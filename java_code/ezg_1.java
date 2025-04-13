/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ezG
 */
public enum ezg_1 {
    a(-1, false),
    b(0, false),
    c(1),
    d(2),
    e(3),
    f(4),
    g(5),
    h(6),
    i(7),
    j(8),
    k(9),
    l(10),
    m(11),
    n(12);

    private static final ezg_1[] o;
    private final int p;
    private final boolean q;

    private ezg_1(int n2) {
        this(n2, true);
    }

    private ezg_1(int n2, boolean bl) {
        this.p = n2;
        this.q = bl;
    }

    public int a() {
        return this.p;
    }

    public boolean b() {
        return this.q;
    }

    public static ezg_1 a(byte by) {
        if (by > o.length) {
            return a;
        }
        return o[by];
    }

    static {
        o = ezg_1.values();
    }
}

