/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.set.hash.TIntHashSet;

/*
 * Renamed from eyU
 */
public class eyu_2 {
    public static final eyu_2 a = new eyu_2(-1, -1, -1, new int[0]);
    private final int b;
    private final int c;
    private final int d;
    private final TIntHashSet e = new TIntHashSet();

    public eyu_2(int n, int n2, int n3, int ... nArray) {
        this.b = n;
        this.c = n2;
        this.d = n3;
        this.e.addAll(nArray);
        this.e.removeAll(enZ.a);
    }

    public int a() {
        return this.d;
    }

    public TIntHashSet b() {
        return this.e;
    }

    public int c() {
        return this.b;
    }

    public boolean a(int n) {
        return this.e.contains(n);
    }

    public int d() {
        return this.c;
    }

    public boolean e() {
        return this.b == eyu_2.a.b;
    }
}

