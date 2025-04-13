/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ePG
 */
public enum epg_0 {
    a(1),
    b(2),
    c(3),
    d(4),
    e(5);

    private final byte f;

    private epg_0(int n2) {
        this.f = (byte)n2;
    }

    public byte a() {
        return this.f;
    }

    public static epg_0 a(byte by) {
        for (epg_0 epg_02 : epg_0.values()) {
            if (epg_02.f != by) continue;
            return epg_02;
        }
        return null;
    }
}

