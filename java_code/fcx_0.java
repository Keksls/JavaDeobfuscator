/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fcx
 */
public enum fcx_0 {
    a(0),
    b(1),
    c(2),
    d(3);

    private final byte e;

    private fcx_0(byte by) {
        this.e = by;
    }

    public byte a() {
        return this.e;
    }

    public static fcx_0 a(byte by) {
        for (fcx_0 fcx_02 : fcx_0.values()) {
            if (by != fcx_02.e) continue;
            return fcx_02;
        }
        return null;
    }
}

