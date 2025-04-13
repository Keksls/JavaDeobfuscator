/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from eOb
 */
public final class eob_2 {
    public static List<eoc_2> a(apl_1 apl_12, epq_2 epq_22) {
        if (apl_12 == null) {
            return Collections.emptyList();
        }
        eod_2 eod_22 = new eod_2();
        Collection collection = epq_22.ck().p(epq_22);
        eoc_2 eoc_22 = eod_22.a(epq_22, collection, epq_22.P_());
        ArrayList<eoc_2> arrayList = new ArrayList<eoc_2>();
        arrayList.add(eoc_22);
        eob_2.a(collection, eoc_22);
        int n = apl_12.a();
        aff_1 aff_12 = new aff_1();
        for (int k = 0; k < n - 1; ++k) {
            aff_12.b(apl_12.a(k));
            eoc_2 eoc_23 = eod_22.a(epq_22, collection, aff_12);
            arrayList.add(eoc_23);
            eob_2.a(collection, eoc_23);
        }
        return arrayList;
    }

    private static void a(Collection<? extends epq_2> collection, eoc_2 eoc_22) {
        for (epq_2 epq_22 : eoc_22.c()) {
            if (epq_22.X() <= 0) continue;
            collection.remove(epq_22);
        }
    }
}

