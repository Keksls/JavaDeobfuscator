/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from deV
 */
public class dev_0
implements dex_0 {
    private static final Logger a = Logger.getLogger(dev_0.class);

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17211: {
                this.a();
                return false;
            }
        }
        return true;
    }

    public void a() {
        bsx_2 bsx_22;
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        biI biI2 = bmr_12.bv();
        if (biI2.ba()) {
            aUh.a("bag.forbidden.moving", new Object[0]);
            return;
        }
        if (bmr_12.ak()) {
            return;
        }
        if (bmr_12.cW()) {
            return;
        }
        if (bvz_2.a.a()) {
            return;
        }
        if (!bmr_12.a(false, true)) {
            return;
        }
        if (!bmr_12.cY()) {
            return;
        }
        bmr_1 bmr_13 = azu_0.j().k();
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        if (cct_12 != null && cct_12.a()) {
            aUh.a("action.error.notInBattleground", new Object[0]);
            return;
        }
        if (azu_02.c(cxm_0.a())) {
            azu_02.b(cxm_0.a());
        }
        if ((bsx_22 = bmr_12.di()) != null) {
            biI2.a(aej_2.b);
            cdw_0.n().c(600066L);
            bmr_12.m(true);
            this.c();
            return;
        }
        if (!this.d()) {
            aUh.a("bag.forbiddenAtThisPosition", new Object[0]);
            return;
        }
        if (!this.e()) {
            aUh.a("bag.forbiddenInEnnemyTerritory", new Object[0]);
            return;
        }
        if (fpm_0.b().q("exchangeDialog")) {
            azu_02.b(cyc_0.d());
        }
        if (fpm_0.b().q("protectorManagementDialog")) {
            azu_02.b(dce.a());
        }
        if (fpm_0.b().q("weatherInfoDialog")) {
            azu_02.b(ddK.a());
        }
        if (azu_02.c(cye_0.a())) {
            azu_02.b(cye_0.a());
        }
        dan.a().d();
        biI2.a(aej_2.b);
        biI2.aW();
        this.b();
        cdw_0.n().c(600065L);
        bmr_12.m(true);
    }

    void b() {
        cpG cpG2 = new cpG();
        cpG2.a(0L);
        azu_0.j().K().c(cpG2);
    }

    private void c() {
        cpI cpI2 = new cpI();
        azu_0.j().K().c(cpI2);
    }

    private boolean d() {
        bmr_1 bmr_12 = azu_0.j().k();
        cct_1 cct_12 = ccs_1.a().a(bmr_12.T_());
        return bsv_2.a(bmr_12.gg(), cct_12);
    }

    private boolean e() {
        bmr_1 bmr_12 = azu_0.j().k();
        bmf_0 bmf_02 = bmr_12.dI();
        if (bmf_02 == null) {
            return true;
        }
        fgy_0 fgy_02 = bmf_02.h();
        faV faV2 = bmr_12.fE();
        return fgy_02 == null || bUD.a().a(faV2, fgy_02.F());
    }
}

