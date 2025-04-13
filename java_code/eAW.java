/*
 * Decompiled with CFR 0.152.
 */
public enum eAW {
    a(0),
    b(1),
    c(2),
    d(3);

    private final byte e;

    private eAW(byte by) {
        this.e = by;
    }

    public static eAW a(byte by) {
        for (eAW eAW2 : eAW.values()) {
            if (eAW2.e != by) continue;
            return eAW2;
        }
        throw new IllegalArgumentException("Unknown result id=" + by);
    }

    public byte a() {
        return this.e;
    }
}

