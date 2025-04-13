/*
 * Decompiled with CFR 0.152.
 */
public enum enX {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5),
    f(6),
    g(7),
    h(8),
    i(9),
    j(10),
    k(11),
    l(12),
    m(13),
    n(14);

    final byte o;

    private enX(int n2) {
        this.o = Hw.b((long)n2);
    }

    public static enX a(byte by) {
        for (enX enX2 : enX.values()) {
            if (by != enX2.o) continue;
            return enX2;
        }
        return a;
    }

    public byte a() {
        return this.o;
    }
}

