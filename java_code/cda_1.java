/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from cda
 */
class cda_1
implements TObjectProcedure<esy_2> {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ccy_2 c;

    cda_1(ccy_2 ccy_22, ArrayList arrayList, ArrayList arrayList2) {
        this.c = ccy_22;
        this.a = arrayList;
        this.b = arrayList2;
    }

    public boolean a(esy_2 esy_22) {
        if (esy_22.g().i()) {
            this.a.add(esy_22);
        } else {
            this.b.add(esy_22);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((esy_2)object);
    }
}

