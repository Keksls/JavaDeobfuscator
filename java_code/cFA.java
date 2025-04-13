/*
 * Decompiled with CFR 0.152.
 */
@Deprecated
@fpw_0
public class cFA {
    public static final String PACKAGE = "wakfu.aptitudeBonus";

    public static void validate(fck_2 fck_22) {
        add_2.b().a(new dfc(16814));
    }

    public static void displayList(fck_2 fck_22) {
        add_2.b().a(new dfc(17853));
    }

    public static void hideList(fck_2 fck_22) {
        add_2.b().a(new dfc(19684));
    }

    public static void selectPage(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(17663);
        dfc2.a(fcb_22.j());
        add_2.b().a(dfc2);
    }

    public static void modifyPage(fck_2 fck_22) {
        add_2.b().a(new dfc(17032));
    }

    public static void overAptitude(fcb_2 fcb_22) {
        cFA.overAptitude(fcb_22, (ajf_1)fcb_22.j());
    }

    public static void overAptitude(fzs fzs2, ajf_1 ajf_12) {
        fis_1.a().a("describedAptitude", ajf_12);
    }

    public static void increaseBonus(fzs fzs2, bko_2 bko_22, fso fso2, fru_0 fru_02) {
        cFA.a(fzs2, bko_22, fso2, fru_02, true);
    }

    public static void decreaseBonus(fzs fzs2, bko_2 bko_22, fso fso2, fru_0 fru_02) {
        cFA.a(fzs2, bko_22, fso2, fru_02, false);
    }

    public static void selectCategory(fzs fzs2, bkm_1 bkm_12) {
        dfc dfc2 = new dfc(16488);
        dfc2.a(bkm_12);
        add_2.b().a(dfc2);
    }

    public static void validateCommonAptitudePoints(fzs fzs2, fso fso2, fru_0 fru_02) {
        dfh_0 dfh_02 = new dfh_0();
        dfh_02.a_(16063);
        dfh_02.a(fso2);
        dfh_02.a(fru_02);
        add_2.b().a(dfh_02);
    }

    public static void cancelCommonAptitudePoints(fzs fzs2, fso fso2, fru_0 fru_02) {
        dfh_0 dfh_02 = new dfh_0();
        dfh_02.a_(16272);
        dfh_02.a(fso2);
        dfh_02.a(fru_02);
        add_2.b().a(dfh_02);
    }

    public static void changeSheetLevel(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(19832);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void onSheetNameChanged(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            fug_0 fug_02 = (fug_0)fcz_12.e();
            dfc dfc2 = new dfc(18100);
            dfc2.a(fug_02.getText());
            add_2.b().a(dfc2);
        }
    }

    public static void onSheetNameChanged(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        dfc dfc2 = new dfc(18100);
        dfc2.a(fug_02.getText());
        add_2.b().a(dfc2);
    }

    public static void setToCurrentBuildSheet(fck_2 fck_22) {
        add_2.b().a(new dfc(17098));
    }

    public static void addNewSheet(fck_2 fck_22) {
        bmr_1 bmr_12 = bkr_2.v.r();
        if (bmr_12 == null) {
            return;
        }
        ezy_2 ezy_22 = bmr_12.dA();
    }

    public static void restatOnePage(fck_2 fck_22) {
        add_2.b().a(new dfc(18272));
    }

    public static void restatAllPages(fck_2 fck_22) {
        add_2.b().a(new dfc(16022));
    }

    private static void a(fzs fzs2, bko_2 bko_22, fso fso2, fru_0 fru_02, boolean bl) {
        if (fzs2 instanceof fca_2) {
            if (chr_0.a.a()) {
                return;
            }
            dfg_0 dfg_02 = new dfg_0(bko_22);
            dfg_02.a(fso2);
            dfg_02.a(fru_02);
            dfg_02.a_(bl ? 18365 : 16987);
            dfg_02.b(((fca_2)fzs2).t() ? 10 : 1);
            chr_0.a.a(dfg_02, (fru_0)fzs2.e());
        }
    }
}

