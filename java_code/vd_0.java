/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.Comparator;

/*
 * Renamed from VD
 */
public abstract class vd_0 {
    public static final int a = -1;

    protected vd_0() {
    }

    protected abstract void a(vb_0 var1);

    protected abstract void b(vb_0 var1);

    protected abstract void c(vb_0 var1);

    protected abstract void a(vb_0 var1, long var2);

    protected abstract void a(vb_0 var1, long var2, int var4);

    protected abstract void b(vb_0 var1, long var2);

    protected void a(TLongArrayList tLongArrayList, Comparator<Long> comparator) {
        long[] lArray = tLongArrayList.toArray();
        tLongArrayList.clear();
        for (long l : lArray) {
            this.a(tLongArrayList, l, comparator);
        }
    }

    protected void a(TLongArrayList tLongArrayList, long l, Comparator<Long> comparator) {
        this.a(tLongArrayList, l, comparator, 0);
    }

    protected void a(TLongArrayList tLongArrayList, long l, Comparator<Long> comparator, int n) {
        while (n < tLongArrayList.size() && comparator.compare(l, tLongArrayList.get(n)) >= 0) {
            ++n;
        }
        tLongArrayList.insert(n, l);
    }
}

