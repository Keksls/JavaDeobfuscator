/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eMr
 */
public enum emr_2 {
    a(emr_2.b(1).a(emd_2.c).Z().ab().ac().ah().ad().ae().a(3)),
    b(emr_2.b(2).b(8).M().N().W().X().ai().ab()),
    c(emr_2.b(6).a(emd_2.c).ae().ag().ak()),
    d(emr_2.b(11).Q().a(new emt_1()).R().S().J().T().U().P()),
    e(emr_2.b(13).Q().R().a(5).J().P().a(new ems_1()).U()),
    f(emr_2.b(14).b(8).P().J().X().ai().Z()),
    g(emr_2.b(19).b(1).a(1).U().M().N().P().Z().V().aa()),
    h(emr_2.b(20).Q().R().S().M().a(new emu_1()).U().ai()),
    i(emr_2.b(23).a(emd_2.b).ab().a(emi_1.d).P().X().ai().Z()),
    j(emr_2.b(24).b(8).M().N().W().X().ai().ab().P()),
    k(emr_2.b(25).a(120000L).a(emd_2.c).b(6).a(6).ac().ah().ad().af().P().O().ak().ai()),
    l(emr_2.b(26).a(60000L).a(emd_2.c).b(4).a(4).ac().ah().ad().af().P().O().ai()),
    m(emr_2.b(27).b(8).M().N().ad().af().P().ai()),
    n(emr_2.b(65).P().a(emd_2.b).Z().ab().X().ai()),
    o(emr_2.b(67).a(1).P().b(999000L).c(999000L).a(emi_1.b).ab().aa().b(8).aj()),
    p(emr_2.b(68).a(6).b(8).V().P().a(emi_1.b).ab().aa().aj().ai()),
    q(emr_2.b(69).a(1).b(8).V().P().Q().a(new emu_1()).ab().aa().aj().R()),
    r(emr_2.b(70).a(600000L).b(600000L).c(600000L).L().O().P().J().V().aa().a(emi_1.d)),
    s(emr_2.b(71).a(600000L).b(600000L).c(600000L).N().O().P().V().aa().a(emi_1.d)),
    t(emr_2.b(72).N().O().P().V().aa().a(emi_1.d)),
    u(emr_2.b(73).b(8).a(3).M().N().W().ai().ab().P()),
    v(emr_2.b(74).a(emd_2.c).ai().X().ab().ad().a(6).a(true)),
    w(emr_2.b(75).b(8).M().N().X().ai().ab().P()),
    x(emr_2.b(76).Q().a(new emx_2()).R().M().N().X().ai().ab().al());

    private final byte y;
    private final byte z;
    private final byte A;
    private final byte B;
    private final byte C;
    private final Long D;
    private final Long E;
    private final Long F;
    private final Long G;
    private final boolean H;
    private final boolean I;
    private final boolean J;
    private final boolean K;
    private final boolean L;
    private final boolean M;
    private final boolean N;
    private final boolean O;
    private final emw_1 P;
    private final boolean Q;
    private final boolean R;
    private final boolean S;
    private final boolean T;
    private final emd_2 U;
    private final boolean V;
    private final boolean W;
    private final boolean X;
    private final boolean Y;
    private final boolean Z;
    private final boolean aa;
    private final boolean ab;
    private final boolean ac;
    private final boolean ad;
    private final boolean ae;
    private final boolean af;
    private final boolean ag;
    private final emi_1 ah;
    private final boolean ai;
    private final boolean aj;
    private final boolean ak;
    private final boolean al;
    private final boolean am;

    public static emr_2 a(int n) {
        for (emr_2 emr_22 : emr_2.values()) {
            if (emr_22.a() != (byte)n) continue;
            return emr_22;
        }
        return null;
    }

    private static ems_2 b(int n) {
        return new ems_2(n);
    }

    private emr_2(ems_2 ems_22) {
        this.y = (byte)ems_22.a();
        this.z = (byte)ems_22.b();
        this.A = (byte)ems_22.b();
        this.B = (byte)ems_22.c();
        this.C = (byte)ems_22.d();
        this.D = ems_22.e();
        this.E = ems_22.f();
        this.F = ems_22.g();
        this.G = ems_22.h();
        this.H = ems_22.i();
        this.I = ems_22.j();
        this.J = ems_22.k();
        this.K = ems_22.m();
        this.L = ems_22.l();
        this.M = ems_22.n();
        this.N = ems_22.o();
        this.O = ems_22.p();
        this.P = ems_22.s();
        this.Q = ems_22.q();
        this.R = ems_22.r();
        this.S = ems_22.t();
        this.T = ems_22.u();
        this.U = ems_22.v();
        this.V = ems_22.w();
        this.W = ems_22.x();
        this.X = ems_22.y();
        this.Y = ems_22.ao();
        this.Z = ems_22.A();
        this.aa = ems_22.B();
        this.ab = ems_22.am();
        this.ac = ems_22.C();
        this.ad = ems_22.an();
        this.ae = ems_22.D();
        this.af = ems_22.E();
        this.ag = ems_22.F();
        this.ah = ems_22.H();
        this.ai = ems_22.ap();
        this.aj = ems_22.G();
        this.ak = ems_22.aq();
        this.al = ems_22.I();
        this.am = ems_22.ar();
    }

    public byte a() {
        return this.y;
    }

    public byte b() {
        return this.z;
    }

    public byte c() {
        return this.A;
    }

    public byte d() {
        return this.B;
    }

    public byte e() {
        return this.C;
    }

    public boolean f() {
        return this.J;
    }

    public boolean g() {
        return this.L;
    }

    public Long h() {
        return this.E;
    }

    public Long i() {
        return this.F;
    }

    public Long j() {
        return this.G;
    }

    public boolean k() {
        return this.H;
    }

    public boolean l() {
        return this.I;
    }

    public boolean m() {
        return this.K;
    }

    public boolean n() {
        return this.M;
    }

    public Long o() {
        return this.D;
    }

    public boolean p() {
        return this.N;
    }

    public boolean q() {
        return this.O;
    }

    public emw_1 r() {
        return this.P;
    }

    public boolean s() {
        return this.Q;
    }

    public boolean t() {
        return this.R;
    }

    public boolean u() {
        return this.S;
    }

    public boolean v() {
        return this.T;
    }

    public boolean w() {
        return this.U.a() && !this.U.b();
    }

    public emd_2 x() {
        return this.U;
    }

    public boolean y() {
        return this.V;
    }

    public boolean z() {
        return this.W;
    }

    public boolean A() {
        return this.X;
    }

    public boolean B() {
        return this.Y;
    }

    public boolean C() {
        return this.Z;
    }

    public boolean D() {
        return this.aa;
    }

    public boolean E() {
        return this.ab;
    }

    public boolean F() {
        return this.ac;
    }

    public boolean G() {
        return this.ad;
    }

    public boolean H() {
        return this.ae;
    }

    public boolean I() {
        return this.aj;
    }

    public boolean J() {
        return this.af;
    }

    public boolean K() {
        return this.ag;
    }

    public emi_1 L() {
        return this.ah;
    }

    public boolean M() {
        return this.ai;
    }

    public boolean N() {
        return this.ak;
    }

    public boolean O() {
        return this.al;
    }

    public boolean P() {
        return this.am;
    }
}

