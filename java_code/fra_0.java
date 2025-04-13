/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fra
 */
public enum fra_0 {
    a,
    b,
    c;


    public static fra_0 a(String string) {
        fra_0[] fra_0Array;
        for (fra_0 fra_02 : fra_0Array = fra_0.values()) {
            if (!fra_02.name().equals(string.toUpperCase())) continue;
            return fra_02;
        }
        return fra_0Array[0];
    }
}

