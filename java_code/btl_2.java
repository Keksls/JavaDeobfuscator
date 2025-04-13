/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bTL
 */
class btl_2
implements TObjectProcedure<btm_2> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ btj_2 b;

    btl_2(btj_2 btj_22, ArrayList arrayList) {
        this.b = btj_22;
        this.a = arrayList;
    }

    public boolean a(btm_2 btm_22) {
        this.a.add(btm_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((btm_2)object);
    }
}

