/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TIntProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.hash.TIntHashSet;

class afj
implements TIntProcedure {
    final /* synthetic */ afk a;
    final /* synthetic */ afg b;

    afj(afg afg2, afk afk2) {
        this.b = afg2;
        this.a = afk2;
    }

    public boolean execute(int n) {
        TIntHashSet tIntHashSet = this.b.g.a(n);
        if (tIntHashSet != null) {
            TIntIterator tIntIterator = tIntHashSet.iterator();
            while (tIntIterator.hasNext()) {
                this.a.a(tIntIterator.next());
            }
        }
        return true;
    }
}

