/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from fkq
 */
class fkq_0
implements TObjectProcedure<esy_2> {
    final /* synthetic */ afk_2 a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ fkp_0 c;

    fkq_0(fkp_0 fkp_02, afk_2 afk_22, ArrayList arrayList) {
        this.c = fkp_02;
        this.a = afk_22;
        this.b = arrayList;
    }

    public boolean a(esy_2 esy_22) {
        if (this.a.b(esy_22.j())) {
            this.b.add(esy_22);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

