/*
 * Decompiled with CFR 0.152.
 */
public enum eCJ {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5);

    private final byte g;

    private eCJ(byte by) {
        this.g = by;
    }

    public static eCJ a(byte by) {
        for (eCJ eCJ2 : eCJ.values()) {
            if (eCJ2.g != by) continue;
            return eCJ2;
        }
        return null;
    }

    public byte a() {
        return this.g;
    }
}

