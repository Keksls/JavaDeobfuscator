/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aGv
 */
public abstract class agv_2
implements agt_2,
Runnable {
    protected static final Logger a = Logger.getLogger(agv_2.class);
    protected final boolean b = false;
    private boolean c = false;
    private boolean d = true;
    private final Object e = new Object();
    private final ArrayList<agu_2> f = new ArrayList();

    public final void a() {
        if (!this.c) {
            a.info((Object)"Loader non initialis\u00e9");
        } else {
            a.info((Object)"Loader d\u00e9j\u00e0 d\u00e9marrer");
        }
    }

    public final void b() {
        this.c = false;
        this.e();
    }

    @Override
    public final void run() {
        a.info((Object)"Loader non initialis\u00e9");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected final void c() {
        if (this.d) {
            this.d = false;
            Object object = this.e;
            synchronized (object) {
                this.e.notify();
            }
        }
    }

    protected abstract void d();

    protected abstract void e();

    @Override
    public void a(agu_2 agu_22) {
        this.f.add(agu_22);
    }

    @Override
    public void e(String string) {
        for (agu_2 agu_22 : this.f) {
            agu_22.b(string);
        }
    }

    @Override
    public void a(String string, String string2) {
        for (agu_2 agu_22 : this.f) {
            agu_22.a(string, string2);
        }
    }

    @Override
    public void f(String string) {
        for (agu_2 agu_22 : this.f) {
            agu_22.a(string);
        }
    }

    @Override
    public void b(agu_2 agu_22) {
        this.f.remove(agu_22);
    }
}

