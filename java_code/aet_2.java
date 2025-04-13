/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from aET
 */
public final class aet_2 {
    private static final Logger a = Logger.getLogger(aet_2.class);

    private static float a(int n, int n2) {
        int n3 = n + n2 * 57;
        n3 = n3 << 13 ^ n3;
        return 1.0f - (float)(n3 * (n3 * n3 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE) / 1.0737418E9f;
    }

    private static float b(int n, int n2) {
        float f2 = (aet_2.a(n - 1, n2 - 1) + aet_2.a(n + 1, n2 - 1) + aet_2.a(n - 1, n2 + 1) + aet_2.a(n + 1, n2 + 1)) / 16.0f;
        float f3 = (aet_2.a(n - 1, n2) + aet_2.a(n + 1, n2) + aet_2.a(n, n2 + 1) + aet_2.a(n, n2 - 1)) / 8.0f;
        float f4 = aet_2.a(n, n2) / 4.0f + f2 + f3;
        return f4;
    }

    private static float a(float f2, float f3, afc_1 afc_12) {
        int n = f2 < 0.0f ? (int)(f2 - 1.0f) : (int)f2;
        int n2 = f3 < 0.0f ? (int)(f3 - 1.0f) : (int)f3;
        float f4 = f2 - (float)n;
        float f5 = f3 - (float)n2;
        float f6 = aet_2.b(n, n2);
        float f7 = aet_2.b(n + 1, n2);
        float f8 = aet_2.b(n, n2 + 1);
        float f9 = aet_2.b(n + 1, n2 + 1);
        float f10 = afc_12.a(f6, f7, f4);
        float f11 = afc_12.a(f8, f9, f4);
        return afc_12.a(f10, f11, f5);
    }

    public static float a(float f2, float f3, float f4, int n, afc_1 afc_12) {
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 1.0f;
        for (int k = 0; k < n - 1; ++k) {
            f5 += aet_2.a(f2 * f6, f3 * f6, afc_12) * f7;
            f6 *= 2.0f;
            f7 *= f4;
        }
        return f5;
    }

    public static void a(float[] fArray, int n, int n2, float f2, float f3, int n3, int n4, float f4, int n5, aey_2 aey_22) {
        aey_2 aey_23 = aey_22 != null ? aey_22 : aeu_2.a;
        for (int k = 0; k < n2; ++k) {
            float f5 = (float)(k + n4) * f3 / (float)n2;
            for (int i2 = 0; i2 < n; ++i2) {
                float f6 = (float)(i2 + n3) * f2 / (float)n;
                float f7 = aet_2.a(f6, f5, f4, n5, aey_23.a());
                fArray[i2 + k * n] = aey_23.a(f6, f5, f7);
            }
        }
    }
}

