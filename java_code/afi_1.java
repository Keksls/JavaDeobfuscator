/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aFi
 */
public final class afi_1 {
    public static float a(float f2, float f3) {
        afi_1.a(new double[]{f2, f3});
        return f2 * f3;
    }

    public static float b(float f2, float f3) {
        afi_1.a(new double[]{f2, f3});
        return f2 + f3 - afi_1.a(f2, f3);
    }

    public static float a(float f2, float f3, float f4) {
        afi_1.a(new double[]{f2, f3});
        return f2 + f3 + f4 - afi_1.a(f2, f3) - afi_1.a(f2, f4) - afi_1.a(f3, f4) + afi_1.a(new float[]{f2, f3, f4});
    }

    public static float a(float ... fArray) {
        if (fArray.length == 0) {
            return 0.0f;
        }
        double d2 = fArray[0];
        for (int k = 1; k < fArray.length; ++k) {
            double d3 = fArray[k];
            afi_1.a(d3);
            d2 *= d3;
        }
        return (float)d2;
    }

    private static void a(double ... dArray) {
        for (int k = 0; k < dArray.length; ++k) {
            if (dArray[k] < 0.0) {
                throw new IllegalArgumentException("a < 0.0f");
            }
            if (!(dArray[k] > 1.0)) continue;
            throw new IllegalArgumentException("a > 1,0f");
        }
    }
}

