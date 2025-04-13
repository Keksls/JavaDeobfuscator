/*
 * Decompiled with CFR 0.152.
 */
public class foQ
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected int l;
    protected short m;
    protected int[] n;
    protected foT[] o;
    protected foR[] p;
    protected fos_0[] q;

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

    public int h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public int n() {
        return this.l;
    }

    public short o() {
        return this.m;
    }

    public int[] p() {
        return this.n;
    }

    public foT[] q() {
        return this.o;
    }

    public foR[] r() {
        return this.p;
    }

    public fos_0[] s() {
        return this.q;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.f();
        this.g = asc_22.f();
        this.h = asc_22.f();
        this.i = asc_22.f();
        this.j = asc_22.f();
        this.k = asc_22.f();
        this.l = asc_22.f();
        this.m = asc_22.d();
        this.n = asc_22.k();
        int n3 = asc_22.f();
        this.o = new foT[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.o[n2] = new foT();
            this.o[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.p = new foR[n2];
        for (n = 0; n < n2; ++n) {
            this.p[n] = new foR();
            this.p[n].a(asc_22);
        }
        n = asc_22.f();
        this.q = new fos_0[n];
        for (int k = 0; k < n; ++k) {
            this.q[k] = new fos_0();
            this.q[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.ab.a();
    }
}

