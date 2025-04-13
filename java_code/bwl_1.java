/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from bwl
 */
public final class bwl_1 {
    public static final bwl_1 a = new bwl_1();
    private final TLongObjectHashMap<aff_1> b = new TLongObjectHashMap();
    private final TLongObjectHashMap<baR> c = new TLongObjectHashMap();

    private bwl_1() {
    }

    public void a(long l) {
        this.b.remove(l);
        this.c.remove(l);
    }

    public void a(long l, baR baR2) {
        this.c.put(l, (Object)baR2);
    }

    public boolean b(long l, baR baR2) {
        return this.c.get(l) == baR2;
    }

    public void a(TLongObjectHashMap<aff_1> tLongObjectHashMap) {
        TLongObjectIterator tLongObjectIterator = tLongObjectHashMap.iterator();
        while (tLongObjectIterator.hasNext()) {
            tLongObjectIterator.advance();
            this.b.put(tLongObjectIterator.key(), (Object)((aff_1)tLongObjectIterator.value()));
        }
    }

    public aff_1 b(long l) {
        return (aff_1)this.b.get(l);
    }
}

