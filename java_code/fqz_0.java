/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fqZ
 */
public enum fqz_0 {
    a,
    b,
    c,
    d;


    public static fqz_0 a(String string) {
        fqz_0[] fqz_0Array;
        for (fqz_0 fqz_02 : fqz_0Array = fqz_0.values()) {
            if (!fqz_02.name().equals(string.toUpperCase())) continue;
            return fqz_02;
        }
        return fqz_0Array[0];
    }

    public static fqz_0 a(int n) {
        fqz_0[] fqz_0Array = fqz_0.values();
        if (fqz_0Array.length > n && n >= 0) {
            return fqz_0Array[n];
        }
        return null;
    }
}

