/*
 * Decompiled with CFR 0.152.
 */
public class fpp
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected short d;
    protected int[] e;
    protected short f;
    protected short g;
    protected int[] h;
    protected short i;
    protected int[] j;
    protected int[] k;
    protected int[] l;
    protected int[] m;
    protected int[] n;
    protected int[] o;
    protected int[] p;
    protected String q;
    protected long[] r;
    protected boolean s;
    protected int t;
    protected float u;
    protected boolean v;
    protected boolean w;
    protected short x;
    protected float y;
    protected float[] z;
    protected float A;
    protected float B;
    protected byte C;
    protected byte D;
    protected byte E;
    protected int F;
    protected boolean G;
    protected short H;
    protected float I;
    protected byte J;
    protected boolean K;
    protected String L;
    protected short M;
    protected short N;
    protected String O;
    protected String P;
    protected String Q;
    protected boolean R;
    protected boolean S;
    protected boolean T;
    protected boolean U;
    protected boolean V;
    protected boolean W;
    protected int X;
    protected boolean Y;
    protected boolean Z;
    protected boolean aa;
    protected int[] ab;

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public boolean f() {
        String string = this.Y().trim();
        boolean bl = this.S();
        boolean bl2 = this.g();
        if (bl2) {
            return false;
        }
        if (string.startsWith("ITEM")) {
            return bl && this.h();
        }
        String string2 = this.X().trim();
        return string2.startsWith("SPELL") && bl || string2.startsWith("GROUP") || string2.startsWith("BOMB") || string2.startsWith("AREA") || string2.startsWith("IEP_DESTRUCTIBLE") || string2.startsWith("STATE") && bl || string2.startsWith("TIMELINE") && bl;
    }

    public boolean g() {
        if (this.ab == null) {
            return false;
        }
        for (int k = 0; k < this.ab.length; ++k) {
            int n = this.ab[k];
            eff_0 eff_02 = eff_0.a(n);
            if (eff_02 != eff_0.s) continue;
            return true;
        }
        return false;
    }

    public boolean h() {
        String string = this.Y().trim();
        boolean bl = this.g();
        if (bl) {
            return false;
        }
        if (string.startsWith("ITEM")) {
            return string.endsWith("_USE");
        }
        boolean bl2 = this.S();
        String string2 = this.X().trim();
        return !string2.startsWith("SET") && (!string2.startsWith("SPELL") || bl2) && !string2.startsWith("PROTECTOR") && !string2.startsWith("BUILDING") && !string2.startsWith("ABILITY") && !string2.startsWith("APTITUDE");
    }

    public int i() {
        return this.a;
    }

    public int j() {
        return this.b;
    }

    public int k() {
        return this.c;
    }

    public short l() {
        return this.d;
    }

    public int[] m() {
        return this.e;
    }

    public short n() {
        return this.f;
    }

    public short o() {
        return this.g;
    }

    public int[] p() {
        return this.h;
    }

    public short q() {
        return this.i;
    }

    public int[] r() {
        return this.j;
    }

    public int[] s() {
        return this.k;
    }

    public int[] t() {
        return this.l;
    }

    public int[] u() {
        return this.m;
    }

    public int[] v() {
        return this.n;
    }

    public int[] w() {
        return this.o;
    }

    public int[] x() {
        return this.p;
    }

    public String y() {
        return this.q;
    }

    public long[] z() {
        return this.r;
    }

    public boolean A() {
        return this.s;
    }

    public int B() {
        return this.t;
    }

    public float C() {
        return this.u;
    }

    public boolean D() {
        return this.v;
    }

    public boolean E() {
        return this.w;
    }

    public short F() {
        return this.x;
    }

    public float G() {
        return this.y;
    }

    public float[] H() {
        return this.z;
    }

    public float I() {
        return this.A;
    }

    public float J() {
        return this.B;
    }

    public byte K() {
        return this.C;
    }

    public byte L() {
        return this.D;
    }

    public byte M() {
        return this.E;
    }

    public int N() {
        return this.F;
    }

    public boolean O() {
        return this.G;
    }

    public short P() {
        return this.H;
    }

    public float Q() {
        return this.I;
    }

    public byte R() {
        return this.J;
    }

    public boolean S() {
        return this.K;
    }

    public String T() {
        return this.L;
    }

    public short U() {
        return this.M;
    }

    public short V() {
        return this.N;
    }

    public String W() {
        return this.O;
    }

    public String X() {
        return this.P;
    }

    public String Y() {
        return this.Q;
    }

    public boolean Z() {
        return this.R;
    }

    public boolean aa() {
        return this.S;
    }

    public boolean ab() {
        return this.T;
    }

    public boolean ac() {
        return this.U;
    }

    public boolean ad() {
        return this.V;
    }

    public boolean ae() {
        return this.W;
    }

    public int af() {
        return this.X;
    }

    public boolean ag() {
        return this.Y;
    }

    public boolean ah() {
        return this.Z;
    }

    public boolean ai() {
        return this.aa;
    }

    public int[] aj() {
        return this.ab;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = false;
        this.t = 0;
        this.u = 0.0f;
        this.v = false;
        this.w = false;
        this.x = 0;
        this.y = 0.0f;
        this.z = null;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = false;
        this.H = 0;
        this.I = 0.0f;
        this.J = 0;
        this.K = false;
        this.L = null;
        this.M = 0;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.aa = false;
        this.ab = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.d();
        this.e = asc_22.k();
        this.f = asc_22.d();
        this.g = asc_22.d();
        this.h = asc_22.k();
        this.i = asc_22.d();
        this.j = asc_22.k();
        this.k = asc_22.k();
        this.l = asc_22.k();
        this.m = asc_22.k();
        this.n = asc_22.k();
        this.o = asc_22.k();
        this.p = asc_22.k();
        this.q = asc_22.i().intern();
        this.r = asc_22.o();
        this.s = asc_22.c();
        this.t = asc_22.f();
        this.u = asc_22.e();
        this.v = asc_22.c();
        this.w = asc_22.c();
        this.x = asc_22.d();
        this.y = asc_22.e();
        this.z = asc_22.m();
        this.A = asc_22.e();
        this.B = asc_22.e();
        this.C = asc_22.b();
        this.D = asc_22.b();
        this.E = asc_22.b();
        this.F = asc_22.f();
        this.G = asc_22.c();
        this.H = asc_22.d();
        this.I = asc_22.e();
        this.J = asc_22.b();
        this.K = asc_22.c();
        this.L = asc_22.i().intern();
        this.M = asc_22.d();
        this.N = asc_22.d();
        this.O = asc_22.i().intern();
        this.P = asc_22.i().intern();
        this.Q = asc_22.i().intern();
        this.R = asc_22.c();
        this.S = asc_22.c();
        this.T = asc_22.c();
        this.U = asc_22.c();
        this.V = asc_22.c();
        this.W = asc_22.c();
        this.X = asc_22.f();
        this.Y = asc_22.c();
        this.Z = asc_22.c();
        this.aa = asc_22.c();
        this.ab = asc_22.k();
    }

    @Override
    public final int a() {
        return enK.ao.a();
    }
}

