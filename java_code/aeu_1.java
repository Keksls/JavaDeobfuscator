/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Renamed from aEu
 */
class aeu_1
extends Thread {
    private boolean a;

    aeu_1() {
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
            ArrayList<aeo_1> arrayList = aeo_1.d;
            synchronized (arrayList) {
                if (aeo_1.d.isEmpty()) {
                    try {
                        aeo_1.d.wait(1000L);
                    }
                    catch (InterruptedException interruptedException) {
                        aeo_1.a.error((Object)("Interruption du thread " + this.getName()), (Throwable)interruptedException);
                    }
                } else {
                    Iterator<aeo_1> iterator = aeo_1.d.iterator();
                    while (iterator.hasNext()) {
                        aeo_1 aeo_12 = iterator.next();
                        aef_1 aef_12 = aeo_12.f();
                        if (aef_12 == null || aef_12.a()) {
                            aee_1 aee_12 = aeo_12.g();
                            if (aee_12 == null || aee_12.a()) {
                                iterator.remove();
                                continue;
                            }
                            try {
                                aee_12.b();
                            }
                            catch (IOException iOException) {
                                iterator.remove();
                                aeo_12.a(iOException);
                            }
                            continue;
                        }
                        try {
                            aef_12.b();
                        }
                        catch (IOException iOException) {
                            aeo_12.b(iOException);
                            iterator.remove();
                        }
                    }
                }
            }
        }
    }
}

