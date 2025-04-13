/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fkF
 */
public class fkf_0
extends fkg_0<fkj_0> {
    private static final Logger b = Logger.getLogger(fkf_0.class);
    private final fkm_0 c;

    public fkf_0(fkj_0 fkj_02, fkm_0 fkm_02) {
        super(fkj_02);
        this.c = fkm_02;
    }

    public boolean a(short s2, int n, int n2) {
        if (!((fkj_0)this.a).a(n, n2)) {
            this.b(s2, n, n2);
            return false;
        }
        fkj_0 fkj_02 = ((fkj_0)this.a).f();
        fkj_02.a(n, n2, s2);
        if (!this.a(fkj_02, n, n2)) {
            this.b(s2, n, n2);
            return false;
        }
        this.b(fkj_02, n, n2);
        return this.b();
    }

    private void b(short s2, int n, int n2) {
        etn_2 etn_22 = eti_2.a.d(s2);
        this.a(new fkw(etn_22, n, n2));
    }

    private boolean a(fkj_0 fkj_02, int n, int n2) {
        return fkk_0.a(fkj_02.b(n - 1, n2)) || fkk_0.a(fkj_02.b(n + 1, n2)) || fkk_0.a(fkj_02.b(n, n2 - 1)) || fkk_0.a(fkj_02.b(n, n2 + 1));
    }

    private void b(fkj_0 fkj_02, int n, int n2) {
        short s2 = fkh_0.e(n);
        short s3 = fkh_0.f(n2);
        for (esy_2 esy_22 : fkj_02.e(s2, s3)) {
            if (this.a(fkj_02, esy_22)) continue;
            this.a(new fkr_0(esy_22));
        }
    }

    public boolean a(fkj_0 fkj_02, esy_2 esy_22) {
        afk_2 afk_22 = esy_22.j();
        int n = afk_22.b;
        int n2 = afk_22.d;
        int n3 = afk_22.c;
        int n4 = afk_22.e;
        for (int k = n2; k < n4; ++k) {
            for (int i2 = n; i2 < n3; ++i2) {
                if (!this.c(fkj_02, i2, k)) continue;
                return false;
            }
        }
        return true;
    }

    private boolean c(fkj_0 fkj_02, int n, int n2) {
        return fkf_0.a(this.c, fkj_02, n, n2);
    }

    static boolean a(fkm_0 fkm_02, fkj_0 fkj_02, int n, int n2) {
        int n3 = fkk_0.b(n);
        int n4 = fkk_0.c(n2);
        short s2 = fkj_02.b(n3, n4);
        Object p2 = fkm_02.c(s2);
        int n5 = n3 * 9;
        int n6 = n4 * 9;
        int n7 = n - n5;
        int n8 = n2 - n6;
        return p2 == null || ((fkk_0)p2).a(n7, n8) || ((fkk_0)p2).e(n7, n8) != 0;
    }
}

