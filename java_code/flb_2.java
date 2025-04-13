/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLB
 */
class flb_2 {
    int a;
    int b;
    float[] c;
    int[] d;
    float e;
    float[] f = new float[1024];
    float[] g = new float[1024];

    flb_2() {
    }

    void a(int n) {
        int n2;
        this.d = new int[n / 4];
        this.c = new float[n + n / 4];
        this.b = (int)Math.rint(Math.log(n) / Math.log(2.0));
        this.a = n;
        int n3 = 0;
        int n4 = 1;
        int n5 = n3 + n / 2;
        int n6 = n5 + 1;
        int n7 = n5 + n / 2;
        int n8 = n7 + 1;
        for (n2 = 0; n2 < n / 4; ++n2) {
            this.c[n3 + n2 * 2] = (float)Math.cos(Math.PI / (double)n * (double)(4 * n2));
            this.c[n4 + n2 * 2] = (float)(-Math.sin(Math.PI / (double)n * (double)(4 * n2)));
            this.c[n5 + n2 * 2] = (float)Math.cos(Math.PI / (double)(2 * n) * (double)(2 * n2 + 1));
            this.c[n6 + n2 * 2] = (float)Math.sin(Math.PI / (double)(2 * n) * (double)(2 * n2 + 1));
        }
        for (n2 = 0; n2 < n / 8; ++n2) {
            this.c[n7 + n2 * 2] = (float)Math.cos(Math.PI / (double)n * (double)(4 * n2 + 2));
            this.c[n8 + n2 * 2] = (float)(-Math.sin(Math.PI / (double)n * (double)(4 * n2 + 2)));
        }
        n2 = (1 << this.b - 1) - 1;
        int n9 = 1 << this.b - 2;
        for (int k = 0; k < n / 8; ++k) {
            int n10 = 0;
            int n11 = 0;
            while (n9 >>> n11 != 0) {
                if ((n9 >>> n11 & k) != 0) {
                    n10 |= 1 << n11;
                }
                ++n11;
            }
            this.d[k * 2] = ~n10 & n2;
            this.d[k * 2 + 1] = n10;
        }
        this.e = 4.0f / (float)n;
    }

    void a() {
    }

    void a(float[] fArray, float[] fArray2) {
    }

    synchronized void b(float[] fArray, float[] fArray2) {
        int n;
        if (this.f.length < this.a / 2) {
            this.f = new float[this.a / 2];
        }
        if (this.g.length < this.a / 2) {
            this.g = new float[this.a / 2];
        }
        float[] fArray3 = this.f;
        float[] fArray4 = this.g;
        int n2 = this.a >>> 1;
        int n3 = this.a >>> 2;
        int n4 = this.a >>> 3;
        int n5 = 1;
        int n6 = 0;
        int n7 = n2;
        for (n = 0; n < n4; ++n) {
            fArray3[n6++] = -fArray[n5 + 2] * this.c[(n7 -= 2) + 1] - fArray[n5] * this.c[n7];
            fArray3[n6++] = fArray[n5] * this.c[n7 + 1] - fArray[n5 + 2] * this.c[n7];
            n5 += 4;
        }
        n5 = n2 - 4;
        for (n = 0; n < n4; ++n) {
            fArray3[n6++] = fArray[n5] * this.c[(n7 -= 2) + 1] + fArray[n5 + 2] * this.c[n7];
            fArray3[n6++] = fArray[n5] * this.c[n7] - fArray[n5 + 2] * this.c[n7 + 1];
            n5 -= 4;
        }
        float[] fArray5 = this.a(fArray3, fArray4, this.a, n2, n3, n4);
        n6 = 0;
        n7 = n2;
        n = n3;
        int n8 = n - 1;
        int n9 = n3 + n2;
        int n10 = n9 - 1;
        for (int k = 0; k < n3; ++k) {
            float f2 = fArray5[n6] * this.c[n7 + 1] - fArray5[n6 + 1] * this.c[n7];
            float f3 = -(fArray5[n6] * this.c[n7] + fArray5[n6 + 1] * this.c[n7 + 1]);
            fArray2[n] = -f2;
            fArray2[n8] = f2;
            fArray2[n9] = f3;
            fArray2[n10] = f3;
            ++n;
            --n8;
            ++n9;
            --n10;
            n6 += 2;
            n7 += 2;
        }
    }

    private float[] a(float[] fArray, float[] fArray2, int n, int n2, int n3, int n4) {
        float f2;
        float f3;
        float f4;
        float f5;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = n3;
        int n10 = 0;
        int n11 = n3;
        int n12 = n2;
        for (n8 = 0; n8 < n3; ++n8) {
            float f6 = fArray[n9] - fArray[n10];
            fArray2[n11 + n8] = fArray[n9++] + fArray[n10++];
            float f7 = fArray[n9] - fArray[n10];
            fArray2[n8++] = f6 * this.c[n12 -= 4] + f7 * this.c[n12 + 1];
            fArray2[n8] = f7 * this.c[n12] - f6 * this.c[n12 + 1];
            fArray2[n11 + n8] = fArray[n9++] + fArray[n10++];
        }
        for (n8 = 0; n8 < this.b - 3; ++n8) {
            int n13 = n >>> n8 + 2;
            int n14 = 1 << n8 + 3;
            n7 = n2 - 2;
            n12 = 0;
            for (n6 = 0; n6 < n13 >>> 2; ++n6) {
                n5 = n7;
                n11 = n5 - (n13 >> 1);
                f5 = this.c[n12];
                f4 = this.c[n12 + 1];
                n7 -= 2;
                ++n13;
                for (int k = 0; k < 2 << n8; ++k) {
                    f3 = fArray2[n5] - fArray2[n11];
                    fArray[n5] = fArray2[n5] + fArray2[n11];
                    f2 = fArray2[++n5] - fArray2[++n11];
                    fArray[n5] = fArray2[n5] + fArray2[n11];
                    fArray[n11] = f2 * f5 - f3 * f4;
                    fArray[n11 - 1] = f3 * f5 + f2 * f4;
                    n5 -= n13;
                    n11 -= n13;
                }
                --n13;
                n12 += n14;
            }
            float[] fArray3 = fArray2;
            fArray2 = fArray;
            fArray = fArray3;
        }
        n8 = n;
        int n15 = 0;
        int n16 = 0;
        n7 = n2 - 1;
        for (int k = 0; k < n4; ++k) {
            n6 = this.d[n15++];
            n5 = this.d[n15++];
            f5 = fArray2[n6] - fArray2[n5 + 1];
            f2 = fArray2[n6 - 1] + fArray2[n5];
            f4 = fArray2[n6] + fArray2[n5 + 1];
            f3 = fArray2[n6 - 1] - fArray2[n5];
            float f8 = f5 * this.c[n8];
            float f9 = f2 * this.c[n8++];
            float f10 = f5 * this.c[n8];
            float f11 = f2 * this.c[n8++];
            fArray[n16++] = (f4 + f10 + f9) * 0.5f;
            fArray[n7--] = (-f3 + f11 - f8) * 0.5f;
            fArray[n16++] = (f3 + f11 - f8) * 0.5f;
            fArray[n7--] = (f4 - f10 - f9) * 0.5f;
        }
        return fArray;
    }
}

