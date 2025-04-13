/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eRF
 */
public class erf_1 {
    private erf_1() {
    }

    public static wt_0 a(erh_1 erh_12, eqd_0 eqd_02, double d2) {
        return erf_1.a(erh_12.b(), eqd_02.b(), d2);
    }

    public static boolean a(erh_1 erh_12) {
        return !erh_12.c().c() && erh_12.c().c(wc_0.p().j());
    }

    public static boolean b(erh_1 erh_12, eqd_0 eqd_02, double d2) {
        if (erf_1.a(erh_12)) {
            return false;
        }
        wt_0 wt_02 = erf_1.a(erh_12.b(), eqd_02.b(), d2);
        return wt_02.d(wc_0.p().a());
    }

    public static boolean c(erh_1 erh_12, eqd_0 eqd_02, double d2) {
        wt_0 wt_02 = erf_1.a(erh_12.b(), eqd_02.b(), d2);
        return wt_02.c(wc_0.p().a());
    }

    public static wt_0 d(erh_1 erh_12, eqd_0 eqd_02, double d2) {
        return erf_1.a(erh_12.c(), eqd_02.d(), d2);
    }

    public static wt_0 a(wu_0 wu_02, wx_0 wx_02, double d2) {
        wt_0 wt_02 = new wt_0(wu_02);
        if (wx_02.e()) {
            wt_02.a(new ww_0(Hw.d((double)wx_02.g() * d2)));
        }
        return wt_02;
    }
}

