/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntIntHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntIntHashMap;
import org.apache.log4j.Logger;

public class bqW {
    private static final Logger b = Logger.getLogger(bqW.class);
    public static final bqW a = new bqW();
    private final TIntIntHashMap c = new TIntIntHashMap();

    public void a(int n) {
        Object r2 = eyo_1.g().d(n);
        if (!(((ezr_0)r2).p() instanceof biu_1)) {
            b.warn((Object)("Trying to had an items with the bad ItemAction " + n));
            return;
        }
        biu_1 biu_12 = (biu_1)((ezr_0)r2).p();
        if (this.c.contains(biu_12.g())) {
            throw new IllegalArgumentException("We have two items who give the same companion : " + n);
        }
        this.c.put(n, biu_12.g());
    }

    public int b(int n) {
        return this.c.get(n);
    }
}

