/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLw
 */
class flw_1 {
    final fld_1 a = new fld_1();
    int b;
    int c;

    flw_1() {
    }

    static float a(float[] fArray, float[] fArray2, int n, int n2) {
        int n3;
        float f2;
        float[] fArray3 = new float[n2 + 1];
        int n4 = n2 + 1;
        while (n4-- != 0) {
            f2 = 0.0f;
            for (n3 = n4; n3 < n; ++n3) {
                f2 += fArray[n3] * fArray[n3 - n4];
            }
            fArray3[n4] = f2;
        }
        float f3 = fArray3[0];
        for (n3 = 0; n3 < n2; ++n3) {
            f2 = -fArray3[n3 + 1];
            if (f3 == 0.0f) {
                for (int k = 0; k < n2; ++k) {
                    fArray2[k] = 0.0f;
                }
                return 0.0f;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                f2 -= fArray2[n4] * fArray3[n3 - n4];
            }
            fArray2[n3] = f2 /= f3;
            for (n4 = 0; n4 < n3 / 2; ++n4) {
                float f4 = fArray2[n4];
                int n5 = n4;
                fArray2[n5] = fArray2[n5] + f2 * fArray2[n3 - 1 - n4];
                int n6 = n3 - 1 - n4;
                fArray2[n6] = fArray2[n6] + f2 * f4;
            }
            if (n3 % 2 != 0) {
                int n7 = n4;
                fArray2[n7] = fArray2[n7] + fArray2[n4] * f2;
            }
            f3 = (float)((double)f3 * (1.0 - (double)(f2 * f2)));
        }
        return f3;
    }

    float a(float[] fArray, float[] fArray2) {
        int n;
        int n2 = this.b;
        float[] fArray3 = new float[n2 + n2];
        float f2 = (float)(0.5 / (double)n2);
        for (n = 0; n < n2; ++n) {
            fArray3[n * 2] = fArray[n] * f2;
            fArray3[n * 2 + 1] = 0.0f;
        }
        fArray3[n2 * 2 - 1] = fArray[n2 - 1] * f2;
        this.a.a(fArray3);
        n = 0;
        int n3 = (n2 *= 2) / 2;
        while (n < n2 / 2) {
            float f3 = fArray3[n];
            fArray3[n++] = fArray3[n3];
            fArray3[n3++] = f3;
        }
        return flw_1.a(fArray3, fArray2, n2, this.c);
    }

    void a(int n, int n2) {
        this.b = n;
        this.c = n2;
        this.a.a(n * 2);
    }

    void a() {
        this.a.a();
    }

    static float a(float f2, float f3) {
        return (float)Math.sqrt(f2 * f2 + f3 * f3);
    }

    void a(float[] fArray, float[] fArray2, float f2) {
        int n;
        for (n = 0; n < this.b * 2; ++n) {
            fArray[n] = 0.0f;
        }
        if (f2 == 0.0f) {
            return;
        }
        for (n = 0; n < this.c; ++n) {
            fArray[n * 2 + 1] = fArray2[n] / (4.0f * f2);
            fArray[n * 2 + 2] = -fArray2[n] / (4.0f * f2);
        }
        this.a.a(fArray);
        n = this.b * 2;
        float f3 = (float)(1.0 / (double)f2);
        fArray[0] = (float)(1.0 / (double)(fArray[0] * 2.0f + f3));
        for (int k = 1; k < this.b; ++k) {
            float f4 = fArray[k] + fArray[n - k];
            float f5 = fArray[k] - fArray[n - k];
            float f6 = f4 + f3;
            fArray[k] = (float)(1.0 / (double)flw_1.a(f6, f5));
        }
    }
}

