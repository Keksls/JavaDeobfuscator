/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jdom.Content
 *  org.jdom.Element
 */
import java.nio.ByteBuffer;
import org.jdom.Content;
import org.jdom.Element;

/*
 * Renamed from Yn
 */
public class yn_0 {
    public final yl_0[] a;
    public final int b;
    public final int c;

    public yn_0(yl_0[] yl_0Array, int n, int n2) {
        this.a = yl_0Array;
        this.b = n;
        this.c = n2;
        this.b();
    }

    public yn_0(ByteBuffer byteBuffer) {
        this.c = byteBuffer.getShort() & 0xFFFF;
        this.b = byteBuffer.getShort() & 0xFFFF;
        int n = byteBuffer.get() & 0xFF;
        this.a = new yl_0[n];
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            int n4 = byteBuffer.getInt();
            this.a[k] = new yl_0(n2, n3, n4);
        }
    }

    public yl_0 a(int n) {
        for (yl_0 yl_02 : this.a) {
            if (yl_02.a != n) continue;
            return yl_02;
        }
        return null;
    }

    public void a(gk_0 gk_02) {
        gk_02.a((short)this.c);
        gk_02.a((short)this.b);
        gk_02.a((byte)this.a.length);
        for (int k = 0; k < this.a.length; ++k) {
            gk_02.a(this.a[k].a);
            gk_02.a(this.a[k].b);
            gk_02.a(this.a[k].c);
        }
    }

    public Element a() {
        Element element = new Element("resourceBalancing");
        element.setAttribute("max_quantity", String.valueOf(this.c));
        element.setAttribute("stasis_threshold", String.valueOf(this.b));
        for (int k = 0; k < this.a.length; ++k) {
            Element element2 = this.a[k].a("resourceFamily");
            element.addContent((Content)element2);
        }
        return element;
    }

    private void b() {
        int n = 0;
        for (yl_0 yl_02 : this.a) {
            n += yl_02.c;
        }
        if (n > this.c) {
            throw new RuntimeException("le nombre max de resources d\u00e9passe la quantit\u00e9 max");
        }
        if (this.b > this.c) {
            throw new RuntimeException("le seuil est sup\u00e9rieur \u00e0 la quantit\u00e9 max de resources");
        }
    }
}

