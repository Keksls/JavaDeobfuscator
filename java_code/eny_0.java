/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eny
 */
public enum eny_0 {
    a(0),
    b(1),
    c(2),
    d(3);

    private final int e;

    private eny_0(int n2) {
        this.e = n2;
    }

    public static eny_0 a(int n) {
        eny_0[] eny_0Array = eny_0.values();
        for (int k = 0; k < eny_0Array.length; ++k) {
            eny_0 eny_02 = eny_0Array[k];
            if (eny_02.e != n) continue;
            return eny_02;
        }
        return a;
    }
}

