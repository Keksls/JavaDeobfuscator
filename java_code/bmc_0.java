/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bMC
 */
public class bmc_0 {
    public static long a = 0L;
    public static final int b = 60000;

    public static void a() {
        long l = System.currentTimeMillis();
        if (a + 60000L < l) {
            bMn bMn2;
            bmr_1 bmr_12 = azu_0.j().k();
            boolean bl = bmr_12 != null && bmr_12.di() == bmr_12.dj();
            bMn bMn3 = bMn2 = bl ? bwy_2.h().k() : bwy_2.h().j();
            if (bMn2 != null) {
                cqt_0 cqt_02 = new cqt_0();
                cqt_02.b(bMn2.B());
                azu_0.j().K().c(cqt_02);
                a = l;
            }
        }
    }
}

