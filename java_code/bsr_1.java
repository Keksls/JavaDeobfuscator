/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from bsr
 */
class bsr_1
implements TObjectProcedure<bhm_0> {
    final /* synthetic */ boolean a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ bsq_1 c;

    bsr_1(bsq_1 bsq_12, boolean bl, ArrayList arrayList) {
        this.c = bsq_12;
        this.a = bl;
        this.b = arrayList;
    }

    public boolean a(bhm_0 bhm_02) {
        Iterator iterator = bhm_02.a(this.a);
        while (iterator.hasNext()) {
            this.b.add((bHN)iterator.next());
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bhm_0)object);
    }
}

