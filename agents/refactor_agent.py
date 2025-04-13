from typing import Dict
from pathlib import Path
import jpype
import jpype.imports
from jpype import JClass

def rename_method_in_body(body: str, old_name: str, new_name: str, method_dict: Dict[str, Dict]) -> str:
    old_name_clean = old_name.split(".")[len(old_name.split(".")) - 1]
    new_name_clean = new_name.split(".")[len(new_name.split(".")) - 1]

    # replace method name in body
    body = body.replace(old_name_clean, new_name_clean)

    # propagate rename to all method that calls the old name
    for method_name, method_data in method_dict.items():
        if old_name in method_data["calls"]:
            call_body = method_data["body"]
            # replace method name in call body
            call_body = call_body.replace(old_name_clean, new_name_clean)
            method_data["body"] = call_body

    return body

def refactor_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "cus_ast": { ... },
        "renaming_map": { ... }
    }

    Output:
    {
        "cus_ast": { ... },
        "renamed_methods": [ ... ]
    }
    """
    system_reserved_methods = input_data["system_reserved_methods"]
    cus_ast = input_data["cus_ast"]
    renaming_map = input_data["renaming_map"]
    renamed_methods = input_data["renamed_methods"]
    
    # rename method names in AST
    MethodRenamerVisitor = JClass("refactor.MethodRenamerVisitor")

    for qualified_name, proposal in renaming_map.items():
        class_name = proposal["class_name"]
        old_name = proposal["old_name"]
        new_name = proposal["proposed_name"]
        if class_name not in cus_ast:
            print(f"[!] Classe {class_name} introuvable.")
            continue
        if old_name in system_reserved_methods:
            print(f"[!] Méthode {old_name} réservée.")
            continue

        visitor = MethodRenamerVisitor(class_name, old_name, new_name)

        for cu in cus_ast.values():
            visitor.visit(cu, None)
            
        renamed_methods.append(class_name + "." + new_name)
    
    input_data["cus_ast"] = cus_ast
    input_data["renamed_methods"] = renamed_methods

    # debug, print all ast toString
    for class_name, cu in cus_ast.items():
        print(f"// ---- {class_name}.java ----")
        print(cu.toString())
        print()

    return input_data
    