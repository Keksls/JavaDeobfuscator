/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bNm
 */
public enum bnm_0 {
    a(0, "AnimStatique"),
    b(1, "AnimStatique-Content"),
    c(2, "AnimStatique-Colere"),
    d(3, "AnimStatique-Surpris");

    private final byte e;
    private final String f;

    private bnm_0(byte by, String string2) {
        this.e = by;
        this.f = string2;
    }

    public static bnm_0 a(byte by) {
        for (bnm_0 bnm_02 : bnm_0.values()) {
            if (bnm_02.e != by) continue;
            return bnm_02;
        }
        return null;
    }

    public byte a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public static bnm_0 a(fgk_0 fgk_02) {
        switch (fgk_02) {
            case b: {
                return c;
            }
            case d: {
                return b;
            }
        }
        return a;
    }
}

