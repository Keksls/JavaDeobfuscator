/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fKF
 */
public class fkf_2
extends fky_1<fkf_2> {
    private static final String n = "doc";
    private final boolean o;

    public fkf_2(aqx_2 aqx_22, fyo fyo2, String string, String string2, fkf_2 fkf_22, boolean bl) {
        super(aqx_22, fyo2, string, string2, fkf_22, bl);
        this.o = bl;
    }

    @Override
    protected void a(boolean bl) {
        if (bl) {
            this.a(new fkw_1(fyw_0.class, n, "parser", true));
            this.a(new fkv_1(null, "push", "elementMaps", "currentElementMap"));
        }
        this.a(new fkw_1(fyy_0.class, "elementMap", "elementMaps.peek()"));
    }

    public String o() {
        return n;
    }

    @Override
    public void a(fyo fyo2, String string) {
        this.j = fyo2;
        this.b = string;
        if (this.j != null) {
            this.k = this.a(fyo2);
        }
        if (this.j != null && this.b != null) {
            this.a(this.b, this.j);
        }
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.h.clear();
        if (this.o) {
            printWriter.println("\t@Override");
            printWriter.println("\tpublic void " + this.g() + "(final ElementMap currentElementMap, final DocumentParser parser, final Widget " + this.b + ") {");
        } else {
            printWriter.println("\tpublic BasicElement " + this.g() + "(final BasicElement " + this.b + ") {");
        }
        for (fkt_1 fkt_12 : this.e) {
            printWriter.println("\t\t" + fkt_12.a(this));
        }
        if (!this.o) {
            printWriter.println("\t\treturn " + this.m + ";");
        }
        printWriter.println("\t}");
    }
}

