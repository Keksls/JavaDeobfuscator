/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jdom.Element
 */
import org.jdom.Element;

/*
 * Renamed from Yl
 */
public class yl_0 {
    public final int a;
    public final int b;
    public final int c;

    public yl_0(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
    }

    final Element a(String string) {
        Element element = new Element(string);
        element.setAttribute("id", String.valueOf(this.a));
        element.setAttribute("minQuantity", String.valueOf(this.b));
        element.setAttribute("maxQuantity", String.valueOf(this.c));
        return element;
    }
}

