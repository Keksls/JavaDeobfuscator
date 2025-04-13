/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from brs
 */
public enum brs_1 {
    a(0),
    b(1);

    final byte c;

    private brs_1(byte by) {
        this.c = by;
    }

    public static brs_1 a(byte by) {
        for (brs_1 brs_12 : brs_1.values()) {
            if (by != brs_12.c) continue;
            return brs_12;
        }
        return null;
    }
}

