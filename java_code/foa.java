/*
 * Decompiled with CFR 0.152.
 */
public class foa
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected boolean g;
    protected int h;
    protected boolean i;
    protected int j;
    protected String k;
    protected fmf_0 l;
    protected fob[] m;
    protected foc[] n;

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

    public boolean i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public boolean k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public String m() {
        return this.k;
    }

    public fmf_0 n() {
        return this.l;
    }

    public fob[] o() {
        return this.m;
    }

    public foc[] p() {
        return this.n;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = false;
        this.h = 0;
        this.i = false;
        this.j = 0;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.f();
        this.g = asc_22.c();
        this.h = asc_22.f();
        this.i = asc_22.c();
        this.j = asc_22.f();
        this.k = asc_22.i().intern();
        if (asc_22.b() != 0) {
            this.l = new fmf_0();
            this.l.a(asc_22);
        } else {
            this.l = null;
        }
        int n2 = asc_22.f();
        this.m = new fob[n2];
        for (n = 0; n < n2; ++n) {
            this.m[n] = new fob();
            this.m[n].a(asc_22);
        }
        n = asc_22.f();
        this.n = new foc[n];
        for (int k = 0; k < n; ++k) {
            this.n[k] = new foc();
            this.n[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.L.a();
    }
}

