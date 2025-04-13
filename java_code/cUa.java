/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class cUa
extends cSS
implements afy_0 {
    private bpp_1 n;
    private boolean o;
    public static final int a = 0;
    public static final int m = 1;
    private int p;

    cUa() {
    }

    public cUa(bpp_1 bpp_12) {
        this.n = bpp_12;
    }

    @Override
    public void a(Object object) {
        super.a(object);
        this.o = ((epq_2)this.l).a(erl_2.n);
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (this.n.f() == eao_0.e.a() && !emj_0.a.a(new emh_0[]{bmr_12})) {
            this.p = 1;
            return false;
        }
        if (this.n.f() == eao_0.d.a() && !emj_0.b.a(new emh_0[]{bmr_12})) {
            this.p = 1;
            return false;
        }
        this.p = 0;
        return true;
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.a(erl_2.W)) {
            return false;
        }
        return this.l instanceof bmv_1 && !((bmv_1)this.l).ab_() && !((bmv_1)this.l).f(erl_2.I) && this.n.b((bmv_1)this.l);
    }

    @Override
    public void o() {
        boolean bl;
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.bv().b(this);
        int n = bmr_12.P_().e(((bmv_1)this.l).P_());
        boolean bl2 = bl = n > 2;
        if (!this.n.g() || n <= 1 && bmr_12.bv().bb() == null) {
            this.b();
        } else {
            ArrayList<aff_1> arrayList = new ArrayList<aff_1>();
            aff_1 aff_12 = ((bmv_1)this.l).P_();
            arrayList.add(new aff_1(aff_12.d() + 1, aff_12.e(), aff_12.f()));
            arrayList.add(new aff_1(aff_12.d() - 1, aff_12.e(), aff_12.f()));
            arrayList.add(new aff_1(aff_12.d(), aff_12.e() + 1, aff_12.f()));
            arrayList.add(new aff_1(aff_12.d(), aff_12.e() - 1, aff_12.f()));
            if (!bmr_12.a(false, bl, (List<aff_1>)arrayList)) {
                bmr_12.bv().c(this);
                bQG.a();
                bQG.a(2, new Object[0]);
            }
        }
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        this.b();
    }

    private void b() {
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        bmv_1 bmv_12 = (bmv_1)this.l;
        biI2.c(this);
        int n = bmr_12.P_().e(bmv_12.P_());
        if (this.n.g() && n > 1) {
            return;
        }
        this.n.a(bmv_12);
    }

    public bpp_1 a() {
        return this.n;
    }

    @Override
    protected int t() {
        return this.n.a().c();
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(!eao_0.a(this.n.f()).b() && this.o ? h : f);
        ani_22.a((CharSequence)bae.h().a("desc.mru." + this.n.a().d(), new Object[0]));
        ani_22.b();
        if (!this.d()) {
            switch (this.p) {
                case 1: {
                    ani_22.m().a(h).a((CharSequence)bae.h().a("error.playerNotSubscribed", new Object[0]));
                }
            }
        }
        return ani_22.r();
    }

    @Override
    public String r() {
        return null;
    }

    @Override
    public cSY n() {
        return cSY.K;
    }

    @Override
    public cSS v() {
        return new cUa(this.n);
    }

    public String toString() {
        return "MRUMonsterAction{m_action=" + this.n + ", m_busy=" + this.o + "}";
    }
}

