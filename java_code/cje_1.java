/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjE
 */
public class cje_1
implements adx_1<coI> {
    @Override
    public boolean a(coI coI2) {
        fzw_0.a.a("marketRetrieveLock", true);
        if (coI2.g().c()) {
            bQG.a(coI2.h(), new Object[0]);
            return false;
        }
        if (coI2.g() == faG.b) {
            aul_0.a().b(bQG.b(coI2.h(), new Object[0]));
        }
        daw.g();
        if (fpm_0.b().q("marketSoldItemsDetailDialog")) {
            daw.d().d(0, true);
        }
        return false;
    }

    @Override
    public int a() {
        return 13133;
    }
}

