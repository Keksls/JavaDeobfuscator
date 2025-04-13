/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frg
 */
public enum frg_0 {
    a,
    b,
    c,
    d,
    e;


    public static frg_0 a(String string) {
        frg_0[] frg_0Array;
        for (frg_0 frg_02 : frg_0Array = frg_0.values()) {
            if (!frg_02.name().equals(string.toUpperCase())) continue;
            return frg_02;
        }
        return frg_0Array[0];
    }
}

