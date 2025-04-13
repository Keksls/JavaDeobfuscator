/*
 * Decompiled with CFR 0.152.
 */
public class foX
implements asu_2 {
    protected int a;
    protected int b;
    protected long c;
    protected String d;
    protected boolean e;
    protected int f;
    protected int[] g;
    protected int h;
    protected int i;
    protected boolean j;
    protected long k;
    protected long l;
    protected int m;
    protected foy_0[] n;
    protected fpa[] o;
    protected foZ[] p;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public long e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public int h() {
        return this.f;
    }

    public int[] i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public boolean l() {
        return this.j;
    }

    public long m() {
        return this.k;
    }

    public long n() {
        return this.l;
    }

    public int o() {
        return this.m;
    }

    public foy_0[] p() {
        return this.n;
    }

    public fpa[] q() {
        return this.o;
    }

    public foZ[] r() {
        return this.p;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = null;
        this.e = false;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.k = 0L;
        this.l = 0L;
        this.m = 0;
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.h();
        this.d = asc_22.i().intern();
        this.e = asc_22.c();
        this.f = asc_22.f();
        this.g = asc_22.k();
        this.h = asc_22.f();
        this.i = asc_22.f();
        this.j = asc_22.c();
        this.k = asc_22.h();
        this.l = asc_22.h();
        this.m = asc_22.f();
        int n3 = asc_22.f();
        this.n = new foy_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.n[n2] = new foy_0();
            this.n[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.o = new fpa[n2];
        for (n = 0; n < n2; ++n) {
            this.o[n] = new fpa();
            this.o[n].a(asc_22);
        }
        n = asc_22.f();
        this.p = new foZ[n];
        for (int k = 0; k < n; ++k) {
            this.p[k] = new foZ();
            this.p[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.af.a();
    }
}

