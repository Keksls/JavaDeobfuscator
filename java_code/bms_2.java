/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bms
 */
class bms_2
implements TObjectProcedure<epq_2> {
    final /* synthetic */ ArrayList a;

    bms_2(ArrayList arrayList) {
        this.a = arrayList;
    }

    public boolean a(epq_2 epq_22) {
        this.a.add(((blx_1)epq_22).dt());
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((epq_2)object);
    }
}

