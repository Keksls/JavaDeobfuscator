/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cWD
 */
public class cwd_0
extends cur_0 {
    private static final boolean b = false;
    private static final Logger c = Logger.getLogger(cwd_0.class);
    private static final cwd_0 d = new cwd_0();
    private btv_2 e;
    private ans_1 f;
    private ese_1 g;
    private bdv_0 h;

    public static cwd_0 d() {
        return d;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 16569: {
                dgL dgL2 = (dgL)adt_12;
                exk_2 exk_22 = dgL2.o();
                if (!this.a(exk_22)) {
                    return false;
                }
                this.e.a(exk_22);
                this.a(this.g.b(), exk_22.aT_());
                return false;
            }
            case 19253: {
                this.e.a(null);
                this.a(this.g.b(), 0);
                return false;
            }
        }
        return true;
    }

    private void a(long l, int n) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (!(bpc_22 instanceof bpz_2)) {
            return;
        }
        if (!this.a(bmr_12)) {
            return;
        }
        cnc_0 cnc_02 = new cnc_0(bmr_12.a_());
        cnc_02.a(new esi_2(l, n));
        azu_0.j().K().c(cnc_02);
    }

    private boolean a(bnh_1 bnh_12) {
        if (this.a.a() != bnh_12.fc()) {
            return false;
        }
        bos_2 bos_22 = bnh_12.eV();
        erl_1 erl_12 = bos_22.a(bnh_12.a_());
        if (erl_12 == null) {
            return false;
        }
        return bos_22.c(erl_12.d()).a(eQt.i);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.e == null) {
                return;
            }
            this.f = new cwe_0(this);
            fpm_0.b().a(this.f);
            fpm_0.b().a("wakfu.buildingPanel", cfl_0.class);
            fpm_0.b().a("havenWorldBuildingPanelDialog", cfi_0.a("havenWorldBuildingPanelDialog"), 1L, (short)10005);
            azu_0.j().k().bv().a(this);
            fis_1.a().a("selectedBuilding", this.e);
        }
        super.a(aav_22, bl);
    }

    @Override
    public ese_1 c() {
        return this.g;
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.h = null;
            this.e = null;
            fpm_0.b().b(this.f);
            cuo_0.e().b();
            fis_1.a().a("selectedBuilding");
            fpm_0.b().o("havenWorldBuildingPanelDialog");
            fpm_0.b().o("buildingEvolutionDialog");
            fpm_0.b().e("wakfu.buildingPanel");
            bmr_1 bmr_12 = azu_0.j().k();
            if (bmr_12 != null) {
                bmr_12.dN();
                bmr_12.bv().b(this);
            }
        }
        super.b(aav_22, bl);
    }

    @Override
    public void pathStarted(afe_0 afe_02, apl_1 apl_12) {
        azu_0.j().b(this);
    }

    @Override
    public void a(esl_1 esl_12) {
        super.a(esl_12);
        long l = this.h.Z();
        this.g = esl_12.a(l);
        if (this.g == null) {
            return;
        }
        this.e = bua_2.a.b(l);
    }

    public boolean a(exk_2 exk_22) {
        return this.g.a().b(exk_22.aT_());
    }

    public void b(exk_2 exk_22) {
        if (!azu_0.j().c(cwd_0.d())) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("havenWorldBuildingPanelDialog");
        boolean bl = this.a(exk_22);
        fso fso2 = (fso)fyy_02.a("frontSlot");
        azf_2 azf_22 = bl ? new azf_2(anr_0.U.i()) : azf_2.h;
        this.a(fso2, azf_22);
    }

    private void a(fso fso2, azj_2 azj_22) {
        fqj fqj2 = fso2.getAppearance();
        azf_2 azf_22 = new azf_2(azf_2.e.i());
        fqj2.removeTweensOfType(fjp_2.class);
        fqj2.setModulationColor(azf_22);
        fjp_2 fjp_22 = new fjp_2(azf_22, azj_22, fqj2, 0, 300, -1, fjw_2.b);
        fqj2.addTween(fjp_22);
    }

    public void e() {
        if (!azu_0.j().c(cwd_0.d())) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("havenWorldBuildingPanelDialog");
        fso fso2 = (fso)fyy_02.a("frontSlot");
        fso2.getAppearance().removeTweensOfType(fjp_2.class);
    }

    public void a(bdv_0 bdv_02) {
        this.h = bdv_02;
    }
}

