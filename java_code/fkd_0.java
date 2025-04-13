/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fkD
 */
public class fkd_0
extends fkg_0<fkj_0> {
    private static final Logger b = Logger.getLogger(fkd_0.class);
    private final fkm_0 c;

    public fkd_0(fkj_0 fkj_02, fkm_0 fkm_02) {
        super(fkj_02);
        this.c = fkm_02;
    }

    public boolean a(esd_1 esd_12) {
        this.b(esd_12);
        this.c(esd_12);
        return !this.b();
    }

    private void b(esd_1 esd_12) {
        Object t = esd_12.m();
        etw_2 etw_22 = esd_12.g();
        boolean bl = etw_22.i();
        int n = esd_12.h();
        int n2 = esd_12.i();
        int n3 = ((fkn_0)t).d();
        int n4 = ((fkn_0)t).e();
        esy_2[] esy_2Array = null;
        int s2 = Short.MIN_VALUE;
        int n5 = Short.MIN_VALUE;
        for (int k = n2; k < n2 + n4; ++k) {
            for (int i2 = n; i2 < n + n3; ++i2) {
                short s3;
                short s4;
                boolean bl2 = ((fkn_0)t).e(i2 - n, k - n2);
                if (bl && bl2) continue;
                short s5 = (short)XY.a(i2);
                short s6 = (short)XY.b(k);
                if (esy_2Array == null || s4 != s5 || s3 != s6) {
                    esy_2Array = ((fkj_0)this.a).e(s5, s6);
                    s4 = s5;
                    s3 = s6;
                }
                for (esy_2 esy_22 : esy_2Array) {
                    if (esy_22.c() == esd_12.c()) continue;
                    etw_2 etw_23 = esy_22.g();
                    if (!esy_22.b(i2, k)) continue;
                    if (!bl && !etw_23.i()) {
                        this.a(new fkr_0(esy_22));
                        continue;
                    }
                    if (bl2 || !esy_22.a(i2, k) || bl && esy_22.d(i2, k)) continue;
                    this.a(new fkr_0(esy_22));
                }
            }
        }
    }

    private void c(esd_1 esd_12) {
        afk_2 afk_22 = esd_12.j();
        for (int k = afk_22.d; k < afk_22.e; ++k) {
            for (int i2 = afk_22.b; i2 < afk_22.c; ++i2) {
                short s2 = fkh_0.c(i2);
                short s3 = fkh_0.d(k);
                short s4 = ((fkj_0)this.a).b(s2, s3);
                if (!((fkj_0)this.a).a(s2, s3)) {
                    this.a(s4, s2, s3);
                    continue;
                }
                if (!fkf_0.a(this.c, (fkj_0)this.a, i2, k)) continue;
                this.a(s4, s2, s3);
            }
        }
    }

    private void a(short s2, short s3, short s4) {
        etn_2 etn_22 = eti_2.a.d(s2);
        this.a(new fkw(etn_22, s3, s4));
    }
}

