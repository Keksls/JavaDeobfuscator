/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.procedure.TLongProcedure
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.procedure.TLongProcedure;
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from aoW
 */
public class aow_1 {
    private final long a;
    private final TLongHashSet b = new TLongHashSet();

    public aow_1(long l) {
        this.a = l;
    }

    public void a(long l) {
        this.b.add(l);
    }

    public long a() {
        return this.a;
    }

    public int b() {
        return this.b.size();
    }

    public boolean b(long l) {
        return this.b.contains(l);
    }

    public long[] c() {
        return this.b.toArray();
    }

    public boolean a(TLongProcedure tLongProcedure) {
        return this.b.forEach(tLongProcedure);
    }

    public void b(TLongProcedure tLongProcedure) {
        TLongIterator tLongIterator = this.b.iterator();
        while (tLongIterator.hasNext()) {
            if (tLongProcedure.execute(tLongIterator.next())) continue;
            tLongIterator.remove();
        }
    }
}

