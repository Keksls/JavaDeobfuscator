/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;
import java.util.ArrayList;

/*
 * Renamed from aAH
 */
class aah_1
implements TIntProcedure {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ aad_1 b;

    aah_1(aad_1 aad_12, ArrayList arrayList) {
        this.b = aad_12;
        this.a = arrayList;
    }

    public boolean execute(int n) {
        this.a.remove(this.b.i.get(n));
        return true;
    }
}

