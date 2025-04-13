/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDN
 */
public enum adn_2 {
    a(1000L),
    b(60000L),
    c(3600000L),
    d(86400000L);

    private final long e;

    private adn_2(long l) {
        this.e = l;
    }

    public long a(long l) {
        return this.e * l;
    }
}

