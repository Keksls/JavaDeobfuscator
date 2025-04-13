/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from foJ
 */
public class foj_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected long f;
    protected long g;
    protected byte h;
    protected short i;
    protected short j;
    protected foM[] k;
    protected foL[] l;
    protected foN[] m;
    protected foo_0[] n;
    protected int[] o;
    protected foK[] p;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public long h() {
        return this.f;
    }

    public long i() {
        return this.g;
    }

    public byte j() {
        return this.h;
    }

    public short k() {
        return this.i;
    }

    public short l() {
        return this.j;
    }

    public foM[] m() {
        return this.k;
    }

    public foL[] n() {
        return this.l;
    }

    public foN[] o() {
        return this.m;
    }

    public foo_0[] p() {
        return this.n;
    }

    public int[] q() {
        return this.o;
    }

    public foK[] r() {
        return this.p;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0L;
        this.g = 0L;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        int n3;
        int n4;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.h();
        this.g = asc_22.h();
        this.h = asc_22.b();
        this.i = asc_22.d();
        this.j = asc_22.d();
        int n5 = asc_22.f();
        this.k = new foM[n5];
        for (n4 = 0; n4 < n5; ++n4) {
            this.k[n4] = new foM();
            this.k[n4].a(asc_22);
        }
        n4 = asc_22.f();
        this.l = new foL[n4];
        for (n3 = 0; n3 < n4; ++n3) {
            this.l[n3] = new foL();
            this.l[n3].a(asc_22);
        }
        n3 = asc_22.f();
        this.m = new foN[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.m[n2] = new foN();
            this.m[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.n = new foo_0[n2];
        for (n = 0; n < n2; ++n) {
            this.n[n] = new foo_0();
            this.n[n].a(asc_22);
        }
        this.o = asc_22.k();
        n = asc_22.f();
        this.p = new foK[n];
        for (int k = 0; k < n; ++k) {
            this.p[k] = new foK();
            this.p[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bk.a();
    }
}

