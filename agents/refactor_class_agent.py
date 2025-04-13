from typing import Dict
from pathlib import Path
import jpype
import jpype.imports
from jpype import JClass

def refactor_class_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "cus_ast": { ... },
        "class_renaming_map": { ... }
    }

    Output:
    {
        "cus_ast": { ... },
        "renamed_classes": [ ... ]
    }
    """
    system_reserved_classes = input_data["system_reserved_classes"]
    cus_ast = input_data["cus_ast"]
    class_renaming_map = input_data["class_renaming_map"]
    renamed_classes = input_data["renamed_classes"]
    
    # rename class names in AST
    ClassRenamerVisitor = JClass("refactor.ClassRenamerVisitor")

    for qualified_name, proposal in class_renaming_map.items():
        old_name = proposal["old_name"]
        new_name = proposal["proposed_name"]
        
        if qualified_name not in cus_ast:
            print(f"[!] Classe {qualified_name} introuvable.")
            continue
            
        if old_name in system_reserved_classes:
            print(f"[!] Classe {old_name} réservée.")
            continue

        visitor = ClassRenamerVisitor(qualified_name, new_name)

        # Renommer la classe dans sa propre déclaration
        visitor.visit(cus_ast[qualified_name], None)
        
        # Renommer toutes les références à cette classe dans tous les fichiers
        for cu in cus_ast.values():
            visitor.visitReferences(cu, None)
            
        # Ajouter à la liste des classes renommées
        renamed_classes.append(qualified_name)
    
    input_data["cus_ast"] = cus_ast
    input_data["renamed_classes"] = renamed_classes

    # debug, print all ast toString
    for class_name, cu in cus_ast.items():
        print(f"// ---- {class_name}.java ----")
        print(cu.toString())
        print()

    return input_data