/*
 * Decompiled with CFR 0.152.
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from aEA
 */
class aea_1
extends Thread {
    private boolean a;
    private final ArrayList<aew_1> b = new ArrayList();

    aea_1() {
    }

    @Override
    public final synchronized void start() {
        if (!this.a) {
            this.setName(this.getClass().getSimpleName());
            this.a = true;
            super.start();
        }
    }

    public final synchronized void a() {
        this.a = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        while (this.a) {
            aew_1 aew_12;
            if (aew_1.d.isEmpty()) {
                try {
                    Thread.sleep(100L);
                }
                catch (InterruptedException interruptedException) {
                    aew_1.a.error((Object)"wait() interrupted : ", (Throwable)interruptedException);
                }
                continue;
            }
            ArrayList<aew_1> arrayList = aew_1.d;
            synchronized (arrayList) {
                Iterator<aew_1> iterator = aew_1.d.iterator();
                while (iterator.hasNext()) {
                    aew_12 = iterator.next();
                    if (aew_12.a()) {
                        iterator.remove();
                        aew_12.f();
                        continue;
                    }
                    this.b.add(aew_12);
                }
            }
            int n = 0;
            for (int k = 0; k < this.b.size(); ++k) {
                aew_12 = this.b.get(k);
                try {
                    aew_12.g();
                    n += aew_12.h;
                }
                catch (Exception exception) {
                    if (aew_12.c()) {
                        abj_2<URL, aew_1> abj_22 = aew_1.c;
                        synchronized (abj_22) {
                            aew_1.c.b(aew_12.b());
                        }
                    }
                    aew_12.a(exception);
                }
                if (n > 0x400000) break;
            }
            this.b.clear();
            Thread.yield();
        }
    }
}

