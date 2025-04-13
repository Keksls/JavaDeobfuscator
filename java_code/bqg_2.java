/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.LinkedList;
import org.apache.log4j.Logger;

/*
 * Renamed from bqg
 */
public class bqg_2
implements Runnable {
    private static final Logger b = Logger.getLogger(bqg_2.class);
    private static final bqg_2 c = new bqg_2();
    private static final float[] d = new float[]{1.0f, 1.0f, 1.0f, 0.6f};
    private final LinkedList<bqf_2> e = new LinkedList();
    public static final boolean a = false;

    public static bqg_2 a() {
        return c;
    }

    private bqg_2() {
    }

    public void b() {
        while (!this.d(this.c())) {
        }
    }

    private boolean d(bqf_2 bqf_22) {
        if (bqf_22 == null) {
            return true;
        }
        bqf_22.b();
        if (bqf_22.d() && bqf_22.c()) {
            bqf_22.a(true);
            return true;
        }
        return false;
    }

    bqf_2 c() {
        if (this.e.isEmpty()) {
            return null;
        }
        return this.e.poll();
    }

    public void a(bqf_2 bqf_22) {
        if (this.b(bqf_22)) {
            return;
        }
        bqf_22.a();
        this.e.add(bqf_22);
    }

    public boolean d() {
        return this.e.isEmpty();
    }

    public void e() {
        b.info((Object)"[QUEUE_COLLECT] on clear toutes les actions");
        this.i();
        for (int k = this.e.size() - 1; k >= 0; --k) {
            this.c(this.e.get(k));
        }
    }

    public boolean b(bqf_2 bqf_22) {
        brw_1 brw_12 = bqf_22.e();
        aby_0 aby_02 = bqf_22.f();
        if (brw_12 == null || aby_02 == null) {
            return true;
        }
        for (bqf_2 bqf_23 : this.e) {
            if (!brw_12.equals(bqf_23.e()) || !aby_02.equals(bqf_23.f())) continue;
            return true;
        }
        return false;
    }

    public void c(bqf_2 bqf_22) {
        if (this.e.contains(bqf_22)) {
            bqf_22.b();
            this.e.remove(bqf_22);
        }
    }

    public boolean a(bNK bNK2) {
        for (bqf_2 bqf_22 : this.e) {
            if (!bqf_22.f().equals(bNK2)) continue;
            return true;
        }
        return false;
    }

    public void f() {
        this.g();
        ado_1.a().a(this, 5000L, 1);
    }

    public void g() {
        ado_1.a().b(this);
    }

    public boolean h() {
        bpc_2 bpc_22 = azu_0.j().k().eE();
        return bpc_22 != null && (bpc_22.ac_() == 3 || bpc_22.ac_() == 6);
    }

    public void i() {
        this.g();
    }

    @Override
    public void run() {
        b.warn((Object)"[QUEUE_COLLECT] timeOut execut\u00e9");
        this.b();
    }
}

