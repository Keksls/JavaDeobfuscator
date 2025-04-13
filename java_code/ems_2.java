/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMs
 */
class ems_2 {
    private static final int a = 2;
    private static final int b = 6;
    private final int c;
    private final int d = 2;
    private int e = 6;
    private int f = 6;
    private Long g;
    private Long h;
    private Long i;
    private Long j;
    private boolean k = true;
    private boolean l = true;
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private boolean p = true;
    private boolean q = true;
    private boolean r = false;
    private emw_1 s = new emv_1();
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private boolean x = true;
    private emd_2 y = emd_2.a;
    private boolean z = true;
    private boolean A = false;
    private boolean B = false;
    private boolean C = true;
    private boolean D = false;
    private boolean E = true;
    private boolean F = false;
    private boolean G = false;
    private boolean H = true;
    private boolean I = true;
    private boolean J = false;
    private boolean K = false;
    private emi_1 L = emi_1.a;
    private boolean M = false;
    private boolean N = false;
    private boolean O = true;
    private boolean P = false;
    private boolean Q = false;

    ems_2(int n) {
        this.c = n;
    }

    public int a() {
        return this.c;
    }

    public int b() {
        return 2;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public Long e() {
        return this.g;
    }

    public Long f() {
        return this.h;
    }

    public Long g() {
        return this.i;
    }

    public Long h() {
        return this.j;
    }

    public boolean i() {
        return this.k;
    }

    public boolean j() {
        return this.l;
    }

    public boolean k() {
        return this.m;
    }

    public boolean l() {
        return this.n;
    }

    public boolean m() {
        return this.o;
    }

    public boolean n() {
        return this.p;
    }

    public boolean o() {
        return this.q;
    }

    public boolean p() {
        return this.r;
    }

    public boolean q() {
        return this.t;
    }

    public boolean r() {
        return this.u;
    }

    public emw_1 s() {
        return this.s;
    }

    public boolean t() {
        return this.v;
    }

    public boolean u() {
        return this.x;
    }

    public emd_2 v() {
        return this.y;
    }

    public boolean w() {
        return this.z;
    }

    boolean x() {
        return this.A;
    }

    boolean y() {
        return this.B;
    }

    public boolean z() {
        return this.C;
    }

    public boolean A() {
        return this.D;
    }

    public boolean B() {
        return this.E;
    }

    public boolean C() {
        return this.G;
    }

    public boolean D() {
        return this.I;
    }

    public boolean E() {
        return this.J;
    }

    public boolean F() {
        return this.K;
    }

    public boolean G() {
        return this.O;
    }

    public emi_1 H() {
        return this.L;
    }

    public boolean I() {
        return this.w;
    }

    public ems_2 J() {
        this.q = false;
        return this;
    }

    public ems_2 a(int n) {
        this.e = n;
        return this;
    }

    public ems_2 b(int n) {
        this.f = n;
        return this;
    }

    public ems_2 a(long l) {
        this.g = l;
        return this;
    }

    public ems_2 b(long l) {
        this.h = l;
        if (this.j != null && this.h > this.j) {
            this.j = this.h;
        }
        return this;
    }

    public ems_2 c(long l) {
        this.i = l;
        if (this.j != null && this.i > this.j) {
            this.j = this.i;
        }
        return this;
    }

    public ems_2 d(long l) {
        if (!(this.h != null && this.j < this.h || this.i != null && this.j < this.i)) {
            this.j = l;
        }
        return this;
    }

    public ems_2 K() {
        this.k = false;
        this.l = false;
        return this;
    }

    public ems_2 L() {
        this.k = false;
        return this;
    }

    public ems_2 M() {
        this.m = true;
        return this;
    }

    public ems_2 N() {
        this.n = true;
        return this;
    }

    public ems_2 O() {
        this.o = false;
        return this;
    }

    public ems_2 P() {
        this.p = false;
        return this;
    }

    public ems_2 Q() {
        this.r = true;
        return this;
    }

    public ems_2 a(emw_1 emw_12) {
        this.s = emw_12;
        return this;
    }

    public ems_2 R() {
        this.t = true;
        return this;
    }

    public ems_2 S() {
        this.u = true;
        return this;
    }

    public ems_2 T() {
        this.v = true;
        return this;
    }

    public ems_2 U() {
        this.x = false;
        return this;
    }

    public ems_2 a(emd_2 emd_22) {
        this.y = emd_22;
        return this;
    }

    public ems_2 V() {
        this.z = false;
        return this;
    }

    public ems_2 W() {
        this.A = true;
        return this;
    }

    public ems_2 X() {
        this.B = true;
        return this;
    }

    public ems_2 Y() {
        this.C = false;
        return this;
    }

    public ems_2 Z() {
        this.D = true;
        return this;
    }

    public ems_2 aa() {
        this.E = false;
        return this;
    }

    public ems_2 ab() {
        this.F = true;
        return this;
    }

    public ems_2 ac() {
        this.G = true;
        return this;
    }

    public ems_2 ad() {
        this.H = false;
        return this;
    }

    public ems_2 ae() {
        this.I = false;
        return this;
    }

    public ems_2 af() {
        this.O = false;
        return this;
    }

    public ems_2 ag() {
        this.J = true;
        return this;
    }

    public ems_2 ah() {
        this.K = true;
        return this;
    }

    public ems_2 a(emi_1 emi_12) {
        this.L = emi_12;
        return this;
    }

    public ems_2 ai() {
        this.M = true;
        return this;
    }

    public ems_2 aj() {
        this.N = true;
        return this;
    }

    public ems_2 ak() {
        this.P = true;
        return this;
    }

    public ems_2 al() {
        this.w = true;
        return this;
    }

    public boolean am() {
        return this.F;
    }

    public boolean an() {
        return this.H;
    }

    public boolean ao() {
        return this.M;
    }

    public boolean ap() {
        return this.N;
    }

    public boolean aq() {
        return this.P;
    }

    public ems_2 a(boolean bl) {
        this.Q = bl;
        return this;
    }

    public boolean ar() {
        return this.Q;
    }
}

