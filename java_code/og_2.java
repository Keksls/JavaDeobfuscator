/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Og
 */
public enum og_2 {
    a(0),
    b(1),
    c(2);

    private final int d;

    private og_2(int n2) {
        this.d = n2;
    }

    public int a() {
        return this.d;
    }

    public static og_2 a(int n) {
        for (og_2 og_22 : og_2.values()) {
            if (og_22.d != n) continue;
            return og_22;
        }
        return null;
    }
}

