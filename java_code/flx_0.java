/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from flx
 */
public enum flx_0 {
    a(0),
    b(1),
    c(2);

    private final byte d;

    public static flx_0 a(byte by) {
        for (flx_0 flx_02 : flx_0.values()) {
            if (flx_02.d != by) continue;
            return flx_02;
        }
        return a;
    }

    private flx_0(byte by) {
        this.d = by;
    }

    public byte a() {
        return this.d;
    }
}

