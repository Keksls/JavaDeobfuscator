/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.custom_hash.TObjectIntCustomHashMap
 *  gnu.trove.map.hash.TObjectIntHashMap
 */
import gnu.trove.map.custom_hash.TObjectIntCustomHashMap;
import gnu.trove.map.hash.TObjectIntHashMap;
import java.util.ArrayList;

/*
 * Renamed from CN
 */
class cn_0 {
    final TObjectIntCustomHashMap<float[]> a = new TObjectIntCustomHashMap(cj_0.b, 10000);
    final TObjectIntCustomHashMap<float[]> b = new TObjectIntCustomHashMap(cj_0.b, 10000);
    final TObjectIntCustomHashMap<float[]> c = new TObjectIntCustomHashMap(cj_0.b, 10000);
    final TObjectIntHashMap<Fz> d = new TObjectIntHashMap(1000);
    final ArrayList<float[]> e = new ArrayList(10000);
    final ArrayList<float[]> f = new ArrayList(10000);
    final ArrayList<float[]> g = new ArrayList(10000);
    final ArrayList<Fz> h = new ArrayList(1000);

    cn_0() {
    }

    public final int a(Fz fz) {
        int n = this.d.get((Object)fz);
        if (n == 0) {
            this.h.add(fz);
            n = this.h.size();
            this.d.put((Object)fz, n);
        }
        return n - 1;
    }

    public final int a(float ... fArray) {
        int n = this.a.get((Object)fArray);
        if (n == 0) {
            this.e.add(fArray);
            n = this.e.size();
            this.a.put((Object)fArray, n);
        }
        return n - 1;
    }

    public final int b(float ... fArray) {
        int n = this.b.get((Object)fArray);
        if (n == 0) {
            this.f.add(fArray);
            n = this.f.size();
            this.b.put((Object)fArray, n);
        }
        return n - 1;
    }

    public final int c(float ... fArray) {
        int n = this.c.get((Object)fArray);
        if (n == 0) {
            this.g.add(fArray);
            n = this.g.size();
            this.c.put((Object)fArray, n);
        }
        return n - 1;
    }

    public final void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
    }
}

