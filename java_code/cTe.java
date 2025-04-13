/*
 * Decompiled with CFR 0.152.
 */
public class cTe
extends cSS
implements afy_0 {
    @Override
    public cSY n() {
        return cSY.s;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bel_0 bel_02 = (bel_0)this.l;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (!bel_02.aB_() && bel_02.c(biI2.ap()) || bel_02.aB_() && biI2.ap().b(bel_02.G(), bel_02.H(), (int)bel_02.I())) {
            this.a();
        } else {
            apl_1 apl_12 = dei.a(biI2, bel_02);
            if (apl_12.b()) {
                biI2.b(this);
                bmr_12.a(apl_12, true);
            } else {
                b.warn((Object)("Impossible de trouver un chemin jusqu'\u00e0 la vitrine " + this.l));
            }
        }
    }

    @Override
    public boolean c() {
        bpc_2 bpc_22;
        if (!(this.l instanceof bel_0)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bvz_2.a.a() || bmr_12.cW()) {
            return false;
        }
        bel_0 bel_02 = (bel_0)this.l;
        if (bel_02.m() == bmr_12.a_()) {
            return false;
        }
        this.c(true);
        bsx_2 bsx_22 = bmr_12.di();
        if (bsx_22 != null && !bsx_22.a(bmr_12, bel_02.G(), bel_02.H())) {
            this.c(false);
        }
        if (!((bpc_22 = bmr_12.eE()) instanceof bpg_2)) {
            return true;
        }
        bpg_2 bpg_22 = (bpg_2)bpc_22;
        return bpg_22.j() != bel_02.ap();
    }

    @Override
    public String r() {
        return "browseFlea";
    }

    @Override
    public cSS v() {
        return new cTe();
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        this.a();
    }

    private void a() {
        bmr_1 bmr_12 = azu_0.j().k();
        bel_0 bel_02 = (bel_0)this.l;
        biI biI2 = bmr_12.bv();
        if (bel_02.aB_() ? !biI2.ap().b(bel_02.G(), bel_02.H(), (int)bel_02.I()) : !bel_02.c(biI2.ap())) {
            return;
        }
        bpg_2 bpg_22 = new bpg_2(bmr_12.di(), bel_02);
        if (bpg_22.g()) {
            int n = bel_02.G() - biI2.G();
            int n2 = bel_02.H() - biI2.H();
            aej_2 aej_22 = aej_2.a(n, n2);
            if (biI2.aC() != aej_22) {
                ((afv)biI2).a(aej_22);
            }
            bpg_22.a();
            cWw.e().a(this.l, bpg_22);
        }
    }

    @Override
    protected int t() {
        return cUL.r.aH;
    }
}

