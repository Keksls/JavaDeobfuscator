/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fLl
 */
class fll_1 {
    static final int a = 63;
    static final int b = 16;
    static final int c = 31;
    int d;
    int[] e = new int[31];
    int[] f = new int[16];
    int[] g = new int[16];
    int[] h = new int[16];
    int[][] i = new int[16][];
    int j;
    int[] k = new int[65];
    float l;
    float m;
    float n;
    int o;
    int p;
    int q;
    float r;
    int s;
    int t;
    int u;
    final /* synthetic */ flj_1 v;

    fll_1(flj_1 flj_12) {
        this.v = flj_12;
        for (int k = 0; k < this.i.length; ++k) {
            this.i[k] = new int[8];
        }
    }

    void a() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.k = null;
    }

    Object b() {
        fll_1 fll_12 = this;
        fll_1 fll_13 = new fll_1(this.v);
        fll_13.d = fll_12.d;
        System.arraycopy(fll_12.e, 0, fll_13.e, 0, 31);
        System.arraycopy(fll_12.f, 0, fll_13.f, 0, 16);
        System.arraycopy(fll_12.g, 0, fll_13.g, 0, 16);
        System.arraycopy(fll_12.h, 0, fll_13.h, 0, 16);
        for (int k = 0; k < 16; ++k) {
            System.arraycopy(fll_12.i[k], 0, fll_13.i[k], 0, 8);
        }
        fll_13.j = fll_12.j;
        System.arraycopy(fll_12.k, 0, fll_13.k, 0, 65);
        fll_13.l = fll_12.l;
        fll_13.m = fll_12.m;
        fll_13.n = fll_12.n;
        fll_13.o = fll_12.o;
        fll_13.p = fll_12.p;
        fll_13.q = fll_12.q;
        fll_13.r = fll_12.r;
        fll_13.s = fll_12.s;
        fll_13.t = fll_12.t;
        fll_13.u = fll_12.u;
        return fll_13;
    }
}

