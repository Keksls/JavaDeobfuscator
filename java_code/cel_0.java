/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cEL
 */
public enum cel_0 {
    a(0, "Ev\u00e8nement m\u00e9t\u00e9o"),
    b(1, "Ev\u00e8nement de faune"),
    c(2, "Ev\u00e8nement de flore"),
    d(3, "Ev\u00e8nement g\u00e9ographique"),
    e(4, "Ev\u00e8nement de marqueur audio"),
    f(5, "Ev\u00e8nement de Temps");

    private final String g;
    private final byte h;

    private cel_0(byte by, String string2) {
        this.g = string2;
        this.h = by;
    }

    public String a() {
        return this.g;
    }

    public byte b() {
        return this.h;
    }

    public String toString() {
        return this.g;
    }

    public static cel_0 a(byte by) {
        for (cel_0 cel_02 : cel_0.values()) {
            if (cel_02.h != by) continue;
            return cel_02;
        }
        return null;
    }
}

