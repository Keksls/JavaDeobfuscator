/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJj
 */
@fpw_0
public class cjj_0 {
    public static final String PACKAGE = "wakfu.playerGift";

    public static void packageListOffset(fzs fzs2, fsQ fsQ2, String string) {
        float f2 = Co.e(string);
        fsQ2.setListOffset(fsQ2.getOffset() + f2);
    }

    public static void consumeOneGift(fzs fzs2, bxg_2 bxg_22) {
        dhk_0 dhk_02 = new dhk_0(bxg_22);
        dhk_02.a(false);
        dhk_02.a_(18005);
        add_2.b().a(dhk_02);
    }

    public static void consumeAllGifts(fzs fzs2, bxg_2 bxg_22) {
        dhk_0 dhk_02 = new dhk_0(bxg_22);
        dhk_02.a(true);
        dhk_02.a_(18005);
        add_2.b().a(dhk_02);
    }

    public static void selectGiftPackage(fcb_2 fcb_22) {
        dhl_0 dhl_02 = new dhl_0((bxi_2)fcb_22.j());
        dhl_02.a_(18694);
        add_2.b().a(dhl_02);
    }

    public static void showItemDetailPopup(fcb_2 fcb_22) {
        bxg_2 bxg_22 = (bxg_2)fcb_22.j();
        cJl.showPopup(bxg_22.a(), 0);
    }

    public static void hideItemDetailPopup(fcb_2 fcb_22) {
        bxg_2 bxg_22 = (bxg_2)fcb_22.j();
        cJl.hidePopup(fcb_22, bxg_22.a());
    }

    public static void openCloseDialog(fzs fzs2) {
        dfc.d((short)19692);
    }

    public static void openItemDetails(fzs fzs2, bxg_2 bxg_22, fvk_0 fvk_02) {
        if (((fck_2)fzs2).x() != 1) {
            dgE dgE2;
            bjw_1 bjw_12 = bxg_22.a();
            exk_2 exk_22 = new exk_2(bjw_12.n());
            exk_22.b(bjw_12);
            exk_22.a((short)1);
            if (exk_22.aQ_()) {
                dgE2 = new dgO<bMi>(new bMi(exk_22));
                dgE2.a_(18168);
            } else {
                dgE2 = new dgK();
                dgE2.a_(16130);
                dgE2.a(exk_22);
            }
            dgE2.b(fvk_02 == null ? null : fvk_02.getElementMap().c());
            add_2.b().a(dgE2);
        }
    }
}

