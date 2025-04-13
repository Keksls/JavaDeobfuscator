/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TIntObjectProcedure
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Maps;
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TIntObjectProcedure;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class fat<D extends UG> {
    protected static final Logger a = Logger.getLogger(fat.class);
    static final ahh_2 c = new ahh_2();
    static final TreeMap<Integer, Integer> d = Maps.newTreeMap();
    private int e;
    protected final TIntObjectHashMap<D> b = new TIntObjectHashMap();

    public fat(int n) {
        this.e = n;
    }

    public fat() {
    }

    public void a(D d2) {
        this.b.put(d2.a(), d2);
    }

    @Nullable
    public D a(Object object, Object object2, Object object3, Object object4) {
        int n = this.c(object, object2, object3, object4);
        return (D)(n == -1 ? null : (UG)this.b.get(n));
    }

    @Nullable
    public D a(Collection<? extends epq_2> collection, Collection<? extends epq_2> collection2, Object object, Object object2) {
        int n = this.b(collection, collection2, object, object2);
        return (D)(n == -1 ? null : (UG)this.b.get(n));
    }

    public boolean b(Object object, Object object2, Object object3, Object object4) {
        return !this.b.isEmpty();
    }

    protected boolean a(D d2, Object object, Object object2, Object object3, Object object4) {
        short s2 = d2.c();
        apc_2 apc_22 = d2.d();
        return s2 > 0 && (apc_22 == null || apc_22.b(object, object2, object3, object4));
    }

    public int c(Object object, Object object2, Object object3, Object object4) {
        int n;
        if (this.b.isEmpty()) {
            return -1;
        }
        d.clear();
        c.b();
        if (!this.b.isEmpty()) {
            this.b.forEachEntry((TIntObjectProcedure)new fau_0(this, object, object2, object3, object4));
        }
        if ((n = c.c()) == 0) {
            return -1;
        }
        int n2 = xc_0.a(n);
        Optional<Map.Entry> optional = d.entrySet().stream().filter(entry -> entry != null && (Integer)entry.getKey() >= n2).findFirst();
        if (optional.isEmpty()) {
            a.warn((Object)"Roll sur une DropTable non vide mais avec des poids de drop \u00e0 0");
            return -1;
        }
        return (Integer)optional.get().getValue();
    }

    private int b(Collection<? extends epq_2> collection, Collection<? extends epq_2> collection2, Object object, Object object2) {
        int n;
        if (this.b.isEmpty()) {
            return -1;
        }
        d.clear();
        c.b();
        if (!this.b.isEmpty()) {
            this.b.forEachEntry((TIntObjectProcedure)new fav_0(this, collection, collection2, object, object2));
        }
        if ((n = c.c()) == 0) {
            return -1;
        }
        int n2 = xc_0.a(n);
        Optional<Map.Entry> optional = d.entrySet().stream().filter(entry -> entry != null && (Integer)entry.getKey() >= n2).findFirst();
        if (optional.isEmpty()) {
            a.warn((Object)"Roll sur une DropTable non vide mais avec des poids de drop \u00e0 0");
            return -1;
        }
        return (Integer)optional.get().getValue();
    }

    public D a(int n) {
        return (D)((UG)this.b.get(n));
    }

    public int a() {
        return this.e;
    }

    public TIntObjectHashMap<D> b() {
        return this.b;
    }

    public int c() {
        return this.b.size();
    }

    public String toString() {
        return "DropTable{m_id=" + this.e + ", m_drops=" + this.b.size() + "}";
    }
}

