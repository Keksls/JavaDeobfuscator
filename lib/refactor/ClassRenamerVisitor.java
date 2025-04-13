package refactor;

import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.type.ClassOrInterfaceType;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.Node;
import com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration;
import com.github.javaparser.resolution.types.ResolvedType;
import com.github.javaparser.resolution.types.ResolvedReferenceType;
import com.github.javaparser.resolution.UnsolvedSymbolException;

public class ClassRenamerVisitor extends ModifierVisitor<Void> {
    private String qualifiedClassName;
    private String newName;
    private String shortClassName;
    private String packageName;

    public ClassRenamerVisitor(String qualifiedClassName, String newName) {
        this.qualifiedClassName = qualifiedClassName;
        this.newName = newName;
        
        int lastDotIndex = qualifiedClassName.lastIndexOf('.');
        if (lastDotIndex != -1) {
            this.shortClassName = qualifiedClassName.substring(lastDotIndex + 1);
            this.packageName = qualifiedClassName.substring(0, lastDotIndex);
        } else {
            this.shortClassName = qualifiedClassName;
            this.packageName = "";
        }
        
        System.out.println("[ClassRenamer] Renaming class: " + qualifiedClassName + " -> " + newName);
        System.out.println("[ClassRenamer] Short name: " + shortClassName);
        System.out.println("[ClassRenamer] Package: " + packageName);
    }

    @Override
    public Visitable visit(ClassOrInterfaceDeclaration n, Void arg) {
        // Renommer la déclaration de classe elle-même
        if (n.getNameAsString().equals(shortClassName)) {
            try {
                ResolvedReferenceTypeDeclaration resolved = n.resolve();
                if (resolved.getQualifiedName().equals(qualifiedClassName)) {
                    System.out.println("[ClassRenamer] Renaming class declaration: " + n.getNameAsString() + " -> " + newName);
                    n.setName(newName);
                }
            } catch (Exception e) {
                // Si l'analyse type échoue, on utilise juste la correspondance de nom
                System.out.println("[ClassRenamer] Renaming class declaration (by name): " + n.getNameAsString() + " -> " + newName);
                n.setName(newName);
            }
        }
        return super.visit(n, arg);
    }

    @Override
    public Node visit(ImportDeclaration n, Void arg) {
        // Renommer les importations pour la classe
        String importName = n.getNameAsString();
        
        if (importName.equals(qualifiedClassName) || 
            (!n.isAsterisk() && importName.endsWith("." + shortClassName))) {
            // Import direct de la classe: import package.MyClass;
            System.out.println("[ClassRenamer] Renaming import: " + importName);
            
            // Construire le nouveau nom d'import en gardant le package
            String newImportName;
            if (packageName.isEmpty()) {
                newImportName = newName;
            } else {
                int lastDotIndex = importName.lastIndexOf('.');
                newImportName = importName.substring(0, lastDotIndex + 1) + newName;
            }
            
            n.setName(newImportName);
        }
        
        return super.visit(n, arg);
    }

    public void visitReferences(Visitable n, Void arg) {
        // Cette méthode est appelée pour visiter un CompilationUnit entier
        // pour mettre à jour les références à la classe renommée
        n.accept(this, arg);
    }

    @Override
    public Visitable visit(ClassOrInterfaceType n, Void arg) {
        // Renommer les références de type
        if (n.getNameAsString().equals(shortClassName)) {
            try {
                ResolvedType resolvedType = n.resolve();
                if (resolvedType.isReferenceType()) {
                    ResolvedReferenceType refType = resolvedType.asReferenceType();
                    if (refType.getQualifiedName().equals(qualifiedClassName)) {
                        System.out.println("[ClassRenamer] Renaming type reference: " + n.getNameAsString() + " -> " + newName);
                        n.setName(newName);
                    }
                }
            } catch (UnsolvedSymbolException e) {
                // Si le type ne peut pas être résolu, on se base sur le nom
                if (e.getName().equals(shortClassName)) {
                    System.out.println("[ClassRenamer] Renaming type reference (by name): " + n.getNameAsString() + " -> " + newName);
                    n.setName(newName);
                }
            } catch (Exception e) {
                // Ignorer les autres erreurs
                System.out.println("[!] Erreur lors de la résolution du type: " + n.toString() + " - " + e.getMessage());
            }
        }
        return super.visit(n, arg);
    }
    
    @Override
    public Visitable visit(NameExpr n, Void arg) {
        // Renommer les références simples
        if (n.getNameAsString().equals(shortClassName)) {
            try {
                if (n.calculateResolvedType().describe().equals(qualifiedClassName)) {
                    System.out.println("[ClassRenamer] Renaming name expression: " + n.getNameAsString() + " -> " + newName);
                    n.setName(newName);
                }
            } catch (Exception e) {
                // On peut essayer de renommer en se basant uniquement sur le nom
                System.out.println("[!] Nom non résolu : " + n.toString() + " - " + e.getMessage());
            }
        }
        return super.visit(n, arg);
    }
}
