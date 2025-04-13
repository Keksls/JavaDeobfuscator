/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;

class bja
implements TObjectProcedure<bjd> {
    final /* synthetic */ TIntHashSet a;

    bja(TIntHashSet tIntHashSet) {
        this.a = tIntHashSet;
    }

    public boolean a(bjd bjd2) {
        int n = bjd2.a.d();
        for (int k = 0; k < n; ++k) {
            for (bjc_0 bjc_02 : bjd2.a.h(k)) {
                this.a.add(bjc_02.b);
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((bjd)object);
    }
}

