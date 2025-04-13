/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVG
 */
public enum evg_1 {
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
    z(26),
    A(27),
    B(28),
    C(29),
    D(30);

    private final byte E;

    private evg_1(byte by) {
        this.E = by;
    }

    public byte a() {
        return this.E;
    }

    public static evg_1 a(byte by) {
        for (evg_1 evg_12 : evg_1.values()) {
            if (evg_12.E != by) continue;
            return evg_12;
        }
        return null;
    }
}

