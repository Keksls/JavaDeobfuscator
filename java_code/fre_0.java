/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fre
 */
public enum fre_0 {
    a,
    b;


    public static fre_0 a(String string) {
        fre_0[] fre_0Array;
        for (fre_0 fre_02 : fre_0Array = fre_0.values()) {
            if (!fre_02.name().equals(string.toUpperCase())) continue;
            return fre_02;
        }
        return null;
    }
}

