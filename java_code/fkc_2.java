/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fKC
 */
public class fkc_2
extends fks_1<fkc_2> {
    private final fyw_0 j;

    public fkc_2(fyw_0 fyw_02, String string, String string2, fkc_2 fkc_22, boolean bl) {
        super(string, string2, fkc_22, bl);
        this.j = fyw_02;
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.h.clear();
        printWriter.println("\tpublic void " + this.g() + "(DocumentParser " + this.b + ") {");
        for (fkt_1 fkt_12 : this.e) {
            printWriter.println("\t\t" + fkt_12.a(this));
        }
        printWriter.println("\t}");
    }
}

