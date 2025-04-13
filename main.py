from langgraph.graph import StateGraph, END
from typing_extensions import TypedDict
import jpype
import jpype.imports
if not jpype.isJVMStarted():
    jpype.startJVM(classpath=[
            "lib/javaparser-core-3.26.4.jar",
            "lib/javaparser-symbol-solver-core-3.26.4.jar", 
        "lib/guava-33.4.7-jre.jar",
        "lib/javassist-3.30.2-GA.jar",
        "lib/JavaDeobfuscatorVisitors.jar"
    ])
from jpype import JClass
from agents.javaparser_runner import javaparser_agent
from agents.call_graph_coordinator import get_ready_to_process_methods, get_ready_to_process_class
from agents.semantic_analyzer import semantic_analyzer_agent
from agents.semantic_analyzer_class import semantic_analyzer_class_agent
from agents.refactor_agent import refactor_agent
from agents.refactor_class_agent import refactor_class_agent
from agents.writer_agent import write_agent

# ----- GRAPH SETUP -----
from typing import TypedDict, List, Dict

class AgentState(TypedDict):
    src_jar: str # source jar
    src_java: str # source java
    cus_ast: Dict[str, JClass] # AST des classes => class.Name => class AST
    # --- Partie méthodes ---
    methods_to_rename: List[str] # méthodes prêtes à être renommées => className.methodName
    renaming_map: Dict[str, object] # mapping des renommages => className.methodName => {className, newMethodName, description}
    renamed_methods: List[str] # méthodes renommées => className.methodName
    system_reserved_methods: List[str] # méthodes réservées
    # --- Partie classes ---
    classes_to_rename: List[str] # classes prêtes à être renommées => className
    class_renaming_map: Dict[str, object] # mapping des renommages de classes => className => {oldName, newClassName, description}
    renamed_classes: List[str] # classes renommées => className
    system_reserved_classes: List[str] # classes réservées
    # --- Contrôle du flux ---
    processing_mode: str # "methods" ou "classes" pour indiquer quel type d'entité est en cours de traitement

builder = StateGraph(AgentState)

# Nœuds communs
builder.add_node("ParseAST", javaparser_agent)
builder.add_node("Writer", write_agent)

# Nœuds pour le traitement des méthodes
builder.add_node("BuildMethodGraph", get_ready_to_process_methods)
builder.add_node("MethodSemanticAnalyzer", semantic_analyzer_agent)
builder.add_node("RefactorMethods", refactor_agent)

# Nœuds pour le traitement des classes (à créer)
builder.add_node("BuildClassGraph", get_ready_to_process_class)
# À créer : semantic_analyzer_for_classes et refactor_classes_agent
builder.add_node("ClassSemanticAnalyzer", semantic_analyzer_class_agent)  # Agent dédié aux classes
builder.add_node("RefactorClasses", refactor_class_agent)  # Agent dédié aux classes

builder.set_entry_point("ParseAST")

# Configuration du flux
builder.add_edge("ParseAST", "BuildMethodGraph")

# Flux pour les méthodes
builder.add_conditional_edges("BuildMethodGraph", lambda state: (
    "MethodSemanticAnalyzer" if state.get("methods_to_rename") and len(state["methods_to_rename"]) > 0 
    else "BuildClassGraph"  # Passe au traitement des classes quand toutes les méthodes sont traitées
))
builder.add_edge("MethodSemanticAnalyzer", "RefactorMethods")
builder.add_edge("RefactorMethods", "BuildMethodGraph")

# Flux pour les classes
builder.add_conditional_edges("BuildClassGraph", lambda state: (
    "ClassSemanticAnalyzer" if state.get("classes_to_rename") and len(state["classes_to_rename"]) > 0 
    else "Writer"  # Quand tout est traité, on passe à l'écriture
))
builder.add_edge("ClassSemanticAnalyzer", "RefactorClasses")
builder.add_edge("RefactorClasses", "BuildClassGraph")

# Sortie finale
builder.add_edge("Writer", END)

graph = builder.compile()

# ----- ÉTAT INITIAL -----
initial_state = {
    "src_jar": "obfuscated_single_package/obfuscated.jar",
    "src_java": "obfuscated_test_code",
    "cus_ast": {},
    # --- Partie méthodes ---
    "methods_to_rename": [],
    "renaming_map": {},
    "renamed_methods": [],
    "system_reserved_methods": ["toString", "equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "main", "run"],
    # --- Partie classes ---
    "classes_to_rename": [],
    "class_renaming_map": {},
    "renamed_classes": [],
    "system_reserved_classes": ["Object", "String", "Integer", "Boolean", "Double", "Float", "Void", "Class"],
    # --- Contrôle du flux ---
    "processing_mode": "methods"
}

# ----- EXECUTION LOOP -----
graph.invoke(initial_state, {"recursion_limit": 50})