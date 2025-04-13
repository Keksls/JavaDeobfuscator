/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cFL
 */
@fpw_0
public class cfl_0
extends cHn {
    private static final Logger a = Logger.getLogger(cfl_0.class);
    public static final String PACKAGE = "wakfu.buildingPanel";

    public static void evolveBuilding(fzs fzs2) {
        cfl_0.evolveBuilding(fzs2, (btv_2)fis_1.a().e("selectedBuilding"));
    }

    public static void deleteBuilding(fzs fzs2) {
        fzm_0 fzm_02 = cfl_0.createDeleteMessageBox();
        fzm_02.a(new cFM());
    }

    public static fzm_0 createDeleteMessageBox() {
        String string = bae.h().a("question.havenWorldDeleteBuilding", new Object[0]);
        fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
        return fpm_0.b().a(fzn_02);
    }

    public static void deleteBuilding(long l) {
        bmr_1 bmr_12 = azu_0.j().k();
        esh_2 esh_22 = new esh_2(l);
        cnc_0 cnc_02 = new cnc_0(bmr_12.a_());
        cnc_02.a(esh_22);
        azu_0.j().K().c(cnc_02);
    }

    public static void dropFrontManual(fcv_2 fcv_22) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        cwd_0.d().e();
        exk_2 exk_22 = (exk_2)fcv_22.n();
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a_(16569);
        add_2.b().a(dgL2);
    }

    public static void removeFrontManual(fcp_1 fcp_12) {
        dfc.d((short)19253);
    }
}

