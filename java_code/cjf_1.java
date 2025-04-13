/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjF
 */
public class cjf_1
implements adx_1<coK> {
    @Override
    public boolean a(coK coK2) {
        fzw_0.a.a("marketFulfillOfferLock", true);
        if (coK2.g().c()) {
            bQG.a(coK2.h(), new Object[0]);
            return false;
        }
        cHE.closeOfferFulfillWindow();
        if (daw.k() || daw.m()) {
            bky_0.a().u().h();
        } else {
            daw.d().b(bky_0.a().m().a(1), true);
        }
        return false;
    }

    @Override
    public int a() {
        return 12759;
    }
}

