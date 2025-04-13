/*
 * Decompiled with CFR 0.152.
 */
public enum bSu {
    a(0, "default"),
    b(1, "BANNER");

    private final byte c;
    private final String d;

    private bSu(int n2, String string2) {
        this.c = Hw.b((long)n2);
        this.d = string2;
    }

    public byte a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public static bSu a(String string) {
        if (string == null) {
            return a;
        }
        for (bSu bSu2 : bSu.values()) {
            if (!string.equals(bSu2.d)) continue;
            return bSu2;
        }
        return a;
    }
}

