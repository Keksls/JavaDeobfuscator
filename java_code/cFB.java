/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cFB {
    public static final String PACKAGE = "wakfu.arcadeDungeon";

    public static void closeArcadeDungeonDetailSmallDialog(fzs fzs2) {
        fis_1.a().a("arcadeDungeonDetailsVisible", false);
    }

    public static void onArcadeDungeonCheckBoxOver(fzs fzs2, fvE fvE2) {
        fvE2.setVisible(true);
    }

    public static void onArcadeDungeonCheckBoxOut(fzs fzs2, fvE fvE2) {
        fup_0 fup_02 = (fup_0)fzs2.e();
        if (!fup_02.getSelected()) {
            fvE2.setVisible(false);
        }
    }

    public static void openCloseArcadeDungeonSmallDialog(fcp_2 fcp_22, fvE fvE2) {
        fvE2.setVisible(fcp_22.j());
    }

    public static void showItemDetails(fcb_2 fcb_22, fso fso2) {
        bjw_1 bjw_12;
        Object object;
        Object object2 = fcb_22.j();
        if (object2 instanceof bgs) {
            object = (bgs)object2;
            eel_0 eel_02 = ((bgs)object).b();
            if (eel_02.a() != eem_0.a) {
                fil_1 fil_12 = (fil_1)fso2.getElementMap().a("rewardPopup");
                if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                    fis_1.a().a("desc.reward", (Object)((bgs)object).a());
                    fpu_0.popup(fil_12, (fvE)fcb_22.e());
                } else if (fcb_22.f() == frd_0.l) {
                    fpu_0.closePopup(fcb_22, fil_12);
                    fis_1.a().a("desc.reward", (Object)null);
                }
                return;
            }
            bjw_12 = eyo_1.g().d(eel_02.b());
        } else {
            bjw_12 = (bjw_1)object2;
        }
        object = (fil_1)fso2.getElementMap().a("itemDetailPopup");
        if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
            fis_1.a().a("itemPopupDetail", bjw_12);
            fis_1.a().a("isFromShortcut", false);
            fpu_0.popup((fil_1)object, (fvE)fcb_22.e());
        } else if (fcb_22.f() == frd_0.l) {
            fis_1.a().a("itemPopupDetail", (Object)null);
            fis_1.a().a("isFromShortcut", false);
            fis_1.a().a("isFromEquipedShortcut", false);
            fpu_0.closePopup(fcb_22, (fil_1)object);
        }
    }
}

