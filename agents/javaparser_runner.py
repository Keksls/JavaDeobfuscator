import jpype
import jpype.imports
from jpype.types import *
from tqdm import tqdm
from pathlib import Path
from typing import Dict, List, Tuple

# ----- Java classes à importer une seule fois -----
ParserConfiguration = None
StaticJavaParser = None
File = None
ParseProblemException = None

def start_jvm(source_dir: Path):
    global ParserConfiguration, StaticJavaParser, File, ParseProblemException, JavaSymbolSolver

    # Imports Java
    ParserConfiguration = jpype.JClass("com.github.javaparser.ParserConfiguration")
    StaticJavaParser = jpype.JClass("com.github.javaparser.StaticJavaParser")
    File = jpype.JClass("java.io.File")
    f = File(str(source_dir))
    ParseProblemException = jpype.JClass("com.github.javaparser.ParseProblemException")

    # Créez un TypeSolver en passant le chemin sous forme de chaîne
    TypeSolver = jpype.JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver")
    type_solver = jpype.JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver")(jpype.JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver"), TypeSolver(f))
    JavaSymbolSolver = jpype.JClass("com.github.javaparser.symbolsolver.JavaSymbolSolver")(type_solver)

def parse_java_file_with_javaparser(java_file_path: str) -> Tuple[str, Dict, str]:
    config = ParserConfiguration()
    config.setLanguageLevel(ParserConfiguration.LanguageLevel.JAVA_17)
    config.setAttributeComments(False)
    config.setStoreTokens(False)
    config.setTabSize(4)
    config.setLexicalPreservationEnabled(False)
    config.setPreprocessUnicodeEscapes(True)

    StaticJavaParser.setConfiguration(config)

    try:
        cu = StaticJavaParser.parse(File(java_file_path))
    except ParseProblemException as e:
        return (java_file_path, {}, f"[Syntax✗] {java_file_path}: {e.getMessage()}")
    except Exception as e:
        return (java_file_path, {}, f"[JavaParser✗] {java_file_path}: {e}")

    result = {}
    parsed_class_names = []

    if cu:
        types = cu.getTypes()
        for type_decl in types:
            class_name = str(type_decl.getName())
            fq_class = class_name
            if cu.getPackageDeclaration().isPresent():
                package_name = cu.getPackageDeclaration().get().getNameAsString()
                fq_class = f"{class_name}"
            parsed_class_names.append(fq_class)

        for type_decl in types:
            class_name = str(type_decl.getName())
            fq_class = class_name
            if cu.getPackageDeclaration().isPresent():
                package_name = cu.getPackageDeclaration().get().getNameAsString()
                fq_class = f"{class_name}"

            methods = {}
            for method in type_decl.getMethods():
                method_name = str(method.getName())
                full_method_name = f"{fq_class}.{method_name}"
                params = [str(p.getName()) for p in method.getParameters()]
                body = method.toString()

                variable_type_map = {}
                method_body = method.getBody()
                if method_body.isPresent():
                    for var in method_body.get().findAll(jpype.JClass("com.github.javaparser.ast.body.VariableDeclarator")):
                        variable_type_map[var.getNameAsString()] = var.getType().toString()

                calls = []
                if method_body.isPresent():
                    calls = visit_method_body(method_body.get(), fq_class, variable_type_map, parsed_class_names)

                methods[full_method_name] = {
                    "params": params,
                    "calls": calls,
                    "body": body.strip()
                }

            result[fq_class] = {
                "fields": [],
                "methods": methods
            }

    return (java_file_path, result, None)

def visit_method_body(method_body, fq_class, variable_type_map, parsed_class_names):
    calls = []

    for stmt in method_body.getStatements():
        if isinstance(stmt, jpype.JClass('com.github.javaparser.ast.stmt.ExpressionStmt')):
            expr = stmt.getExpression()
            if expr.isMethodCallExpr():
                method_call = expr.asMethodCallExpr()
                method_name = method_call.getNameAsString()

                if method_call.getScope().isPresent():
                    scope_expr = method_call.getScope().get().toString()
                    type_name = variable_type_map.get(scope_expr, scope_expr)
                else:
                    type_name = fq_class  # appel implicite à this

                calls.append(f"{type_name}.{method_name}")

    return calls

def javaparser_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "source_dir": "path/to/java/files",
        "javaparser_jar": "path/to/javaparser-core.jar"
    }

    Returns:
    {
        "parsed_ast": { ... },
        "failed_files": [ "path/to/failure1.java", ... ],
        "ready_to_process": [ "ClassName.methodName", ... ]
    }
    """
    source_dir = Path(input_data["source_dir"])

    start_jvm(source_dir)

    parsed = {}
    failed = []
    ready_to_process = []
    renamed_methods = []

    java_files = list(source_dir.rglob("*.java"))
    print(f"[JavaParser] Parsing {len(java_files)} files...")

    failed = []
    invalid_dir = Path("invalid_java")
    invalid_dir.mkdir(exist_ok=True)

    for java_file in tqdm(java_files, desc="[JavaParser]", unit="file"):
        file_path, file_result, error = parse_java_file_with_javaparser(str(java_file))

        if error:
            short_error = error.strip().splitlines()[0] if error and isinstance(error, str) else "Unknown error"
            tqdm.write(f"[✗] {java_file.name}: {short_error}")
            failed.append(file_path)

            with open("javaparser_errors.log", "a", encoding="utf-8") as log:
                log.write(f"{java_file.name}: {short_error}\n")

            dest = invalid_dir / java_file.name
            with open(dest, "w", encoding="utf-8") as out:
                out.write(java_file.read_text(encoding="utf-8"))
        else:
            parsed.update(file_result)
            # Ajoutez ici les méthodes prêtes à être traitées
            for class_name, class_data in file_result.items():
                for method_name in class_data["methods"]:
                    ready_to_process.append(f"{method_name}")

    print(f"[JavaParser] ✅ Parsed: {len(parsed)} files | ❌ Failed: {len(failed)} files")

    # **Second Pass**: prepare a dic of className.MethodName => methodData
    method_dict = {}
    for class_name, class_data in parsed.items():
        for method_name, method_data in class_data["methods"].items():
            method_dict[f"{method_name}"] = method_data

    return {
        "parsed_ast": parsed,
        "failed_files": failed,
        "ready_to_process": ready_to_process,  # Important pour la suite
        "method_dict": method_dict,
        "renamed_methods": renamed_methods
    }