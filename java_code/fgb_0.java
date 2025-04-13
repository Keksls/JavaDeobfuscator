/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;
import gnu.trove.map.hash.TIntShortHashMap;

/*
 * Renamed from fgB
 */
public class fgb_0 {
    private final TIntIntHashMap a = new TIntIntHashMap();
    private final TIntIntHashMap b = new TIntIntHashMap();
    private final TIntIntHashMap c = new TIntIntHashMap();
    private final TIntShortHashMap d = new TIntShortHashMap();
    private final TIntIntHashMap e = new TIntIntHashMap();
    private final TIntIntHashMap f = new TIntIntHashMap();
    private final TIntIntHashMap g = new TIntIntHashMap();
    private final TIntShortHashMap h = new TIntShortHashMap();

    public void a(int n, int n2, int n3, int n4, short s2) {
        this.a.put(n, n2);
        this.b.put(n, n3);
        this.c.put(n, n4);
        this.d.put(n, s2);
    }

    public void b(int n, int n2, int n3, int n4, short s2) {
        this.e.put(n, n2);
        this.f.put(n, n3);
        this.g.put(n, n4);
        this.h.put(n, s2);
    }

    public int a(int n) {
        return this.a.get(n);
    }

    public int b(int n) {
        return this.b.get(n);
    }

    public int c(int n) {
        return this.c.get(n);
    }

    public short d(int n) {
        return this.d.get(n);
    }

    public int e(int n) {
        return this.e.get(n);
    }

    public int f(int n) {
        return this.f.get(n);
    }

    public int g(int n) {
        return this.g.get(n);
    }

    public short h(int n) {
        return this.h.get(n);
    }

    public int[] a() {
        return this.a.keys();
    }

    public int[] b() {
        return this.e.keys();
    }
}

