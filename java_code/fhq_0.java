/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

/*
 * Renamed from fhQ
 */
public final class fhq_0 {
    public static boolean a(fhp_0 fhp_02, fhf_0<?> fhf_02, epj_1 epj_12, Yf yf, int n) {
        return fhq_0.a(fhp_02, fhf_02, epj_12, yf, Hw.f(), n);
    }

    public static boolean a(fhp_0 fhp_02, fhf_0<?> fhf_02, epj_1 epj_12, Yf yf, Random random, int n) {
        short s2 = epj_12.a(fhf_02.h(), fhf_02.j());
        return s2 > 0 && random.nextDouble() < fhq_0.a(fhp_02, fhf_02, s2, yf, n);
    }

    public static double b(fhp_0 fhp_02, fhf_0<?> fhf_02, epj_1 epj_12, Yf yf, int n) {
        short s2 = epj_12.a(fhf_02.h(), fhf_02.j());
        return fhq_0.a(fhp_02, fhf_02, s2, yf, n);
    }

    private static double a(fhp_0 fhp_02, fhf_0<?> fhf_02, int n, Yf yf, int n2) {
        double d2 = fhq_0.a(n);
        double d3 = fhq_0.a(fhf_02, yf);
        double d4 = fhq_0.a(fhp_02, n2);
        return Hw.b(d2 * d3 * d4, 0.0, 1.0);
    }

    private static double a(int n) {
        return (double)n / 100.0;
    }

    private static double a(fhf_0<?> fhf_02, Yf yf) {
        fhj_0 fhj_02 = fhf_02.m();
        return yf == Yf.a || fhj_02 == fhj_0.a || fhj_02.a().contains((Object)yf) ? 1.0 : 0.8;
    }

    private static double a(fhp_0 fhp_02, int n) {
        return 1.0 + fhp_02.z(n);
    }
}

