/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/*
 * Renamed from eRW
 */
public enum erw_1 {
    a(0, 40),
    b(1, 40),
    c(2, 40),
    d(3, 40),
    e(4, 5),
    f(5, 7),
    g(6, 8),
    h(7, 5),
    i(8, 7),
    j(9, 8),
    k(10, 5),
    l(11, 7),
    m(12, 8),
    n(13, 5),
    o(14, 7),
    p(15, 8),
    q(16, 5),
    r(17, 7),
    s(18, 8),
    t(19, 5),
    u(20, 7),
    v(21, 8),
    w(22, 5),
    x(23, 7),
    y(24, 8),
    z(25, 5),
    A(26, 7),
    B(27, 8),
    C(28, 20),
    D(29, 30),
    E(30, 20),
    F(31, 30),
    G(32, 20),
    H(33, 30),
    I(34, 20),
    J(35, 30),
    K(36, 40);

    public static final Map<erw_1, erw_1> L;
    public final int M;
    public final short N;
    private erv_1 O;
    private erx_1 P;

    private erw_1(int n2, int n3) {
        this.M = n2;
        this.N = Hw.c((long)n3);
    }

    public static erw_1 a(int n) {
        for (erw_1 erw_12 : erw_1.values()) {
            if (n != erw_12.M) continue;
            return erw_12;
        }
        return null;
    }

    void a(erv_1 erv_12) {
        this.O = erv_12;
    }

    void a(erx_1 erx_12) {
        this.P = erx_12;
    }

    public erv_1 a() {
        return this.O;
    }

    public erx_1 b() {
        return this.P;
    }

    static {
        EnumMap<erw_1, erw_1> enumMap = new EnumMap<erw_1, erw_1>(erw_1.class);
        enumMap.put(e, f);
        enumMap.put(f, g);
        enumMap.put(h, i);
        enumMap.put(i, j);
        enumMap.put(k, l);
        enumMap.put(l, m);
        enumMap.put(n, o);
        enumMap.put(o, p);
        enumMap.put(q, r);
        enumMap.put(r, s);
        enumMap.put(t, u);
        enumMap.put(u, v);
        enumMap.put(w, x);
        enumMap.put(x, y);
        enumMap.put(z, A);
        enumMap.put(A, B);
        enumMap.put(C, D);
        enumMap.put(E, F);
        enumMap.put(G, H);
        enumMap.put(I, J);
        L = Collections.unmodifiableMap(enumMap);
        erx_1.a();
        erv_1.a();
    }
}

