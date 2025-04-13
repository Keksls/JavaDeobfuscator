/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLs
 */
public class fls_1 {
    private static final int C = -136;
    private static final int D = -135;
    private static final byte[] E = "vorbis".getBytes();
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 3;
    private static final int I = 1;
    private static final int J = 1;
    public int a;
    public int b;
    public int c;
    int d;
    int e;
    int f;
    final int[] g = new int[2];
    int h;
    int i;
    int j;
    int k;
    int l;
    int m;
    int n;
    flt_1[] o = null;
    int[] p = null;
    Object[] q = null;
    int[] r = null;
    Object[] s = null;
    int[] t = null;
    Object[] u = null;
    int[] v = null;
    Object[] w = null;
    flj_2[] x = null;
    final flc_2[] y = new flc_2[64];
    int z;
    float A;
    float B;

    public void a() {
        this.c = 0;
    }

    public void b() {
        int n;
        for (n = 0; n < this.h; ++n) {
            this.o[n] = null;
        }
        this.o = null;
        for (n = 0; n < this.i; ++n) {
            flp_1.a[this.p[n]].a(this.q[n]);
        }
        this.q = null;
        for (n = 0; n < this.j; ++n) {
            flr_1.a[this.r[n]].a(this.s[n]);
        }
        this.s = null;
        for (n = 0; n < this.k; ++n) {
            flo_1.c[this.t[n]].b(this.u[n]);
        }
        this.u = null;
        for (n = 0; n < this.l; ++n) {
            flq_1.a[this.v[n]].a(this.w[n]);
        }
        this.w = null;
        for (n = 0; n < this.m; ++n) {
            if (this.x[n] == null) continue;
            this.x[n].a();
            this.x[n] = null;
        }
        this.x = null;
        for (n = 0; n < this.n; ++n) {
            this.y[n].a();
        }
    }

    int a(fks_2 fks_22) {
        this.a = fks_22.c(32);
        if (this.a != 0) {
            return -1;
        }
        this.b = fks_22.c(8);
        this.c = fks_22.c(32);
        this.d = fks_22.c(32);
        this.e = fks_22.c(32);
        this.f = fks_22.c(32);
        this.g[0] = 1 << fks_22.c(4);
        this.g[1] = 1 << fks_22.c(4);
        if (this.c < 1 || this.b < 1 || this.g[0] < 8 || this.g[1] < this.g[0] || fks_22.c(1) != 1) {
            this.b();
            return -1;
        }
        return 0;
    }

    int b(fks_2 fks_22) {
        int n;
        this.m = fks_22.c(8) + 1;
        if (this.x == null || this.x.length != this.m) {
            this.x = new flj_2[this.m];
        }
        for (n = 0; n < this.m; ++n) {
            this.x[n] = new flj_2();
            if (this.x[n].b(fks_22) == 0) continue;
            this.b();
            return -1;
        }
        this.j = fks_22.c(6) + 1;
        if (this.r == null || this.r.length != this.j) {
            this.r = new int[this.j];
        }
        if (this.s == null || this.s.length != this.j) {
            this.s = new Object[this.j];
        }
        for (n = 0; n < this.j; ++n) {
            this.r[n] = fks_22.c(16);
            if (this.r[n] < 0 || this.r[n] >= 1) {
                this.b();
                return -1;
            }
            this.s[n] = flr_1.a[this.r[n]].a(this, fks_22);
            if (this.s[n] != null) continue;
            this.b();
            return -1;
        }
        this.k = fks_22.c(6) + 1;
        if (this.t == null || this.t.length != this.k) {
            this.t = new int[this.k];
        }
        if (this.u == null || this.u.length != this.k) {
            this.u = new Object[this.k];
        }
        for (n = 0; n < this.k; ++n) {
            this.t[n] = fks_22.c(16);
            if (this.t[n] < 0 || this.t[n] >= 2) {
                this.b();
                return -1;
            }
            this.u[n] = flo_1.c[this.t[n]].a(this, fks_22);
            if (this.u[n] != null) continue;
            this.b();
            return -1;
        }
        this.l = fks_22.c(6) + 1;
        if (this.v == null || this.v.length != this.l) {
            this.v = new int[this.l];
        }
        if (this.w == null || this.w.length != this.l) {
            this.w = new Object[this.l];
        }
        for (n = 0; n < this.l; ++n) {
            this.v[n] = fks_22.c(16);
            if (this.v[n] < 0 || this.v[n] >= 3) {
                this.b();
                return -1;
            }
            this.w[n] = flq_1.a[this.v[n]].a(this, fks_22);
            if (this.w[n] != null) continue;
            this.b();
            return -1;
        }
        this.i = fks_22.c(6) + 1;
        if (this.p == null || this.p.length != this.i) {
            this.p = new int[this.i];
        }
        if (this.q == null || this.q.length != this.i) {
            this.q = new Object[this.i];
        }
        for (n = 0; n < this.i; ++n) {
            this.p[n] = fks_22.c(16);
            if (this.p[n] < 0 || this.p[n] >= 1) {
                this.b();
                return -1;
            }
            this.q[n] = flp_1.a[this.p[n]].a(this, fks_22);
            if (this.q[n] != null) continue;
            this.b();
            return -1;
        }
        this.h = fks_22.c(6) + 1;
        if (this.o == null || this.o.length != this.h) {
            this.o = new flt_1[this.h];
        }
        for (n = 0; n < this.h; ++n) {
            this.o[n] = new flt_1();
            this.o[n].a = fks_22.c(1);
            this.o[n].b = fks_22.c(16);
            this.o[n].c = fks_22.c(16);
            this.o[n].d = fks_22.c(8);
            if (this.o[n].b < 1 && this.o[n].c < 1 && this.o[n].d < this.i) continue;
            this.b();
            return -1;
        }
        if (fks_22.c(1) != 1) {
            this.b();
            return -1;
        }
        return 0;
    }

    public int a(flb_1 flb_12, fkt_2 fkt_22) {
        fks_2 fks_22 = new fks_2();
        if (fkt_22 != null) {
            fks_22.a(fkt_22.a, fkt_22.b, fkt_22.c);
            byte[] byArray = new byte[6];
            int n = fks_22.c(8);
            fks_22.a(byArray, 6);
            if (byArray[0] != 118 || byArray[1] != 111 || byArray[2] != 114 || byArray[3] != 98 || byArray[4] != 105 || byArray[5] != 115) {
                return -1;
            }
            switch (n) {
                case 1: {
                    if (fkt_22.d == 0) {
                        return -1;
                    }
                    if (this.c != 0) {
                        return -1;
                    }
                    return this.a(fks_22);
                }
                case 3: {
                    if (this.c == 0) {
                        return -1;
                    }
                    return flb_12.a(fks_22);
                }
                case 5: {
                    if (this.c == 0 || flb_12.d == null) {
                        return -1;
                    }
                    return this.b(fks_22);
                }
            }
        }
        return -1;
    }

    int c(fks_2 fks_22) {
        fks_22.a(1, 8);
        fks_22.a(E);
        fks_22.a(0, 32);
        fks_22.a(this.b, 8);
        fks_22.a(this.c, 32);
        fks_22.a(this.d, 32);
        fks_22.a(this.e, 32);
        fks_22.a(this.f, 32);
        fks_22.a(fll_2.b(this.g[0]), 4);
        fks_22.a(fll_2.b(this.g[1]), 4);
        fks_22.a(1, 1);
        return 0;
    }

    int d(fks_2 fks_22) {
        int n;
        fks_22.a(5, 8);
        fks_22.a(E);
        fks_22.a(this.m - 1, 8);
        for (n = 0; n < this.m; ++n) {
            if (this.x[n].a(fks_22) == 0) continue;
            return -1;
        }
        fks_22.a(this.j - 1, 6);
        for (n = 0; n < this.j; ++n) {
            fks_22.a(this.r[n], 16);
            flr_1.a[this.r[n]].a(this.s[n], fks_22);
        }
        fks_22.a(this.k - 1, 6);
        for (n = 0; n < this.k; ++n) {
            fks_22.a(this.t[n], 16);
            flo_1.c[this.t[n]].a(this.u[n], fks_22);
        }
        fks_22.a(this.l - 1, 6);
        for (n = 0; n < this.l; ++n) {
            fks_22.a(this.v[n], 16);
            flq_1.a[this.v[n]].a(this.w[n], fks_22);
        }
        fks_22.a(this.i - 1, 6);
        for (n = 0; n < this.i; ++n) {
            fks_22.a(this.p[n], 16);
            flp_1.a[this.p[n]].a(this, this.q[n], fks_22);
        }
        fks_22.a(this.h - 1, 6);
        for (n = 0; n < this.h; ++n) {
            fks_22.a(this.o[n].a, 1);
            fks_22.a(this.o[n].b, 16);
            fks_22.a(this.o[n].c, 16);
            fks_22.a(this.o[n].d, 8);
        }
        fks_22.a(1, 1);
        return 0;
    }

    public int a(fkt_2 fkt_22) {
        fks_2 fks_22 = new fks_2();
        fks_22.a(fkt_22.a, fkt_22.b, fkt_22.c);
        if (fks_22.c(1) != 0) {
            return -135;
        }
        int n = 0;
        for (int k = this.h; k > 1; k >>>= 1) {
            ++n;
        }
        int n2 = fks_22.c(n);
        if (n2 == -1) {
            return -136;
        }
        return this.g[this.o[n2].a];
    }

    public String toString() {
        return "version:" + this.a + ", channels:" + this.b + ", rate:" + this.c + ", bitrate:" + this.d + "," + this.e + "," + this.f;
    }
}

