/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.set.hash.TIntHashSet
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.set.hash.TIntHashSet;

public class ffc {
    public static final ffc a = new ffc();
    private final TIntObjectHashMap<ffb> b = new TIntObjectHashMap();
    private final TIntHashSet c = new TIntHashSet();

    public void a(ffb ffb2) {
        int n = ffb2.a();
        this.b.put(n, (Object)ffb2);
        if (ffb2.d()) {
            this.c.add(n);
        }
    }

    public ffb a(int n) {
        return (ffb)this.b.get(n);
    }

    public boolean b(int n) {
        ffb ffb2 = this.a(n);
        return ffb2 == null || ffb2.b();
    }

    public boolean c(int n) {
        ffb ffb2 = this.a(n);
        return ffb2 == null || ffb2.c();
    }

    public boolean d(int n) {
        return this.b.contains(n);
    }

    public TIntHashSet a() {
        return this.c;
    }
}

