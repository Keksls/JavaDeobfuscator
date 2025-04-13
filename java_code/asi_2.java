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
 * Renamed from asI
 */
class asi_2
extends ash_2<TLongObjectHashMap<int[]>> {
    asi_2(asc_2 asc_22) {
        super(asc_22);
    }

    protected TLongObjectHashMap<int[]> b(int n) {
        return new TLongObjectHashMap(n, 1.0f);
    }

    @Override
    protected void a(long l, asc_2 asc_22) {
        ((TLongObjectHashMap)this.b).put(l, (Object)asc_22.k());
    }

    @Override
    public int a(long l) {
        int[] nArray = (int[])((TLongObjectHashMap)this.b).get(l);
        return nArray == null ? 0 : nArray.length;
    }

    @Override
    public int a(long l, int n) {
        return ((int[])((TLongObjectHashMap)this.b).get(l))[n];
    }

    @Override
    protected /* synthetic */ TLongHash a(int n) {
        return this.b(n);
    }
}

