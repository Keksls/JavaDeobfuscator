/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frf
 */
public enum frf_0 {
    a,
    b,
    c,
    d;


    public static frf_0 a(String string) {
        frf_0[] frf_0Array;
        for (frf_0 frf_02 : frf_0Array = frf_0.values()) {
            if (!frf_02.name().equals(string.toUpperCase())) continue;
            return frf_02;
        }
        return frf_0Array[0];
    }
}

