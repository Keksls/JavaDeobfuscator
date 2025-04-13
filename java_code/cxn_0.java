/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cXN
 */
class cxn_0
implements TObjectProcedure<pj_0> {
    final /* synthetic */ cxm_0 a;

    cxn_0(cxm_0 cxm_02) {
        this.a = cxm_02;
    }

    public boolean a(pj_0 pj_02) {
        aff_1 aff_12 = pj_02.P_();
        this.a.g.put(cxm_0.a(aff_12.d(), aff_12.e()), (Object)bst_1.c);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((pj_0)object);
    }
}

