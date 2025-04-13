/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjS
 */
public class cjs_1
implements adx_1<cpl_0> {
    @Override
    public boolean a(cpl_0 cpl_02) {
        fzw_0.a.a("marketRetrieveLock", true);
        if (cpl_02.g().c()) {
            bQG.a(cpl_02.h(), new Object[0]);
            return false;
        }
        daw.g();
        if (fpm_0.b().q("marketPurchasedItemsDetailDialog")) {
            if (cpl_02.b() == 1) {
                daw.d().h(bky_0.a().s().a(1), true);
            } else {
                daw.d().h(0, true);
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 13515;
    }
}

