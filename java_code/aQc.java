/*
 * Decompiled with CFR 0.152.
 */
public class aQc
implements asu_2 {
    protected int a;
    protected int b;
    protected boolean c;
    protected boolean d;
    protected boolean e;
    protected String f;
    protected String g;
    protected aqd_0[] h;
    protected aQf[] i;
    protected int j;
    protected int k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected int o;
    protected int p;
    protected boolean q;
    protected int r;
    protected long s;
    protected long t;
    protected boolean u;
    protected int v;
    protected boolean w;
    protected int x;
    protected byte y;
    protected int z;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public aqd_0[] j() {
        return this.h;
    }

    public aQf[] k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.m;
    }

    public boolean p() {
        return this.n;
    }

    public int q() {
        return this.o;
    }

    public int r() {
        return this.p;
    }

    public boolean s() {
        return this.q;
    }

    public int t() {
        return this.r;
    }

    public long u() {
        return this.s;
    }

    public long v() {
        return this.t;
    }

    public boolean w() {
        return this.u;
    }

    public int x() {
        return this.v;
    }

    public boolean y() {
        return this.w;
    }

    public int z() {
        return this.x;
    }

    public byte A() {
        return this.y;
    }

    public int B() {
        return this.z;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = 0;
        this.p = 0;
        this.q = false;
        this.r = 0;
        this.s = 0L;
        this.t = 0L;
        this.u = false;
        this.v = 0;
        this.w = false;
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.c();
        this.d = asc_22.c();
        this.e = asc_22.c();
        this.f = asc_22.i().intern();
        this.g = asc_22.i().intern();
        int n2 = asc_22.f();
        this.h = new aqd_0[n2];
        for (n = 0; n < n2; ++n) {
            this.h[n] = new aqd_0();
            this.h[n].a(asc_22);
        }
        n = asc_22.f();
        this.i = new aQf[n];
        for (int k = 0; k < n; ++k) {
            this.i[k] = new aQf();
            this.i[k].a(asc_22);
        }
        this.j = asc_22.f();
        this.k = asc_22.f();
        this.l = asc_22.c();
        this.m = asc_22.c();
        this.n = asc_22.c();
        this.o = asc_22.f();
        this.p = asc_22.f();
        this.q = asc_22.c();
        this.r = asc_22.f();
        this.s = asc_22.h();
        this.t = asc_22.h();
        this.u = asc_22.c();
        this.v = asc_22.f();
        this.w = asc_22.c();
        this.x = asc_22.f();
        this.y = asc_22.b();
        this.z = asc_22.f();
    }

    @Override
    public final int a() {
        return enK.a.a();
    }
}

