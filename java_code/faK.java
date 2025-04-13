/*
 * Decompiled with CFR 0.152.
 */
public enum faK {
    a(0),
    b(9),
    c(5),
    d(9),
    e(5);

    private static final faK[] f;
    private final int g;

    public static faK a(int n) {
        return f[n];
    }

    public int a() {
        return this.g;
    }

    private faK(int n2) {
        this.g = n2;
    }

    static {
        f = faK.values();
    }
}

