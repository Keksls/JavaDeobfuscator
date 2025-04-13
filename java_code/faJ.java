/*
 * Decompiled with CFR 0.152.
 */
public enum faJ {
    a(0),
    b(1),
    c(2),
    d(3);

    private static final faJ[] e;
    private final byte f;

    private faJ(byte by) {
        this.f = by;
    }

    public byte a() {
        return this.f;
    }

    public static faJ a(int n) {
        return e[n];
    }

    static {
        e = faJ.values();
    }
}

