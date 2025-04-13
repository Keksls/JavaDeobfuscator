/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eTD
 */
class etd_2
implements TObjectProcedure<etw_2> {
    final /* synthetic */ etk_2 a;
    final /* synthetic */ ArrayList b;

    etd_2(etk_2 etk_22, ArrayList arrayList) {
        this.a = etk_22;
        this.b = arrayList;
    }

    public boolean a(etw_2 etw_22) {
        if (etw_22.d() == this.a.i()) {
            this.b.add(etw_22);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((etw_2)object);
    }
}

