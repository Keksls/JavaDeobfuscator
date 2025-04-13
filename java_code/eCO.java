/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

public class eCO {
    public static final eCO a = new eCO();
    private final acy_2<ebs_0> b = new acy_2();
    private final acy_2<eCV> c = new acy_2();

    public void a(eCV eCV2) {
        int n = eCV2.a();
        this.c.a(n, eCV2);
        if (eCV2.e()) {
            this.b.a(n, new ebs_0());
        }
    }

    public eCV a(int n) {
        return this.c.g(n);
    }

    public ebs_0 b(int n) {
        return this.b.g(n);
    }

    public void a(TObjectProcedure<eCV> tObjectProcedure) {
        int n = this.c.d();
        for (int k = 0; k < n; ++k) {
            eCV eCV2 = this.c.h(k);
            if (!eCV2.d() || tObjectProcedure.execute((Object)eCV2)) continue;
            return;
        }
    }

    public int a() {
        return this.c.d();
    }

    public void b(TObjectProcedure<eCV> tObjectProcedure) {
        int n = this.c.d();
        for (int k = 0; k < n; ++k) {
            eCV eCV2 = this.c.h(k);
            if (tObjectProcedure.execute((Object)eCV2)) continue;
            return;
        }
    }

    public boolean a(int ... nArray) {
        int n = this.c.d();
        for (int k = 0; k < n; ++k) {
            eCV eCV2 = this.c.h(k);
            for (int i2 = 0; i2 < nArray.length; ++i2) {
                int n2 = nArray[i2];
                if (!eCV2.c(n2)) continue;
                return true;
            }
        }
        return false;
    }

    public eCQ c(int n) {
        int n2 = this.c.d();
        for (int k = 0; k < n2; ++k) {
            eCV eCV2 = this.c.h(k);
            eCQ eCQ2 = eCV2.a(n);
            if (eCQ2 == null) continue;
            return eCQ2;
        }
        return null;
    }
}

