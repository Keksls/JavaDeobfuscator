/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from azZ
 */
public final class azz_2
extends Thread {
    protected static final Logger a = Logger.getLogger(azz_2.class);
    private boolean b = false;
    private int c;
    private long d = System.nanoTime();
    private final ArrayList<aaa_2> e = new ArrayList();

    private azz_2() {
    }

    @Override
    public synchronized void start() {
        this.b = true;
        super.start();
    }

    public int a() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }

    public boolean b() {
        return this.b;
    }

    public long c() {
        return this.d;
    }

    public void a(long l) {
        this.d = l;
    }

    public boolean a(aab_2 aab_22) {
        for (aaa_2 aaa_22 : this.e) {
            if (aaa_22.a() != aab_22) continue;
            return true;
        }
        return false;
    }

    public aaa_2 a(aab_2 aab_22, int n) {
        if (!this.a(aab_22)) {
            aaa_2 aaa_22 = new aaa_2(aab_22, n);
            this.e.add(aaa_22);
            return aaa_22;
        }
        return null;
    }

    public void b(aab_2 aab_22) {
        for (aaa_2 aaa_22 : this.e) {
            if (aaa_22.a() != aab_22) continue;
            this.e.remove(aaa_22);
            break;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        ArrayList<aaa_2> arrayList = new ArrayList<aaa_2>();
        Object object = new Object();
        a.info((Object)"Animator running");
        Object object2 = object;
        synchronized (object2) {
            while (this.b) {
                arrayList.clear();
                long l = Long.MAX_VALUE;
                long l2 = System.nanoTime();
                for (aaa_2 aaa_22 : this.e) {
                    long l3 = aaa_22.a(l2);
                    if (l3 >= l) continue;
                    l = l3;
                    arrayList.add(aaa_22);
                }
                if (l > 0L) {
                    try {
                        if (l == Long.MAX_VALUE) {
                            object.wait(100L);
                        } else {
                            object.wait((int)(l / 1000000L), (int)(l % 1000000L));
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        a.error((Object)"InterruptedException during Animator run", (Throwable)interruptedException);
                    }
                }
                l2 = System.nanoTime();
                for (aaa_2 aaa_22 : arrayList) {
                    aaa_22.a().a(aaa_22.b(l2));
                }
            }
        }
    }
}

