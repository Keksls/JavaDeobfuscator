/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bSw
 */
public enum bsw_0 {
    a("OGRINETOKEN"),
    b("");

    private final String c;

    private bsw_0(String string2) {
        this.c = string2;
    }

    public String a() {
        return this.c;
    }

    public static bsw_0 a(String string) {
        for (bsw_0 bsw_02 : bsw_0.values()) {
            if (!bsw_02.c.equals(string)) continue;
            return bsw_02;
        }
        return b;
    }
}

