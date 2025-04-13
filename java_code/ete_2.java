/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eTE
 */
class ete_2
implements TObjectProcedure<efh_0> {
    final /* synthetic */ ArrayList a;

    ete_2(ArrayList arrayList) {
        this.a = arrayList;
    }

    public boolean a(efh_0 efh_02) {
        if (!efh_02.a(eff_0.j)) {
            this.a.add(efh_02);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((efh_0)object);
    }
}

