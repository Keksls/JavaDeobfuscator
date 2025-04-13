package refactor;

import com.github.javaparser.ast.visitor.ModifierVisitor;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.MethodCallExpr;
import com.github.javaparser.ast.visitor.Visitable;
import com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration;

public class MethodRenamerVisitor extends ModifierVisitor<Void> {
    private String oldName;
    private String newName;
    private String targetClass;

    public MethodRenamerVisitor(String className, String oldName, String newName) {
        this.oldName = oldName;
        this.newName = newName;
        this.targetClass = className;
    }

    @Override
    public Visitable visit(MethodDeclaration n, Void arg) {
        try {
            ResolvedMethodDeclaration resolved = n.resolve();
            if (resolved.getName().equals(oldName)
                && resolved.declaringType().getQualifiedName().endsWith(targetClass)) {
                n.setName(newName);
            }
        } catch (Exception e) {
            // Résolution échouée, ignorer
        }
        return super.visit(n, arg);
    }

    @Override
    public Visitable visit(MethodCallExpr n, Void arg) {
        try {
            ResolvedMethodDeclaration resolved = n.resolve();
            System.out.println("MethodCall resolved: " + resolved.getQualifiedSignature());
    
            if (resolved.getName().equals(oldName)
                && resolved.declaringType().getQualifiedName().endsWith(targetClass)) {
                n.setName(newName);
            }
        } catch (Exception e) {
            System.out.println("[!] Call non résolu : " + n.toString() + " " + e.getMessage());
        }
        return super.visit(n, arg);
    }    
}