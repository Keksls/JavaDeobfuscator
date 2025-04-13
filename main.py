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
        "lib/MethodRenamerVisitor.jar"
    ])
from jpype import JClass
from agents.javaparser_runner import javaparser_agent
from agents.call_graph_coordinator import get_ready_to_process_methods
from agents.semantic_analyzer import semantic_analyzer_agent
from agents.refactor_agent import refactor_agent
from agents.writer_agent import write_agent

# ----- GRAPH SETUP -----
from typing import TypedDict, List, Dict

class AgentState(TypedDict):
    src_jar: str # source jar
    src_java: str # source java
    cus_ast: Dict[str, JClass] # AST des classes => class.Name => class AST
    methods_to_rename: List[str] # méthodes prêtes à être renommées => className.methodName
    renaming_map: Dict[str, object] # mapping des renommages => className.methodName => {className, newMethodName, description}
    renamed_methods: List[str] # méthodes renommées => className.methodName
    system_reserved_methods: List[str] # méthodes réservées
    
builder = StateGraph(AgentState)

builder.add_node("ParseAST", javaparser_agent)
builder.add_node("BuildGraph", get_ready_to_process_methods)
builder.add_node("SemanticAnalyzer", semantic_analyzer_agent)
builder.add_node("RefactorCode", refactor_agent)
builder.add_node("Writer", write_agent)

builder.set_entry_point("ParseAST")
builder.add_edge("ParseAST", "BuildGraph")
# Boucle entre BuildGraph -> SemanticAnalyzer -> RefactorCode
builder.add_conditional_edges("BuildGraph", lambda state: (
    "SemanticAnalyzer" if state.get("methods_to_rename") and len(state["methods_to_rename"]) > 0 else "Writer"
))
builder.add_edge("SemanticAnalyzer", "RefactorCode")
builder.add_edge("RefactorCode", "BuildGraph")
builder.add_edge("Writer", END)

graph = builder.compile()

# ----- ÉTAT INITIAL -----
initial_state = {
    "src_jar": "out/app.jar",
    "src_java": "test_code",
    "cus_ast": {},
    "methods_to_rename": [],
    "renaming_map": {},
    "renamed_methods": [],
    "system_reserved_methods": ["toString", "equals", "hashCode", "getClass", "clone", "wait", "notify", "notifyAll", "main", "run"]
}

# ----- EXECUTION LOOP -----
graph.invoke(initial_state)