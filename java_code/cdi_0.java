/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.util.ArrayList;

/*
 * Renamed from cDI
 */
public class cdi_0 {
    private static final TIntHashSet a = new TIntHashSet();
    private static final TObjectProcedure<bau_2> b = new cdj_0();

    public static void a() {
        int n;
        if (!ccm_1.g().a()) {
            return;
        }
        acv_1 acv_12 = cdi_0.c();
        TIntIterator tIntIterator = a.iterator();
        while (tIntIterator.hasNext()) {
            n = tIntIterator.next();
            if (!acv_12.d(n)) {
                cdw_0.n().a(new cec_1(null, cdh_0.a(n), 0));
            }
            tIntIterator.remove();
        }
        int n2 = acv_12.d();
        for (n = 0; n < n2; ++n) {
            a.add(acv_12.e(n));
            cdw_0.n().a(new cec_1(null, cdh_0.a(acv_12.e(n)), (short)acv_12.h(n)));
        }
    }

    private static acv_1 c() {
        acv_1 acv_12 = new acv_1();
        cdi_0.a(new cdk_0(acv_12));
        return acv_12;
    }

    public static void b() {
        if (!ccm_1.g().a()) {
            return;
        }
        cdi_0.a(b);
    }

    private static void a(TObjectProcedure<bau_2> tObjectProcedure) {
        ArrayList<pj_0> arrayList = ccm_1.g().i();
        int n = arrayList.size();
        for (int k = 0; k < n; ++k) {
            bau_2 bau_22;
            pj_0 pj_02 = arrayList.get(k);
            if (!(pj_02 instanceof bau_2) || !(bau_22 = (bau_2)pj_02).P()) continue;
            tObjectProcedure.execute((Object)bau_22);
        }
    }
}

