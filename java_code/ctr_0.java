/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cTr
 */
public class ctr_0
extends cSS
implements afy_0 {
    @Override
    public cSY n() {
        return cSY.j;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bcf_1 bcf_12 = (bcf_1)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (bcf_12.c(biI2.ap())) {
            this.a();
        } else {
            apl_1 apl_12 = dei.a(biI2, bcf_12);
            if (apl_12.b()) {
                biI2.b(this);
                bmr_12.a(apl_12, true);
            } else {
                b.warn((Object)("Impossible de trouver un chemin jusqu'au sac " + this.l));
            }
        }
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bcf_1)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return !bvz_2.a.a() && !bmr_12.cW();
    }

    @Override
    public String r() {
        return "browseDimBagFlea";
    }

    @Override
    public cSS v() {
        return new ctr_0();
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    private void a() {
        bcf_1 bcf_12 = (bcf_1)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (!bcf_12.c(biI2.ap())) {
            return;
        }
        bpp_2 bpp_22 = new bpp_2(bcf_12);
        if (bpp_22.g()) {
            int n = bcf_12.G() - biI2.G();
            int n2 = bcf_12.H() - biI2.H();
            aej_2 aej_22 = aej_2.a(n, n2);
            if (biI2.aC() != aej_22) {
                ((afv)biI2).a(aej_22);
            }
            bpp_22.a();
            cWt.e().a(this.l, bpp_22);
        }
    }

    @Override
    protected int t() {
        return cUL.r.aH;
    }

    @Override
    public boolean d() {
        return !azu_0.j().n().f();
    }

    @Override
    public String q() {
        if (azu_0.j().n().f()) {
            ani_2 ani_22 = new ani_2().a().a(h);
            ani_22.a((CharSequence)bae.h().a("security.impossible.action.account.locked", new Object[0]));
            ani_22.b();
            return ani_22.r();
        }
        return super.q();
    }
}

