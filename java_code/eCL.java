/*
 * Decompiled with CFR 0.152.
 */
public enum eCL {
    a(0),
    b(1),
    c(2),
    d(3);

    private final byte e;

    private eCL(byte by) {
        this.e = by;
    }

    public static eCL a(byte by) {
        for (eCL eCL2 : eCL.values()) {
            if (eCL2.e != by) continue;
            return eCL2;
        }
        return null;
    }

    public byte a() {
        return this.e;
    }
}

