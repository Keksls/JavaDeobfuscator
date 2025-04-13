from langgraph.graph import StateGraph, END
from langgraph.prebuilt import ToolNode
from pathlib import Path

import jpype
import jpype.imports
if not jpype.isJVMStarted():
    jpype.startJVM(classpath=[
        "lib/javaparser-core-3.26.4.jar",
        "lib/javaparser-symbol-solver-core-3.26.4.jar",
        "lib/guava-33.4.7-jre.jar",
        "lib/javassist-3.30.2-GA.jar",
        "lib/MethodRenamerVisitor.jar"
    ])

import jpype
import jpype.imports
from jpype import JClass
from pathlib import Path

def test_javaparser():
    # === Démarrage de la JVM ===
    if not jpype.isJVMStarted():
        jpype.startJVM(classpath=[
            "lib/javaparser-core-3.26.4.jar",
            "lib/javaparser-symbol-solver-core-3.26.4.jar",
            "lib/javassist-3.29.2-GA.jar",
            "lib/MethodRenamerVisitor.jar"
        ])

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

    # === Résolveurs de symboles ===
    combined_solver = CombinedTypeSolver()
    combined_solver.add(ReflectionTypeSolver())
    # combined_solver.add(JavaParserTypeSolver(File("test_code")))  # .java source
    # combined_solver.add(JavaParserTypeSolver(File("out")))        # .class compilés
    # ou si tu compiles un .jar : 
    combined_solver.add(JarTypeSolver(File("out/app.jar")))

    symbol_solver = JavaSymbolSolver(combined_solver)
    parser_config = ParserConfiguration()
    parser_config.setSymbolResolver(symbol_solver)

    # === Parsing avec SourceRoot ===
    source_root = SourceRoot(Paths.get("test_code"))
    source_root.setParserConfiguration(parser_config)

    parse_results = source_root.tryToParse()

    cus = {}
    for result in parse_results:
        if result.isSuccessful():
            cu = result.getResult().get()
            class_name = cu.getType(0).getNameAsString()
            cus[class_name] = cu
        else:
            print(f"[✗] Erreur parsing : {result.getPath()}")

    # === Renommage ciblé ===
    rename_map = {
        "aab.cad": "sqrt"
    }

    MethodRenamerVisitor = JClass("refactor.MethodRenamerVisitor")

    for qualified_name, new_name in rename_map.items():
        class_name, old_name = qualified_name.split(".")
        if class_name not in cus:
            print(f"[!] Classe {class_name} introuvable.")
            continue

        visitor = MethodRenamerVisitor(class_name, old_name, new_name)

        for cu in cus.values():
            visitor.visit(cu, None)

    # === Affichage final ===
    print("\n=== Résultat après renommage ===\n")
    for class_name, cu in cus.items():
        print(f"// ---- {class_name}.java ----")
        print(cu.toString())
        print()
    
test_javaparser()
    

from agents.javaparser_runner import javaparser_agent
from agents.call_graph_coordinator import call_graph_coordinator_agent
from agents.semantic_analyzer import semantic_analyzer_agent
from agents.refactor_agent import refactor_agent
from agents.writer_agent import write_agent

from pathlib import Path
import os

# ----- GRAPH SETUP -----
from typing import TypedDict, List, Dict, Optional

class AgentState(TypedDict, total=False):
    source_dir: str
    parsed_ast: Dict
    call_graph: Dict
    method_levels: Dict[str, int]
    ready_to_process: List[str]
    proposed_names: List[str]
    reasonings: List[str]
    renamed_context: Dict[str, str]
    renaming_map: Dict[str, str]
    refactored_files: Dict[str, str]
    method_dict: Dict[str, Dict]
    renamed_methods: List[str]

builder = StateGraph(AgentState)

builder.add_node("ParseAST", javaparser_agent)
builder.add_node("BuildGraph", call_graph_coordinator_agent)
builder.add_node("SemanticAnalyzer", semantic_analyzer_agent)
builder.add_node("RefactorCode", refactor_agent)
builder.add_node("Writer", write_agent)

builder.set_entry_point("ParseAST")
builder.add_edge("ParseAST", "BuildGraph")
# Boucle entre BuildGraph -> SemanticAnalyzer -> RefactorCode
builder.add_conditional_edges("BuildGraph", lambda state: (
    "SemanticAnalyzer" if state.get("ready_to_process") and len(state["ready_to_process"]) > 0 else "Writer"
))
builder.add_edge("SemanticAnalyzer", "RefactorCode")
builder.add_edge("RefactorCode", "BuildGraph")
builder.add_edge("Writer", END)

graph = builder.compile()

# ----- ÉTAT INITIAL -----
SOURCE_DIR = "test_code"
STATE = {
    "source_dir": SOURCE_DIR,
    "parsed_ast": None,
    "call_graph": None,
    "method_levels": None,
    "renaming_map": {},
    "ready_to_process": [],
    "refactored_files": {},
    "current_index": 0,
    "method_dict": {},
    "renamed_methods": []
}

# ----- EXECUTION LOOP -----
# Utilisation de graph.stream() pour contrôler l'exécution étape par étape
stream = graph.stream(STATE)  # Initialisation du flux

while True:
    try:
        # Passe à l'étape suivante du graphe
        state = next(stream)  # Maintenant, on récupère juste le state

        if "RefactorCode" in state:
            parsed_ast = state["RefactorCode"]["parsed_ast"]
            method_dict = state["RefactorCode"]["method_dict"]
            renamed_methods = state["RefactorCode"]["renamed_methods"]
            STATE.update({
                "parsed_ast": parsed_ast,
                "method_dict": method_dict,
                "renamed_methods": renamed_methods
            })
            if len(parsed_ast) == 0:
                break

        # Check for end of process or refactored files
        elif "SemanticAnalyzer" in state:
            renaming_map = state["SemanticAnalyzer"]["renaming_map"]
            method_dict = state["SemanticAnalyzer"]["method_dict"]
            parsed_ast = state["SemanticAnalyzer"]["parsed_ast"]
            renamed_methods = state["SemanticAnalyzer"]["renamed_methods"]
            
            STATE.update({
                "renaming_map": renaming_map,
                "method_dict": method_dict,
                "parsed_ast": parsed_ast,
                "renamed_methods": renamed_methods
            })

        # Process the next method if ready
        elif "BuildGraph" in state:
            ready = state["BuildGraph"]["ready_to_process"]
            method_dict = state["BuildGraph"]["method_dict"]
            renamed_methods = state["BuildGraph"]["renamed_methods"]
            STATE.update({
                "ready_to_process": ready,
                "method_dict": method_dict,
                "renamed_methods": renamed_methods
            })

        elif "ParseAST" in state:
            print("✅ AST parsed. Proceeding to call graph analysis.")
            parsed_ast = state["ParseAST"]["parsed_ast"]
            method_dict = state["ParseAST"]["method_dict"]
            renamed_methods = state["ParseAST"]["renamed_methods"]
            STATE.update({
                "parsed_ast": parsed_ast,
                "method_dict": method_dict,
                "renamed_methods": renamed_methods
            })
            
        elif "Writer" in state:
            print("✅ AST written to files. Fin.")
            break

        else:
            print("❌ Aucune méthode prête à traiter. Fin.")
            break

    except StopIteration:
        # Cela signifie que le flux est terminé
        break