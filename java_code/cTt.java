/*
 * Decompiled with CFR 0.152.
 */
public class cTt
extends cSS
implements afy_0 {
    private bcf_1 a;

    @Override
    public cSS v() {
        return new cTt();
    }

    @Override
    public boolean c() {
        if (!(this.l instanceof bcf_1)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (cct_12 != null && cct_12.f() == Xd.b) {
            return false;
        }
        if (bmr_12.ab_()) {
            return false;
        }
        if (bmr_12.cW()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        return !bmr_12.ak();
    }

    @Override
    public boolean d() {
        bcf_1 bcf_12 = (bcf_1)this.l;
        if (bcf_12.ao() && emp_0.a(azu_0.j().n().v(), emp_0.b)) {
            return false;
        }
        return super.d() && cTt.a() && !cTt.b();
    }

    private static boolean a() {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.di() != null) {
            return true;
        }
        bmf_0 bmf_02 = bmr_12.dI();
        if (bmf_02 == null) {
            return true;
        }
        fgy_0 fgy_02 = bmf_02.h();
        if (fgy_02 == null) {
            return true;
        }
        faV faV2 = bmr_12.fE();
        return bUD.a().a(faV2, fgy_02.F());
    }

    private static boolean b() {
        bmr_1 bmr_12 = azu_0.j().k();
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        return cct_12 != null && cct_12.a();
    }

    private void e() {
        cpG cpG2 = new cpG();
        cpG2.a(this.a.Z().q());
        azu_0.j().K().c(cpG2);
    }

    @Override
    public void o() {
        if (!this.c()) {
            b.error((Object)("Tentative de lancement de l'action '" + this.n().e() + "' alors que isRunnable retourne que l'action est impossible"));
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bmr_12.a(false, false);
        this.a = (bcf_1)this.l;
        aff_1 aff_12 = afh_1.a(bmr_12.gg(), this.a.aK_());
        if (aff_12 == null) {
            return;
        }
        if (aff_12.e(bmr_12.gg()) == 0) {
            int n = this.a.G() - bmr_12.G();
            int n2 = this.a.H() - bmr_12.H();
            bmr_12.a(afs_2.a(n, n2));
            this.e();
        } else {
            bmr_12.bv().b(this);
            bmr_12.b(aff_12, false, true);
        }
    }

    @Override
    public cSY n() {
        return cSY.i;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        int n3 = this.a.G() - afe_02.G();
        int n4 = this.a.H() - afe_02.H();
        if (Math.abs(n3) <= 1 && Math.abs(n4) <= 1) {
            afe_02.a(afs_2.a(n3, n4));
            this.e();
        }
    }

    @Override
    protected int t() {
        return cUL.G.aH;
    }

    @Override
    public String q() {
        ani_2 ani_22 = new ani_2().a().a(this.d() ? f : h);
        ani_22.a((CharSequence)bae.h().a(this.r(), new Object[0]));
        ani_22.b();
        return ani_22.r();
    }

    @Override
    public String r() {
        bcf_1 bcf_12 = (bcf_1)this.l;
        if (bcf_12.ao()) {
            return "bag.forbiddenLocked";
        }
        if (!cTt.a()) {
            return "bag.forbiddenInEnnemyTerritory";
        }
        if (cTt.b()) {
            return "action.error.notInBattleground";
        }
        return "desc.mru.bagEnterOther";
    }
}

