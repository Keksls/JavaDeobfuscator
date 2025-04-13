/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from bQz
 */
public class bqz_1
implements adv_1 {
    private static final Logger b = Logger.getLogger(bqz_1.class);
    public static final bqz_1 a = new bqz_1();
    private final ArrayList<bQA> c = new ArrayList();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(bQA bQA2) {
        ArrayList<bQA> arrayList = this.c;
        synchronized (arrayList) {
            if (!this.c.contains(bQA2)) {
                this.c.add(bQA2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(bQA bQA2) {
        ArrayList<bQA> arrayList = this.c;
        synchronized (arrayList) {
            this.c.remove(bQA2);
        }
    }

    public void a() {
        adi_2.a().a(this, 1000L, -1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        adi_2.a().a(this);
        ArrayList<bQA> arrayList = this.c;
        synchronized (arrayList) {
            this.c.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean a(adt_1 adt_12) {
        if (adt_12 instanceof adh_2) {
            ArrayList<bQA> arrayList = this.c;
            synchronized (arrayList) {
                int n = this.c.size();
                for (int k = 0; k < n; ++k) {
                    try {
                        this.c.get(k).c();
                        continue;
                    }
                    catch (Throwable throwable) {
                        b.warn((Object)"Erreur durant un TimeTick", throwable);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "TimeManager{m_listeners=" + this.c + "}";
    }
}

