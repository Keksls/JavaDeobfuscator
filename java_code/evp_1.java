/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eVp
 */
public class evp_1
extends evk_1 {
    private final TIntObjectHashMap<evq_1> a = new TIntObjectHashMap();
    private final TIntArrayList b = new TIntArrayList();

    public evp_1(int n, int n2, ezy_1 ezy_12, int n3) {
        super(n, n2, ezy_12, n3);
    }

    public void a(evq_1 evq_12) {
        this.a.put(evq_12.a(), (Object)evq_12);
        this.b.add(evq_12.a());
    }

    public TIntObjectIterator<evq_1> a() {
        return this.a.iterator();
    }

    public int d() {
        return this.a.size();
    }

    public evq_1 a(int n) {
        return (evq_1)this.a.get(n);
    }

    public evq_1 b(int n) {
        return (evq_1)this.a.get(this.b.get(n));
    }

    public int e() {
        return this.a.size();
    }
}

