/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjP
 */
public class cjp_1
implements adx_1<cpe_0> {
    @Override
    public boolean a(cpe_0 cpe_02) {
        fzw_0.a.a("marketRetrieveLock", true);
        if (cpe_02.g().c()) {
            bQG.a(cpe_02.h(), new Object[0]);
            return false;
        }
        if (cpe_02.g() == faG.b) {
            aul_0.a().b(bQG.b(cpe_02.h(), new Object[0]));
        }
        daw.g();
        if (fpm_0.b().q("marketExpiredOffersDetailDialog")) {
            daw.d().g(0, true);
        }
        return false;
    }

    @Override
    public int a() {
        return 13019;
    }
}

