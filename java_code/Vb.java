/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class Vb<C extends UZ<V>, V extends RI>
implements Vc<V> {
    protected static final Logger a = Logger.getLogger(Vb.class);
    protected final TIntObjectHashMap<C> b = new TIntObjectHashMap();
    private final ArrayList<Vc<V>> c = new ArrayList();

    @Override
    public void a(C c2) {
        int n = ((UZ)c2).a();
        if (this.b.contains(n)) {
            a.warn((Object)("Surcharge du compteur pour le type id=" + n + " : \u00e9trange"));
        }
        this.b.put(((UZ)c2).a(), c2);
    }

    @Override
    public void a(V v) {
        int n = v.a();
        if (this.b.contains(n)) {
            ((UZ)this.b.get(n)).a(v);
            int n2 = this.c.size();
            for (int k = 0; k < n2; ++k) {
                this.c.get(k).a(v);
            }
        }
    }

    @Override
    public void b(V v) {
        int n = v.a();
        if (this.b.contains(n)) {
            ((UZ)this.b.get(n)).b(v);
            int n2 = this.c.size();
            for (int k = 0; k < n2; ++k) {
                this.c.get(k).b(v);
            }
        }
    }

    public C a(int n) {
        return (C)((UZ)this.b.get(n));
    }

    @Override
    public void a(Vc<V> vc) {
        this.c.add(vc);
    }

    public TIntObjectHashMap<C> a() {
        return this.b;
    }

    public void b() {
        this.b.clear();
    }

    public String toString() {
        return "CountManager{m_counters=" + this.b.size() + "}";
    }
}

