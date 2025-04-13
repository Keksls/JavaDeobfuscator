/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntShortHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from bTC
 */
public class btc_2 {
    private static final Logger a = Logger.getLogger(btc_2.class);
    private static final btc_2 b = new btc_2();
    private final TIntShortHashMap c = new TIntShortHashMap();

    public static btc_2 a() {
        return b;
    }

    private btc_2() {
    }

    public String a(int n) {
        return bae.h().a(128, (long)n, new Object[0]);
    }

    public String b(int n) {
        return bae.h().a(129, (long)n, new Object[0]);
    }

    public void b() {
        this.c.compact();
    }

    public int c(int n) {
        return n;
    }
}

