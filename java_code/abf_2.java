/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.TLinkable
 *  gnu.trove.list.linked.TLinkedList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.list.TLinkable;
import gnu.trove.list.linked.TLinkedList;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from aBF
 */
public class abf_2<V> {
    private final TLinkedList<abg_2<V>> a = new TLinkedList();
    private final TIntObjectHashMap<abg_2<V>> b = new TIntObjectHashMap();
    private int c;
    private int d;
    private int e;
    private int f;

    public abf_2(int n) {
        this.c = n;
        this.d = 0;
    }

    public void a(int n, V v) {
        abg_2 abg_22 = (abg_2)this.b.get(n);
        if (abg_22 == null) {
            abg_22 = new abg_2(n, v);
            this.a.addFirst(abg_22);
            this.b.put(n, abg_22);
            ++this.d;
            if (this.d > this.c) {
                abg_22 = (abg_2)this.a.removeLast();
                this.b.remove(abg_22.a);
                --this.d;
            }
        } else {
            this.a.remove((Object)abg_22);
            this.a.addFirst(abg_22);
            abg_22.b = v;
        }
    }

    public void a(int n) {
        abg_2 abg_22 = (abg_2)this.b.get(n);
        if (abg_22 != null) {
            this.b.remove(n);
            this.a.remove((Object)abg_22);
            --this.d;
        }
    }

    public V b(int n) {
        abg_2 abg_22 = (abg_2)this.b.get(n);
        if (abg_22 != null) {
            this.a.remove((Object)abg_22);
            this.a.addFirst((TLinkable)abg_22);
            ++this.e;
            return abg_22.b;
        }
        ++this.f;
        return null;
    }

    public int a() {
        return this.d;
    }

    public void b() {
        this.d = 0;
        this.b.clear();
        this.a.clear();
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public void c(int n) {
        this.c = n;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.a.size() * 100 / this.c;
    }
}

