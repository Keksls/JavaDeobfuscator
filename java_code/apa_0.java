/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from aPa
 */
class apa_0
implements TObjectProcedure<abz_0> {
    final /* synthetic */ ArrayList a;

    apa_0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public boolean a(abz_0 abz_02) {
        this.a.add(abz_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((abz_0)object);
    }
}

