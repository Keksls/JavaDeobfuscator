/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

public class eKi
implements eKh {
    private static final Logger j = Logger.getLogger(eKi.class);
    private final Su k;
    private final Su l;
    private final efa_0 m;
    private final efh_0 n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private efa_0 t;

    public eKi(Su su, Su su2, efa_0 efa_02, efh_0 efh_02) {
        this.l = su2;
        this.k = su;
        this.m = efa_02;
        this.n = efh_02;
        this.t = this.m;
    }

    @Override
    public void b() {
        if (this.m == efa_0.f || this.m == efa_0.g) {
            this.t = eiu_0.a(this.k);
        }
        int n = (this.o & 1) == 0 ? 0 : this.g();
        float f2 = this.s;
        f2 *= 1.0f + (float)n / 100.0f;
        int n2 = (this.o & 1) == 0 ? 0 : this.f();
        int n3 = (this.o & 1) == 0 ? 0 : this.r;
        f2 = (float)((double)(f2 * (float)(100 + n2 + n3)) / 100.0);
        int n4 = (this.o & 2) == 0 ? 0 : this.e();
        f2 -= f2 * (float)n4 / 100.0f;
        this.s = Math.max(1, xh_0.a(f2));
    }

    private int e() {
        if (this.l.a(eps_0.z)) {
            return (int)((float)this.l.c(eps_0.z) / 10.0f);
        }
        return 0;
    }

    private int f() {
        if (this.k.a(eps_0.ao)) {
            return this.k.c(eps_0.ao);
        }
        return 0;
    }

    private int g() {
        int n = this.q;
        if (this.k.a(eps_0.p)) {
            n += this.k.c(eps_0.p);
        }
        if (this.k.a(eps_0.o)) {
            n += this.k.c(eps_0.o);
        }
        if (this.t != null && this.t != efa_0.a) {
            n += eiu_0.a(this.t.c(), this.k);
        }
        if (this.p) {
            if (this.k.a(eps_0.K)) {
                n += this.k.c(eps_0.K);
            }
        } else if (this.k.a(eps_0.ac)) {
            n += this.k.c(eps_0.ac);
        }
        if (eiu_0.a(this.n, eff_0.u) && this.k.a(eps_0.af)) {
            n += this.k.c(eps_0.af);
        }
        if (eiu_0.a(this.n, eff_0.d) && this.k.a(eps_0.ag)) {
            n += this.k.c(eps_0.ag);
        }
        if (eiu_0.b(this.k, this.l, this.n) && this.k.a(eps_0.ad)) {
            n += this.k.c(eps_0.ad);
        }
        if (eiu_0.a(this.k, this.l, this.n) && this.k.a(eps_0.ae)) {
            n += this.k.c(eps_0.ae);
        }
        if (this.k.a(eps_0.ah)) {
            int n2 = eiu_0.b(this.k, true);
            int n3 = eiu_0.a(this.k, true);
            float f2 = (float)n3 / (float)n2 * 100.0f;
            if (f2 < 50.0f) {
                n += this.k.c(eps_0.ah);
            }
        }
        return n;
    }

    @Override
    public int a() {
        return this.s;
    }

    @Override
    public void a(int n) {
        this.o = n;
    }

    @Override
    public void a(boolean bl) {
    }

    @Override
    public void b(int n) {
        this.s = n;
    }

    @Override
    public void c(int n) {
        this.r = n;
    }

    @Override
    public void b(boolean bl) {
        this.p = bl;
    }

    @Override
    public void d(int n) {
    }

    @Override
    public void e(int n) {
        this.q = n;
    }

    @Override
    @Nullable
    public efa_0 c() {
        return null;
    }

    @Override
    public efa_0 d() {
        return this.t;
    }

    @Override
    public void c(boolean bl) {
    }

    @Override
    public void d(boolean bl) {
    }
}

