/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ckg
 */
final class ckg_0
implements adx_1<cyd_1> {
    private static final Logger a = Logger.getLogger(ckg_0.class);

    ckg_0() {
    }

    @Override
    public boolean a(cyd_1 cyd_12) {
        boolean bl = new fiL().a(cyd_12.b(), cyd_12.c(), cyd_12.d());
        if (!bl) {
            return false;
        }
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(cyd_12.b());
        if (bnh_12 != null) {
            int n = bnh_12.dw().e() - 1;
            if (azu_0.j().c(dcX.a)) {
                dcX.a.d(n);
            }
            if (cyd_12.c() >= 0) {
                bld_0 bld_02 = cwa_0.a.e();
                bld_02.c();
                cwa_0.a.d();
                if (!fpm_0.b().q("spellDeckDialog")) {
                    if (azu_0.j().c(dcX.a)) {
                        det.a(1);
                    }
                    det.a(1);
                }
                dfc dfc2 = new dfc(19533);
                dfc2.a(cwa_0.a.e().c(n + 1));
                add_2.b().a(dfc2);
                add_2.b().a(new dfc(16237));
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 12401;
    }
}

