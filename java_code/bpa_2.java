/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from bpa
 */
public class bpa_2 {
    private static final bpa_2 a = new bpa_2();
    private final TIntObjectHashMap<boz_2> b = new TIntObjectHashMap();
    private final TIntObjectHashMap<TIntHashSet> c = new TIntObjectHashMap();

    private bpa_2() {
        this.b.put(111111, (Object)new boz_2(111111, -1, 111111, false));
        this.b.put(111112, (Object)new boz_2(111112, -1, 111112, false));
    }

    public static bpa_2 a() {
        return a;
    }

    public boz_2 a(int n) {
        return (boz_2)this.b.get(n);
    }

    public void a(int n, boz_2 boz_22) {
        if (!this.c.contains(n)) {
            this.c.put(n, (Object)new TIntHashSet());
        }
        this.b.put(boz_22.d(), (Object)boz_22);
        ((TIntHashSet)this.c.get(n)).add(boz_22.a());
    }

    public boolean a(int n, int n2) {
        if (!this.c.contains(n)) {
            return false;
        }
        return ((TIntHashSet)this.c.get(n)).contains(n2);
    }
}

