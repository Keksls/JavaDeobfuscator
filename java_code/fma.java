/*
 * Decompiled with CFR 0.152.
 */
public class fma
implements asu_2 {
    protected int a;
    protected short b;
    protected int[] c;
    protected int[] d;
    protected fmb[] e;
    protected fmf[] f;
    protected fme[] g;
    protected fmc_0[] h;
    protected int i;
    protected int j;

    public int c() {
        return this.a;
    }

    public short d() {
        return this.b;
    }

    public int[] e() {
        return this.c;
    }

    public int[] f() {
        return this.d;
    }

    public fmb[] g() {
        return this.e;
    }

    public fmf[] h() {
        return this.f;
    }

    public fme[] i() {
        return this.g;
    }

    public fmc_0[] j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        int n3;
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.k();
        this.d = asc_22.k();
        int n4 = asc_22.f();
        this.e = new fmb[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.e[n3] = new fmb();
            this.e[n3].a(asc_22);
        }
        n3 = asc_22.f();
        this.f = new fmf[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.f[n2] = new fmf();
            this.f[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.g = new fme[n2];
        for (n = 0; n < n2; ++n) {
            this.g[n] = new fme();
            this.g[n].a(asc_22);
        }
        n = asc_22.f();
        this.h = new fmc_0[n];
        for (int k = 0; k < n; ++k) {
            this.h[k] = new fmc_0();
            this.h[k].a(asc_22);
        }
        this.i = asc_22.f();
        this.j = asc_22.f();
    }

    @Override
    public final int a() {
        return enK.aH.a();
    }
}

