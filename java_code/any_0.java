/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aNY
 */
public enum any_0 implements ZW
{
    a(1, ZU.b),
    b(2, ZU.b),
    c(3, ZU.b),
    d(4, ZU.b),
    e(5, ZU.b),
    f(6, ZU.b),
    g(7, ZU.b),
    h(8, ZU.b),
    i(9, ZU.b),
    j(10, ZU.b),
    k(1000, ZU.b),
    l(1001, ZU.b),
    m(1002, ZU.b),
    n(1003, ZU.b),
    o(1004, ZU.b),
    p(1005, ZU.b),
    q(10001, ZU.a),
    r(10002, ZU.a),
    s(10003, ZU.a),
    t(10004, ZU.a),
    u(10005, ZU.a),
    v(10006, ZU.a),
    w(10007, ZU.a),
    x(10008, ZU.a),
    y(10009, ZU.a),
    z(10010, ZU.a),
    A(10011, ZU.a),
    B(10012, ZU.a),
    C(20001, ZU.c),
    D(20003, ZU.c),
    E(20004, ZU.c),
    F(20005, ZU.c),
    G(20007, ZU.c),
    H(20008, ZU.c);

    private final int I;
    private final ZU J;
    private static final aoa_0 K;

    public static void c() {
        any_0[] any_0Array = any_0.values();
        for (int k = 0; k < any_0Array.length - 1; ++k) {
            for (int i2 = k + 1; i2 < any_0Array.length; ++i2) {
                if (any_0Array[k].a() != any_0Array[i2].a()) continue;
                throw new Exception(any_0Array[k].name() + " et " + any_0Array[i2].name() + "ont le m\u00eame id");
            }
        }
    }

    private any_0(int n2, ZU zU) {
        this.I = n2;
        this.J = zU;
    }

    @Override
    public final int a() {
        return this.I;
    }

    @Override
    public final ZU b() {
        return this.J;
    }

    public static String a(int n) {
        return K.b(n);
    }

    public static aaq_0 a(any_0 any_02) {
        return K.a(any_02);
    }

    public static aoa_0 d() {
        return K;
    }

    static {
        K = new aoa_0();
    }
}

