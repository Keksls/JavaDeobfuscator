/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from afM
 */
public enum afm_0 {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4),
    f(5),
    g(6),
    h(7),
    i(8),
    j(9),
    k(10),
    l(11),
    m(12),
    n(13),
    o(14),
    p(-1);

    private final int q;
    private static final Map<Integer, afm_0> r;

    private afm_0(int n2) {
        this.q = n2;
    }

    public int a() {
        return this.q;
    }

    public static afm_0 a(int n) {
        return r.get(n);
    }

    static {
        r = new HashMap<Integer, afm_0>();
        for (afm_0 afm_02 : afm_0.values()) {
            r.put(afm_02.q, afm_02);
        }
    }
}

