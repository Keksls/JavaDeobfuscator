/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSm
 */
public class asm_0
implements asu_2 {
    protected int a;
    protected short b;
    protected int c;
    protected int d;
    protected int e;
    protected short f;
    protected String[] g;
    protected int h;
    protected short i;
    protected byte j;
    protected byte k;
    protected byte l;
    protected int m;
    protected int n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected boolean r;
    protected short s;
    protected byte t;
    protected String u;
    protected int[] v;
    protected byte w;
    protected byte x;
    protected byte y;
    protected byte z;
    protected float A;
    protected float B;
    protected byte C;
    protected int[] D;
    protected aSn[] E;
    protected aso_0 F;
    protected aSp G;

    public int c() {
        return this.a;
    }

    public short d() {
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

    public short h() {
        return this.f;
    }

    public String[] i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public short k() {
        return this.i;
    }

    public byte l() {
        return this.j;
    }

    public byte m() {
        return this.k;
    }

    public byte n() {
        return this.l;
    }

    public int o() {
        return this.m;
    }

    public int p() {
        return this.n;
    }

    public boolean q() {
        return this.o;
    }

    public boolean r() {
        return this.p;
    }

    public boolean s() {
        return this.q;
    }

    public boolean t() {
        return this.r;
    }

    public short u() {
        return this.s;
    }

    public byte v() {
        return this.t;
    }

    public String w() {
        return this.u;
    }

    public int[] x() {
        return this.v;
    }

    public byte y() {
        return this.w;
    }

    public byte z() {
        return this.x;
    }

    public byte A() {
        return this.y;
    }

    public byte B() {
        return this.z;
    }

    public float C() {
        return this.A;
    }

    public float D() {
        return this.B;
    }

    public byte E() {
        return this.C;
    }

    public int[] F() {
        return this.D;
    }

    public aSn[] G() {
        return this.E;
    }

    public aso_0 H() {
        return this.F;
    }

    public aSp I() {
        return this.G;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = 0;
        this.t = 0;
        this.u = null;
        this.v = null;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.f();
        this.f = asc_22.d();
        this.g = asc_22.n();
        this.h = asc_22.f();
        this.i = asc_22.d();
        this.j = asc_22.b();
        this.k = asc_22.b();
        this.l = asc_22.b();
        this.m = asc_22.f();
        this.n = asc_22.f();
        this.o = asc_22.c();
        this.p = asc_22.c();
        this.q = asc_22.c();
        this.r = asc_22.c();
        this.s = asc_22.d();
        this.t = asc_22.b();
        this.u = asc_22.i().intern();
        this.v = asc_22.k();
        this.w = asc_22.b();
        this.x = asc_22.b();
        this.y = asc_22.b();
        this.z = asc_22.b();
        this.A = asc_22.e();
        this.B = asc_22.e();
        this.C = asc_22.b();
        this.D = asc_22.k();
        int n = asc_22.f();
        this.E = new aSn[n];
        for (int k = 0; k < n; ++k) {
            this.E[k] = new aSn();
            this.E[k].a(asc_22);
        }
        if (asc_22.b() != 0) {
            this.F = new aso_0();
            this.F.a(asc_22);
        } else {
            this.F = null;
        }
        if (asc_22.b() != 0) {
            this.G = new aSp();
            this.G.a(asc_22);
        } else {
            this.G = null;
        }
    }

    @Override
    public final int a() {
        return enK.I.a();
    }
}

