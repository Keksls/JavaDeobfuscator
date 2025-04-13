/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntIterator
 *  gnu.trove.procedure.TIntObjectProcedure
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.iterator.TIntIterator;
import gnu.trove.procedure.TIntObjectProcedure;
import gnu.trove.set.hash.TIntHashSet;
import java.io.IOException;

/*
 * Renamed from aeQ
 */
class aeq_0
implements TIntObjectProcedure<TIntHashSet> {
    final /* synthetic */ gk_0 a;
    final /* synthetic */ aep_0 b;

    aeq_0(aep_0 aep_02, gk_0 gk_02) {
        this.b = aep_02;
        this.a = gk_02;
    }

    public boolean a(int n, TIntHashSet tIntHashSet) {
        try {
            this.a.a(n);
            this.a.a(tIntHashSet.size());
            TIntIterator tIntIterator = tIntHashSet.iterator();
            while (tIntIterator.hasNext()) {
                this.a.a(tIntIterator.next());
            }
        }
        catch (IOException iOException) {
            aep_0.a.error((Object)"IOException during save", (Throwable)iOException);
            return false;
        }
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (TIntHashSet)object);
    }
}

