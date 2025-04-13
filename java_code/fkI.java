/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fkI
extends fkg_0<fkj_0> {
    private static final Logger b = Logger.getLogger(fkI.class);

    public fkI(fkj_0 fkj_02) {
        super(fkj_02);
    }

    public boolean a(int n, int n2) {
        short s2 = fkh_0.e(n);
        short s3 = fkh_0.f(n2);
        for (esy_2 esy_22 : ((fkj_0)this.a).e(s2, s3)) {
            this.a(new fkr_0(esy_22));
        }
        this.b(n, n2);
        this.b(n + 1, n2);
        this.b(n, n2 + 1);
        this.b(n + 1, n2 + 1);
        return !this.b();
    }

    private void b(int n, int n2) {
        short s2 = ((fkj_0)this.a).b(n, n2);
        if (s2 != 0) {
            etn_2 etn_22 = eti_2.a.d(s2);
            this.a(new fkw(etn_22, n, n2));
        }
    }
}

