/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bxY
 */
public class bxy_1
implements ajh_1,
bQA {
    public static final String a = "name";
    public static final String b = "learnDuration";
    public static final String d = "duration";
    public static final String e = "cost";
    public static final String f = "requirement";
    public static final String g = "effects";
    public static final String h = "learnRemainingTime";
    public static final String i = "remainingTime";
    public static final String j = "canBePurchased";
    public static final String k = "isActive";
    public static final String l = "performedLearningDuration";
    public static final String m = "learnDurationAsMinute";
    private final eqd_0 n;

    public bxy_1(eqd_0 eqd_02) {
        this.n = eqd_02;
    }

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a(138, (long)this.n.a(), new Object[0]);
        }
        if (string.equals(b)) {
            if (!this.n.c()) {
                return null;
            }
            return wa_0.c(this.n.b());
        }
        if (string.equals(d)) {
            if (!this.n.e()) {
                return null;
            }
            return wa_0.c(this.n.d());
        }
        if (string.equals(e)) {
            ani_2 ani_22 = new ani_2();
            if (!this.k()) {
                ani_22.i().a(new azf_2(0.6f, 0.0f, 0.0f, 1.0f).w());
            }
            ani_22.d(this.n.g());
            return ani_22.r();
        }
        if (string.equals(f)) {
            ani_2 ani_23 = new ani_2();
            if (!this.l()) {
                ani_23.i().a(new azf_2(0.6f, 0.0f, 0.0f, 1.0f).w());
            }
            ani_23.a((CharSequence)bae.h().a("required.level.custom", eqw_2.b.c(this.n.a())));
            return ani_23.r();
        }
        if (string.equals(g)) {
            return this.a();
        }
        if (string.equals(j)) {
            return this.j();
        }
        if (string.equals(h)) {
            if (!this.n.c()) {
                return null;
            }
            wt_0 wt_02 = bxv_1.b(this.n(), this.n, this.o());
            return this.a(wt_02);
        }
        if (string.equals(i)) {
            if (!this.n.e()) {
                return null;
            }
            wt_0 wt_03 = bxv_1.c(this.n(), this.n, this.o());
            return this.a(wt_03);
        }
        if (string.equals(k)) {
            return erf_1.a(this.n());
        }
        if (string.equals(l)) {
            if (!this.n.c()) {
                return null;
            }
            return (this.n.b().g() - wc_0.p().a().g(bxv_1.b(this.n(), this.n, this.o())).g()) / 60L;
        }
        if (string.equals(m)) {
            return this.n.b().g() / 60L;
        }
        return null;
    }

    public String a() {
        return bxv_1.a(this.n);
    }

    private String a(wt_0 wt_02) {
        ww_0 ww_02 = wc_0.p().a().g(wt_02);
        return wa_0.c(ww_02.b(wx_0.e) ? ww_02 : wx_0.e);
    }

    public int b() {
        return this.n.a();
    }

    public eqh_0 e() {
        return this.n.f();
    }

    private boolean j() {
        return this.k() && this.l();
    }

    private boolean k() {
        return this.m().h() >= this.n.g();
    }

    private boolean l() {
        return eqw_2.b.a(this.n.a(), this.m().g());
    }

    private bot_2 m() {
        return (bot_2)azu_0.j().k().eV();
    }

    private erh_1 n() {
        return this.o().a(this.n.a());
    }

    private erg_1 o() {
        return this.m().f();
    }

    public void f() {
        fis_1.a().a((ajf_1)this, j, f, e);
    }

    public void g() {
        fis_1.a().a((ajf_1)this, j);
    }

    public void h() {
        bqz_1.a.a(this);
    }

    public void i() {
        bqz_1.a.b(this);
    }

    @Override
    public void c() {
        fis_1.a().a((ajf_1)this, i, h, k, l);
    }
}

