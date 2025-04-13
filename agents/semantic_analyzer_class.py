import subprocess
from typing import Dict
from tqdm import tqdm
from jpype import JClass
from langchain_ollama.llms import OllamaLLM
from langchain.prompts import PromptTemplate
from langchain.output_parsers import ResponseSchema, StructuredOutputParser

def build_class_prompt(class_name: str, class_data: Dict) -> str:
    """
    Génère le prompt à envoyer au LLM pour analyser une classe.
    """
    prompt = f"""
    You are analyzing a Java class that has an obfuscated name. Your task is to suggest a clear, self-explanatory name for the class, based on its structure, methods, and fields. If class name is a system reserved name, return same name (eg : Object, String, etc).

    ## Class (original name: {class_name})
    ```java
    {class_data["declaration"]}
    ```

    ## Fields:
    {class_data.get("fields", "None")}

    ## Methods:
    {class_data.get("methods", "None")}

    ## Extends:
    {class_data.get("extends", "None")}

    ## Implements:
    {class_data.get("implements", "None")}
    """

    prompt += (
        "\nNow propose a meaningful Java class name. Be precise and concise. Choose a name that follows Java naming conventions (PascalCase).\n"
        "Return only JSON like:\n"
        "{\n"
        '  "proposed_name": "YourClassName",\n'
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
            description="The proposed class name"
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

def semantic_analyzer_class_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "cus_ast": { qualifiedClassName: CompilationUnit },
        "classes_to_rename": ["QualifiedClassName", ...]
    }

    Returns:
    {
        "class_renaming_map": {
            "qualifiedClassName": {
                "proposed_name": "...",
                "reasoning": "...",
                "oldName": "...",
            },
            ...
        }
    }
    """
    ClassOrInterfaceDeclaration = JClass("com.github.javaparser.ast.body.ClassOrInterfaceDeclaration")
    FieldDeclaration = JClass("com.github.javaparser.ast.body.FieldDeclaration")
    MethodDeclaration = JClass("com.github.javaparser.ast.body.MethodDeclaration")

    cus_ast = input_data["cus_ast"]
    ready_classes = input_data["classes_to_rename"]

    class_renaming_map = {}

    tqdm.write(f"[✓] Lancement de l'analyse sémantique sur {len(ready_classes)} classes...")
    for full_class_name in tqdm(ready_classes):
        try:
            cu = cus_ast[full_class_name]
            
            # Extraire le nom court de la classe à partir du nom complet
            short_class_name = str(full_class_name.split(".")[-1])

            # Récupérer la déclaration de classe dans le CompilationUnit
            class_decl = None
            for c in cu.findAll(ClassOrInterfaceDeclaration):
                if str(c.getNameAsString()) == short_class_name:
                    class_decl = c
                    break
            
            if class_decl is None:
                tqdm.write(f"[!] Classe non trouvée dans AST : {full_class_name}")
                continue

            # Préparer les infos à donner au prompt
            declaration = str(class_decl.toString())
            
            # Récupérer les champs
            fields = []
            for field in class_decl.findAll(FieldDeclaration):
                fields.append(str(field.toString()))
            
            # Récupérer les méthodes
            methods = []
            for method in class_decl.findAll(MethodDeclaration):
                method_signature = str(f"{method.getType()} {method.getNameAsString()}({', '.join([str(p.getType().asString() + ' ' + p.getNameAsString()) for p in method.getParameters()])})")
                methods.append(method_signature)
            
            # Récupérer les classes étendues
            extends = []
            for ext in class_decl.getExtendedTypes():
                extends.append(str(ext.asString()))
            
            # Récupérer les interfaces implémentées
            implements = []
            for impl in class_decl.getImplementedTypes():
                implements.append(str(impl.asString()))

            class_data = {
                "declaration": declaration,
                "fields": "\n".join(fields) if fields else "None",
                "methods": "\n".join(methods) if methods else "None",
                "extends": ", ".join(extends) if extends else "None",
                "implements": ", ".join(implements) if implements else "None"
            }

            prompt = build_class_prompt(short_class_name, class_data)
            response = query_mistral_ollama(prompt)

            if response["proposed_name"]:
                class_renaming_map[full_class_name] = {
                    "proposed_name": response["proposed_name"],
                    "reasoning": response["reasoning"],
                    "old_name": short_class_name
                }
                tqdm.write(f"[✓] Suggestion pour {full_class_name} → {response['proposed_name']}")
        except Exception as e:
            tqdm.write(f"[✗] Erreur sur {full_class_name} : {e}")

    input_data["class_renaming_map"] = class_renaming_map
    print(f"[✓] Analyse sémantique des classes terminée : {len(class_renaming_map)} noms proposés")
    return input_data
