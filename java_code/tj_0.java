/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TByteHashSet
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TByteHashSet;

/*
 * Renamed from Tj
 */
public final class tj_0 {
    private final TIntObjectHashMap<TByteHashSet> a = new TIntObjectHashMap();
    private final TByteIntHashMap b = new TByteIntHashMap();

    void a(byte by, int n) {
        this.b(by, n);
        this.b.put(by, n);
    }

    void b(byte by, int n) {
        TByteHashSet tByteHashSet = (TByteHashSet)this.a.get(n);
        if (tByteHashSet == null) {
            tByteHashSet = new TByteHashSet();
            this.a.put(n, (Object)tByteHashSet);
        }
        tByteHashSet.add(by);
    }

    void a(byte by) {
        TByteHashSet tByteHashSet = (TByteHashSet)this.a.get(this.b.get(by));
        this.b.remove(by);
        if (tByteHashSet == null) {
            return;
        }
        tByteHashSet.remove(by);
    }

    void b(byte by) {
        this.b.remove(by);
        TIntObjectIterator tIntObjectIterator = this.a.iterator();
        while (tIntObjectIterator.hasNext()) {
            tIntObjectIterator.advance();
            TByteHashSet tByteHashSet = (TByteHashSet)tIntObjectIterator.value();
            tByteHashSet.remove(by);
        }
    }

    TByteHashSet a(int n) {
        return (TByteHashSet)this.a.get(n);
    }

    public int c(byte by) {
        return this.b.get(by);
    }

    public boolean d(byte by) {
        return this.b.contains(by);
    }

    public byte[] a() {
        return this.b.keys();
    }
}

