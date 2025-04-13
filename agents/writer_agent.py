from typing import Dict
from pathlib import Path

def write_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "cus_ast": { ... }        
    }

    Returns:
    {
    }
    """

    cus_ast = input_data["cus_ast"]
    
    # Write the AST back to files
    source_dir = Path("refactored_java")
    source_dir.mkdir(exist_ok=True)

    for class_name, cu in cus_ast.items():
        # get unqualified class name
        class_name = class_name.split(".")[-1]
        file_path = source_dir / f"{class_name}.java"
        body = str(cu.toString())
        # write the file
        with open(file_path, "w", encoding="utf-8") as out:
            out.write(body)

    return input_data