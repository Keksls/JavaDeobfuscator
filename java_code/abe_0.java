/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Renamed from abE
 */
public class abe_0
extends abs<abu> {
    private static final abe_0 f = new abe_0();
    protected final ConcurrentHashMap<Long, abu> d = new ConcurrentHashMap();
    protected final List<abu> e = new ArrayList<abu>();

    public static abe_0 d() {
        return f;
    }

    public void a(abu abu2) {
        this.d.put(abu2.a(), abu2);
        this.a(abu2, abu2.G(), abu2.H(), (int)abu2.L());
    }

    public abu a(long l) {
        abu abu2 = this.d.remove(l);
        if (abu2 != null) {
            this.e.add(abu2);
        }
        return abu2;
    }

    public abu b(abu abu2) {
        return this.a(abu2.a());
    }

    public void e() {
        this.e.addAll(this.d.values());
        this.d.clear();
    }

    public abu b(long l) {
        return this.d.get(l);
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        this.g();
        for (abu abu2 : this.d.values()) {
            abu2.a((ahg_0)acb_02, n);
        }
    }

    private void g() {
        int n = this.e.size();
        for (int k = 0; k < n; ++k) {
            abu abu2 = this.e.get(k);
            abu2.e(false);
            this.c.remove(abu2);
            abu2.R();
        }
        this.e.clear();
    }

    @Override
    public void a(acb_0 acb_02, float f2, float f3) {
        this.c.clear();
        for (abu abu2 : this.d.values()) {
            if (abu2.a(acb_02)) {
                abu2.k(false);
                abe_0.a(abu2, acb_02);
                this.c.add(abu2);
                continue;
            }
            abu2.k(true);
        }
    }

    private static void a(abu abu2, acb_0 acb_02) {
        if (!abu2.ax()) {
            return;
        }
        int n = aht_0.a((ahg_0)acb_02, abu2.ag());
        afd_1 afd_12 = aht_0.b(acb_02, abu2);
        int n2 = Hw.b(afd_12.a);
        int n3 = Hw.b(afd_12.b);
        if (n2 != abu2.i() || n3 != abu2.j() || n != abu2.k()) {
            abu2.d(n2);
            abu2.e(n3);
            abu2.f(n);
            abu2.ay();
        }
    }

    public void f() {
        for (abu abu2 : this.d.values()) {
            abu2.R();
        }
        this.d.clear();
        this.c.clear();
    }

    @Override
    public void c() {
        for (abu abu2 : this.d.values()) {
            aiI.a(abu2);
        }
    }
}

