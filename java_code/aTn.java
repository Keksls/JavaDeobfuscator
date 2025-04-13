/*
 * Decompiled with CFR 0.152.
 */
public class aTn
implements asu_2 {
    protected int a;
    protected int b;
    protected long c;
    protected String d;
    protected String e;
    protected boolean f;
    protected int g;
    protected int[] h;
    protected int i;
    protected int[] j;
    protected int k;
    protected boolean l;
    protected long m;
    protected long n;
    protected int o;
    protected ato_0[] p;
    protected atq_0[] q;
    protected aTp[] r;

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

    public String g() {
        return this.e;
    }

    public boolean h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public int[] j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public int[] l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public boolean n() {
        return this.l;
    }

    public long o() {
        return this.m;
    }

    public long p() {
        return this.n;
    }

    public int q() {
        return this.o;
    }

    public ato_0[] r() {
        return this.p;
    }

    public atq_0[] s() {
        return this.q;
    }

    public aTp[] t() {
        return this.r;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0L;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = 0;
        this.h = null;
        this.i = 0;
        this.j = null;
        this.k = 0;
        this.l = false;
        this.m = 0L;
        this.n = 0L;
        this.o = 0;
        this.p = null;
        this.q = null;
        this.r = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.h();
        this.d = asc_22.i().intern();
        this.e = asc_22.i().intern();
        this.f = asc_22.c();
        this.g = asc_22.f();
        this.h = asc_22.k();
        this.i = asc_22.f();
        this.j = asc_22.k();
        this.k = asc_22.f();
        this.l = asc_22.c();
        this.m = asc_22.h();
        this.n = asc_22.h();
        this.o = asc_22.f();
        int n3 = asc_22.f();
        this.p = new ato_0[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.p[n2] = new ato_0();
            this.p[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.q = new atq_0[n2];
        for (n = 0; n < n2; ++n) {
            this.q[n] = new atq_0();
            this.q[n].a(asc_22);
        }
        n = asc_22.f();
        this.r = new aTp[n];
        for (int k = 0; k < n; ++k) {
            this.r[k] = new aTp();
            this.r[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.af.a();
    }
}

