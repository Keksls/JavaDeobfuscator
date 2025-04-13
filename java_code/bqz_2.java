/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

/*
 * Renamed from bqz
 */
public final class bqz_2 {
    protected static final Logger a = Logger.getLogger(bqz_2.class);
    private final ArrayList<flm_0> b = new ArrayList();
    private final ArrayList<bqb_1> c = new ArrayList(1);
    private long d;

    public final void a(bqb_1 bqb_12) {
        this.c.add(bqb_12);
    }

    public final void b(bqb_1 bqb_12) {
        this.c.remove(bqb_12);
    }

    public final void a(flm_0 flm_02) {
        this.b.add(flm_02);
        if (!flm_02.a().h()) {
            this.d();
        }
    }

    public final void b(flm_0 flm_02) {
        this.b.remove(flm_02);
        if (!this.c()) {
            this.e();
        }
    }

    public final void a() {
        this.b.clear();
        this.e();
    }

    public final Collection<flm_0> b() {
        return this.b;
    }

    private boolean c() {
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            flm_0 flm_02 = this.b.get(k);
            if (flm_02.a().h()) continue;
            return true;
        }
        return false;
    }

    private void d() {
        if (this.d == 0L) {
            this.d = adi_2.a().a(new bqa_1(this), 1000L, 1);
            this.f();
        }
    }

    private void e() {
        if (this.d != 0L) {
            adi_2.a().a(this.d);
            this.d = 0L;
            this.f();
        }
    }

    void f() {
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            bqb_1 bqb_12 = this.c.get(k);
            bqb_12.onTick();
        }
    }
}

