#!/bin/bash

# Créer le répertoire de build
mkdir -p build

# Compiler toutes les classes
javac -d build *.java

# Vérifier si la compilation a réussi
if [ $? -eq 0 ]; then
    echo "Compilation réussie !"
    
    # Créer le JAR
    cd build
    jar cvfe ../obfuscated_app.jar aaa *.class
    
    echo "JAR créé avec succès : obfuscated_app.jar"
    echo "Vous pouvez maintenant tester votre désobfuscateur avec ce JAR"
else
    echo "La compilation a échoué"
fi
