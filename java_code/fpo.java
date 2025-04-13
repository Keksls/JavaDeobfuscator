/*
 * Decompiled with CFR 0.152.
 */
public class fpo
implements asu_2 {
    protected int a;
    protected short b;
    protected int[] c;
    protected int[] d;
    protected int[] e;
    protected boolean f;
    protected boolean g;
    protected boolean h;
    protected boolean i;
    protected String j;
    protected String k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected int[] o;
    protected int[] p;
    protected boolean q;
    protected boolean r;
    protected byte s;
    protected byte t;
    protected boolean u;

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

    public int[] g() {
        return this.e;
    }

    public short h() {
        return (short)this.d[0];
    }

    public int i() {
        return this.d.length == 0 ? 0 : 1000 * this.d[1];
    }

    public int j() {
        return this.e[0];
    }

    public int k() {
        return this.e.length == 0 ? 0 : 1000 * this.e[1];
    }

    public boolean l() {
        return this.f;
    }

    public boolean m() {
        return this.g;
    }

    public boolean n() {
        return this.h;
    }

    public boolean o() {
        return this.i;
    }

    public String p() {
        return this.j;
    }

    public String q() {
        return this.k;
    }

    public boolean r() {
        return this.l;
    }

    public boolean s() {
        return this.m;
    }

    public boolean t() {
        return this.n;
    }

    public int[] u() {
        return this.o;
    }

    public int[] v() {
        return this.p;
    }

    public boolean w() {
        return this.q;
    }

    public boolean x() {
        return this.r;
    }

    public byte y() {
        return this.s;
    }

    public byte z() {
        return this.t;
    }

    public boolean A() {
        return this.u;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = false;
        this.j = null;
        this.k = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = null;
        this.p = null;
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = 0;
        this.u = false;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.k();
        this.d = asc_22.k();
        this.e = asc_22.k();
        this.f = asc_22.c();
        this.g = asc_22.c();
        this.h = asc_22.c();
        this.i = asc_22.c();
        this.j = asc_22.i().intern();
        this.k = asc_22.i().intern();
        this.l = asc_22.c();
        this.m = asc_22.c();
        this.n = asc_22.c();
        this.o = asc_22.k();
        this.p = asc_22.k();
        this.q = asc_22.c();
        this.r = asc_22.c();
        this.s = asc_22.b();
        this.t = asc_22.b();
        this.u = asc_22.c();
    }

    @Override
    public final int a() {
        return enK.an.a();
    }
}

