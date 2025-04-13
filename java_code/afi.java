/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;

class afi
implements TIntProcedure {
    final /* synthetic */ afl a;
    final /* synthetic */ afg b;

    afi(afg afg2, afl afl2) {
        this.b = afg2;
        this.a = afl2;
    }

    public boolean execute(int n) {
        TIntHashSet tIntHashSet = this.b.g.a(n);
        if (tIntHashSet != null) {
            for (int n2 : tIntHashSet) {
                this.a.a(aep_0.b(n2), aep_0.c(n2));
            }
        }
        return true;
    }
}

