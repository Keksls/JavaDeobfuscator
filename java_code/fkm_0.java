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
 * Renamed from fkm
 */
public abstract class fkm_0<P extends fkk_0> {
    private static final Logger a = Logger.getLogger(fkm_0.class);
    private final TIntObjectHashMap<P> b = new TIntObjectHashMap();

    public void a(String string) {
        arf_1 arf_12 = arf_1.a(gg_0.b(string));
        int n = arf_12.c();
        for (int k = 0; k < n; ++k) {
            int n2 = arf_12.c();
            P p2 = this.b(n2);
            ((fkk_0)p2).a(arf_12);
            this.b.put(n2, p2);
        }
    }

    protected abstract P b(int var1);

    public P c(int n) {
        return (P)((fkk_0)this.b.get(n));
    }
}

