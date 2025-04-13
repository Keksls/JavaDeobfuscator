from typing import Dict
from pathlib import Path

def write_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "parsed_ast": { ... },
        "method_dict": { ... },
        "renamed_methods": [ "Class.method", ... ]
    }

    Returns:
    {
        "parsed_ast": { ... },
        "method_dict": { ... },
        "renamed_methods": [ "Class.method", ... ]
    }
    """

    parsed_ast = input_data["parsed_ast"]
    method_dict = input_data["method_dict"]
    renamed_methods = input_data["renamed_methods"]

    # Write the AST back to files
    source_dir = Path("refactored_java")
    source_dir.mkdir(exist_ok=True)

    for class_name, class_data in parsed_ast.items():
        for method_name, method_data in class_data["methods"].items():
            if f"{class_name}.{method_name}" in renamed_methods:
                continue
            file_path = source_dir / f"{class_name}.java"
            body = method_data["body"]
            # write the file
            with open(file_path, "w", encoding="utf-8") as out:
                out.write(body)

    return {
        "parsed_ast": parsed_ast,
        "method_dict": method_dict,
        "renamed_methods": renamed_methods
    }