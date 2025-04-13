/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;

/*
 * Renamed from bTE
 */
public class bte_2 {
    public static final bte_2 a = new bte_2();
    private final TIntIntHashMap b = new TIntIntHashMap();
    private final TIntIntHashMap c = new TIntIntHashMap();

    public void a(int n, int n2) {
        this.b.put(n, n2);
    }

    public void b(int n, int n2) {
        this.c.put(n, n2);
    }

    public int a(int n) {
        return this.b.get(n);
    }

    public int b(int n) {
        return this.c.get(n);
    }
}

