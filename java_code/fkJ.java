/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class fkJ
extends fkg_0<fkc_0> {
    private static final Logger b = Logger.getLogger(fkJ.class);

    public fkJ(fkc_0 fkc_02) {
        super(fkc_02);
    }

    public boolean d() {
        this.c();
        ArrayList<fkN> arrayList = fkJ.a((fkc_0)this.a);
        return arrayList.isEmpty();
    }

    public boolean e() {
        ArrayList<fkN> arrayList;
        this.c();
        fkc_0 fkc_02 = new fkc_0((fkc_0)this.a);
        boolean bl = true;
        while (bl && !(arrayList = fkJ.a(fkc_02)).isEmpty()) {
            bl = this.a(fkc_02, arrayList);
            int n = arrayList.size();
            for (int k = 0; k < n; ++k) {
                this.a(arrayList.get(k));
            }
        }
        return !this.b();
    }

    private static ArrayList<fkN> a(fkc_0 fkc_02) {
        ArrayList<fkN> arrayList = new ArrayList<fkN>();
        fkc_02.a(new fkK(fkc_02, arrayList));
        return arrayList;
    }

    private boolean a(fkc_0 fkc_02, ArrayList<fkN> arrayList) {
        boolean bl = false;
        for (fkN fkN2 : arrayList) {
            fkr_0 fkr_02 = (fkr_0)fkN2.c();
            bl |= fkc_02.b(fkr_02.e());
        }
        return bl;
    }
}

