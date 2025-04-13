/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from avg
 */
public enum avg_1 {
    a(false),
    b(true),
    c(false),
    d(true);

    private final boolean e;

    private avg_1(boolean bl) {
        this.e = bl;
    }

    public boolean a() {
        return this.e;
    }

    public static avg_1 a(String string) {
        avg_1[] avg_1Array;
        for (avg_1 avg_12 : avg_1Array = avg_1.values()) {
            if (!avg_12.name().equals(string.toUpperCase())) continue;
            return avg_12;
        }
        return avg_1Array[0];
    }

    public static boolean a(avg_1 avg_12, avg_1 avg_13) {
        return avg_12.ordinal() % 2 != avg_13.ordinal() % 2;
    }
}

