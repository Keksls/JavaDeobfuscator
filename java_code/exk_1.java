/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eXk
 */
class exk_1
implements TObjectProcedure<exg_2> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ exh_1 b;

    exk_1(exh_1 exh_12, ArrayList arrayList) {
        this.b = exh_12;
        this.a = arrayList;
    }

    public boolean a(exg_2 exg_22) {
        this.a.add(exg_22);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((exg_2)object);
    }
}

