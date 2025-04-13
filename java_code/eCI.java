/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

public class eCI {
    public static final eCI a = new eCI();
    private final TLongObjectHashMap<TLongObjectHashMap<eCH>> b = new TLongObjectHashMap();
    private final TLongObjectHashMap<TLongObjectHashMap<eCH>> c = new TLongObjectHashMap();

    public void a(eCH eCH2) {
        long l = eCH2.a();
        long l2 = eCH2.b();
        if (!this.b.containsKey(l)) {
            this.b.put(l, (Object)new TLongObjectHashMap());
        }
        if (!this.c.containsKey(l2)) {
            this.c.put(l2, (Object)new TLongObjectHashMap());
        }
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(l);
        tLongObjectHashMap.put(l2, (Object)eCH2);
        TLongObjectHashMap tLongObjectHashMap2 = (TLongObjectHashMap)this.c.get(l2);
        tLongObjectHashMap2.put(l, (Object)eCH2);
    }

    public TLongObjectIterator<eCH> a(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return tLongObjectHashMap.iterator();
    }

    public TLongObjectIterator<eCH> b(long l) {
        return ((TLongObjectHashMap)this.c.get(l)).iterator();
    }

    public eCH a(long l, long l2) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(l);
        if (tLongObjectHashMap == null) {
            return null;
        }
        return (eCH)tLongObjectHashMap.get(l2);
    }

    public int c(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.b.get(l);
        if (tLongObjectHashMap == null) {
            return -1;
        }
        return tLongObjectHashMap.size();
    }

    public int d(long l) {
        TLongObjectHashMap tLongObjectHashMap = (TLongObjectHashMap)this.c.get(l);
        if (tLongObjectHashMap == null) {
            return -1;
        }
        return tLongObjectHashMap.size();
    }
}

