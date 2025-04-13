/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;

/*
 * Renamed from aDE
 */
class ade_2
implements Runnable {
    private final Runnable b;
    final /* synthetic */ add_2 a;

    ade_2(add_2 add_22, Runnable runnable) {
        this.a = add_22;
        this.b = runnable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        add_2.b.info((Object)"Worker running");
        this.a.a(true);
        while (this.a.j()) {
            this.b.run();
            long l = ado_1.a().c();
            if (l <= 0L || !this.a.d.tryLock()) continue;
            try {
                this.a.e.await(l, TimeUnit.MILLISECONDS);
            }
            catch (InterruptedException interruptedException) {
                add_2.b.error((Object)"Worker interrupted", (Throwable)interruptedException);
            }
            finally {
                this.a.d.unlock();
            }
        }
        add_2.b.info((Object)"Worker stopped");
        this.a.f = null;
    }
}

