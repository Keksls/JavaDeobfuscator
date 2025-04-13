/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public final class eKd {
    private eov_1 b;
    private final List<eps_0> c = new ArrayList<eps_0>();
    private final List<eps_0> d;
    public static final eKd a = new eKd();

    private eKd() {
        this.c.add(eps_0.b);
        this.c.add(eps_0.T);
        this.c.add(eps_0.t);
        this.c.add(eps_0.q);
        this.c.add(eps_0.s);
        this.c.add(eps_0.r);
        this.c.add(eps_0.p);
        this.c.add(eps_0.y);
        this.c.add(eps_0.v);
        this.c.add(eps_0.x);
        this.c.add(eps_0.w);
        this.c.add(eps_0.u);
        this.d = new ArrayList<eps_0>();
        this.d.add(eps_0.g);
        this.d.add(eps_0.f);
        this.d.add(eps_0.B);
    }

    public void a(eov_1 eov_12, float f2, float f3) {
        eps_0 eps_02;
        int n;
        this.b = eov_12;
        int n2 = this.c.size();
        for (n = 0; n < n2; ++n) {
            eps_02 = this.c.get(n);
            this.a(eps_02, f2);
        }
        n2 = this.d.size();
        for (n = 0; n < n2; ++n) {
            eps_02 = this.d.get(n);
            this.a(eps_02, f3);
        }
        this.b = null;
    }

    private void a(eps_0 eps_02, float f2) {
        Object Characteristic = this.b.b(eps_02);
        int n = ((rs_0)Characteristic).a();
        ((rs_0)Characteristic).b(Math.round((float)n - Math.abs((float)n * (1.0f - f2))));
        ((rs_0)Characteristic).g(Math.round((float)((rs_0)Characteristic).c() * f2));
    }

    public int a(eps_0 eps_02, short s2, epy_0 epy_02, float f2, float f3) {
        float f4 = this.c.contains(eps_02) ? f2 : (this.d.contains(eps_02) ? f3 : 1.0f);
        int n = epy_02.a(eps_02, (int)s2);
        return Math.round((float)n - Math.abs((float)n * (1.0f - f4)));
    }
}

