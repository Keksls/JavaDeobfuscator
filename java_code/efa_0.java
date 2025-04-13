/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eFa
 */
public enum efa_0 implements aqk_2
{
    a(0, null, null, null, 17, false),
    b(1, eps_0.G, eps_0.q, eps_0.v, 14, true),
    c(2, eps_0.D, eps_0.r, eps_0.w, 13, true),
    d(3, eps_0.F, eps_0.s, eps_0.x, 15, true),
    e(4, eps_0.E, eps_0.t, eps_0.y, 16, true),
    f(5, eps_0.Z, eps_0.R, eps_0.S, 19, true),
    g(6, eps_0.ai, eps_0.aj, eps_0.ak, 30, true),
    h(9, null, null, null, 18, false);

    public static final byte i = 0;
    public static final byte j = 1;
    public static final byte k = 2;
    public static final byte l = 3;
    public static final byte m = 4;
    public static final byte n = 5;
    public static final byte o = 9;
    private final byte p;
    private final eps_0 q;
    private final eps_0 r;
    private final eps_0 s;
    private final boolean t;
    private final int u;

    public static efa_0 a(byte by) {
        for (efa_0 efa_02 : efa_0.values()) {
            if (efa_02.a() != by) continue;
            return efa_02;
        }
        return null;
    }

    private efa_0(byte by, eps_0 eps_02, eps_0 eps_03, eps_0 eps_04, int n2, boolean bl) {
        this.p = by;
        this.q = eps_02;
        this.r = eps_03;
        if (this.r != null) {
            this.r.a(this);
        }
        this.s = eps_04;
        if (this.s != null) {
            this.s.a(this);
        }
        this.u = n2;
        this.t = bl;
    }

    @Override
    public String d() {
        return Byte.toString(this.a());
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }

    public byte a() {
        return this.p;
    }

    public eps_0 b() {
        return this.q;
    }

    public eps_0 c() {
        return this.r;
    }

    public eps_0 g() {
        return this.s;
    }

    public boolean h() {
        return this.q != null;
    }

    public boolean i() {
        return this.t;
    }

    public int j() {
        return this.u;
    }
}

