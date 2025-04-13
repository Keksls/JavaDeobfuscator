/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fKy
 */
public class fky_1<T extends fky_1>
extends fks_1<T> {
    protected fyo j;
    protected String k;
    protected final String l;
    protected String m = null;

    public fky_1(aqx_2 aqx_22, fyo fyo2, String string, String string2, T t, boolean bl) {
        super(string, string2, t, bl);
        this.a(bl);
        this.l = this.a(aqx_22);
        this.a(fyo2, string);
        this.m = null;
    }

    @Override
    protected void a(boolean bl) {
        if (bl) {
            this.a(new fkw_1(fya_0.class, "env", "environment", true));
            this.a(new fkv_1(null, "push", "elementMaps", "currentElementMap"));
        }
        this.a(new fkw_1(fyy_0.class, "elementMap", "elementMaps.peek()"));
    }

    @Override
    String a(Object object) {
        String string = super.a(object);
        if (this.m == null && object instanceof fyb_0) {
            this.m = string;
        }
        return string;
    }

    public fyo k() {
        return this.j;
    }

    public String l() {
        return this.k;
    }

    public String m() {
        return this.l;
    }

    public String n() {
        return this.m;
    }

    @Override
    public void a(String string, Object object) {
        super.a(string, object);
        if (this.m == null && object instanceof fyb_0) {
            this.m = string;
        }
    }

    public void a(fyo fyo2, String string, boolean bl) {
        this.j = fyo2;
        this.b = string;
        if (this.j != null) {
            this.k = this.a(fyo2);
        }
        if (bl) {
            this.k = string;
        }
        if (this.j != null && this.b != null) {
            this.a(this.b, this.j);
        }
    }

    public void a(fyo fyo2, String string) {
        this.a(fyo2, string, false);
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.h.clear();
        if (this.b != null && this.j != null) {
            printWriter.println("\tpublic BasicElement " + this.g() + "(final " + this.j.getClass().getSimpleName() + " " + this.b + ") {");
        } else {
            printWriter.println("\t@Override");
            printWriter.println("\tpublic BasicElement " + this.g() + "(final Environment environment, final ElementMap currentElementMap) {");
        }
        for (fkt_1 fkt_12 : this.e) {
            printWriter.println("\t\t" + fkt_12.a(this));
        }
        printWriter.println("\t\treturn " + this.m + ";");
        printWriter.println("\t}");
    }
}

