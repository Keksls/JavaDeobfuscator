#!/bin/bash

# Créer le répertoire de build
mkdir -p build

# Compiler toutes les classes ensemble (en incluant tout le classpath)
javac -d build -cp .:../ *.java utils/*.java exceptions/*.java

# Vérifier si la compilation a réussi
if [ $? -eq 0 ]; then
    echo "Compilation réussie !"
    
    # Créer le JAR
    cd build
    jar cvfe ../obfuscated_app.jar aaa *.class utils/*.class exceptions/*.class
    
    echo "JAR créé avec succès : obfuscated_app.jar"
else
    echo "La compilation a échoué"
fi
