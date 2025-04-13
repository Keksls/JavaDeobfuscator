/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgB
 */
final class cgb_2
implements adx_1<crQ> {
    cgb_2() {
    }

    @Override
    public boolean a(crQ crQ2) {
        long l = crQ2.b();
        byte by = crQ2.e();
        ezm_2.a(l, by, crQ2.c(), crQ2.d());
        bnh_1 bnh_12 = (bnh_1)euw_2.a.d(crQ2.b());
        if (bnh_12 != null) {
            bkr_2.v.a((int)by);
            bkr_2.v.a(true);
            if (crQ2.c() >= 0) {
                bld_0 bld_02 = cwa_0.a.e();
                bld_02.e();
                cwa_0.a.d();
                int n = bnh_12.dA().a() - 1;
                if (!fpm_0.b().q("aptitudeBonusDialog")) {
                    cVw.a.c();
                }
                dfc dfc2 = new dfc(17663);
                dfc2.a(cwa_0.a.e().d(n + 1));
                add_2.b().a(dfc2);
                add_2.b().a(new dfc(17032));
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 13671;
    }
}

