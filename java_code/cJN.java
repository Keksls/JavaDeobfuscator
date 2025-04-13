/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cJN {
    public static final String PACKAGE = "wakfu.stele";

    public static void changeDifficulty(fcf_2 fcf_22) {
        Object object = fcf_22.l();
        if (!(object instanceof bPT)) {
            return;
        }
        dhD dhD2 = new dhD((bPT)object, fcf_22.k());
        add_2.b().a(dhD2);
    }

    public static void displayDifficultyState(fck_2 fck_22, bPT bPT2, fvE fvE2) {
        if (fck_22.x() != 3) {
            return;
        }
        dgo_0 dgo_02 = new dgo_0();
        dgo_02.a(bPT2.e());
        dgo_02.a(fvE2.getElementMap().c());
        add_2.b().a(dgo_02);
    }

    public static void toggleReward(fck_2 fck_22, bPV bPV2) {
        if (!bPV2.e()) {
            return;
        }
        if (fck_22.x() != 1) {
            return;
        }
        dhE dhE2 = new dhE(bPV2);
        add_2.b().a(dhE2);
    }

    public static void activate(fzs fzs2) {
        dfc dfc2 = new dfc(17666);
        add_2.b().a(dfc2);
    }

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02) {
        Object object = fcb_22.j();
        if (!(object instanceof bPV)) {
            return;
        }
        bPV bPV2 = (bPV)object;
        exk_2 exk_22 = bPV2.h();
        cgo_0.openItemDetailWindow((fck_2)fcb_22, fvk_02, exk_22);
    }
}

