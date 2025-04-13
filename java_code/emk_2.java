/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eMk
 */
public abstract class emk_2<F extends els_0> {
    protected static final Logger a = Logger.getLogger(emk_2.class);
    protected final TIntObjectHashMap<F> b = new TIntObjectHashMap();

    public void a(F f2) {
        this.b.put(((els_0)f2).c(), f2);
    }

    public void b(F f2) {
        this.b.remove(((els_0)f2).c());
    }

    public F a(int n) {
        return (F)((els_0)this.b.get(n));
    }
}

