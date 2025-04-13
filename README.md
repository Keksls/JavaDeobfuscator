# Chat LangChain avec Ollama (Mistral)

Ce projet est une application de chat en ligne de commande qui utilise LangChain pour interagir avec un modèle Mistral hébergé sur Ollama.

## Prérequis

- Python 3.8+
- Ollama installé et fonctionnant sur Windows (accessible depuis WSL)
- Le modèle Mistral chargé dans Ollama

## Configuration

1. Assurez-vous que votre fichier `.env` contient les variables d'environnement nécessaires pour LangSmith (déjà configuré) :
   ```
   LANGSMITH_TRACING=true
   LANGSMITH_ENDPOINT="https://api.smith.langchain.com"
   LANGSMITH_API_KEY="votre_clé_api"
   LANGSMITH_PROJECT="votre_projet"
   ```

2. Installez les dépendances :
   ```bash
   pip install -r requirements.txt
   ```

3. Assurez-vous qu'Ollama est en cours d'exécution sur votre machine Windows et que le modèle Mistral est disponible.

## Utilisation

Exécutez le script Python pour démarrer le chat :

```bash
python chat.py
```

- Tapez vos messages et appuyez sur Entrée pour obtenir une réponse.
- Tapez 'exit', 'quit' ou 'q' pour terminer la conversation.

## Notes

- L'application se connecte à Ollama sur Windows depuis WSL en utilisant l'adresse `http://host.docker.internal:11434`.
- Les réponses sont diffusées en temps réel (streaming) dans le terminal.
- L'historique de conversation est maintenu pendant la session.
