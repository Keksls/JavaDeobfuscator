/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

public enum DR {
    a(fk_1.a, new DS()),
    b(fk_1.b, new DU()),
    c(fk_1.c, new DV()),
    d(fk_1.d, new DW()),
    e(fk_1.e, new DX()),
    f(fk_1.f, new DY()),
    g(fk_1.g, new dz_0()),
    h(fk_1.h, new ea_0()),
    i(fk_1.i, new eb_0()),
    j(fk_1.j, new DT());

    private final fk_1 k;
    private final DQ<? extends DP> l;

    private DR(fk_1 fk_12, DQ<? extends DP> dQ) {
        this.k = fk_12;
        this.l = dQ;
    }

    public fk_1 a() {
        return this.k;
    }

    public DQ<? extends DP> b() {
        return this.l;
    }

    public static Optional<DR> a(fk_1 fk_12) {
        DR[] dRArray;
        for (DR dR : dRArray = DR.values()) {
            if (dR.k != fk_12) continue;
            return Optional.of(dR);
        }
        return Optional.empty();
    }
}

