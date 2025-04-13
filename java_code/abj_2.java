/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aBJ
 */
public class abj_2<K, V>
implements Iterable {
    protected final LinkedHashMap<K, V> a;
    int b;
    private int c = 0;
    private int d = 1;

    public abj_2(int n) {
        this.b = n;
        this.a = new abk_2(this, n, 0.75f, true);
    }

    public V a(K k) {
        return this.a.get(k);
    }

    public void a(K k, V v) {
        this.a.put(k, v);
    }

    public V b(K k) {
        return this.a.remove(k);
    }

    public void a() {
        this.a.clear();
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
        this.d = 1;
        this.c = 0;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.a.size() * 100 / this.b;
    }

    public int f() {
        return this.a.size();
    }

    @NotNull
    public Iterator iterator() {
        return this.a.values().iterator();
    }

    public boolean b(int n) {
        return this.a.containsKey(n);
    }
}

