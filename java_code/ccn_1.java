/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from ccn
 */
class ccn_1
implements TObjectProcedure<pj_0> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ccm_1 b;

    ccn_1(ccm_1 ccm_12, ArrayList arrayList) {
        this.b = ccm_12;
        this.a = arrayList;
    }

    public boolean a(pj_0 pj_02) {
        this.a.add(pj_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((pj_0)object);
    }
}

