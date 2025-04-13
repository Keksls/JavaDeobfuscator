/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

@fpw_0
public class cJR {
    protected static final Logger a = Logger.getLogger(cJR.class);
    public static final String PACKAGE = "wakfu.temporaryInventory";
    private static adv_1 b;
    private static long c;

    public static void selectHero(fck_2 fck_22, bmr_1 bmr_12) {
        dfc dfc2 = new dfc(17346);
        dfc2.a(bmr_12.a_());
        add_2.b().a(dfc2);
    }

    public static void closeTemporaryInventory(fzs fzs2) {
        if (fzs2.f() == frd_0.C) {
            dfc.d((short)16750);
        }
    }

    public static void minimizeMaximizeDialog(fck_2 fck_22, fvk_0 fvk_02) {
        if (fck_22.f() == frd_0.D) {
            fvE fvE2 = (fvE)fvk_02.getElementMap().a("contentWindow");
            if (!fvE2.getVisible()) {
                fvk_02.setPrefSize(new fjf_2(0, 0));
            } else {
                fvk_02.setPrefSize(new fjf_2(0, fvE2.getHeight()));
            }
            fvE2.setVisible(!fvE2.getVisible());
            fvE fvE3 = (fvE)fvk_02.getElementMap().a("barCloseButton");
            fvE3.setVisible(!fvE3.getVisible());
        }
    }

    public static void showItemDetailPopup(fcb_2 fcb_22, fvk_0 fvk_02) {
        Object object = fcb_22.j();
        cJl.showPopup((ajf_1)object, 500);
    }

    public static void dropOut(fcx_1 fcx_12) {
        if (fcx_12.l() instanceof exk_2) {
            exk_2 exk_22 = (exk_2)fcx_12.l();
            if (fta_0.getInstance().getWidget(fcx_12.v(), fcx_12.w()) == fta_0.getInstance()) {
                if (exk_22.T().a(exz_1.d) != null && !exk_22.T().a(exz_1.d).b(azu_0.j().k(), azu_0.j().k().P_(), exk_22, azu_0.j().k().ge())) {
                    aUh.a("item.unDroppable", exk_22.e(), exk_22.N());
                    return;
                }
                if (exk_22.a() == c) {
                    if (fcx_12.t() && exk_22.e() > 1) {
                        cjk_0.setMaxQuantity(exk_22.e());
                        cjk_0.setItem(exk_22);
                        cjk_0.setMessageType((short)17553);
                        dgL dgL2 = new dgL();
                        dgL2.a(exk_22);
                        dgL2.g((short)fcx_12.v());
                        dgL2.h((short)fcx_12.w());
                        dgL2.a_(18919);
                        add_2.b().a(dgL2);
                    } else {
                        dgL dgL3 = new dgL();
                        dgL3.a(exk_22);
                        dgL3.f(exk_22.e());
                        dgL3.a_(17553);
                        dgL3.c(-1L);
                        add_2.b().a(dgL3);
                    }
                }
            }
        }
    }

    public static void dragItem(fcp_1 fcp_12) {
        if (fpm_0.b().q("splitStackDialog")) {
            fpm_0.b().o("splitStackDialog");
        }
        if (fcp_12.k() instanceof exk_2) {
            exk_2 exk_22 = (exk_2)fcp_12.k();
            c = exk_22.a();
            fis_1.a().a("temporaryInventory.currentDragItemId", exk_22.a());
        }
    }

    public static void onItemDoubleClick(fcb_2 fcb_22) {
        if (fpm_0.b().q("splitStackDialog")) {
            fpm_0.b().o("splitStackDialog");
        }
        exk_2 exk_22 = (exk_2)fcb_22.j();
        dgL dgL2 = new dgL();
        dgL2.a_(17553);
        dgL2.a(exk_22);
        dgL2.f(exk_22.e());
        bHi bHi2 = cyt_0.s().da();
        exg_2 exg_22 = bHi2.e(exk_22);
        byte by = (byte)(exg_22 == null ? -1 : (int)exg_22.d(exg_22.c(exk_22.aT_())));
        if (exg_22 == null && (exg_22 = bHi2.a(exk_22)) != null) {
            by = (byte)exg_22.l();
        }
        if (exg_22 == null) {
            return;
        }
        c = exk_22.a();
        fis_1.a().a("temporaryInventory.currentDragItemId", exk_22.a());
        dgL2.c(exg_22.f());
        dgL2.e(by);
        add_2.b().a(dgL2);
    }
}

