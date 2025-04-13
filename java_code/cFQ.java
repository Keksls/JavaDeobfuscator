/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cFQ
extends cGj {
    public static final String PACKAGE = "wakfu.characterSheet";

    public static void switchToCharacteristicsMode(fzs fzs2) {
        boolean bl = fis_1.a().c("characterSheetSecondMode");
        fis_1.a().a("characterSheetSecondMode", !bl);
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.N, !bl);
    }

    public static void openCloseAptitudes(fzs fzs2) {
        bmk_1 bmk_12 = (bmk_1)fis_1.a().d("characterSheet", "characterSheetDialog");
        if (bmk_12 != null && bmk_12.f() != azu_0.j().k().a_()) {
            fpm_0.b().a(new cFR(bmk_12));
        }
        det.a(2);
    }

    public static void highlightCharacteristic(fcp_2 fcp_22, bon_2 bon_22) {
        bmk_1 bmk_12 = (bmk_1)fis_1.a().d("characterSheet", ((fyb_0)fcp_22.e()).getElementMap());
        bor_1 bor_12 = bmk_12.l().cd();
        bor_12.a(bon_22.f(), fcp_22.j());
    }

    public static void displayAllCharacteristics(fcp_2 fcp_22) {
        cwu_0.a(fcp_22.j());
    }

    public static void dropView(fcx_1 fcx_12) {
        brn brn2 = (brn)fcx_12.k();
        if (brn2.c()) {
            return;
        }
        int n = fcx_12.v();
        int n2 = fcx_12.w();
        cwu_0.h().a(cxo_0.c(brn2.f()), "characterSheetWindow", n, n2);
    }

    public static void changeLevel(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(17219);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }
}

