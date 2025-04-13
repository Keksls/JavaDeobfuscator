/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from byV
 */
public final class byv_1 {
    public static void a(eQb eQb2) {
        byv_1.c(eQb2);
        byv_1.d(eQb2);
    }

    public static void b(eQb eQb2) {
        TLongObjectHashMap<epl_0> tLongObjectHashMap = eQb2.e();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            epl_0 epl_02 = (epl_0)tLongObjectIterator.value();
            blx_1 blx_12 = bzf_1.a(epl_02.f());
            if (blx_12 == null) continue;
            blx_12.z();
        }
    }

    private static void c(eQb eQb2) {
        bmr_1 bmr_12 = azu_0.j().k();
        TLongObjectHashMap<epl_0> tLongObjectHashMap = eQb2.e();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            epl_0 epl_02 = (epl_0)tLongObjectIterator.value();
            if (epl_02.f() == bmr_12.a_()) continue;
            ble_1.E().b(0, epl_02.f());
            if (bmr_12.T_() == epl_02.h()) continue;
            blq_0.c().b(0, epl_02.f());
        }
    }

    private static void d(eQb eQb2) {
        bmr_1 bmr_12 = azu_0.j().k();
        TLongObjectHashMap<epl_0> tLongObjectHashMap = eQb2.e();
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            aff_1 aff_12;
            tLongObjectIterator.advance();
            epl_0 epl_02 = (epl_0)tLongObjectIterator.value();
            if (epl_02.v() || epl_02.w() || (aff_12 = epl_02.g()) == null || epl_02.f() == bmr_12.a_()) continue;
            blq_0.c().a(0, epl_02.f(), aff_12.d(), aff_12.e(), aff_12.f());
            blf_1.a(epl_02.f(), 0, aff_12.d(), aff_12.e(), aff_12.f(), epl_02.h(), epl_02, bLs.o, epl_02.a(), anr_0.G, ble_1.E());
        }
    }
}

