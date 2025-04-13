/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;

/*
 * Renamed from Xw
 */
public class xw_0 {
    private static final Logger a = Logger.getLogger(xw_0.class);
    private final ExecutorService b;
    final ach_2<Future> c;

    public xw_0(String string) {
        this(string, 25);
    }

    public xw_0(String string, int n) {
        this.b = Executors.newFixedThreadPool(1, new xx_0(this, string));
        this.c = new ach_2(n);
    }

    public void a(long l, Runnable runnable) {
        Future<?> future = this.b.submit(new xy_0(this, runnable, l));
        this.c.a(l, future);
    }

    public final void a(long l) {
        Future future = this.c.e(l);
        if (future == null) {
            return;
        }
        while (!future.isDone()) {
            try {
                Thread.sleep(3L);
            }
            catch (InterruptedException interruptedException) {
                a.error((Object)"", (Throwable)interruptedException);
            }
        }
    }

    public final void b(long l) {
        Future future = this.c.d(l);
        if (future != null) {
            future.cancel(true);
        }
    }

    public final void a() {
        for (int k = 0; k < this.c.d(); ++k) {
            Future future = this.c.c(k);
            if (future == null) continue;
            future.cancel(true);
        }
        this.c.c();
    }
}

