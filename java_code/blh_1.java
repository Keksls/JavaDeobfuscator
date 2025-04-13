/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLH
 */
public enum blh_1 {
    a(0, "territory", true),
    b(1, "subInstance", true),
    c(2, "instance", true),
    d(3, "parentMap", true),
    e(4, "full", true),
    f(5, "deco", false);

    final byte g;
    private final String h;
    private final boolean i;

    private blh_1(byte by, String string2, boolean bl) {
        this.g = by;
        this.h = string2;
        this.i = bl;
    }

    public byte a() {
        return this.g;
    }

    public boolean b() {
        return this.i;
    }

    public static blh_1 a(String string) {
        for (blh_1 blh_12 : blh_1.values()) {
            if (!blh_12.h.equals(string)) continue;
            return blh_12;
        }
        return null;
    }
}

