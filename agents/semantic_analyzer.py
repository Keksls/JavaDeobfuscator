import subprocess
from typing import Dict
from tqdm import tqdm
from jpype import JClass
from langchain_ollama.llms import OllamaLLM
from langchain.prompts import PromptTemplate
from langchain.output_parsers import ResponseSchema, StructuredOutputParser

def build_prompt(method_name: str, method_data: Dict) -> str:
    """
    Génère le prompt à envoyer au LLM pour analyser une méthode.
    """
    prompt = f"""
    You are analyzing a Java method that has an obfuscated name.
    Your task is to suggest a clear,self-explanatory name for the method, based on what it does.
    

    ## Method (original name: {method_name})
    ```java
    {method_data["body"]}
    ```

    ## Parameters:
    {", ".join(method_data.get("params", [])) or "None"}

    ## Method calls:
    {", ".join(method_data.get("calls", [])) or "None"}
    """

    prompt += (
        "\nNow propose a meaningful Java method name. Be precise and concise.\n"
        "Return only JSON like:\n"
        "{\n"
        '  "proposed_name": "yourNameHere",\n'
        '  "reasoning": "why you chose this name"\n'
        "}"
    )
    return prompt.strip()

def query_mistral_ollama(prompt: str) -> Dict:
    """
    Envoie le prompt à Ollama avec Mistral via langchain et récupère la réponse JSON.
    """
    try:
        # Définir le format de sortie attendu
        proposed_name_schema = ResponseSchema(
            name="proposed_name", 
            description="The proposed method name"
        )
        reasoning_schema = ResponseSchema(
            name="reasoning", 
            description="Reasoning behind the proposed name"
        )
        
        # Configurer le parser pour la sortie structurée
        output_parser = StructuredOutputParser.from_response_schemas([
            proposed_name_schema, 
            reasoning_schema
        ])
        format_instructions = output_parser.get_format_instructions()
        
        # Initialiser le modèle Ollama
        model = OllamaLLM(model="mistral")
        
        # Ajouter les instructions de formatage au prompt
        full_prompt = prompt + "\n\n" + format_instructions
        
        # Appeler le modèle et traiter la réponse
        response = model.invoke(full_prompt)
        return output_parser.parse(response)
        
    except Exception as e:
        print(f"Erreur lors de l'appel à langchain: {e}")
        return {
            "proposed_name": None,
            "reasoning": f"Error: {str(e)}"
        }

def semantic_analyzer_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "cus_ast": { qualifiedClassName: CompilationUnit },
        "methods_to_rename": ["Class.method", ...]
    }

    Returns:
    {
        "renaming_map": {
            "qualifiedClass.method": {
                "proposed_name": "...",
                "reasoning": "..."
            },
            ...
        }
    }
    """
    MethodDeclaration = JClass("com.github.javaparser.ast.body.MethodDeclaration")

    cus_ast = input_data["cus_ast"]
    ready_methods = input_data["methods_to_rename"]

    renaming_map = {}

    tqdm.write(f"[✓] Lancement de l'analyse sémantique sur {len(ready_methods)} méthodes...")
    for full_name in tqdm(ready_methods):
        try:
            class_name, method_name = full_name.rsplit(".", 1)
            cu = cus_ast[class_name]

            # Récupérer la méthode dans le CompilationUnit
            method = None
            for m in cu.findAll(MethodDeclaration):
                if m.getNameAsString() == method_name:
                    method = m
                    break
            if method is None:
                tqdm.write(f"[!] Méthode non trouvée dans AST : {full_name}")
                continue

            # Préparer les infos à donner au prompt
            body = str(method.toString())
            params = [str(p.getType().asString() + " " + p.getNameAsString()) for p in method.getParameters()]
            calls = [str(c.getNameAsString()) for c in method.findAll(JClass("com.github.javaparser.ast.expr.MethodCallExpr"))]

            method_data = {
                "body": body,
                "params": params,
                "calls": calls
            }

            prompt = build_prompt(method_name, method_data)
            response = query_mistral_ollama(prompt)

            if response["proposed_name"]:
                renaming_map[full_name] = {
                    "proposed_name": response["proposed_name"],
                    "reasoning": response["reasoning"],
                    "class_name": class_name,
                    "old_name": method_name
                }
                tqdm.write(f"[✓] Suggestion pour {full_name} → {response['proposed_name']}")
        except Exception as e:
            tqdm.write(f"[✗] Erreur sur {full_name} : {e}")

    input_data["renaming_map"] = renaming_map
    print(f"[✓] Analyse sémantique terminée : {len(renaming_map)} noms proposés")
    return input_data