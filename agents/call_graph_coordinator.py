from typing import Dict, List
from jpype import JClass

def get_ready_to_process_methods(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "cus_ast": { className: ASTObject (JavaParser CompilationUnit) },
        "renamed_methods": [ "className.methodName", ... ]
    }

    Returns:
    {
        "ready_to_process": [ "className.methodName", ... ]
    }
    """
    cus_ast = input_data["cus_ast"]
    renamed_methods = input_data["renamed_methods"]
    ready_to_process = []
    system_reserved_methods = input_data["system_reserved_methods"]

    MethodDeclaration = JClass("com.github.javaparser.ast.body.MethodDeclaration")
    MethodCallExpr = JClass("com.github.javaparser.ast.expr.MethodCallExpr")

    # === Étape 1 : construire le graphe des appels internes
    method_calls_graph: Dict[str, List[str]] = {}

    for class_name, cu in cus_ast.items():
        methods = cu.findAll(MethodDeclaration)

        for method in methods:
            method_name = str(method.getNameAsString())
            full_method_name = str(f"{class_name}.{method_name}")
            if full_method_name in renamed_methods:
                continue  # skip méthode déjà renommée
            if method_name in system_reserved_methods:
                continue  # skip méthode réservée

            called_internal_methods = []

            for call in method.findAll(MethodCallExpr):
                try:
                    resolved = call.resolve()
                    called_class = str(resolved.declaringType().getQualifiedName())
                    called_method = str(resolved.getName())
                    called_full = str(f"{called_class}.{called_method}")

                    if called_class in cus_ast:
                        called_internal_methods.append(called_full)
                except Exception:
                    pass  # on ignore les appels non résolus (par défaut, prudence)

            method_calls_graph[full_method_name] = called_internal_methods

    # === Étape 2 : détecter les méthodes prêtes à être renommées
    for method, called_methods in method_calls_graph.items():
        # Aucune méthode interne appelée => prête
        if not called_methods:
            ready_to_process.append(method)
            continue

        # Si toutes les méthodes appelées sont déjà renommées
        if all(m in renamed_methods for m in called_methods):
            ready_to_process.append(method)
        else:
            pass

    input_data["methods_to_rename"] = ready_to_process
    print(f"[✓] Get ready to process methods terminé : {len(ready_to_process)} méthodes prêtes à être renommées")
    return input_data