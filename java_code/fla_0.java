/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fla
 */
public class fla_0 {
    public static long a(double d2, epq_2 epq_22) {
        float f2;
        enu_0 enu_02 = enu_0.a;
        if (epq_22 instanceof emh_0) {
            enu_02 = ((emh_0)((Object)epq_22)).N_().c();
        }
        float f3 = f2 = enu_02 == null ? 1.0f : enu_02.g();
        if (!epq_22.f(erl_2.aR) && !epq_22.f(erl_2.aR.c())) {
            d2 *= (double)f2;
        }
        return Math.round(d2);
    }

    public static long a(double d2) {
        return Math.round(d2 * (double)enu_0.b.g());
    }

    public static long b(double d2) {
        enu_0 enu_02 = enu_0.a(enu_0.b.c());
        float f2 = enu_02.g() - enu_0.b.g();
        return Math.round(d2 * (double)f2);
    }
}

