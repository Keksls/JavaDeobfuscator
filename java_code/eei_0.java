/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eEi
 */
public final class eei_0 {
    public static boolean a(int n, epq_2 epq_22) {
        long l = euv_2.a.b(epq_22.U_());
        Object t = euw_2.a.d(l);
        if (t == null) {
            return false;
        }
        fjv_0 fjv_02 = ((fjw_0)fjw_0.e()).c(((epq_2)t).T_());
        if (fjv_02 == null) {
            return false;
        }
        if (!fjv_02.c() && !fjv_02.a()) {
            return true;
        }
        if (n == -1) {
            return epq_22.dr() == epq_22.dt();
        }
        return epq_22.dr() == n;
    }
}

