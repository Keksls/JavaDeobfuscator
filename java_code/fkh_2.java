/*
 * Decompiled with CFR 0.152.
 */
import java.io.PrintWriter;

/*
 * Renamed from fKH
 */
public class fkh_2
extends fks_1<fkh_2> {
    public fkh_2(String string, fkh_2 fkh_22) {
        super(null, string, fkh_22, false);
    }

    @Override
    public void a(PrintWriter printWriter) {
        this.h.clear();
        printWriter.println("\tpublic void " + this.g() + "() {");
        for (fkt_1 fkt_12 : this.e) {
            printWriter.println("\t\t" + fkt_12.a(this));
        }
        printWriter.println("\t}");
    }
}

