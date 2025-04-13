/*
 * Decompiled with CFR 0.152.
 */
public enum Tv implements aqk_2
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7),
    i(8),
    j(9),
    k(10),
    l(11),
    m(12),
    n(13),
    o(14),
    p(15),
    q(16),
    r(17),
    s(18),
    t(19),
    u(20),
    v(21),
    w(22),
    x(23),
    y(24),
    z(25),
    A(26),
    B(27),
    C(28),
    D(29),
    E(30),
    F(31),
    G(32),
    H(33),
    I(34),
    J(35),
    K(36),
    L(37),
    M(38);

    private final short P;
    public static final Tv[] N;
    public static final Tv[] O;

    private Tv(int n2) {
        this.P = Hw.c((long)n2);
    }

    public static Tv a(short s2) {
        for (Tv tv : Tv.values()) {
            if (tv.P != s2) continue;
            return tv;
        }
        return null;
    }

    public short a() {
        return this.P;
    }

    @Override
    public String f() {
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.P);
    }

    @Override
    public String e() {
        return this.name();
    }

    static {
        N = new Tv[]{a, F, G, H, I, J, K, L};
        O = new Tv[0];
    }
}

