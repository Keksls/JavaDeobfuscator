/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;

class ceY
implements Runnable {
    private final AtomicInteger b;
    private final int c;
    final /* synthetic */ ceX a;

    ceY(ceX ceX2, int n) {
        this.a = ceX2;
        this.c = n;
        this.b = new AtomicInteger(0);
    }

    @Override
    public void run() {
        cuo_0.e().a().a(this.b.incrementAndGet());
        if (this.b.get() >= this.c) {
            this.a.c();
        }
    }
}

