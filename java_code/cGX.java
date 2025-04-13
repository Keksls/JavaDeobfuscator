/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGX {
    public static final String PACKAGE = "wakfu.fightResult";

    public static void closeFightResultDialog(fzs fzs2) {
        dfc.d((short)16776);
    }

    public static void switchCompactMode(fzs fzs2) {
        dfc.d((short)17807);
    }

    public static void switchOtherTeamDisplay(fzs fzs2) {
        dfc.d((short)17214);
    }

    public static void enterPlusLootDots(fzs fzs2, bxg_1 bxg_12) {
        dfc dfc2 = new dfc(19680);
        dfc2.a(true);
        dfc2.a(bxg_12);
        add_2.b().a(dfc2);
    }

    public static void exitPlusLootDots(fzs fzs2) {
        dfc dfc2 = new dfc(19680);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void enterUiFocus(fzs fzs2) {
        dfc dfc2 = new dfc(19388);
        dfc2.a(true);
        add_2.b().a(dfc2);
    }

    public static void exitUiFocus(fzs fzs2) {
        dfc dfc2 = new dfc(19388);
        dfc2.a(false);
        add_2.b().a(dfc2);
    }

    public static void openItemDetails(fcb_2 fcb_22) {
        if (fcb_22.f() == frd_0.j && fcb_22.x() == 3) {
            cfq_0.sendOpenCloseItemDetailMessage(null, ((bwk_2)fcb_22.j()).a());
        }
    }
}

