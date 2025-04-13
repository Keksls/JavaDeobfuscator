/*
 * Decompiled with CFR 0.152.
 */
public class flJ
implements asu_2 {
    protected int a;
    protected int b;
    protected boolean c;
    protected boolean d;
    protected String e;
    protected String f;
    protected flL[] g;
    protected flN[] h;
    protected int i;
    protected int j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected int n;
    protected boolean o;
    protected int p;
    protected long[] q;
    protected long r;
    protected long s;
    protected boolean t;
    protected boolean u;
    protected boolean v;
    protected int w;
    protected byte x;
    protected int y;
    protected boolean z;

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

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public flL[] i() {
        return this.g;
    }

    public flN[] j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public boolean m() {
        return this.k;
    }

    public boolean n() {
        return this.l;
    }

    public boolean o() {
        return this.m;
    }

    public int p() {
        return this.n;
    }

    public boolean q() {
        return this.o;
    }

    public int r() {
        return this.p;
    }

    public long[] s() {
        return this.q;
    }

    public long t() {
        return this.r;
    }

    public long u() {
        return this.s;
    }

    public boolean v() {
        return this.t;
    }

    public boolean w() {
        return this.u;
    }

    public boolean x() {
        return this.v;
    }

    public int y() {
        return this.w;
    }

    public byte z() {
        return this.x;
    }

    public int A() {
        return this.y;
    }

    public boolean B() {
        return this.z;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = false;
        this.d = false;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = 0;
        this.o = false;
        this.p = 0;
        this.q = null;
        this.r = 0L;
        this.s = 0L;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = false;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.c();
        this.d = asc_22.c();
        this.e = asc_22.i().intern();
        this.f = asc_22.i().intern();
        int n2 = asc_22.f();
        this.g = new flL[n2];
        for (n = 0; n < n2; ++n) {
            this.g[n] = new flL();
            this.g[n].a(asc_22);
        }
        n = asc_22.f();
        this.h = new flN[n];
        for (int k = 0; k < n; ++k) {
            this.h[k] = new flN();
            this.h[k].a(asc_22);
        }
        this.i = asc_22.f();
        this.j = asc_22.f();
        this.k = asc_22.c();
        this.l = asc_22.c();
        this.m = asc_22.c();
        this.n = asc_22.f();
        this.o = asc_22.c();
        this.p = asc_22.f();
        this.q = asc_22.o();
        this.r = asc_22.h();
        this.s = asc_22.h();
        this.t = asc_22.c();
        this.u = asc_22.c();
        this.v = asc_22.c();
        this.w = asc_22.f();
        this.x = asc_22.b();
        this.y = asc_22.f();
        this.z = asc_22.c();
    }

    @Override
    public final int a() {
        return enK.a.a();
    }
}

