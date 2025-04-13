/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from emD
 */
public enum emd_0 {
    a(0, ""),
    b(1, "SHIELD"),
    c(2, "AUTHENTICATOR");

    private final byte d;
    private final String e;

    private emd_0(int n2, String string2) {
        this.d = Hw.b((long)n2);
        this.e = string2;
    }

    public byte a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public static emd_0 a(byte by) {
        for (emd_0 emd_02 : emd_0.values()) {
            if (emd_02.d != by) continue;
            return emd_02;
        }
        return a;
    }

    public static emd_0 a(String string) {
        for (emd_0 emd_02 : emd_0.values()) {
            if (!emd_02.e.equalsIgnoreCase(string)) continue;
            return emd_02;
        }
        return a;
    }
}

