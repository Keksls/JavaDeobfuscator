/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjB
 */
public class cjb_1
implements adx_1<coE> {
    @Override
    public boolean a(coE coE2) {
        fzw_0.a.a("marketSearchesLock", true);
        if (coE2.g().c()) {
            bQG.a(coE2.h(), new Object[0]);
            return false;
        }
        switch (coE2.c()) {
            case b: {
                bky_0.a().a(coE2.b());
                break;
            }
            case c: {
                bky_0.a().u().a(coE2.b());
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 12781;
    }
}

