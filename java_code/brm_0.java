/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Optional;

/*
 * Renamed from bRM
 */
class brm_0
implements TObjectProcedure<bNI> {
    public static final brm_0 a = new brm_0();
    private ArrayList<bNS> b;
    private boolean c = true;
    private boolean d = true;
    private boolean e = true;

    private brm_0() {
    }

    public void a(ArrayList<bNS> arrayList) {
        this.b = arrayList;
        bNJ.a().a(this);
        this.b = null;
    }

    public boolean a(bNI bNI2) {
        eAJ eAJ2 = eAJ.a(bNI2.j());
        if (eAJ2 == null) {
            return true;
        }
        switch (eAJ2) {
            case d: {
                if (this.c) break;
                return true;
            }
            case c: {
                if (this.d) break;
                return true;
            }
            case a: {
                if (this.e) break;
                return true;
            }
            default: {
                return true;
            }
        }
        int n = Integer.MAX_VALUE;
        Optional<ece_0> optional = bgg.a.a(azu_0.j().n().u());
        if (optional.isPresent()) {
            int n2 = bNI2.l();
            for (int k = 0; k < n2; ++k) {
                bNR bNR2 = (bNR)bNI2.a(k);
                int n3 = bNR2.g();
                for (int i2 = 0; i2 < n3; ++i2) {
                    brw_1 brw_12 = (brw_1)bNR2.c(i2);
                    int n4 = brw_12.k();
                    if (!optional.get().e(brw_12.l()) || n4 >= n || n4 > optional.get().f(brw_12.l())) continue;
                    n = n4;
                }
            }
        }
        if (n != Integer.MAX_VALUE) {
            this.b.add(new bNS(bNI2, n));
        }
        return true;
    }

    public boolean a() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public boolean b() {
        return this.d;
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public boolean c() {
        return this.e;
    }

    public void c(boolean bl) {
        this.e = bl;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bNI)object);
    }
}

