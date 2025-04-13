/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from fhW
 */
public enum fhw_0 {
    a((exk_22, exk_23) -> {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        return comparator.compare(exk_22.aT_(), exk_23.aT_());
    }),
    b((exk_22, exk_23) -> {
        if (!exk_22.y()) {
            return -1;
        }
        if (!exk_23.y()) {
            return 1;
        }
        return exk_22.A() - exk_23.A();
    }),
    c((exk_22, exk_23) -> fhw_0.b.e.reversed().compare((exk_2)exk_22, (exk_2)exk_23)),
    d(fhw_0.a.e::compare);

    private final Comparator<exk_2> e;

    private fhw_0(Comparator<exk_2> comparator) {
        this.e = comparator;
    }

    public Comparator<exk_2> a() {
        return this.e;
    }
}

