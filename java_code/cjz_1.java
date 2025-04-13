/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cjz
 */
public class cjz_1
implements adx_1<coB> {
    @Override
    public boolean a(coB coB2) {
        fzw_0.a.a("marketSearchesLock", true);
        if (coB2.g().c()) {
            bQG.a(coB2.h(), new Object[0]);
            return false;
        }
        switch (coB2.c()) {
            case d: {
                bky_0.a().a(coB2.b());
                break;
            }
            case e: {
                bky_0.a().u().a(coB2.b());
            }
        }
        return false;
    }

    @Override
    public int a() {
        return 13409;
    }
}

