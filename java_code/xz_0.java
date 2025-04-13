/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xz
 */
public enum xz_0 {
    a(-1, "?"),
    b(0, "fr", Ow.a),
    c(1, "en"),
    d(2, "int"),
    e(3, "de"),
    f(4, "es", Ow.c),
    g(5, "ru"),
    h(6, "pt", Ow.d),
    i(7, "nl"),
    j(8, "jp"),
    k(9, "it"),
    l(11, "na"),
    m(12, "cn"),
    n(13, "asia"),
    o(14, "tw");

    public static final xz_0 p;
    private final int q;
    private final String r;
    private final Ow s;

    private xz_0(int n2, String string2) {
        this(n2, string2, Ow.o);
    }

    private xz_0(int n2, String string2, Ow ow) {
        this.q = n2;
        this.r = string2;
        this.s = ow;
    }

    public int a() {
        return this.q;
    }

    public String b() {
        return this.r;
    }

    public Ow c() {
        return this.s;
    }

    public static xz_0 a(int n) {
        for (xz_0 xz_02 : xz_0.values()) {
            if (n != xz_02.q) continue;
            return xz_02;
        }
        return p;
    }

    static {
        p = c;
    }
}

