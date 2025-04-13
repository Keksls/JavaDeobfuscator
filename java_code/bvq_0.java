/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bVQ
 */
public enum bvq_0 {
    a(0, "options.displayHpBar.always"),
    b(1, "options.displayHpBar.smart"),
    c(2, "options.displayHpBar.never");

    private final byte d;
    private final String e;

    private bvq_0(byte by, String string2) {
        this.d = by;
        this.e = string2;
    }

    public byte a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public static bvq_0 a(byte by) {
        for (bvq_0 bvq_02 : bvq_0.values()) {
            if (by != bvq_02.d) continue;
            return bvq_02;
        }
        return null;
    }

    public static bvq_0 a(String string) {
        for (bvq_0 bvq_02 : bvq_0.values()) {
            if (!bae.h().a(bvq_02.e, new Object[0]).equals(string)) continue;
            return bvq_02;
        }
        return null;
    }

    public static byte b(byte by) {
        bvq_0 bvq_02 = bvq_0.a(by);
        if (bvq_02 == null) {
            return bvq_0.a.d;
        }
        switch (bvq_02) {
            case a: {
                return bvq_0.c.d;
            }
            case b: {
                return bvq_0.a.d;
            }
            case c: {
                return bvq_0.b.d;
            }
        }
        return bvq_0.a.d;
    }
}

