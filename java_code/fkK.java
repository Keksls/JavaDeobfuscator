/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

class fkK
implements TObjectProcedure<esy_2> {
    final /* synthetic */ fkc_0 a;
    final /* synthetic */ ArrayList b;

    fkK(fkc_0 fkc_02, ArrayList arrayList) {
        this.a = fkc_02;
        this.b = arrayList;
    }

    public boolean a(esy_2 esy_22) {
        fkz fkz2 = new fkz(this.a);
        fkz2.a(esy_22);
        for (fkN fkN2 : fkz2.a()) {
            if (this.b.contains(fkN2)) continue;
            this.b.add(fkN2);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

