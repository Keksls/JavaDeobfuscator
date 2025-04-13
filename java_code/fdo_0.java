/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.map.hash.TLongObjectHashMap
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.map.hash.TLongObjectHashMap;
import gnu.trove.set.hash.TLongHashSet;

/*
 * Renamed from fdo
 */
public class fdo_0
implements fbf_0 {
    public static final fdo_0 a = new fdo_0();
    private final TLongObjectHashMap<fde> b = new TLongObjectHashMap();
    private final TLongHashSet c = new TLongHashSet();
    private final TIntObjectHashMap<TLongHashSet> d = new TIntObjectHashMap();

    private fdo_0() {
    }

    public void a(fde fde2) {
        this.b.put(fde2.a(), (Object)fde2);
        this.c.add(fde2.a());
    }

    public void a(int n, fde fde2) {
        this.b.put(fde2.a(), (Object)fde2);
        TLongHashSet tLongHashSet = (TLongHashSet)this.d.get(n);
        if (tLongHashSet == null) {
            tLongHashSet = new TLongHashSet();
            this.d.put(n, (Object)tLongHashSet);
        }
        tLongHashSet.add(fde2.a());
    }

    @Override
    public void a(faX faX2) {
        fdk_0 fdk_02 = faX2.m();
        TLongIterator tLongIterator = this.c.iterator();
        while (tLongIterator.hasNext()) {
            fdk_02.a((fde)this.b.get(tLongIterator.next()));
        }
        tLongIterator = (TLongHashSet)this.d.get(faX2.c());
        if (tLongIterator == null) {
            return;
        }
        TLongIterator tLongIterator2 = tLongIterator.iterator();
        while (tLongIterator2.hasNext()) {
            fdk_02.a((fde)this.b.get(tLongIterator2.next()));
        }
    }
}

