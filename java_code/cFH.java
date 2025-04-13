/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cFH {
    public static final String PACKAGE = "wakfu.blindBox";

    public static void showItemDetails(fcb_2 fcb_22, fso fso2) {
        exi_2 exi_22 = (exi_2)fcb_22.j();
        fil_1 fil_12 = (fil_1)fso2.getElementMap().a("itemDetailPopup");
        if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
            fis_1.a().a("itemPopupDetail", exi_22);
            fis_1.a().a("isFromShortcut", false);
            fpu_0.popup(fil_12, (fvE)fcb_22.e());
        } else if (fcb_22.f() == frd_0.l) {
            fis_1.a().a("itemPopupDetail", (Object)null);
            fis_1.a().a("isFromShortcut", false);
            fis_1.a().a("isFromEquipedShortcut", false);
            fpu_0.closePopup(fcb_22, fil_12);
        }
    }

    public static void launch(fck_2 fck_22) {
        cwi_0.a().e();
    }
}

