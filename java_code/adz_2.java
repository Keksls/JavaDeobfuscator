/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from aDz
 */
public class adz_2 {
    protected static final Logger a = Logger.getLogger(adz_2.class);
    private static final adz_2 c = new adz_2();
    final Map<Runnable, adb_2> b = new HashMap<Runnable, adb_2>();
    private static final boolean d = false;
    final ObjectPool e = new abm_1(new ada_2(this));

    private adz_2() {
    }

    public static adz_2 a() {
        return c;
    }

    private adb_2 a(adz_2 adz_22, Runnable runnable, long l, int n) {
        try {
            adb_2 adb_22 = (adb_2)this.e.borrowObject();
            adb_22.b = adz_22;
            adb_22.c = runnable;
            adb_22.d = l;
            adb_22.e = n;
            adb_22.f = true;
            adb_22.g = true;
            return adb_22;
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            return new adb_2(this, adz_22, runnable, l, n);
        }
    }

    int b() {
        return this.e.getNumActive() + this.e.getNumIdle();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(adb_2 adb_22) {
        this.b.remove(adb_22.c);
        adb_2 adb_23 = adb_22;
        synchronized (adb_23) {
            try {
                adb_22.a();
                adb_22.wait();
                adb_22.run();
            }
            catch (InterruptedException interruptedException) {
                a.error((Object)"Exception levee", (Throwable)interruptedException);
            }
        }
    }

    public void a(Runnable runnable, long l, int n) {
        ado_1.a().a(runnable, l, n);
    }

    public void a(Runnable runnable) {
        adb_2 adb_22 = this.b.remove(runnable);
        if (adb_22 != null) {
            adb_22.g = false;
        } else {
            a.warn((Object)"On essaie de retirer une tache qui n'est pas dans le scheduler");
        }
    }
}

