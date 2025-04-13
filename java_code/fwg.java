/*
 * Decompiled with CFR 0.152.
 */
public class fwg {
    public void a(int n, float[] fArray) {
        fArray[0] = fwg.b(n >> 16);
        fArray[1] = fwg.b(n >> 8);
        fArray[2] = fwg.b(n);
        fArray[3] = fwg.b(n >> 24);
        fwg.b(fArray, fArray);
        fArray[3] = 1.0f - fArray[3];
    }

    public int a(float[] fArray) {
        fArray[3] = 1.0f - fArray[3];
        fwg.a(fArray, fArray);
        return fwg.a(fArray[2]) | fwg.a(fArray[1]) << 8 | fwg.a(fArray[0]) << 16 | fwg.a(fArray[3]) << 24;
    }

    float a(int n) {
        return n == 0 ? -1.0f : (n == 2 ? 0.5f : 1.0f);
    }

    private static float b(int n) {
        return (float)(n & 0xFF) / 255.0f;
    }

    private static int a(float f2) {
        return (int)(255.0f * f2);
    }

    private static float[] a(float[] fArray, float[] fArray2) {
        if (fArray2 == null) {
            fArray2 = new float[3];
        }
        float f2 = fArray[0];
        float f3 = fArray[1];
        float f4 = fArray[2];
        if (f3 > 0.0f) {
            f2 = f2 < 1.0f ? f2 * 6.0f : 0.0f;
            float f5 = f4 + f3 * (f4 > 0.5f ? 1.0f - f4 : f4);
            float f6 = 2.0f * f4 - f5;
            fArray2[0] = fwg.c(f5, f6, f2 < 4.0f ? f2 + 2.0f : f2 - 4.0f);
            fArray2[1] = fwg.c(f5, f6, f2);
            fArray2[2] = fwg.c(f5, f6, f2 < 2.0f ? f2 + 4.0f : f2 - 2.0f);
        } else {
            fArray2[0] = f4;
            fArray2[1] = f4;
            fArray2[2] = f4;
        }
        return fArray2;
    }

    private static float[] b(float[] fArray, float[] fArray2) {
        if (fArray2 == null) {
            fArray2 = new float[3];
        }
        float f2 = fwg.b(fArray[0], fArray[1], fArray[2]);
        float f3 = fwg.a(fArray[0], fArray[1], fArray[2]);
        float f4 = f2 + f3;
        float f5 = f2 - f3;
        if (f5 > 0.0f) {
            f5 /= f4 > 1.0f ? 2.0f - f4 : f4;
        }
        fArray2[0] = fwg.a(fArray[0], fArray[1], fArray[2], f2, f3);
        fArray2[1] = f5;
        fArray2[2] = f4 / 2.0f;
        return fArray2;
    }

    static float a(float f2, float f3, float f4) {
        float f5 = f2 < f3 ? f2 : f3;
        return f5 < f4 ? f5 : f4;
    }

    static float b(float f2, float f3, float f4) {
        float f5 = Math.max(f2, f3);
        return Math.max(f5, f4);
    }

    static float a(float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 - f6;
        if (f7 > 0.0f) {
            if (f5 == f2) {
                if ((f7 = (f3 - f4) / f7) < 0.0f) {
                    f7 += 6.0f;
                }
            } else {
                f7 = f5 == f3 ? 2.0f + (f4 - f2) / f7 : 4.0f + (f2 - f3) / f7;
            }
            f7 /= 6.0f;
        }
        return f7;
    }

    private static float c(float f2, float f3, float f4) {
        if (f4 < 1.0f) {
            return f3 + (f2 - f3) * f4;
        }
        if (f4 < 3.0f) {
            return f2;
        }
        if (f4 < 4.0f) {
            return f3 + (f2 - f3) * (4.0f - f4);
        }
        return f3;
    }
}

