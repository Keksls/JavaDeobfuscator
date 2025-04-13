/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public enum faI {
    a(0),
    b(1, eps_0.b, efc_0.bq, efc_0.by),
    c(2, eps_0.c, efc_0.bt, efc_0.bA),
    d(3, eps_0.d, efc_0.bu, efc_0.bC),
    e(4, eps_0.e, efc_0.bv, efc_0.bD),
    f(5, eps_0.p, efc_0.A, efc_0.aI),
    g(6, eps_0.q, List.of(efc_0.A, efc_0.B), List.of(efc_0.aI, efc_0.aJ)),
    h(7, eps_0.q, List.of(efc_0.A, efc_0.B, efc_0.p), List.of(efc_0.aI, efc_0.aJ)),
    i(8, eps_0.s, List.of(efc_0.A, efc_0.C), List.of(efc_0.aI, efc_0.aK)),
    j(9, eps_0.s, List.of(efc_0.A, efc_0.C, efc_0.p), List.of(efc_0.aI, efc_0.aK)),
    k(10, eps_0.r, List.of(efc_0.A, efc_0.D), List.of(efc_0.aI, efc_0.aL)),
    l(11, eps_0.r, List.of(efc_0.A, efc_0.D, efc_0.p), List.of(efc_0.aI, efc_0.aL)),
    m(12, eps_0.t, List.of(efc_0.A, efc_0.E), List.of(efc_0.aI, efc_0.aM)),
    n(13, eps_0.t, List.of(efc_0.A, efc_0.E, efc_0.p), List.of(efc_0.aI, efc_0.aM)),
    o(14, eps_0.K, efc_0.S, efc_0.aZ),
    p(15, eps_0.m, efc_0.P, efc_0.aW),
    q(16, eps_0.ad, efc_0.J, efc_0.aQ),
    r(17, eps_0.ae, efc_0.K, efc_0.aS),
    s(18, eps_0.ah, efc_0.M, efc_0.aT),
    t(19, eps_0.u, efc_0.u, efc_0.ax),
    u(20, eps_0.v, List.of(efc_0.u, efc_0.v), List.of(efc_0.ax, efc_0.az)),
    v(21, eps_0.v, List.of(efc_0.u, efc_0.v, efc_0.q), List.of(efc_0.ax, efc_0.az)),
    w(22, eps_0.x, List.of(efc_0.u, efc_0.x), List.of(efc_0.ax, efc_0.ay)),
    x(23, eps_0.x, List.of(efc_0.u, efc_0.x, efc_0.q), List.of(efc_0.ax, efc_0.ay)),
    y(24, eps_0.w, List.of(efc_0.u, efc_0.w), List.of(efc_0.ax, efc_0.aA)),
    z(25, eps_0.w, List.of(efc_0.u, efc_0.w, efc_0.q), List.of(efc_0.ax, efc_0.aA)),
    A(26, eps_0.y, List.of(efc_0.u, efc_0.y), List.of(efc_0.ax, efc_0.aB)),
    B(27, eps_0.y, List.of(efc_0.u, efc_0.y, efc_0.q), List.of(efc_0.ax, efc_0.aB)),
    C(28, eps_0.W, efc_0.T, efc_0.ba),
    D(29, eps_0.n, efc_0.Q, efc_0.aX),
    E(30, eps_0.o, efc_0.r, efc_0.au),
    F(31, eps_0.h, efc_0.R, efc_0.aY),
    G(32, eps_0.Q, efc_0.Y, efc_0.bb),
    H(33, eps_0.B, efc_0.ad, efc_0.bg),
    I(34, eps_0.j, efc_0.aa, efc_0.bc),
    J(35, eps_0.g, efc_0.af, efc_0.bi),
    K(36, eps_0.f, efc_0.ae, efc_0.bh),
    L(37, eps_0.k, efc_0.O, efc_0.aU),
    M(38, eps_0.P, efc_0.ag, efc_0.bj),
    N(39, eps_0.au, efc_0.ah, efc_0.bk),
    O(40, eps_0.av, efc_0.ai, efc_0.bl);

    private static final Map<Integer, Map<Integer, Integer>> T;
    public static final Map<faI, faI> P;
    public static final Map<Integer, List<Integer>> Q;
    public static final Map<Integer, List<Integer>> R;
    public static final Set<Integer> S;
    private final int U;
    private final eps_0 V;
    private final int[] W;
    private final int[] X;

    private faI(int n2) {
        this.U = n2;
        this.V = null;
        this.W = new int[0];
        this.X = new int[0];
    }

    private faI(int n2, eps_0 eps_02, efd_0 efd_02, efd_0 efd_03) {
        this(n2, eps_02, List.of(efd_02), List.of(efd_03));
    }

    private faI(int n2, eps_0 eps_02, List<efd_0> list, List<efd_0> list2) {
        int n3;
        this.U = n2;
        this.V = eps_02;
        this.W = new int[list.size()];
        for (n3 = 0; n3 < list.size(); ++n3) {
            this.W[n3] = list.get(n3).a();
        }
        this.X = new int[list2.size()];
        for (n3 = 0; n3 < list2.size(); ++n3) {
            this.X[n3] = list2.get(n3).a();
        }
    }

    public static faI a(int n) {
        for (faI faI2 : faI.values()) {
            if (faI2.U != n) continue;
            return faI2;
        }
        return a;
    }

    public static faI b(int n) {
        eps_0 eps_02 = eps_0.a((byte)n);
        for (faI faI2 : faI.values()) {
            if (faI2.V != eps_02) continue;
            return faI2;
        }
        return a;
    }

    @Nullable
    public static Map<Integer, Integer> c(int n) {
        return T.get(n);
    }

    public int a() {
        return this.U;
    }

    public eps_0 b() {
        return this.V;
    }

    public int[] c() {
        return this.W;
    }

    public int[] d() {
        return this.X;
    }

    static {
        HashMap hashMap = new HashMap();
        for (faI faI2 : faI.values()) {
            for (int n : faI2.W) {
                if (!hashMap.containsKey(n)) {
                    hashMap.put(n, new HashMap());
                }
                ((Map)hashMap.get(n)).put(faI2.U, 1);
            }
            for (int n : faI2.X) {
                if (!hashMap.containsKey(n)) {
                    hashMap.put(n, new HashMap());
                }
                ((Map)hashMap.get(n)).put(faI2.U, -1);
            }
        }
        T = Collections.unmodifiableMap(hashMap);
        P = Map.of(g, h, i, j, k, l, m, n, u, v, w, x, y, z, A, B);
        Q = Map.of(Integer.valueOf(efa_0.b.a()), List.of(Integer.valueOf(faI.f.U), Integer.valueOf(faI.g.U), Integer.valueOf(faI.h.U)), Integer.valueOf(efa_0.c.a()), List.of(Integer.valueOf(faI.f.U), Integer.valueOf(faI.k.U), Integer.valueOf(faI.l.U)), Integer.valueOf(efa_0.d.a()), List.of(Integer.valueOf(faI.f.U), Integer.valueOf(faI.i.U), Integer.valueOf(faI.j.U)), Integer.valueOf(efa_0.e.a()), List.of(Integer.valueOf(faI.f.U), Integer.valueOf(faI.m.U), Integer.valueOf(faI.n.U)));
        R = Map.of(Integer.valueOf(efa_0.b.a()), List.of(Integer.valueOf(faI.t.U), Integer.valueOf(faI.u.U), Integer.valueOf(faI.v.U)), Integer.valueOf(efa_0.c.a()), List.of(Integer.valueOf(faI.t.U), Integer.valueOf(faI.y.U), Integer.valueOf(faI.z.U)), Integer.valueOf(efa_0.d.a()), List.of(Integer.valueOf(faI.t.U), Integer.valueOf(faI.w.U), Integer.valueOf(faI.x.U)), Integer.valueOf(efa_0.e.a()), List.of(Integer.valueOf(faI.t.U), Integer.valueOf(faI.A.U), Integer.valueOf(faI.B.U)));
        S = Stream.concat(Q.values().stream(), R.values().stream()).flatMap(Collection::stream).collect(Collectors.toUnmodifiableSet());
    }
}

