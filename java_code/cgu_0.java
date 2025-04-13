/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.ankamagames.wakfu.client.console.command.commonIn.MapCommand;
import com.google.common.base.Strings;

/*
 * Renamed from cGu
 */
@fpw_0
public class cgu_0 {
    public static final String PACKAGE = "wakfu.crafts";

    public static void openLinkedBook(fzs fzs2) {
        ((brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c())).c();
    }

    public static void selectCraft(fcb_2 fcb_22) {
        dfH dfH2 = new dfH((brg_1)fcb_22.j());
        add_2.b().a(dfH2);
    }

    public static void scrollCraft(fck_2 fck_22) {
        cxa_0.a().a(fck_22);
    }

    public static void scrollRecipe(fck_2 fck_22) {
        cxa_0.a().b(fck_22);
    }

    public static void checkOkFilter(fzs fzs2) {
        ((brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c())).s();
    }

    public static void checkUpgradeFilter(fzs fzs2) {
        ((brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c())).t();
    }

    public static void checkXpFilter(fzs fzs2) {
        ((brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c())).u();
    }

    public static void validNameFilter(fzs fzs2, fuh_0 fuh_02) {
        brg_1 brg_12 = (brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c());
        String string = fuh_02.getText();
        if (!string.equals(brg_12.r())) {
            brg_12.a(string);
        }
    }

    public static void validMinLevelFilter(fzs fzs2, fug_0 fug_02) {
        brg_1 brg_12 = (brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c());
        short s2 = -1;
        String string = fug_02.getText();
        if (string != null && string.length() > 0) {
            s2 = Co.h(string);
        }
        if (s2 != brg_12.E()) {
            brg_12.a(s2);
        }
    }

    public static void validMaxLevelFilter(fzs fzs2, fug_0 fug_02) {
        brg_1 brg_12 = (brg_1)fis_1.a().d("craft", ((fyb_0)fzs2.e()).getElementMap().c());
        short s2 = Short.MAX_VALUE;
        String string = fug_02.getText();
        if (string != null && string.length() > 0) {
            s2 = Co.h(string);
        }
        if (s2 != brg_12.F()) {
            brg_12.b(s2);
        }
    }

    public static void previousPage(fzs fzs2, brg_1 brg_12) {
        int n = brg_12.D() - 1;
        if (n < 0) {
            return;
        }
        brg_12.b(n);
    }

    public static void nextPage(fzs fzs2, brg_1 brg_12) {
        int n = brg_12.D() + 1;
        if (n >= brg_12.B()) {
            return;
        }
        brg_12.b(n);
    }

    public static void firstPage(fzs fzs2, brg_1 brg_12) {
        brg_12.b(0);
    }

    public static void lastPage(fzs fzs2, brg_1 brg_12) {
        int n = brg_12.B() - 1;
        brg_12.b(n);
    }

    public static void displayRecipesWithIngredient(fzs fzs2, brr_0 brr_02) {
        cxa_0.a().c(brr_02.g());
    }

    public static void displayLinkedZones(fzs fzs2, brr_0 brr_02) {
        cxa_0.a().a(brr_02.j(), brr_02.k());
    }

    public static void displayRecipesWithIngredient(fzs fzs2, brw_0 brw_02) {
        cxa_0.a().c(brw_02.h().n());
    }

    public static void onCraftTypeChanged(fcp_2 fcp_22, String string) {
    }

    public static void onCraftTypeChanged(fcp_2 fcp_22, String string, brg_1 brg_12) {
        if (!fcp_22.j()) {
            return;
        }
        int n = Integer.parseInt(string);
        brg_12.a(brf_1.a((byte)n));
        fis_1.a().a("craftDisplayType", (byte)n);
    }

    public static void openIngredientDescription(fck_2 fck_22, brk_1 brk_12, fvk_0 fvk_02) {
        if (fck_22.x() != 3) {
            return;
        }
        cfq_0.sendOpenCloseItemDetailMessage(fvk_02 == null ? null : fvk_02.getElementMap().c(), brk_12.a());
    }

    public static void openProducedItemDescription(fcb_2 fcb_22, fvk_0 fvk_02) {
        if (fcb_22.j() instanceof brw_0) {
            cgu_0.openProducedItemDescription((fck_2)fcb_22, (brw_0)fcb_22.j(), fvk_02);
        } else if (fcb_22.j() instanceof brr_0) {
            cgu_0.openProducedItemDescription((fck_2)fcb_22, (brr_0)fcb_22.j(), fvk_02);
        }
    }

    public static void expandJobInLinkedRecipes(fck_2 fck_22, brl_1 brl_12) {
        brl_12.a(!brl_12.n());
        fis_1.a().a((ajf_1)brl_12, "isExpanded");
    }

    public static void expandWorldInLinkedZones(fck_2 fck_22, brn_1 brn_12) {
        brn_12.a(!brn_12.a());
        fis_1.a().a((ajf_1)brn_12, "isExpanded");
    }

    public static void firstPage(fck_2 fck_22, brl_1 brl_12) {
        brl_12.q();
    }

    public static void previousPage(fck_2 fck_22, brl_1 brl_12) {
        brl_12.r();
    }

    public static void nextPage(fck_2 fck_22, brl_1 brl_12) {
        brl_12.s();
    }

    public static void lastPage(fck_2 fck_22, brl_1 brl_12) {
        brl_12.t();
    }

    public static void openProducedItemDescription(fck_2 fck_22, brr_0 brr_02, fvk_0 fvk_02) {
        if (fck_22.x() != 3) {
            return;
        }
        Object r2 = eyo_1.g().d(brr_02.g());
        if (r2 == null) {
            return;
        }
        exk_2 exk_22 = new exk_2(((ezr_0)r2).n());
        exk_22.b((ezr_0)r2);
        dgK dgK2 = new dgK();
        dgK2.a_(16130);
        dgK2.b(fvk_02 == null ? null : fvk_02.getElementMap().c());
        dgK2.a(exk_22);
        add_2.b().a(dgK2);
    }

    public static void openProducedItemDescription(fck_2 fck_22, brw_0 brw_02, fvk_0 fvk_02) {
        if (fck_22.x() != 3) {
            return;
        }
        bjw_1 bjw_12 = brw_02.h();
        cfq_0.sendOpenCloseItemDetailMessage(fvk_02 == null ? null : fvk_02.getElementMap().c(), bjw_12);
    }

    public static void outRecipe(fzs fzs2, fsk_0 fsk_02) {
        cgu_0.outRecipe(fzs2, fsk_02, null);
    }

    public static void overRecipe(fzs fzs2, fsk_0 fsk_02) {
        cgu_0.overRecipe(fzs2, fsk_02, null);
    }

    public static void outRecipe(fzs fzs2, fsk_0 fsk_02, fvE fvE2) {
        fsk_02.setDisplaySize(new fjf_2(46, 46));
        if (fvE2 != null) {
            fvE2.setVisible(false);
        }
    }

    public static void overRecipe(fzs fzs2, fsk_0 fsk_02, fvE fvE2) {
        fsk_02.setDisplaySize(new fjf_2(50, 50));
        if (fvE2 != null) {
            fvE2.setVisible(true);
        }
    }

    public static void switchToFreeMode(fcp_2 fcp_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(19745);
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void overJobTitle(fck_2 fck_22, brl_1 brl_12) {
        brl_12.b(true);
    }

    public static void outJobTitle(fck_2 fck_22, brl_1 brl_12) {
        brl_12.b(false);
    }

    public static void overWorldTitle(fck_2 fck_22, brn_1 brn_12) {
        brn_12.b(true);
    }

    public static void outWorldTitle(fck_2 fck_22, brn_1 brn_12) {
        brn_12.b(false);
    }

    public static void onCompassClick(fck_2 fck_22, brm_1 brm_12) {
        MapCommand.b();
        bLP bLP2 = blf_1.a((long)((short)brm_12.c()), true);
        bLP bLP3 = blf_1.a(brm_12.b(), (short)brm_12.c());
        ble_1.E().a(bLP3 != null ? bLP3 : bLP2);
    }

    public static void toggleLevelSort(fzs fzs2) {
        add_2.b().a(new dfc(16216));
    }

    public static void toggleRegisterView(fck_2 fck_22, brg_1 brg_12) {
        fit_1 fit_12 = fis_1.a().f("craftDisplayType");
        if (fit_12 != null && ((Byte)fit_12.f()).byteValue() == brf_1.c.a()) {
            fis_1.a().a("craftDisplayType", brf_1.a.a());
            brg_12.a(brf_1.a);
            return;
        }
        fis_1.a().a("craftDisplayType", brf_1.c.a());
    }

    public static void setCraftServiceMinLevel(fzs fzs2, fug_0 fug_02, brg_1 brg_12) {
        String string = fug_02.getText();
        if (Strings.isNullOrEmpty((String)string)) {
            return;
        }
        try {
            int n = Integer.parseInt(string);
            dfc dfc2 = new dfc(16846);
            dfc2.b(n);
            dfc2.a(brg_12);
            add_2.b().a(dfc2);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public static void toggleCraftServiceEnabled(fck_2 fck_22, brg_1 brg_12) {
        dfc dfc2 = new dfc(17449);
        dfc2.a(brg_12);
        add_2.b().a(dfc2);
    }

    public static void saveRegistrationChanges(fzs fzs2) {
        add_2.b().a(new dfc(17650));
    }

    public static void cancelRegistrationChanges(fzs fzs2) {
        add_2.b().a(new dfc(17458));
    }

    public static void changeArtisanStatus(fzs fzs2, String string) {
        boolean bl = "1".equals(string);
        dfc dfc2 = new dfc(17758);
        dfc2.a(bl);
        add_2.b().a(dfc2);
    }

    public static void clickOnRecipeIngredient(fcb_2 fcb_22) {
        cHE.a((fck_2)fcb_22, fcb_22.j());
    }

    public static void clickOnRecipeResult(fck_2 fck_22, brw_0 brw_02) {
        cHE.a(fck_22, brw_02);
    }
}

