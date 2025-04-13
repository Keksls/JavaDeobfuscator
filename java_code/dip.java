/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;

final class dip {
    private static final dip a = new dip();
    private final TIntObjectHashMap<dio> b = new TIntObjectHashMap();
    private final TIntObjectHashMap<dio> c = new TIntObjectHashMap();
    private final TIntObjectHashMap<ckt_2> d = new TIntObjectHashMap();
    private final WeakHashMap<Integer, fvy> e = new WeakHashMap();

    private dip() {
    }

    public static dip a() {
        return a;
    }

    public dio a(int n) {
        return (dio)this.c.get(n);
    }

    public void a(int n, dio dio2) {
        this.c.put(n, (Object)dio2);
    }

    public void b(int n) {
        this.c.remove(n);
    }

    public void b(int n, dio dio2) {
        this.b.put(n, (Object)dio2);
    }

    public void c(int n) {
        this.b.remove(n);
    }

    public dio d(int n) {
        return (dio)this.b.get(n);
    }

    public void a(int n, ckt_2 ckt_22) {
        this.d.put(n, (Object)ckt_22);
    }

    public ckt_2 e(int n) {
        return (ckt_2)this.d.get(n);
    }

    public ckt_2 f(int n) {
        return (ckt_2)this.d.remove(n);
    }

    public void b() {
        this.d.clear();
        this.b.clear();
        this.c.clear();
    }

    public void a(fvy fvy2) {
        this.e.put(fvy2.getAdviserId(), fvy2);
    }

    public fvy g(int n) {
        return this.e.get(n);
    }

    public void h(int n) {
        this.e.remove(n);
    }

    public Collection<fvy> a(aby_0 aby_02) {
        ArrayList<fvy> arrayList = new ArrayList<fvy>();
        for (fvy fvy2 : this.e.values()) {
            if (fvy2.getTarget() != aby_02) continue;
            arrayList.add(fvy2);
        }
        return arrayList;
    }
}

