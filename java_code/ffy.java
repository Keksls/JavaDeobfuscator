/*
 * Decompiled with CFR 0.152.
 */
public class ffy {
    public static boolean a(ffu_0 ffu_02, int n) {
        Object r2 = eyo_1.g().d(n);
        eyw_1 eyw_12 = ((ezr_0)r2).p();
        return eyw_12 != null && eyw_12.f() == eyx_1.H || ffu_02.a().a(n);
    }

    public static boolean b(ffu_0 ffu_02, int n) {
        Object r2 = eyo_1.g().d(n);
        eyw_1 eyw_12 = ((ezr_0)r2).p();
        return eyw_12 != null && eyw_12.f() == eyx_1.G || ffu_02.a().b(n);
    }

    public static boolean a(ffu_0 ffu_02) {
        return ffu_02.a().d() <= ffu_02.f();
    }

    public static boolean b(ffu_0 ffu_02) {
        return ffu_02.j() == ffu_02.i();
    }

    public static boolean a(ffu_0 ffu_02, wu_0 wu_02) {
        wt_0 wt_02 = new wt_0(ffu_02.k());
        wt_02.d();
        ww_0 ww_02 = wt_02.g(wu_02);
        if (ffu_02.o()) {
            ww_0 ww_03 = ffu_02.n().g(wu_02);
            ww_02.f(ww_03);
        }
        return wt_02.j() == wu_02.j() && wt_02.m() == wu_02.m() && wt_02.o() == wu_02.o();
    }
}

