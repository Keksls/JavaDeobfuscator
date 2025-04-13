/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLe
 */
public class fle_1 {
    static final float a = (float)Math.PI;
    static final int b = 1;
    static final int c = 1;
    int d;
    fls_1 e;
    int f;
    float[][] g;
    int h;
    int i;
    int j;
    float[] k;
    int l;
    int m;
    int n;
    int o;
    int p;
    int q;
    int r;
    long s;
    long t;
    long u;
    long v;
    long w;
    long x;
    final float[][][][][] y;
    final Object[][] z = new Object[2][];
    fkz_2[] A;
    Object[] B;
    byte[] C;
    byte[] D;
    byte[] E;

    public fle_1() {
        this.y = new float[2][][][][];
        this.y[0] = new float[2][][][];
        this.y[0][0] = new float[2][][];
        this.y[0][1] = new float[2][][];
        this.y[0][0][0] = new float[2][];
        this.y[0][0][1] = new float[2][];
        this.y[0][1][0] = new float[2][];
        this.y[0][1][1] = new float[2][];
        this.y[1] = new float[2][][][];
        this.y[1][0] = new float[2][][];
        this.y[1][1] = new float[2][][];
        this.y[1][0][0] = new float[2][];
        this.y[1][0][1] = new float[2][];
        this.y[1][1][0] = new float[2][];
        this.y[1][1][1] = new float[2][];
    }

    static float[] a(int n, int n2, int n3, int n4) {
        float[] fArray = new float[n2];
        switch (n) {
            case 0: {
                float f2;
                int n5;
                int n6 = n2 / 4 - n3 / 2;
                int n7 = n2 - n2 / 4 - n4 / 2;
                for (n5 = 0; n5 < n3; ++n5) {
                    f2 = (float)(((double)n5 + 0.5) / (double)n3 * 3.1415927410125732 / 2.0);
                    f2 = (float)Math.sin(f2);
                    f2 *= f2;
                    f2 = (float)((double)f2 * 1.5707963705062866);
                    fArray[n5 + n6] = f2 = (float)Math.sin(f2);
                }
                for (n5 = n6 + n3; n5 < n7; ++n5) {
                    fArray[n5] = 1.0f;
                }
                for (n5 = 0; n5 < n4; ++n5) {
                    f2 = (float)(((double)(n4 - n5) - 0.5) / (double)n4 * 3.1415927410125732 / 2.0);
                    f2 = (float)Math.sin(f2);
                    f2 *= f2;
                    f2 = (float)((double)f2 * 1.5707963705062866);
                    fArray[n5 + n7] = f2 = (float)Math.sin(f2);
                }
                break;
            }
            default: {
                return null;
            }
        }
        return fArray;
    }

    int a(fls_1 fls_12, boolean bl) {
        int n;
        this.e = fls_12;
        this.f = fll_2.b(fls_12.h);
        this.z[0] = new Object[1];
        this.z[1] = new Object[1];
        this.z[0][0] = new flb_2();
        this.z[1][0] = new flb_2();
        ((flb_2)this.z[0][0]).a(fls_12.g[0]);
        ((flb_2)this.z[1][0]).a(fls_12.g[1]);
        this.y[0][0][0] = new float[1][];
        this.y[0][0][1] = this.y[0][0][0];
        this.y[0][1][0] = this.y[0][0][0];
        this.y[0][1][1] = this.y[0][0][0];
        this.y[1][0][0] = new float[1][];
        this.y[1][0][1] = new float[1][];
        this.y[1][1][0] = new float[1][];
        this.y[1][1][1] = new float[1][];
        for (n = 0; n < 1; ++n) {
            this.y[0][0][0][n] = fle_1.a(n, fls_12.g[0], fls_12.g[0] / 2, fls_12.g[0] / 2);
            this.y[1][0][0][n] = fle_1.a(n, fls_12.g[1], fls_12.g[0] / 2, fls_12.g[0] / 2);
            this.y[1][0][1][n] = fle_1.a(n, fls_12.g[1], fls_12.g[0] / 2, fls_12.g[1] / 2);
            this.y[1][1][0][n] = fle_1.a(n, fls_12.g[1], fls_12.g[1] / 2, fls_12.g[0] / 2);
            this.y[1][1][1][n] = fle_1.a(n, fls_12.g[1], fls_12.g[1] / 2, fls_12.g[1] / 2);
        }
        this.A = new fkz_2[fls_12.m];
        for (n = 0; n < fls_12.m; ++n) {
            this.A[n] = new fkz_2();
            this.A[n].a(fls_12.x[n]);
        }
        this.h = 8192;
        this.g = new float[fls_12.b][];
        for (n = 0; n < fls_12.b; ++n) {
            this.g[n] = new float[this.h];
        }
        this.o = 0;
        this.p = 0;
        this.i = this.r = fls_12.g[1] / 2;
        this.B = new Object[fls_12.h];
        for (n = 0; n < fls_12.h; ++n) {
            int n2 = fls_12.o[n].d;
            int n3 = fls_12.p[n2];
            this.B[n] = flp_1.a[n3].a(this, fls_12.o[n], fls_12.q[n2]);
        }
        return 0;
    }

    public int a(fls_1 fls_12) {
        this.a(fls_12, false);
        this.j = this.r;
        this.r -= fls_12.g[this.p] / 4 + fls_12.g[this.o] / 4;
        this.s = -1L;
        this.t = -1L;
        return 0;
    }

    fle_1(fls_1 fls_12) {
        this();
        this.a(fls_12, false);
        this.j = this.r;
        this.r -= fls_12.g[this.p] / 4 + fls_12.g[this.o] / 4;
        this.s = -1L;
        this.t = -1L;
    }

    public int a(fkx_2 fkx_22) {
        int n;
        int n2;
        int n3;
        if (this.r > this.e.g[1] / 2 && this.j > 8192) {
            n3 = this.r - this.e.g[1] / 2;
            n3 = this.j < n3 ? this.j : n3;
            this.i -= n3;
            this.r -= n3;
            this.j -= n3;
            if (n3 != 0) {
                for (n2 = 0; n2 < this.e.b; ++n2) {
                    System.arraycopy(this.g[n2], n3, this.g[n2], 0, this.i);
                }
            }
        }
        this.o = this.p;
        this.p = fkx_22.d;
        this.q = -1;
        this.u += (long)fkx_22.l;
        this.v += (long)fkx_22.m;
        this.w += (long)fkx_22.n;
        this.x += (long)fkx_22.o;
        if (this.t + 1L != fkx_22.j) {
            this.s = -1L;
        }
        this.t = fkx_22.j;
        n3 = this.e.g[this.p];
        n2 = this.r + this.e.g[this.o] / 4 + n3 / 4;
        int n4 = n2 - n3 / 2;
        int n5 = n4 + n3;
        int n6 = 0;
        int n7 = 0;
        if (n5 > this.h) {
            this.h = n5 + this.e.g[1];
            for (n = 0; n < this.e.b; ++n) {
                float[] fArray = new float[this.h];
                System.arraycopy(this.g[n], 0, fArray, 0, this.g[n].length);
                this.g[n] = fArray;
            }
        }
        switch (this.p) {
            case 0: {
                n6 = 0;
                n7 = this.e.g[0] / 2;
                break;
            }
            case 1: {
                n6 = this.e.g[1] / 4 - this.e.g[this.o] / 4;
                n7 = n6 + this.e.g[this.o] / 2;
            }
        }
        for (n = 0; n < this.e.b; ++n) {
            int n8 = n4;
            int n9 = 0;
            for (n9 = n6; n9 < n7; ++n9) {
                float[] fArray = this.g[n];
                int n10 = n8 + n9;
                fArray[n10] = fArray[n10] + fkx_22.a[n][n9];
            }
            while (n9 < n3) {
                this.g[n][n8 + n9] = fkx_22.a[n][n9];
                ++n9;
            }
        }
        if (this.s == -1L) {
            this.s = fkx_22.i;
        } else {
            this.s += (long)(n2 - this.r);
            if (fkx_22.i != -1L && this.s != fkx_22.i) {
                if (this.s > fkx_22.i && fkx_22.h != 0) {
                    n2 = (int)((long)n2 - (this.s - fkx_22.i));
                }
                this.s = fkx_22.i;
            }
        }
        this.r = n2;
        this.i = n5;
        if (fkx_22.h != 0) {
            this.n = 1;
        }
        return 0;
    }

    public int a(float[][][] fArray, int[] nArray) {
        if (this.j < this.r) {
            if (fArray != null) {
                for (int k = 0; k < this.e.b; ++k) {
                    nArray[k] = this.j;
                }
                fArray[0] = this.g;
            }
            return this.r - this.j;
        }
        return 0;
    }

    public int a(int n) {
        if (n != 0 && this.j + n > this.r) {
            return -1;
        }
        this.j += n;
        return 0;
    }

    public void a() {
    }
}

