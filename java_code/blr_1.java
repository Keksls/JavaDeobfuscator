/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLR
 */
public enum blr_1 {
    a(0, "singleCharacterIcon"),
    b(1, "optionsIcon"),
    c(2, "LaurelIcon"),
    d(3, "LaurelIcon"),
    e(4, "balanceIcon", 5000, 0),
    f(5, "contactsIcon"),
    g(6, "DongeonIcon"),
    h(7, "ChallengeIcon"),
    i(8, "WeatherIcon"),
    j(9, "questionMark", 15000, 0),
    k(10, "ChallengeIcon"),
    l(11, "ChallengeIcon", 5000, 1),
    m(12, "ChallengeIcon", 5000, 2),
    n(13, "passportPvpCategoryIcon");

    private final byte o;
    private final String p;
    private final int q;
    private final int r;

    private blr_1(byte by, String string2) {
        this(by, string2, 5000, 0);
    }

    private blr_1(byte by, String string2, int n2, int n3) {
        this.o = by;
        this.p = string2;
        this.q = n2;
        this.r = n3;
    }

    public byte a() {
        return this.o;
    }

    public String b() {
        return this.p;
    }

    public int c() {
        return this.q;
    }

    public int d() {
        return this.r;
    }
}

