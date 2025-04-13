/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongIntHashMap
 */
import gnu.trove.map.hash.TLongIntHashMap;

/*
 * Renamed from faj
 */
public class faj_0 {
    public static final faj_0 a = new faj_0();
    private final TLongIntHashMap b = new TLongIntHashMap();

    private faj_0() {
    }

    public void a(int n, int n2, int n3) {
        this.b.put(faj_0.b(n2, n3), n);
    }

    public int a(int n, int n2) {
        return this.b.get(faj_0.b(n, n2));
    }

    private static long b(int n, int n2) {
        return Hw.c(n, n2);
    }
}

