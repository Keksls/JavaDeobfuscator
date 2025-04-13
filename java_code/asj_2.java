/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.impl.hash.TLongHash
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.impl.hash.TLongHash;
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from asJ
 */
class asj_2
extends ash_2<TLongObjectHashMap<Integer>> {
    asj_2(asc_2 asc_22) {
        super(asc_22);
    }

    protected TLongObjectHashMap<Integer> b(int n) {
        return new TLongObjectHashMap(n, 1.0f);
    }

    @Override
    protected void a(long l, asc_2 asc_22) {
        ((TLongObjectHashMap)this.b).put(l, (Object)asc_22.f());
    }

    @Override
    public int a(long l) {
        return ((TLongObjectHashMap)this.b).contains(l) ? 1 : 0;
    }

    @Override
    public int a(long l, int n) {
        return (Integer)((TLongObjectHashMap)this.b).get(l);
    }

    @Override
    protected /* synthetic */ TLongHash a(int n) {
        return this.b(n);
    }
}

