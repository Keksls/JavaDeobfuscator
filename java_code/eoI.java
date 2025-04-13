/*
 * Decompiled with CFR 0.152.
 */
public enum eoI {
    a(0, "FRIENDLY"),
    b(1, "RANDOM"),
    c(2, "TOURNAMENT");

    private final byte d;
    private final String e;

    private eoI(byte by, String string2) {
        this.d = by;
        this.e = string2;
    }

    public byte a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public static eoI a(String string) {
        for (eoI eoI2 : eoI.values()) {
            if (!eoI2.b().equals(string)) continue;
            return eoI2;
        }
        return null;
    }

    public static eoI a(byte by) {
        for (eoI eoI2 : eoI.values()) {
            if (eoI2.d != by) continue;
            return eoI2;
        }
        return null;
    }
}

