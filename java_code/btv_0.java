/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bTv
 */
public enum btv_0 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final byte f;

    private btv_0(byte by) {
        this.f = by;
    }

    public byte a() {
        return this.f;
    }

    public static btv_0 a(byte by) {
        for (btv_0 btv_02 : btv_0.values()) {
            if (btv_02.f != by) continue;
            return btv_02;
        }
        return null;
    }
}

