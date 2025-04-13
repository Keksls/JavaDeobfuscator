/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLL
 */
public enum ell_0 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(10);

    private final byte h;

    private ell_0(byte by) {
        this.h = by;
    }

    public byte a() {
        return this.h;
    }

    public static ell_0 a(byte by) {
        for (ell_0 ell_02 : ell_0.values()) {
            if (ell_02.h != by) continue;
            return ell_02;
        }
        return g;
    }
}

