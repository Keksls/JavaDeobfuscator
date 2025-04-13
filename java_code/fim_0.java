/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.TCollections
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.TCollections;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from fim
 */
public abstract class fim_0<G extends fil_0> {
    protected static final Logger a = Logger.getLogger(fim_0.class);
    private final TIntObjectMap<G> b = TCollections.synchronizedMap((TIntObjectMap)new TIntObjectHashMap());
    private static fim_0<? extends fil_0> c;

    protected fim_0() {
    }

    public static fim_0<? extends fil_0> a() {
        return c;
    }

    public void a(G g) {
        this.b.put(((fil_0)g).h(), g);
    }

    public G a(int n) {
        return (G)((fil_0)this.b.get(n));
    }

    public G b(int n) {
        return (G)((fil_0)this.b.remove(n));
    }

    public void b() {
        this.b.clear();
    }

    public static void a(fim_0<? extends fil_0> fim_02) {
        c = fim_02;
    }
}

