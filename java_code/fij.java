/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

public class fij {
    protected static final Logger a = Logger.getLogger(fij.class);
    private static final fij b = new fij();
    private final TIntObjectHashMap<fii> c = new TIntObjectHashMap();

    public static fij a() {
        return b;
    }

    public void a(fii fii2) {
        this.c.put(fii2.a(), (Object)fii2);
    }

    public fii a(int n) {
        return (fii)this.c.get(n);
    }

    public boolean b() {
        return this.c.isEmpty();
    }
}

