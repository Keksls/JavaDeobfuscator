/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cHn {
    public static final String PACKAGE = "wakfu.havenWorld";

    public static void evolveBuilding(fzs fzs2) {
        cHn.evolveBuilding(fzs2, (btv_2)fis_1.a().e("selectedBuilding"));
    }

    public static void evolveBuilding(fzs fzs2, btv_2 btv_22) {
        etw_2 etw_22 = btv_22.j().g();
        etg_2 etg_22 = eti_2.a.b(etw_22.a());
        if (etg_22 != null) {
            etw_2 etw_23 = eti_2.a.a(etg_22.c());
            etk_2 etk_22 = eti_2.a.c(etw_23.d());
            bti_2 bti_22 = new bti_2(btv_22.g(), etw_22, etk_22, ddZ.d().j());
            fis_1.a().a("buildingEvolution", bti_22);
            cHn.loadEvolveBuildingDialog(fzs2);
        }
    }

    public static void loadEvolveBuildingDialog(fzs fzs2) {
        fpm_0.b().a("buildingEvolutionDialog", cfi_0.a("buildingEvolutionDialog"), 256L, (short)10005);
    }

    public static void payEvolution(fzs fzs2) {
        bmr_1 bmr_12 = azu_0.j().k();
        bpc_2 bpc_22 = bmr_12.eE();
        if (!(bpc_22 instanceof bpz_2)) {
            return;
        }
        bti_2 bti_22 = (bti_2)fis_1.a().e("buildingEvolution");
        if (bti_22 == null) {
            return;
        }
        long l = bti_22.c();
        cnc_0 cnc_02 = new cnc_0(bmr_12.a_());
        esj_2 esj_22 = new esj_2(l);
        cnc_02.a(esj_22);
        azu_0.j().K().c(cnc_02);
        if (azu_0.j().c(cwd_0.d())) {
            azu_0.j().b(cwd_0.d());
        } else {
            fpm_0.b().o("buildingEvolutionDialog");
        }
    }
}

