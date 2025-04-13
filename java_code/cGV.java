/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGV {
    public static final String PACKAGE = "wakfu.fightAction";
    public static final int a = 5000;

    public static void endPlacement(fzs fzs2) {
        dfc.d((short)18331);
    }

    public static void fighterEndsTurn(fzs fzs2) {
        if (fis_1.a().c("isInFightPlacement")) {
            dfc.d((short)18331);
        } else {
            dfc.d((short)16279);
        }
    }

    public static void giveUpFight(fzs fzs2) {
        dfc.d((short)16302);
    }

    public static void callHelp(fzs fzs2) {
        fvk_0 fvk_02 = cxu_0.a().c();
        if (fvk_02 != null) {
            cGV.callHelp(fzs2, (fup_0)fvk_02.getElementMap().a("callHelpBtn"));
        }
    }

    public static void callHelp(fzs fzs2, fup_0 fup_02) {
        dfc.d((short)17645);
    }

    public static void reportCell(fzs fzs2, fru_0 fru_02) {
        dfc.d((short)17551);
        fru_02.setEnabled(false);
        ado_1.a().a(() -> fru_02.setEnabled(true), 5000L, 1);
    }

    public static void addFightMarker(fzs fzs2, fru_0 fru_02) {
        dfc.d((short)19861);
    }

    public static void tacticalViewNextMode(fzs fzs2) {
        dfc.d((short)19764);
    }

    public static void hideFighters(fck_2 fck_22) {
        dfc.d((short)16992);
    }

    public static void hideOccluders(fck_2 fck_22) {
        dfc.d((short)16468);
    }

    public static void openSpellsPage(fzs fzs2) {
        det.a(1);
    }
}

