/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.function.Supplier;

/*
 * Renamed from FK
 */
public enum fk_1 {
    a(1, fd_1::new),
    b(2, fg_1::new),
    c(3, fi_1::new),
    d(4, ff_1::new),
    e(5, fh_1::new),
    f(6, fb_1::new),
    g(7, fc_1::new),
    h(8, fe_1::new),
    i(9, fa_1::new),
    j(10, fj_1::new);

    private final byte k;
    private final Supplier<? extends Fz> l;

    private fk_1(byte by, Supplier<? extends Fz> supplier) {
        this.k = by;
        this.l = supplier;
    }

    public byte a() {
        return this.k;
    }

    public Supplier<? extends Fz> b() {
        return this.l;
    }

    public static Optional<fk_1> a(byte by) {
        fk_1[] fk_1Array;
        for (fk_1 fk_12 : fk_1Array = fk_1.values()) {
            if (fk_12.k != by) continue;
            return Optional.of(fk_12);
        }
        return Optional.empty();
    }
}

