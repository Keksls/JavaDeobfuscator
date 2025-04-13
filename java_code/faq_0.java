/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from faQ
 */
public class faq_0 {
    private static final int[] a = new int[]{exh_2.a.A, exh_2.f.A, exh_2.d.A, exh_2.n.A, exh_2.m.A, exh_2.p.A, exh_2.q.A};

    public static far_0 a(exk_2 exk_22, exk_2 exk_23) {
        int n;
        far_0 far_02 = faq_0.a(exk_22);
        if (far_02 != far_0.a) {
            return far_02;
        }
        far_0 far_03 = faq_0.a(exk_23);
        if (far_03 != far_0.a) {
            return far_03;
        }
        if (exk_22.a() == exk_23.a()) {
            return far_0.c;
        }
        int n2 = exk_22.aT_();
        int n3 = exk_22.l() == 0 ? n2 : exk_22.l();
        int n4 = n = exk_23.l() == 0 ? exk_23.aT_() : exk_23.l();
        if (n3 == n || n2 == n) {
            return far_0.d;
        }
        exq_1 exq_12 = faq_0.a(exk_22.U());
        exq_1 exq_13 = faq_0.a(exk_23.U());
        if (exq_12 == null || exq_13 == null) {
            return far_0.b;
        }
        if (exq_12.d() != exq_13.d()) {
            return far_0.e;
        }
        return far_0.a;
    }

    public static far_0 a(exk_2 exk_22) {
        if (exk_22 == null) {
            return far_0.b;
        }
        if (exk_22.e() > 1) {
            return far_0.g;
        }
        if (!faq_0.b(exk_22)) {
            return far_0.b;
        }
        return far_0.a;
    }

    public static boolean b(exk_2 exk_22) {
        exh_2[] exh_2Array = exk_22.U().h();
        if (exh_2Array.length == 0) {
            return false;
        }
        for (exh_2 exh_22 : exh_2Array) {
            if (ahi_2.a(a, (int)exh_22.a())) continue;
            return false;
        }
        return exk_22.T().a(exz_1.h) == null;
    }

    public static exq_1 a(exq_1 exq_12) {
        if (exq_12 == null || exq_12.k()) {
            return exq_12;
        }
        return faq_0.a(exq_12.f());
    }

    public static eyc_2 c(exk_2 exk_22) {
        if (exk_22.n() != null && exk_22.n().a().g()) {
            return exk_22.n();
        }
        return eye_1.a(eyh_1.i, true);
    }
}

