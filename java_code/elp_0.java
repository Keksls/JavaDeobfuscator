/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eLP
 */
public enum elp_0 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5);

    private final byte g;

    private elp_0(byte by) {
        this.g = by;
    }

    public byte a() {
        return this.g;
    }

    public static elp_0 a(byte by) {
        for (elp_0 elp_02 : elp_0.values()) {
            if (elp_02.a() != by) continue;
            return elp_02;
        }
        return a;
    }
}

