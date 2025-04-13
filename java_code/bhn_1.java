/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bhN
 */
public enum bhn_1 implements OR
{
    a(1, false, true),
    b(2, false, true),
    c(3, false, true),
    d(4, false, true),
    e(5, false, true),
    f(6, true, true),
    g(7, true, true),
    h(8, false, true),
    i(9, false, true),
    j(10, false, true),
    k(11, true, true),
    l(12, false, true),
    m(13, true, true),
    n(14, false, false),
    o(15, false, true),
    p(16, false, true),
    q(17, true, true),
    r(18, false, false);

    private final int s;
    private final boolean t;
    private final boolean u;
    private static bhn_1[] v;

    private bhn_1(int n2, boolean bl, boolean bl2) {
        this.s = n2;
        this.t = bl;
        this.u = bl2;
    }

    public static bhn_1 a(int n) {
        if (v == null) {
            v = bhn_1.values();
        }
        for (bhn_1 bhn_12 : v) {
            if (bhn_12.s != n) continue;
            return bhn_12;
        }
        return null;
    }

    @Override
    public int b() {
        return this.s;
    }

    @Override
    public boolean a() {
        return this.t;
    }

    @Override
    public boolean c() {
        return this.u;
    }
}

