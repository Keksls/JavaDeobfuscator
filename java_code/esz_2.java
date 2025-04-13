/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eSz
 */
public enum esz_2 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7);

    private final byte i;

    private esz_2(byte by) {
        this.i = by;
    }

    public static esz_2 a(byte by) {
        for (esz_2 esz_22 : esz_2.values()) {
            if (by != esz_22.i) continue;
            return esz_22;
        }
        return a;
    }

    public byte a() {
        return this.i;
    }
}

