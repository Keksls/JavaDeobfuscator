import jpype
import jpype.imports
from jpype.types import *
from tqdm import tqdm
from pathlib import Path
from typing import Dict, List, Tuple

# === Import des classes Java ===
File = JClass("java.io.File")
Paths = JClass("java.nio.file.Paths")
SourceRoot = JClass("com.github.javaparser.utils.SourceRoot")
JavaParserTypeSolver = JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver")
ReflectionTypeSolver = JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver")
CombinedTypeSolver = JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver")
JavaSymbolSolver = JClass("com.github.javaparser.symbolsolver.JavaSymbolSolver")
ParserConfiguration = JClass("com.github.javaparser.ParserConfiguration")
JarTypeSolver = JClass("com.github.javaparser.symbolsolver.resolution.typesolvers.JarTypeSolver")

def javaparser_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "src_jar": "path/to/javaparser-core.jar",
        "src_java": "path/to/java/files"
    }

    Returns:
    {
        "cus_ast": { ... }
    }
    """    

    src_jar_path = input_data["src_jar"]
    src_java_path = input_data["src_java"]

    # === Résolveurs de symboles ===
    combined_solver = CombinedTypeSolver()
    combined_solver.add(ReflectionTypeSolver())
    # ou si tu compiles un .jar : 
    combined_solver.add(JarTypeSolver(File(src_jar_path)))

    symbol_solver = JavaSymbolSolver(combined_solver)
    parser_config = ParserConfiguration()
    parser_config.setSymbolResolver(symbol_solver)

    # === Parsing avec SourceRoot ===
    source_root = SourceRoot(Paths.get(src_java_path))
    source_root.setParserConfiguration(parser_config)

    parse_results = source_root.tryToParse()

    cus = {}
    for result in parse_results:
        if result.isSuccessful():
            cu = result.getResult().get()
            qualified_name = str(cu.getType(0).resolve().getQualifiedName())
            cus[qualified_name] = cu
        else:
            print(f"[✗] Erreur parsing : {result.getPath()}")
    input_data["cus_ast"] = cus

    print(f"[✓] Parsing terminé : {len(cus)} classes chargées")

    return input_data