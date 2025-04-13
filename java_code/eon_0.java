/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eoN
 */
public enum eon_0 {
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
    u(20);

    private final int v;

    public static eon_0 a(int n) {
        for (eon_0 eon_02 : eon_0.values()) {
            if (eon_02.v != n) continue;
            return eon_02;
        }
        return null;
    }

    private eon_0(int n2) {
        this.v = n2;
    }

    public int a() {
        return this.v;
    }
}

