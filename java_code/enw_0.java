/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from enw
 */
public enum enw_0 {
    a(0),
    b(2),
    c(3),
    d(5),
    e(6),
    f(7),
    g(8),
    h(9),
    i(10),
    j(11),
    k(12),
    l(13),
    m(14),
    n(15),
    o(17),
    p(20),
    q(21),
    r(22),
    s(23),
    t(24),
    u(25),
    v(26),
    w(26),
    x(26),
    y(26);

    public final int z;

    private enw_0(int n2) {
        this.z = n2;
    }

    public static enw_0 a(int n) {
        for (enw_0 enw_02 : enw_0.values()) {
            if (enw_02.z != n) continue;
            return enw_02;
        }
        return a;
    }

    public String toString() {
        return "SubscriptionRight{name=" + this.name() + ", m_id=" + this.z + "}";
    }
}

