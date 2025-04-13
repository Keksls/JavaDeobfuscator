/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from eOd
 */
public final class eod_2 {
    private final eny_1 a = new eny_1();

    public eoc_2 a(epq_2 epq_22, Collection<? extends epq_2> collection, aff_1 aff_12) {
        if (epq_22 == null) {
            return eoc_2.a;
        }
        if (epq_22.hh() || epq_22.p() || epq_22.t() || epq_22.a(eoz_1.ap)) {
            return eoc_2.a;
        }
        if (collection.isEmpty()) {
            return eoc_2.a;
        }
        this.a.a(epq_22);
        return this.a.a(collection, aff_12);
    }
}

