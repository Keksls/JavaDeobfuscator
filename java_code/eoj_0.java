/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eoJ
 */
public enum eoj_0 {
    a(0, "km_arena"),
    b(1, "dofus"),
    c(2, "wakfu");

    private final byte d;
    private final String e;

    private eoj_0(byte by, String string2) {
        this.d = by;
        this.e = string2;
    }

    public byte a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public static eoj_0 a(String string) {
        for (eoj_0 eoj_02 : eoj_0.values()) {
            if (!eoj_02.b().equalsIgnoreCase(string)) continue;
            return eoj_02;
        }
        return null;
    }

    public static eoj_0 a(byte by) {
        for (eoj_0 eoj_02 : eoj_0.values()) {
            if (eoj_02.d != by) continue;
            return eoj_02;
        }
        return null;
    }
}

