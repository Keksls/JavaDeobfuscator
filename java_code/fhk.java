/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public enum fhk {
    a(fhi.b, fhl.b, 24369),
    b(fhi.b, fhl.c, 24370),
    c(fhi.b, fhl.d, 24371),
    d(fhi.b, fhl.e, 24372),
    e(fhi.c, fhl.b, 24741),
    f(fhi.c, fhl.c, 24742),
    g(fhi.c, fhl.d, 24743),
    h(fhi.c, fhl.e, 24744),
    i(fhi.d, fhl.b, 24746),
    j(fhi.d, fhl.c, 24747),
    k(fhi.d, fhl.d, 24748),
    l(fhi.d, fhl.e, 24749),
    m(fhi.e, fhl.b, 24750),
    n(fhi.e, fhl.c, 24751),
    o(fhi.e, fhl.d, 24752),
    p(fhi.e, fhl.e, 24753),
    q(fhi.f, fhl.b, 24754),
    r(fhi.f, fhl.c, 24755),
    s(fhi.f, fhl.d, 24756),
    t(fhi.f, fhl.e, 24757),
    u(fhi.g, fhl.b, 27988),
    v(fhi.g, fhl.c, 27989),
    w(fhi.g, fhl.d, 27990),
    x(fhi.g, fhl.e, 27991),
    y(fhi.h, fhl.b, 32327),
    z(fhi.h, fhl.c, 32328),
    A(fhi.h, fhl.d, 32329),
    B(fhi.h, fhl.e, 32330);

    private final fhi C;
    private final fhl D;
    private final int E;

    private fhk(fhi fhi2, fhl fhl2, int n2) {
        this.C = fhi2;
        this.D = fhl2;
        this.E = n2;
    }

    public fhi a() {
        return this.C;
    }

    public fhl b() {
        return this.D;
    }

    public int c() {
        return this.E;
    }

    public static Optional<fhk> a(int n, long l) {
        fhk[] fhkArray;
        for (fhk fhk2 : fhkArray = fhk.values()) {
            fhl fhl2;
            fhi fhi2 = fhk2.C;
            if (n < fhi2.b() || n >= fhi2.c() || l < (fhl2 = fhk2.D).b() || l >= fhl2.c()) continue;
            return Optional.of(fhk2);
        }
        return Optional.empty();
    }
}

