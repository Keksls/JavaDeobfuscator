import subprocess
from typing import Dict
from tqdm import tqdm

def build_prompt(method_name: str, method_data: Dict) -> str:
    """
    Génère le prompt à envoyer au LLM pour analyser une méthode.
    """
    prompt = f"""
You are analyzing a Java method that has an obfuscated name. Your task is to suggest a clear, self-explanatory name for the method, based on what it does. If method name is a system reserved name, return same name (eg : main)

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
    Envoie le prompt à Ollama avec Mistral et récupère la réponse JSON.
    """
    result = subprocess.run(
        ["ollama", "run", "mistral", prompt],
        capture_output=True,
        text=True
    )
    raw_output = result.stdout.strip()

    # Hack : tente d’extraire un JSON valide de la sortie
    import re, json
    match = re.search(r'{.*}', raw_output, re.DOTALL)
    if match:
        return json.loads(match.group(0))
    else:
        return {
            "proposed_name": None,
            "reasoning": "Unable to parse response"
        }

def semantic_analyzer_agent(input_data: Dict) -> Dict:
    """
    Expects:
    {
        "ready_to_process": ["Class.method", ...]
    }

    Returns:
    {
        "ready_to_process": ["Class.method", ...],
        "proposed_names": ["sumCoordinates", ...],
        "reasonings": ["adds two coordinates together", ...]
    }
    """
    # Initialiser les listes pour stocker les résultats
    proposed_names = []
    reasonings = []

    # Ajouter la progressbar sur l'itération des méthodes à traiter
    for method_name in tqdm(input_data["ready_to_process"], desc="Processing Methods", unit="method"):
        method_data = input_data["method_dict"].get(method_name)
        if not method_data:
            continue
        prompt = build_prompt(method_name, method_data)
        result = query_mistral_ollama(prompt)
        # Ajout du nom proposé et du raisonnement à la liste
        proposed_names.append(result.get("proposed_name"))
        reasonings.append(result.get("reasoning"))
        
        # Afficher le dernier nom proposé à chaque itération
        print(f"Last proposed name for {method_name}: {proposed_names[-1]}")

    renaming_map = {}
    for i in range(len(input_data["ready_to_process"])):
        renaming_map[input_data["ready_to_process"][i]] = (proposed_names[i], reasonings[i])

    return {
        "ready_to_process": input_data["ready_to_process"],
        "proposed_names": proposed_names,
        "reasonings": reasonings,
        "renaming_map": renaming_map,
        "method_dict": input_data["method_dict"],
        "parsed_ast": input_data["parsed_ast"],
        "renamed_methods": input_data["renamed_methods"]
    }