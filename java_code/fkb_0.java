/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fkB
 */
public final class fkb_0 {
    private static final Logger a = Logger.getLogger(fkb_0.class);

    private fkb_0() {
    }

    @Nullable
    public static wu_0 a(long l, etg_2 etg_22, long l2) {
        etk_1 etk_12;
        if (etg_22.e()) {
            return null;
        }
        ww_0 ww_02 = new ww_0(etg_22.d());
        try {
            etk_12 = etl_1.a.a(l);
        }
        catch (etf_1 etf_12) {
            a.error((Object)"Exception raised", (Throwable)etf_12);
            return wt_0.b(l2).a(ww_02);
        }
        int n = etk_12.a();
        float f2 = (float)(100 + n) / 100.0f;
        ww_02.a(f2);
        return wt_0.b(l2).a(ww_02);
    }

    public static boolean a(long l, ese_1 ese_12) {
        etg_2 etg_22 = eti_2.a.b(ese_12.a().a());
        if (etg_22 == null) {
            return false;
        }
        wu_0 wu_02 = fkb_0.a(l, etg_22, ese_12.c());
        return wu_02 == null || !wu_02.d(wc_0.p().a());
    }

    public static long a(etw_2 etw_22, long l) {
        etk_1 etk_12;
        int n = etw_22.b();
        try {
            etk_12 = etl_1.a.a(l);
        }
        catch (etf_1 etf_12) {
            a.error((Object)"Exception raised", (Throwable)etf_12);
            return n;
        }
        if (etk_12 == null) {
            return n;
        }
        return (long)((double)n * (100.0 + (double)etk_12.c()) / 100.0);
    }

    public static int b(etw_2 etw_22, long l) {
        etk_1 etk_12;
        int n = etw_22.g();
        try {
            etk_12 = etl_1.a.a(l);
        }
        catch (etf_1 etf_12) {
            a.error((Object)"Exception raised", (Throwable)etf_12);
            return n;
        }
        if (etk_12 == null) {
            return n;
        }
        return Hw.e((long)((double)n * (100.0 + (double)etk_12.d()) / 100.0));
    }

    public static long a(esy_2 esy_22, fkc_0 fkc_02) {
        return Math.max(0L, fkb_0.a(esy_22.g(), fkc_02.i()) - fkc_02.c());
    }

    public static int b(esy_2 esy_22, fkc_0 fkc_02) {
        return Math.max(0, fkb_0.b(esy_22.g(), fkc_02.i()) - fkc_02.k());
    }

    public static int c(esy_2 esy_22, fkc_0 fkc_02) {
        return Math.max(0, esy_22.g().e() - fkc_02.g());
    }

    public static boolean a(esy_2 esy_22, fkc_0 fkc_02, boolean bl) {
        int n;
        etw_2 etw_22 = esy_22.g();
        etk_2 etk_22 = esy_22.n();
        if (etk_22.k() <= 0) {
            return true;
        }
        etr_1 etr_12 = new etr_1(etw_22.a());
        fkc_02.a(etr_12);
        int n2 = etr_12.a();
        if (bl) {
            --n2;
        }
        return (n = etk_22.k() - n2) > 0;
    }

    public static eub_2 d(esy_2 esy_22, fkc_0 fkc_02) {
        eub_2 eub_22 = new eub_2(fkc_02, esy_22.g().a());
        return eub_22;
    }
}

