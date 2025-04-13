/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cGA
 */
@fpw_0
public class cga_0 {
    public static final String PACKAGE = "wakfu.dimensionalBagFlea";
    private static final Logger a = Logger.getLogger(cga_0.class);
    private static boolean b = false;
    private static adv_1 c;

    public static void closeDimensionalBagFleaDialog(fzs fzs2) {
        a.error((Object)"DimensionalBagFleaDialog.closeDimensionalBagFleaDialog()");
        if (fpm_0.b().q("dimensionalBagFleaDialog")) {
            cga_0.a();
        }
    }

    private static void a() {
        fis_1.a().a("showRoomBagDetails", false);
        azu_0.j().b(dao.d());
    }

    public static void setShortAd(fzs fzs2, fzz fzz2) {
        fcz_1 fcz_12;
        if (fzs2 instanceof fcz_1 && (fcz_12 = (fcz_1)fzs2).e() == fcz_12.d() && !fcz_12.j() && !fzz2.isValid()) {
            fpm_0.b().a(bae.h().a("error.flea.invalidAd", new Object[0]), cfn_0.a(1), 1027L, 102, 1);
        }
    }

    public static void itemDropOut(fcx_1 fcx_12) {
        if (fcx_12.l() instanceof bHN) {
            bHN bHN2 = (bHN)fcx_12.l();
            if (!fcx_12.t() || bHN2.e() <= 1) {
                dfb_0 dfb_02 = new dfb_0();
                dfb_02.a(bHN2);
                dfb_02.a_(16751);
                add_2.b().a(dfb_02);
            }
        }
    }

    public static void removeMarketItem(fzs fzs2, bHN bHN2) {
        dfb_0 dfb_02 = new dfb_0();
        dfb_02.a(bHN2);
        dfb_02.a_(16751);
        add_2.b().a(dfb_02);
    }

    public static void onMouseEnterIntersection(fzs fzs2, fbf_1 fbf_12) {
        if (fta_0.getInstance().isDragging()) {
            fbf_12.setColor(azf_2.f);
            b = true;
        }
    }

    public static void onMouseExitIntersection(fzs fzs2, fbf_1 fbf_12) {
        fbf_12.setColor(azf_2.b);
        b = false;
    }

    public static void showItemDetailPopup(fcb_2 fcb_22, fvk_0 fvk_02) {
        Object object = fcb_22.j();
        if (!(object instanceof bHN)) {
            return;
        }
        if (fcb_22.f() == frd_0.m) {
            fil_1 fil_12 = (fil_1)fvk_02.getElementMap().a("itemDetailPopup");
            fis_1.a().a("itemPopupDetail", fcb_22.j());
            fpu_0.popup(fcb_22, fil_12);
        } else if (fcb_22.f() == frd_0.l) {
            fpu_0.closePopup(fcb_22);
        }
    }

    public static void openStuffPreviewWindow(fzs fzs2, bHN bHN2) {
        exk_2 exk_22 = bHN2.h();
        if (exk_22 == null) {
            return;
        }
        ddo_0.b.a(exk_22);
    }
}

