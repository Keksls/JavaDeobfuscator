/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.baseImpl.graphics.alea.display.RenderTreeStencil;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.awt.BorderLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

public class agr {
    private JPanel a;
    private JTree b;
    private DefaultMutableTreeNode c;

    public agr() {
        this.b();
    }

    public void a(RenderTreeStencil renderTreeStencil) {
        this.c.removeAllChildren();
        DefaultMutableTreeNode defaultMutableTreeNode = this.c;
        for (RenderTreeStencil renderTreeStencil2 = renderTreeStencil; renderTreeStencil2 != null; renderTreeStencil2 = renderTreeStencil2.c()) {
            Entity entity = renderTreeStencil2.b();
            ArrayList<Entity> arrayList = renderTreeStencil2.g();
            ArrayList<RenderTreeStencil> arrayList2 = renderTreeStencil2.f();
            ArrayList<RenderTreeStencil> arrayList3 = renderTreeStencil2.e();
            String string = entity.getClass().getSimpleName();
            String string2 = string + " [ radius=" + entity.i + ", afterCount=" + arrayList.size() + ", maskCount=" + arrayList2.size() + ", overCount=" + arrayList3.size() + " ]";
            DefaultMutableTreeNode defaultMutableTreeNode2 = new DefaultMutableTreeNode(string2);
            defaultMutableTreeNode.add(defaultMutableTreeNode2);
            defaultMutableTreeNode = defaultMutableTreeNode2;
        }
        this.a(this.b, true);
        this.b.repaint();
    }

    private void b() {
        this.a = new JPanel();
        this.a.setLayout(new BorderLayout(0, 0));
        JScrollPane jScrollPane = new JScrollPane();
        this.a.add((Component)jScrollPane, "Center");
        this.c = new DefaultMutableTreeNode("Root");
        this.b = new JTree(this.c);
        jScrollPane.setViewportView(this.b);
    }

    public void a(JTree jTree, boolean bl) {
        TreeNode treeNode = (TreeNode)jTree.getModel().getRoot();
        this.a(jTree, new TreePath(treeNode), bl);
    }

    private void a(JTree jTree, TreePath treePath, boolean bl) {
        TreeNode treeNode = (TreeNode)treePath.getLastPathComponent();
        if (treeNode.getChildCount() >= 0) {
            Enumeration<? extends TreeNode> enumeration = treeNode.children();
            while (enumeration.hasMoreElements()) {
                TreeNode treeNode2 = enumeration.nextElement();
                TreePath treePath2 = treePath.pathByAddingChild(treeNode2);
                this.a(jTree, treePath2, bl);
            }
        }
        if (bl) {
            jTree.expandPath(treePath);
        } else {
            jTree.collapsePath(treePath);
        }
    }

    public JPanel a() {
        return this.a;
    }
}

