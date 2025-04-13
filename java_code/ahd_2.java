/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 */
import gnu.trove.map.hash.TIntIntHashMap;
import java.util.HashMap;
import java.util.Iterator;

/*
 * Renamed from aHd
 */
public class ahd_2 {
    final HashMap<Integer, Object> a = new HashMap();
    final TIntIntHashMap b = new TIntIntHashMap();
    int c = 0;

    public void a(Object object) {
        this.a.put(this.c, object);
        this.b.put(object.hashCode(), this.c);
        ++this.c;
    }

    public Object a(int n) {
        return this.a.get(n);
    }

    public Object b(Object object) {
        int n = this.b.get(object.hashCode());
        return this.a.get(n);
    }

    public void a(int n, Object object) {
        Object object2 = this.a.get(n);
        int n2 = object2.hashCode();
        this.b.remove(n2);
        this.a.put(n, object);
        n2 = object.hashCode();
        this.b.put(n2, n);
    }

    public void a() {
        this.a.clear();
    }

    public Iterator<Object> b() {
        return this.a.values().iterator();
    }

    public int c() {
        return this.a.size();
    }
}

