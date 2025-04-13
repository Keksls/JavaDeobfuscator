/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;

/*
 * Renamed from fbd
 */
class fbd_0
implements TIntObjectIterator<faX> {
    private final TIntObjectHashMap<faX> a;
    private final TIntObjectIterator<faX> b;
    private final TIntObjectMap<faX> c;

    fbd_0(TIntObjectMap<faX> tIntObjectMap, Collection<Integer> collection) {
        this.a = new TIntObjectHashMap(tIntObjectMap);
        this.a.retainEntries((TIntObjectProcedure)new fbe_0(this, collection));
        this.b = this.a.iterator();
        this.c = tIntObjectMap;
    }

    public void advance() {
        this.b.advance();
    }

    public boolean hasNext() {
        return this.b.hasNext();
    }

    public void remove() {
        this.c.remove(this.b.key());
        this.b.remove();
    }

    public int key() {
        return this.b.key();
    }

    public faX a() {
        return (faX)this.b.value();
    }

    public faX a(faX faX2) {
        return (faX)this.c.put(this.b.key(), (Object)faX2);
    }

    public /* synthetic */ Object setValue(Object object) {
        return this.a((faX)object);
    }

    public /* synthetic */ Object value() {
        return this.a();
    }
}

