/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.log4j.Logger;

public final class eKj
implements eKh {
    private static final Logger j = Logger.getLogger(eKj.class);
    private static final int k = -50;
    private final Su l;
    private final Su m;
    private final efa_0 n;
    private final efh_0 o;
    private efa_0 p;
    private efa_0 q;
    private boolean r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;

    public eKj(Su su, Su su2, efa_0 efa_02, efh_0 efh_02) {
        this.m = su2;
        this.l = su;
        this.n = efa_02;
        this.o = efh_02;
        this.p = this.n;
        this.q = this.n;
    }

    @Override
    public void b() {
        int n;
        if (this.n == efa_0.f) {
            this.q = eiu_0.a(this.l);
            this.p = eiu_0.b(this.m);
        } else if (this.n == efa_0.g) {
            this.p = this.q = eiu_0.a(this.l);
        }
        int n2 = (this.s & 2) == 0 ? 0 : this.i();
        int n3 = (this.s & 1) == 0 ? 0 : this.j();
        double d2 = eKj.a(n2, this.u);
        float f2 = this.y;
        f2 *= (float)((double)(1.0f + (float)n3 / 100.0f) * d2);
        int n4 = this.m();
        f2 *= (float)(100 + n4) / 100.0f;
        int n5 = n = (this.s & 1) == 0 ? 0 : this.l();
        int n6 = (this.s & 1) == 0 ? 0 : (this.z ? this.e() : 0);
        int n7 = (this.s & 2) == 0 ? 0 : this.k();
        int n8 = (this.s & 1) == 0 ? 0 : this.x;
        this.y = Math.max(1, xh_0.a(f2 *= (float)(100 + n6 + n - n7 + n8) / 100.0f));
    }

    private int e() {
        if (this.l.a(eps_0.ab)) {
            return this.l.c(eps_0.ab);
        }
        return 0;
    }

    public static double a(int n, boolean bl) {
        double d2 = StrictMath.pow(0.8f, (float)n / 100.0f);
        double d3 = eKj.a(d2, 2);
        return bl ? d3 : Math.max(d3, 0.1);
    }

    private static double a(double d2, int n) {
        BigDecimal bigDecimal = new BigDecimal(d2);
        return bigDecimal.setScale(n, RoundingMode.CEILING).doubleValue();
    }

    private int f() {
        un_0 un_02 = this.h();
        if (un_02 == null) {
            return 0;
        }
        int n = 0;
        switch (un_02) {
            case a: {
                if (!this.l.a(eps_0.m)) break;
                n = this.l.c(eps_0.m);
            }
        }
        return n;
    }

    private int g() {
        un_0 un_02 = this.h();
        if (un_02 == null) {
            return 0;
        }
        int n = 0;
        if (un_02 == un_0.a && this.m.a(eps_0.n)) {
            n = this.m.c(eps_0.n);
        }
        return n;
    }

    private un_0 h() {
        if (this.q == efa_0.a || !this.r) {
            return null;
        }
        uo_0 uo_02 = this.m.k();
        if (uo_02 == null) {
            return null;
        }
        un_0 un_02 = uo_02.a(this.l.G(), this.l.H(), this.l.I());
        if (un_02 == null) {
            j.error((Object)"Impossible de r\u00e9cup\u00e9rer un partLocalisation...");
            return null;
        }
        return un_02;
    }

    private int i() {
        eps_0 eps_02;
        int n = this.w;
        n += this.g();
        if (this.m.a(eps_0.u)) {
            n += this.m.c(eps_0.u);
        }
        if (this.p != null && this.m.a(eps_02 = this.p.g())) {
            n += this.m.c(eps_02);
        }
        if (this.t && this.m.a(eps_0.W)) {
            n += this.m.c(eps_0.W);
        }
        return n;
    }

    private int j() {
        int n = this.v;
        n += this.f();
        if (this.l.a(eps_0.p)) {
            n += this.l.c(eps_0.p);
        }
        if (this.q != null && this.q != efa_0.a) {
            n += eiu_0.a(this.q.c(), this.l);
        }
        if (this.t) {
            if (this.l.a(eps_0.K)) {
                n += this.l.c(eps_0.K);
            }
        } else if (this.l.a(eps_0.ac)) {
            n += this.l.c(eps_0.ac);
        }
        if (eiu_0.a(this.o, eff_0.u) && this.l.a(eps_0.af)) {
            n += this.l.c(eps_0.af);
        }
        if (eiu_0.a(this.o, eff_0.d) && this.l.a(eps_0.ag)) {
            n += this.l.c(eps_0.ag);
        }
        if (eiu_0.b(this.l, this.m, this.o) && this.l.a(eps_0.ad)) {
            n += this.l.c(eps_0.ad);
        }
        if (eiu_0.a(this.l, this.m, this.o) && this.l.a(eps_0.ae)) {
            n += this.l.c(eps_0.ae);
        }
        if (this.l.a(eps_0.ah)) {
            int n2 = eiu_0.b(this.l, true);
            int n3 = eiu_0.a(this.l, true);
            float f2 = (float)n3 / (float)n2 * 100.0f;
            if (f2 < 50.0f) {
                n += this.l.c(eps_0.ah);
            }
        }
        return n;
    }

    private int k() {
        if (this.m.a(eps_0.I)) {
            return this.m.c(eps_0.I);
        }
        return 0;
    }

    private int l() {
        if (this.l.a(eps_0.H)) {
            int n = this.l.c(eps_0.H);
            return Math.max(n, -50);
        }
        return 0;
    }

    private int m() {
        un_0 un_02 = this.h();
        if (un_02 == null) {
            return 0;
        }
        switch (un_02) {
            case a: {
                return 25;
            }
            case c: 
            case b: {
                return 10;
            }
        }
        return 0;
    }

    @Override
    public efa_0 c() {
        return this.p;
    }

    @Override
    public efa_0 d() {
        return this.q;
    }

    @Override
    public int a() {
        return this.y;
    }

    @Override
    public void a(int n) {
        this.s = n;
    }

    @Override
    public void a(boolean bl) {
        this.r = bl;
    }

    @Override
    public void b(int n) {
        this.y = n;
    }

    @Override
    public void c(int n) {
        this.x = n;
    }

    @Override
    public void b(boolean bl) {
        this.t = bl;
    }

    @Override
    public void d(int n) {
        this.w = n;
    }

    @Override
    public void e(int n) {
        this.v = n;
    }

    @Override
    public void c(boolean bl) {
        this.u = bl;
    }

    @Override
    public void d(boolean bl) {
        this.z = bl;
    }
}

