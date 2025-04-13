/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brF
 */
public enum brf_1 {
    a(0),
    b(1),
    c(2);

    private final byte d;

    private brf_1(byte by) {
        this.d = by;
    }

    public byte a() {
        return this.d;
    }

    public static brf_1 a(byte by) {
        for (brf_1 brf_12 : brf_1.values()) {
            if (brf_12.d != by) continue;
            return brf_12;
        }
        return null;
    }
}

