/*
 * Decompiled with CFR 0.152.
 */
public class cTY
extends cSS {
    @Override
    public cSY n() {
        return cSY.F;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        bmv_1 bmv_12 = (bmv_1)this.l;
        bMn bMn2 = bmv_12.cB();
        if (bMn2 != null) {
            bmr_1 bmr_12 = azu_0.j().k();
            if (!bmr_12.a(false, true)) {
                return;
            }
            this.b();
        }
    }

    private void a() {
        bmv_1 bmv_12 = (bmv_1)this.l;
        bMn bMn2 = bmv_12.cB();
        if (bMn2 != null) {
            cqs_0 cqs_02 = new cqs_0();
            cqs_02.b(bMn2.B());
            ans_0.D();
            ans_0.F().K().c(cqs_02);
        } else {
            b.error((Object)("Tentative de management d'un protecteur inconnu source=" + this.l));
        }
    }

    private void b() {
        if (!azu_0.j().c(dce.a())) {
            azu_0.j().a(dce.a());
        }
    }

    @Override
    public boolean c() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        faV faV2 = bmr_12.fE();
        if (!(this.l instanceof bmv_1)) {
            return false;
        }
        bMn bMn2 = ((bmv_1)this.l).cB();
        if (bMn2 == null) {
            return false;
        }
        int n = bMs.a.b(bMn2);
        return n != -1 && n != 0 && n == faV2.n();
    }

    @Override
    public String r() {
        fcs_0 fcs_02 = bUW.a().x().D();
        fcq_0 fcq_02 = fcs_02.b(azu_0.j().k().a_());
        return fcq_02 != null && fcv_0.a(fcq_02.b()) ? "manageProtector" : "seeProtector";
    }

    @Override
    public cSS v() {
        return new cTY();
    }

    @Override
    protected int t() {
        return cUL.r.aH;
    }
}

