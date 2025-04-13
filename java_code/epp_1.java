/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from epp
 */
public class epp_1 {
    protected static final Logger a = Logger.getLogger(epp_1.class);
    public static final epp_1 b = new epp_1();
    private long c = 0L;
    private long d = System.currentTimeMillis() + 60000L;
    private long e;

    private epp_1() {
        while (this.d < System.currentTimeMillis()) {
            this.a();
        }
        this.a();
    }

    private void a() {
        this.e = this.d + (long)Hw.a(60000);
        this.d += 60000L;
        a.info((Object)("Cacul du prochain loot special : " + Cz.a(this.e)));
    }

    public boolean a(long l) {
        long l2 = System.currentTimeMillis();
        if (l2 < this.e) {
            return false;
        }
        if (l == this.c) {
            return false;
        }
        while (this.d < l2) {
            this.a();
        }
        this.a();
        a.info((Object)("gift gagn\u00e9 par le playerId=" + l));
        this.c = l;
        return true;
    }
}

