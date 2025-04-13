/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from fiB
 */
public class fib_0 {
    private int a;
    private short b;
    private int c;
    private byte d;
    private float e;
    private float f;
    private byte g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private byte o;
    private byte p;
    private short q;
    private byte r;
    private apc_2 s;
    private apc_2 t;
    private int u;
    private apc_2 v;
    private short w;
    private Map<eps_0, fiq_0> x;
    private float y;
    private float z;
    private float A;
    private float B;
    private byte C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private byte I;
    private int J;
    private boolean K;
    private short L;
    private boolean M;
    private int N;
    private boolean O;
    private Map<apc_2, fix> P;
    private boolean Q;
    private boolean R;
    private enV S;
    private int[] T;

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public byte d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public byte f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return this.i;
    }

    public boolean i() {
        return this.j;
    }

    public boolean j() {
        return this.k;
    }

    public boolean k() {
        return this.l;
    }

    public boolean l() {
        return this.m;
    }

    public boolean m() {
        return this.n;
    }

    public byte n() {
        return this.o;
    }

    public byte o() {
        return this.p;
    }

    public short p() {
        return this.q;
    }

    public byte q() {
        return this.r;
    }

    public apc_2 r() {
        return this.s;
    }

    public apc_2 s() {
        return this.t;
    }

    public int t() {
        return this.u;
    }

    public apc_2 u() {
        return this.v;
    }

    public void a(short s2) {
        this.w = s2;
    }

    public short v() {
        return this.w;
    }

    public float w() {
        return this.y;
    }

    public float x() {
        return this.z;
    }

    public float y() {
        return this.A;
    }

    public float z() {
        return this.B;
    }

    public byte A() {
        return this.C;
    }

    public boolean B() {
        return this.D;
    }

    public boolean C() {
        return this.E;
    }

    public boolean D() {
        return this.F;
    }

    public boolean E() {
        return this.G;
    }

    public boolean F() {
        return this.H;
    }

    public void a(int n) {
        this.a = n;
    }

    public void b(short s2) {
        this.b = s2;
    }

    public void b(int n) {
        this.c = n;
    }

    public void a(byte by) {
        this.d = by;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public void b(byte by) {
        this.g = by;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public void c(boolean bl) {
        this.j = bl;
    }

    public void d(boolean bl) {
        this.k = bl;
    }

    public void e(boolean bl) {
        this.l = bl;
    }

    public void f(boolean bl) {
        this.m = bl;
    }

    public void g(boolean bl) {
        this.n = bl;
    }

    public void c(byte by) {
        this.o = by;
    }

    public void d(byte by) {
        this.p = by;
    }

    public void c(short s2) {
        this.q = s2;
    }

    public void e(byte by) {
        this.r = by;
    }

    public void a(apc_2 apc_22) {
        this.s = apc_22;
    }

    public void b(apc_2 apc_22) {
        this.t = apc_22;
    }

    public void c(int n) {
        this.u = n;
    }

    public void c(apc_2 apc_22) {
        this.v = apc_22;
    }

    public void b(float f2) {
        this.y = f2;
    }

    public void c(float f2) {
        this.z = f2;
    }

    public void d(float f2) {
        this.A = f2;
    }

    public void e(float f2) {
        this.B = f2;
    }

    public void f(byte by) {
        this.C = by;
    }

    public void h(boolean bl) {
        this.D = bl;
    }

    public void i(boolean bl) {
        this.E = bl;
    }

    public void j(boolean bl) {
        this.F = bl;
    }

    public void k(boolean bl) {
        this.G = bl;
    }

    public void l(boolean bl) {
        this.H = bl;
    }

    public byte G() {
        return this.I;
    }

    public int H() {
        return this.J;
    }

    public boolean I() {
        return this.K;
    }

    public short J() {
        return this.L;
    }

    public boolean K() {
        return this.M;
    }

    public int L() {
        return this.N;
    }

    public void g(byte by) {
        this.I = by;
    }

    public void d(int n) {
        this.J = n;
    }

    public void m(boolean bl) {
        this.K = bl;
    }

    public void d(short s2) {
        this.L = s2;
    }

    public void n(boolean bl) {
        this.M = bl;
    }

    public void e(int n) {
        this.N = n;
    }

    public boolean M() {
        return this.O;
    }

    public void o(boolean bl) {
        this.O = bl;
    }

    public Map<apc_2, fix> N() {
        return this.P;
    }

    public void a(apc_2 apc_22, fix fix2) {
        if (this.P == null) {
            this.P = new HashMap<apc_2, fix>();
        }
        this.P.put(apc_22, fix2);
    }

    public void a(eps_0 eps_02, float f2, float f3) {
        if (this.x == null) {
            this.x = new HashMap<eps_0, fiq_0>(1);
        }
        this.x.put(eps_02, new fiq_0(f2, f3));
    }

    public Map<eps_0, fiq_0> O() {
        return this.x;
    }

    public boolean P() {
        return this.Q;
    }

    public void p(boolean bl) {
        this.Q = bl;
    }

    public boolean Q() {
        return this.R;
    }

    public void q(boolean bl) {
        this.R = bl;
    }

    public enV R() {
        return this.S;
    }

    public void a(enV enV2) {
        this.S = enV2;
    }

    public float S() {
        return this.f;
    }

    public void f(float f2) {
        this.f = f2;
    }

    public void a(int[] nArray) {
        this.T = nArray;
    }

    public int[] T() {
        return this.T;
    }
}

