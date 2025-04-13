/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ezT
 */
public enum ezt_2 {
    a(-1),
    b(1),
    c(2),
    d(3),
    e(4);

    private final byte f;

    private ezt_2(byte by) {
        this.f = by;
    }

    public byte a() {
        return this.f;
    }

    public static ezt_2 a(byte by) {
        for (ezt_2 ezt_22 : ezt_2.values()) {
            if (ezt_22.f != by) continue;
            return ezt_22;
        }
        return a;
    }
}

