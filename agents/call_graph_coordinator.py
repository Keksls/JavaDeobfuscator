from typing import Dict, List, Set

def build_call_graph(parsed_ast: Dict) -> Dict[str, Set[str]]:
    """
    Crée un graphe d'appel à partir de l'AST parsé.
    """
    graph = {}
    for class_data in parsed_ast.values():
        for method_name, method_info in class_data["methods"].items():
            graph[method_name] = set(method_info["calls"])
    return graph


def compute_dependency_levels(graph: Dict[str, Set[str]]) -> Dict[str, int]:
    """
    Calcule les niveaux de dépendance (N0, N1, ...) pour chaque méthode.
    """
    levels = {}
    unresolved = set(graph.keys())

    while unresolved:
        progress = False
        for method in list(unresolved):
            dependencies = graph[method]
            unknowns = [dep for dep in dependencies if dep in unresolved]

            if not unknowns:  # toutes les dépendances sont résolues
                dep_levels = [levels[dep] for dep in dependencies if dep in levels]
                level = 0 if not dep_levels else max(dep_levels) + 1
                levels[method] = level
                unresolved.remove(method)
                progress = True

        if not progress:
            # Il y a une boucle ou des références manquantes
            for method in unresolved:
                levels[method] = -1  # Marque comme non classifiable
            break

    return levels

def call_graph_coordinator_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "parsed_ast": { ... },
        "renamed_methods": [ "Class.method", ... ]
    }

    Returns:
    {
        "call_graph": { ... },
        "method_levels": { "Class.method": N },
        "ready_to_process": [ ... ]
    }
    """
    parsed_ast = input_data["parsed_ast"]
    renamed_methods = input_data["renamed_methods"]

    print(f"[CallGraph] Found {len(parsed_ast)} classes in AST.")

    graph = build_call_graph(parsed_ast)
    levels = compute_dependency_levels(graph)

    # Méthodes prêtes à être renommées : toutes leurs dépendances sont renommées
    ready = [
        method for method, deps in graph.items()
        if method not in renamed_methods and all(d in renamed_methods or d not in graph for d in deps)
    ]
    method_dict = input_data["method_dict"]

    print(f"[CallGraph] Found {len(ready)} methods ready to be renamed.")

    return {
        "call_graph": graph,
        "method_levels": levels,
        "ready_to_process": ready,
        "method_dict": method_dict,
        "parsed_ast": parsed_ast,
        "renamed_methods": renamed_methods
    }