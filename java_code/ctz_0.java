/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTZ
 */
public class ctz_0
extends cSS
implements afy_0 {
    private fii a;

    @Override
    public cSY n() {
        return cSY.Q;
    }

    @Override
    public cSS v() {
        return new ctz_0();
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bEh bEh2 = (bEh)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (bEh2.c(biI2.ap())) {
            this.a();
            return;
        }
        biI2.b(this);
        b.info((Object)("Searching path to " + bEh2));
        bmr_12.a(dei.a(biI2, bEh2), true);
    }

    @Override
    public String q() {
        String string = super.q();
        ani_2 ani_22 = new ani_2();
        ani_22.a((CharSequence)string);
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() != 14) {
            ani_22.m().i().a(h).a((CharSequence)bae.h().a("error.localPlayerBusy", new Object[0])).j();
        } else if (!bmr_12.a(enw_0.g)) {
            ani_22.m().i().a(h).a((CharSequence)bae.h().a("error.playerNotSubscriptionRight", new Object[0])).j();
        }
        return ani_22.r();
    }

    @Override
    public boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() != 14) {
            return false;
        }
        if (!bmr_12.a(enw_0.g)) {
            return false;
        }
        return super.d();
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bEh)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return !bmr_12.cW() && !bmr_12.ak() && !bvz_2.a.a();
    }

    @Override
    public String r() {
        return this.a.d();
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    private void a() {
        bqa_2 bqa_22 = new bqa_2((bEh)this.l);
        if (bqa_22.g()) {
            bqa_22.a();
        }
    }

    public void a(int n) {
        this.a = fij.a().a(n);
    }

    @Override
    protected int t() {
        return this.a.c();
    }

    public String toString() {
        return "MRUMarketAction{m_actionVisual=" + this.a + "}";
    }
}

