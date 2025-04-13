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
        "parsed_ast": { ... },
        "method_dict": { ... },
        "renaming_map": {
            "a.b": "calculateTotal",
            ...
        }
    }

    Output:
    {
        "parsed_ast": { ... },
        "method_dict": { ... }
    }
    """
    rename_map = input_data["renaming_map"]
    method_dict = input_data["method_dict"]
    parsed_ast = input_data["parsed_ast"]
    renamed_methods = input_data["renamed_methods"]
    
    # rename method names in parsed AST
    updated_ast = {}
    for class_name, class_data in parsed_ast.items():
        updated_methods = {}
        for method_name, method_data in class_data["methods"].items():
            if method_name not in rename_map:
                updated_methods[method_name] = method_data
                continue
            new_method_name = class_name + "." + rename_map.get(method_name)[0]
            if new_method_name:
                MethodRenamerVisitor = JClass("refactor.MethodRenamerVisitor")
                clean_method_name = method_name.split(".")[len(method_name.split(".")) - 1]
                clean_new_method_name = new_method_name.split(".")[len(new_method_name.split(".")) - 1]
                visitor = MethodRenamerVisitor(clean_method_name, clean_new_method_name)
                visitor.visit(method_data, None)
                updated_methods[new_method_name] = method_data
                renamed_methods.append(new_method_name)
        updated_ast[class_name] = {
            "fields": class_data["fields"],
            "methods": updated_methods
        }
    print(f"Renamed {len(rename_map)} methods in AST.")

    # # rename method names in parsed AST
    # updated_ast = {}
    # for class_name, class_data in parsed_ast.items():
    #     updated_methods = {}
    #     for method_name, method_data in class_data["methods"].items():
    #         if method_name not in rename_map:
    #             updated_methods[method_name] = method_data
    #             continue
    #         new_method_name = class_name + "." + rename_map.get(method_name)[0]
    #         if new_method_name:
    #             method_data["name"] = new_method_name
    #             updated_methods[new_method_name] = method_data
    #             renamed_methods.append(new_method_name)
    #             # rename method name in body
    #             method_data["body"] = rename_method_in_body(method_data["body"], method_name, new_method_name, method_dict)
    #     updated_ast[class_name] = {
    #         "fields": class_data["fields"],
    #         "methods": updated_methods
    #     }
    # print(f"Renamed {len(rename_map)} methods in AST.")

    # rename method names in method_dict
    updated_method_dict = {}
    for old_method_name, method_data in method_dict.items():
        if old_method_name not in rename_map:
            updated_method_dict[old_method_name] = method_data
            continue
        class_name = old_method_name.split(".")[0]
        new_method_name = class_name + "." + rename_map.get(old_method_name)[0]
        if new_method_name:
            method_data["name"] = new_method_name
            # rename method name in body
            method_data["body"] = rename_method_in_body(method_data["body"], old_method_name, new_method_name, method_dict)
            updated_method_dict[new_method_name] = method_data
    print(f"Renamed {len(rename_map)} methods in method_dict.")

    return {
        "parsed_ast": updated_ast,
        "method_dict": updated_method_dict,
        "renamed_methods": renamed_methods
    }