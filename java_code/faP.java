/*
 * Decompiled with CFR 0.152.
 */
public enum faP {
    a(0, 86400000L),
    b(1, 604800000L),
    c(2, 2592000000L),
    d(3, 15552000000L),
    e(4, 31104000000L);

    private static final faP[] g;
    public static final byte f = -1;
    private final byte h;
    private final long i;

    private faP(byte by, long l) {
        this.h = by;
        this.i = l;
    }

    public byte a() {
        return this.h;
    }

    public long b() {
        return this.i;
    }

    public static faP a(byte by) {
        return g[by];
    }

    static {
        g = faP.values();
    }
}

