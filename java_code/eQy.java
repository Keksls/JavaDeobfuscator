/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class eQy
implements TObjectProcedure<erl_1> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ erg_1 b;

    eQy(ArrayList arrayList, erg_1 erg_12) {
        this.a = arrayList;
        this.b = erg_12;
    }

    public boolean a(erl_1 erl_12) {
        if (this.a.size() <= 200 + this.b.x() || erl_12.d() == this.b.b()) {
            this.a.add(eQw.b(erl_12));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((erl_1)object);
    }
}

