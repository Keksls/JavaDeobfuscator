/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ahT
 */
public class aht_0 {
    private aht_0() {
    }

    public static afd_1 a(ahg_0 ahg_02, apv_2 apv_22) {
        return aht_0.a(ahg_02, apv_22.J(), apv_22.K(), apv_22.L());
    }

    public static afd_1 a(ahg_0 ahg_02, float f2, float f3, float f4) {
        float f5 = ahg_02.c(f2, f3);
        float f6 = ahg_02.a(f2, f3, f4);
        return new afd_1(f5, f6);
    }

    public static afd_1 b(ahg_0 ahg_02, apv_2 apv_22) {
        return aht_0.b(ahg_02, apv_22.J(), apv_22.K(), apv_22.L());
    }

    public static afd_1 b(ahg_0 ahg_02, float f2, float f3, float f4) {
        ahq_0 ahq_02 = ahg_02.s();
        float f5 = ahq_02.g() / ahg_02.G();
        float f6 = ahg_02.c(f2, f3) - ahq_02.g_();
        float f7 = ahg_02.a(f2, f3, f4) - ahq_02.h_();
        return new afd_1(f6 *= f5, f7 *= f5);
    }

    public static afd_1 c(ahg_0 ahg_02, apv_2 apv_22) {
        return aht_0.c(ahg_02, apv_22.J(), apv_22.K(), apv_22.L());
    }

    public static afd_1 c(ahg_0 ahg_02, float f2, float f3, float f4) {
        afd_1 afd_12 = aht_0.b(ahg_02, f2, f3, f4);
        afd_12.a += ahg_02.E() * 0.5f;
        afd_12.b += ahg_02.F() * 0.5f;
        return afd_12;
    }

    public static int a(ahg_0 ahg_02, short s2) {
        return (int)((float)s2 * ahg_02.y() * ahg_02.s().g());
    }
}

