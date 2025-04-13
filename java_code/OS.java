/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.map.hash.TLongObjectHashMap;

public abstract class OS {
    private final TLongObjectHashMap<OT> a = new TLongObjectHashMap();

    public void a(OT oT) {
        this.a.put(oT.a(), (Object)oT);
    }

    public OT a(long l) {
        return (OT)this.a.get(l);
    }

    public void a() {
        int n = this.a.size();
        for (int k = 0; k < n; ++k) {
            OT oT = (OT)this.a.get((long)k);
            oT.f();
        }
    }

    public TLongObjectIterator<OT> b() {
        return this.a.iterator();
    }
}

