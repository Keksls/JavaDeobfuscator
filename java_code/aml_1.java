/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aMl
 */
public class aml_1 {
    protected static final Logger a = Logger.getLogger(aml_1.class);
    private static final aml_1 b = new aml_1();
    private final ach_2<amj_1> c = new ach_2();
    private long d = 0L;
    private static final ObjectPool e = new abm_1(new amm_1());

    public static aml_1 a() {
        return b;
    }

    public long b() {
        if (this.d == Long.MAX_VALUE) {
            this.d = 0L;
        }
        return this.d++;
    }

    public synchronized amj_1 a(long l) {
        try {
            amj_1 amj_12 = (amj_1)e.borrowObject();
            amj_12.a(true);
            amj_12.a(l == -1L ? this.b() : l);
            this.c.a(amj_12.b(), amj_12);
            return amj_12;
        }
        catch (Exception exception) {
            a.error((Object)"Exception lev\u00e9e lors du checkOut d'une source audio : ", (Throwable)exception);
            return null;
        }
    }

    public synchronized void a(amj_1 amj_12) {
        try {
            if (amj_12 != null) {
                all_1 all_12 = amj_12.d();
                amu_1.a("Removing " + amj_12.K(), all_12 == null ? (byte)-1 : (byte)all_12.c());
                amj_12.a(false);
                this.c.d(amj_12.b());
                e.returnObject((Object)amj_12);
            }
        }
        catch (Exception exception) {
            a.error((Object)"Exception lev\u00e9e lors du release d'une source audio : ", (Throwable)exception);
        }
    }

    public synchronized amj_1 b(long l) {
        return this.c.e(l);
    }

    public amj_1 c() {
        byte by = -1;
        amj_1 amj_12 = null;
        for (int k = this.c.d() - 1; k >= 0; --k) {
            amj_1 amj_13 = this.c.c(k);
            if (amj_13.c() <= by) continue;
            amj_12 = amj_13;
            by = amj_13.c();
        }
        return amj_12;
    }
}

