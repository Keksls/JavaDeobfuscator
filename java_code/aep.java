/*
 * Decompiled with CFR 0.152.
 */
public final class aep
implements aeo {
    private static final int c = 7;
    public static final int a = 128;
    private static final int d = 127;
    private static final int e = 16383;
    private final float[][] f;
    private final afk_2 g = new afk_2(0, 0, 0, 0);

    public aep() {
        this.f = new float[16384][];
        for (int k = 0; k < 16384; ++k) {
            this.f[k] = new float[]{0.0f, 0.0f, 0.0f};
        }
    }

    public final void a(float[] fArray, int n, int n2, int n3, int n4) {
        for (int k = 0; k < n2; ++k) {
            int n5 = k * n;
            int n6 = aep.a(n3, k + n4);
            for (int i2 = 0; i2 < n; ++i2) {
                float f2 = fArray[i2 + n5];
                float[] fArray2 = this.f[i2 + n6 & 0x3FFF];
                fArray2[0] = fArray2[0] * f2;
                fArray2[1] = fArray2[1] * f2;
                fArray2[2] = fArray2[2] * f2;
            }
        }
    }

    public final void a(float[] fArray, int n, int n2, int n3, int n4, float f2, float f3) {
        assert (this.f.length >= fArray.length);
        float f4 = (1.0f - f2) * (1.0f - f3);
        float f5 = (1.0f - f2) * f3;
        float f6 = f2 * (1.0f - f3);
        float f7 = f2 * f3;
        for (int k = 0; k < n2 - 1; ++k) {
            int n5 = k * n;
            int n6 = (k + 1) * n;
            int n7 = aep.a(n3, k + n4);
            for (int i2 = 0; i2 < n - 1; ++i2) {
                float f8 = fArray[i2 + n5];
                float f9 = fArray[i2 + n6];
                float f10 = fArray[i2 + 1 + n5];
                float f11 = fArray[i2 + 1 + n6];
                float f12 = f4 * f8 + f5 * f9 + f6 * f10 + f7 * f11;
                float[] fArray2 = this.f[i2 + n7 & 0x3FFF];
                fArray2[0] = f12;
                fArray2[1] = f12;
                fArray2[2] = f12;
            }
        }
    }

    @Override
    public final void a(int n, int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7) {
        int n4 = aep.a(n, n2);
        float[] fArray = this.f[n4];
        fArray[0] = fArray[0] + f2;
        fArray[1] = fArray[1] + f3;
        fArray[2] = fArray[2] + f4;
    }

    public float[] a(int n, int n2, int n3) {
        int n4 = aep.a(n, n2);
        return this.f[n4];
    }

    @Override
    public afk_2 b() {
        return this.g;
    }

    @Override
    public void a(int n, int n2, int n3, int n4) {
        this.g.a(n, n + n3, n2, n2 + n4);
    }

    public String toString() {
        return "LightMap window={" + this.g + "}";
    }

    private static int a(int n, int n2) {
        return (n & 0x7F) + ((n2 & 0x7F) << 7);
    }

    public void a() {
        int n = this.g.a();
        int n2 = this.g.c();
        int n3 = this.g.e() - 1;
        int n4 = this.g.f() - 1;
        for (int k = 0; k < n4; ++k) {
            int n5 = (k + n2 & 0x7F) << 7;
            for (int i2 = 0; i2 < n3; ++i2) {
                float[] fArray = this.f[(i2 + n & 0x7F) + n5];
                fArray[0] = 1.0f;
                fArray[1] = 1.0f;
                fArray[2] = 1.0f;
            }
        }
    }
}

