/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;

/*
 * Renamed from atL
 */
public class atl_2<T>
extends DefaultMutableTreeNode {
    Color a = Color.BLACK;
    T b;

    public atl_2() {
    }

    public atl_2(String string, Color color) {
        super(string);
        this.a = color;
    }

    public atl_2(String string, Color color, T t) {
        super(string);
        this.a = color;
        this.b = t;
    }

    public atl_2(String string) {
        super(string);
    }

    public Color a() {
        return this.a;
    }

    public void a(JPanel jPanel) {
    }
}

