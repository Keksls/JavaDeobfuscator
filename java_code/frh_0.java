/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from frh
 */
public enum frh_0 {
    a,
    b,
    c,
    d;


    public boolean a() {
        return this == a || this == b;
    }

    public boolean b() {
        return this == d || this == c;
    }

    public static frh_0 a(String string) {
        frh_0[] frh_0Array;
        for (frh_0 frh_02 : frh_0Array = frh_0.values()) {
            if (!frh_02.name().equals(string.toUpperCase())) continue;
            return frh_02;
        }
        return frh_0Array[0];
    }
}

