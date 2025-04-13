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
 * Renamed from fln
 */
public class fln_0 {
    protected static final Logger a = Logger.getLogger(fln_0.class);
    private static final fln_0 b = new fln_0();
    private final TIntObjectHashMap<fll_0> c = new TIntObjectHashMap();

    public static fln_0 a() {
        return b;
    }

    private fln_0() {
    }

    public fll_0 a(int n) {
        fll_0 fll_02 = (fll_0)this.c.get(n);
        if (fll_02 != null) {
            return fll_02;
        }
        return null;
    }
}

