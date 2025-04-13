/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.text.DecimalFormat;
import org.apache.log4j.Logger;

@fpw_0
public class cGY {
    private static final Logger b = Logger.getLogger(cGY.class);
    public static final String PACKAGE = "wakfu.flea";
    private static bHN c;
    private static short d;
    private static long e;
    private static adv_1 f;
    public static final String a = "fleaControlGroup";

    public static void selectItem(fcb_2 fcb_22, fvk_0 fvk_02) {
        if (fcb_22.j() != null && fcb_22.j() instanceof bHN && fcb_22.x() == 3) {
            cfq_0.openItemDetailWindow(fcb_22, fvk_02);
        }
    }

    public static void purchaseItem(fzs fzs2, bHN bHN2, fvk_0 fvk_02) {
        if (!cuu_0.a().w().j()) {
            if (c == bHN2 && fpm_0.b().q("confirmFleaPurchaseDialog")) {
                fpm_0.b().o("confirmFleaPurchaseDialog");
            } else {
                c = bHN2;
                d = 1;
                e = c.p();
                fis_1.a().a("fleaSelectedGood", c);
                fis_1.a().a("currentItemQuantity", d);
                fis_1.a().a("currentItemTotalPrice", e);
                fis_1.a().a("currentItemFormatedTotalPrice", (Object)(DecimalFormat.getIntegerInstance().format(e) + " \u00a7"));
                fis_1.a().a("currentItemStackQtyPlusTotal", (Object)(bhq_0.a(c.q()) + " = " + d * cGY.c.q().f));
                String string = fvk_02.getElementMap().c();
                fvk_0 fvk_03 = (fvk_0)fpm_0.b().a("confirmFleaPurchaseDialog", cfi_0.a("confirmFleaPurchaseDialog"), string, string, a, 145L, (short)10000);
            }
        }
    }

    public static void cancelPurchase(fzs fzs2) {
        fpm_0.b().o("confirmFleaPurchaseDialog");
    }

    public static void confirmPurchase(fzs fzs2) {
        fit_1 fit_12 = fis_1.a().f("fleaSelectedGood");
        if (fit_12 != null) {
            bHN bHN2 = (bHN)fit_12.f();
            if (azu_0.j().c(cWt.e())) {
                cpp_0 cpp_02 = new cpp_0();
                cpp_02.a(bHN2.a());
                cpp_02.a(d);
                azu_0.j().K().c(cpp_02);
            } else {
                cps_0 cps_02 = new cps_0();
                cps_02.a(bHN2.a());
                cps_02.a(d);
                azu_0.j().K().c(cps_02);
            }
            fpm_0.b().a("confirmFleaPurchaseDialog", false);
        }
    }

    public static void confirmOutsidePurchase(fzs fzs2) {
        fit_1 fit_12 = fis_1.a().f("fleaSelectedGood");
        if (fit_12 != null) {
            bHN bHN2 = (bHN)fit_12.f();
            fpm_0.b().a("confirmFleaPurchaseDialog", false);
        }
    }

    public static void decreaseQuantity(fzs fzs2, fug_0 fug_02) {
        cGY.a(d - 1, fug_02);
    }

    public static void increaseQuantity(fzs fzs2, fug_0 fug_02) {
        cGY.a(d + 1, fug_02);
    }

    public static void validQuantity(fzs fzs2, fug_0 fug_02) {
        cGY.a(Co.h(fug_02.getText()), fug_02, !fug_02.getText().isEmpty());
    }

    public static void changeQuantityWithMouseWheel(fck_2 fck_22, fug_0 fug_02) {
        cGY.a(d - fck_22.z(), fug_02);
    }

    private static void a(int n, fug_0 fug_02) {
        cGY.a(n, fug_02, true);
    }

    private static void a(int n, fug_0 fug_02, boolean bl) {
        d = (short)Hw.a(n, 1, (int)c.e());
        if (bl) {
            fug_02.c(String.valueOf(d));
        }
        cGY.applyQuantity();
    }

    public static void applyQuantity() {
        e = (long)d * c.p();
        fis_1.a().a("currentItemQuantity", d);
        fis_1.a().a("currentItemTotalPrice", e);
        fis_1.a().a("currentItemFormatedTotalPrice", (Object)(DecimalFormat.getIntegerInstance().format(e) + " \u00a7"));
        fis_1.a().a("currentItemStackQtyPlusTotal", (Object)(bhq_0.a(c.q()) + " = " + d * cGY.c.q().f));
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

    public static void selectFleaToBrowse(fcb_2 fcb_22) {
        bhm_0 bhm_02 = (bhm_0)fcb_22.j();
        cWt.e().g();
        abo_2 abo_22 = cWt.e().c(bhm_02.r());
        if (abo_22 == null) {
            return;
        }
        if (bhm_02.n() || (Byte)abo_22.a() <= 0) {
            return;
        }
        cpq_0 cpq_02 = new cpq_0();
        cpq_02.a(bhm_02.r());
        azu_0.j().K().c(cpq_02);
        cWt.e().a(bhm_02);
    }

    public static void openStuffPreviewWindow(fzs fzs2, bHN bHN2) {
        exk_2 exk_22 = bHN2.h();
        if (exk_22 == null) {
            return;
        }
        ddo_0.b.a(exk_22);
    }

    static {
        d = 1;
    }
}

