/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.HashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from fzX
 */
public class fzx_0
implements Runnable {
    private static final Logger a = Logger.getLogger(fzx_0.class);
    private final HashMap<String, fzz_0> b = new HashMap();
    private final Object c = new Object();
    private boolean d = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string, int n) {
        fzz_0 fzz_02 = this.b.get(string);
        if (fzz_02 != null) {
            return;
        }
        if (n < 1) {
            n = 1;
        }
        try {
            fzz_02 = new fzz_0(string, n);
            Object object = this.b;
            synchronized (object) {
                this.b.put(string, fzz_02);
            }
            object = this.c;
            synchronized (object) {
                this.c.notify();
            }
            this.d = true;
        }
        catch (Exception exception) {
            a.error((Object)("Resource invalide : " + string));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string) {
        fzz_0 fzz_02 = null;
        HashMap<String, fzz_0> hashMap = this.b;
        synchronized (hashMap) {
            fzz_02 = this.b.remove(string);
        }
        if (fzz_02 != null) {
            fzz_02.f();
        }
    }

    public void a() {
        for (fzz_0 fzz_02 : this.b.values()) {
            fzz_02.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public fyb_0 b(String string) {
        fzz_0 fzz_02;
        Object object = this.b;
        synchronized (object) {
            fzz_02 = this.b.get(string);
        }
        if (fzz_02 != null) {
            object = this.c;
            synchronized (object) {
                this.c.notify();
            }
            this.d = true;
            return fzz_02.a();
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        while (true) {
            HashMap<String, fzz_0> hashMap;
            try {
                hashMap = this.c;
                synchronized (hashMap) {
                    if (!this.d) {
                        this.c.wait();
                    }
                }
            }
            catch (InterruptedException interruptedException) {
                a.warn((Object)"Interrupted Exception");
            }
            hashMap = this.b;
            synchronized (hashMap) {
                for (fzz_0 fzz_02 : this.b.values()) {
                    if (!fzz_02.d()) continue;
                    fzz_02.e();
                }
            }
            this.d = false;
        }
    }
}

