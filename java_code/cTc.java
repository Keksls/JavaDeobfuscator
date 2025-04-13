/*
 * Decompiled with CFR 0.152.
 */
public class cTc
extends cSS
implements afy_0 {
    protected aff_1 a;

    @Override
    public cSY n() {
        return cSY.J;
    }

    @Override
    public void o() {
        if (!this.c()) {
            return;
        }
        aff_1 aff_12 = this.a();
        bmr_1 bmr_12 = azu_0.j().k();
        this.a = aff_12;
        if (!bmr_12.a(false, true)) {
            return;
        }
        bmr_12.bv().b(this);
        if (!bmr_12.b(this.a, false, true)) {
            bmr_12.bv().c(this);
            aff_1 aff_13 = bmr_12.bv().ap();
            if (Math.abs(aff_13.d() - this.a.d()) <= 1 && Math.abs(aff_13.e() - this.a.e()) <= 1) {
                this.e();
                this.b();
                return;
            }
            aUh.a("fight.no.path.to.border", new Object[0]);
        }
    }

    private void b() {
        int n = ((blx_1)this.l).bA();
        if (aPc.f().g() == n) {
            return;
        }
        cmn_0 cmn_02 = new cmn_0();
        cmn_02.b(n);
        azu_0.j().K().c(cmn_02);
    }

    public aff_1 a() {
        blx_1 blx_12 = (blx_1)this.l;
        bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
        if (bwh_02 == null) {
            return null;
        }
        aff_1 aff_12 = this.a(bwh_02);
        return aff_12;
    }

    private aff_1 a(bwh_0 bwh_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        aff_1 aff_12 = bmr_12.P_();
        aff_1 aff_13 = new aff_1(aff_12);
        int n = Integer.MAX_VALUE;
        tg_0 tg_02 = bwh_02.g();
        int n2 = tg_02.z();
        int n3 = tg_02.A();
        aff_1 aff_14 = new aff_1();
        block0: for (int k = n2; k < n2 + tg_02.B(); ++k) {
            for (int i2 = n3; i2 < n3 + tg_02.C(); ++i2) {
                short s2;
                int n4;
                if (!tg_02.a(k, i2) || (n4 = aff_12.b(k, i2, s2 = tg_02.i(k, i2))) >= n) continue;
                aff_14.c(k, i2, s2);
                this.a(bwh_02, aff_14);
                if (aff_14.b(k, i2) || !yz_0.j(aff_14.d(), aff_14.e(), aff_14.f())) continue;
                n = n4;
                aff_13.g(aff_14);
                if (n == 0) continue block0;
            }
        }
        return aff_13;
    }

    private aff_1 a(bwh_0 bwh_02, aff_1 aff_12) {
        tg_0 tg_02 = bwh_02.g();
        if (!tg_02.c(aff_12.d() + 1, aff_12.e())) {
            aff_12.a(1, 0, 0);
        } else if (!tg_02.c(aff_12.d(), aff_12.e() + 1)) {
            aff_12.a(0, 1, 0);
        } else if (!tg_02.c(aff_12.d() - 1, aff_12.e())) {
            aff_12.c(1, 0, 0);
        } else if (!tg_02.c(aff_12.d(), aff_12.e() - 1)) {
            aff_12.c(0, 1, 0);
        }
        return aff_12;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        afe_02.c(this);
        if (this.a.d() != n || this.a.e() != n2) {
            return;
        }
        this.e();
        this.b();
    }

    private void e() {
        aej_2 aej_22;
        bmr_1 bmr_12 = azu_0.j().k();
        blx_1 blx_12 = (blx_1)this.l;
        bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
        if (bwh_02 != null && (aej_22 = bmr_12.P_().b(bwh_02.g().s())) != null) {
            bmr_12.bv().b(aej_22);
        }
    }

    @Override
    public boolean c() {
        if (!enp_2.a.d(ens_2.aG)) {
            return false;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12.ak()) {
            return false;
        }
        if (bvz_2.a.a()) {
            return false;
        }
        if (bmr_12.cP() != null) {
            return false;
        }
        if (this.l instanceof blx_1) {
            return ((blx_1)this.l).ak() && !((blx_1)this.l).ab_();
        }
        return false;
    }

    @Override
    public String r() {
        return "becameFightSpectator";
    }

    @Override
    public cSS v() {
        return new cTc();
    }

    @Override
    protected int t() {
        return cUL.af.aH;
    }
}

