/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjQ
 */
public class cjq_1
implements adx_1<cph_0> {
    @Override
    public boolean a(cph_0 cph_02) {
        fzw_0.a.a("marketRetrieveLock", true);
        if (cph_02.g().c()) {
            bQG.a(cph_02.h(), new Object[0]);
            return false;
        }
        daw.g();
        if (fpm_0.b().q("marketExpiredEntriesDetailDialog")) {
            if (cph_02.b() == 1) {
                daw.d().e(bky_0.a().p().a(1), true);
            } else {
                daw.d().e(0, true);
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 13893;
    }
}

