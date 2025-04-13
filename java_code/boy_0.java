/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bOY
 */
class boy_0
implements TObjectProcedure<efa_0> {
    final /* synthetic */ ArrayList a;

    boy_0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public boolean a(efa_0 efa_02) {
        this.a.add(box_0.a(efa_02));
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((efa_0)object);
    }
}

