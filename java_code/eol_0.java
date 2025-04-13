/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eoL
 */
public enum eol_0 {
    a(40, "vulgarity", 3, eom_0.a, 15),
    b(41, "sexual language", 61, eom_0.a, 90),
    c(42, "hateful language", 62, eom_0.a, 360),
    d(50, "flood", 4, eom_0.a, 15),
    e(160, "misuse of capital letters", 47, eom_0.a, 15),
    f(30, "recruitment flood", 2, eom_0.a, 7),
    g(20, "invalid use of recruitment chan", 1, eom_0.a, 7),
    h(10, "invalid use of trade chan", 0, eom_0.a, 7),
    i(25, "invalid use of community chan", 58, eom_0.a, 7),
    j(130, "trade flood", 41, eom_0.a, 7),
    k(70, "foreign language", 6, eom_0.a, 15),
    l(90, "external website", 9, eom_0.a, 90),
    m(140, "kama trading", 45, eom_0.a, 90),
    n(60, "scam", 5, eom_0.a, 90),
    o(170, "asynchronous trading", 48, eom_0.a, 90),
    p(80, "private server", 8, eom_0.a, 360),
    q(120, "inappropriate behaviour", 11, eom_0.a, 90),
    r(150, "harassment", 46, eom_0.a, 360),
    s(180, "terrorism apology", 55, eom_0.a, 720),
    t(190, "wrong language in channel", 57, eom_0.a, 15),
    u(1030, "vulgarity (repeat offense)", 14, eom_0.b, 60, 90),
    v(1090, "flood (repeat offense)", 20, eom_0.b, 30, 90),
    w(1080, "misuse of capital letters", 19, eom_0.b, 15, 90),
    x(1050, "recruitment flood (repeat offense)", 16, eom_0.b, 15, 30),
    y(1070, "invalid use of recruitment chan (repeat offense)", 18, eom_0.b, 15, 30),
    z(1060, "invalid use of trade chan (repeat offense)", 17, eom_0.b, 15, 30),
    A(1071, "invalid use of community chan (repeat offense)", 59, eom_0.b, 15, 30),
    B(1040, "trade flood (repeat offense)", 15, eom_0.b, 15, 30),
    C(1010, "advertising (repeat offense)", 12, eom_0.b, 60, 180),
    D(1100, "flood (additional repeat offense)", 21, eom_0.b, 60, 90),
    E(1110, "invalid use of chan (additional repeat offense)", 22, eom_0.b, 60, 90),
    F(1120, "flood hard", 23, eom_0.c, 1440, 33, 180),
    G(1020, "harassment or threats", 13, eom_0.c, 1440, 99, 720),
    H(2060, "insults", 26, eom_0.c, 1440, 19, 180),
    I(2050, "racism or xenophobia or homophobia or paedophilia", 25, eom_0.c, 2880, 21, 720),
    J(2070, "content of a sexual nature", 27, eom_0.c, 1440, 120, 360),
    K(2220, "kamas selling", 51, eom_0.c, 1440, 138, 360),
    L(2221, "3rd party website (recidivism)", 60, eom_0.c, 1440, 82, 180),
    M(2160, "inter game selling", 54, eom_0.c, 1440, 156, 360),
    N(2180, "account selling", 53, eom_0.c, 1440, 79, 360),
    O(2170, "guild selling", 52, eom_0.c, 1440, 155, 360),
    P(2150, "account subscription selling", 42, eom_0.c, 1440, 78, 360),
    Q(2040, "inappropriate nickname", 24, eom_0.c, 0, 23, 180),
    R(2080, "sex website advert", 28, eom_0.c, 2880, 100, 360),
    S(2090, "phishing website advert", 29, eom_0.c, 2880, 72, 360),
    T(2100, "player identity theft", 30, eom_0.c, 2880, 13, 720),
    U(2110, "mod identity theft", 31, eom_0.c, 2880, 12, 720),
    V(2190, "inappropriate behaviour", 43, eom_0.c, 1440, 3, 360),
    W(2210, "asynchronous trading", 49, eom_0.c, 1440, 471, 360),
    X(2130, "scam", 33, eom_0.c, 10080, 26, 360),
    Y(2120, "disrespect of anonymity", 32, eom_0.c, 1440, 86, 720),
    Z(2200, "bug abuse", 44, eom_0.c, 2880, 102, 720),
    aa(2140, "private server", 35, eom_0.c, 1440, 139, 720),
    ab(2010, "kama site", 38, eom_0.c, 2880, 105, 90),
    ac(2020, "farming bot", 39, eom_0.c, 2880, 123, 90),
    ad(2030, "bot", 40, eom_0.c, 2880, 124, 90),
    ae(2230, "terrorism apology", 56, eom_0.c, 2880, 435, 720);

    public static final short af = -1;
    public static final short ag = -2;
    public static final int ah = 90;
    private final int ai;
    private final String aj;
    private final int ak;
    private final eom_0 al;
    private final int am;
    private final int an;
    private final int ao;

    private eol_0(int n2, String string2, int n3, eom_0 eom_02, int n4) {
        this(n2, string2, n3, eom_02, 0, n4);
    }

    private eol_0(int n2, String string2, int n3, eom_0 eom_02, int n4, int n5) {
        this(n2, string2, n3, eom_02, n4, -1, n5);
    }

    private eol_0(int n2, String string2, int n3, eom_0 eom_02, int n4, int n5, int n6) {
        this.ai = n2;
        this.aj = string2;
        this.ak = n3;
        this.al = eom_02;
        this.am = n4;
        this.an = n5;
        this.ao = n6;
    }

    public static eol_0 a(int n) {
        for (eol_0 eol_02 : eol_0.values()) {
            if (n != eol_02.ai) continue;
            return eol_02;
        }
        return null;
    }

    public int a() {
        return this.ai;
    }

    public String b() {
        return this.aj;
    }

    public int c() {
        return this.ak;
    }

    public eom_0 d() {
        return this.al;
    }

    public int e() {
        return this.am;
    }

    public int f() {
        return this.an;
    }

    public int g() {
        return this.ao;
    }
}

