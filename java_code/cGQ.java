/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 */
import com.google.common.base.Strings;
import java.util.Optional;

@fpw_0
public class cGQ
extends cGj {
    protected static Runnable c;
    private static ajf_1 a;
    public static final int d = 0;
    public static final int e = 7;

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02, bmk_1 bmk_12) {
        cGQ.openItemDetailWindow(fcb_22, fvk_02, bmk_12.l());
    }

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02, blx_1 blx_12) {
        Object object = fcb_22.j();
        if (aUi.a(fcb_22)) {
            aUi.a(object);
            return;
        }
        if (object instanceof bHR) {
            cGQ.openItemDetailWindow(fcb_22, fvk_02);
            return;
        }
        if (!(object instanceof bjx_2)) {
            return;
        }
        bjx_2 bjx_22 = (bjx_2)object;
        cGQ.a(fcb_22, fvk_02, bjx_22, blx_12);
    }

    public static void openItemDetailWindow(fcb_2 fcb_22, fvk_0 fvk_02) {
        exk_2 exk_22;
        Object object = fcb_22.j();
        if (object instanceof bhz_1) {
            return;
        }
        if (object instanceof bHg) {
            bHe bHe2 = ((bHg)object).o();
            Object r2 = eyo_1.g().d(bHe2.d());
            exk_22 = new exk_2(bHe2.f());
            exk_22.b((ezr_0)r2);
        } else {
            exk_22 = object instanceof bHR ? ((bHR)object).a() : (object instanceof bja_1 ? ((bja_1)object).h() : (exk_2)object);
        }
        if (exk_22 == null) {
            return;
        }
        if (aUi.a(fcb_22)) {
            aUi.a(object);
            return;
        }
        cGQ.openItemDetailWindow((fck_2)fcb_22, fvk_02, exk_22);
    }

    private static void a(fcb_2 fcb_22, fvk_0 fvk_02, bjx_2 bjx_22, blx_1 blx_12) {
        fyy_0 fyy_02 = fvk_02.getElementMap();
        if (fyy_02 == null) {
            return;
        }
        bjw_1 bjw_12 = Optional.ofNullable(bjx_22.a()).orElseGet(() -> (bjw_1)eyo_1.g().d(bjx_22.c()));
        if (bjw_12 == null) {
            return;
        }
        exk_2 exk_22 = new exk_2();
        exk_22.b(bjw_12);
        if (aUi.a(fcb_22)) {
            aUi.a(bjx_22);
            return;
        }
        if (fcb_22.x() == 3) {
            cGQ.openItemDetailWindow((fck_2)fcb_22, fvk_02, exk_22);
            return;
        }
        fis_1.a().a("itemDetail", (Object)exk_22, fyy_02);
        cGQ.a(fcb_22, blx_12);
    }

    public static void openItemDetailWindow(fck_2 fck_22, fvk_0 fvk_02, exk_2 exk_22) {
        fyy_0 fyy_02 = fvk_02.getElementMap();
        if (fyy_02 == null) {
            return;
        }
        if (fck_22.x() == 3) {
            Object object;
            if (exk_22.aQ_()) {
                object = new bMi(exk_22);
                cGQ.customizePet((bMi)object, fvk_02);
            } else {
                cGQ.showItemPopupMenu(exk_22, fvk_02);
            }
            object = (fsQ)fyy_02.a("itemList");
            if (object != null) {
                ((fsQ)object).setSelectedValue(null);
            }
        }
    }

    public static void openItemDetailWindow(fck_2 fck_22, fvk_0 fvk_02, bja_1 bja_12) {
        exh_2 exh_22 = bja_12.a();
        exk_2 exk_22 = bja_12.h();
        if (exk_22 == null) {
            return;
        }
        if (aUi.a(fck_22)) {
            aUi.a((eAM)exk_22);
            return;
        }
        cGQ.openItemDetailWindow(fck_22, fvk_02, exk_22);
    }

    public static void changeDirection(fck_2 fck_22, frO frO2, String string) {
        cGQ.a(fck_22, frO2, Integer.valueOf(string));
    }

    public static void costumeDoubleClick(fcb_2 fcb_22, bmk_1 bmk_12) {
        cGQ.costumeDoubleClick(fcb_22, bmk_12.l());
    }

    public static void costumeDoubleClick(fcb_2 fcb_22, blx_1 blx_12) {
        Object object = fcb_22.j();
        if (!(object instanceof bjx_2)) {
            return;
        }
        dfZ dfZ2 = new dfZ((bjx_2)object, blx_12);
        add_2.b().a(dfZ2);
    }

    private static void a(fcb_2 fcb_22, bmk_1 bmk_12) {
        cGQ.a(fcb_22, bmk_12.l());
    }

    private static void a(fcb_2 fcb_22, blx_1 blx_12) {
        Object object = fcb_22.j();
        if (!(object instanceof bjx_2)) {
            return;
        }
        dga dga2 = new dga((bjx_2)object, blx_12);
        add_2.b().a(dga2);
    }

    private static void a(fck_2 fck_22, frO frO2, int n) {
        int n2 = fck_22.x();
        if (n2 != 1 && n2 != 3) {
            return;
        }
        int n3 = n2 == 1 ? -n : n;
        int n4 = (frO2.getDirection() + n3) % 8;
        if (n4 < 0) {
            n4 = 7;
        }
        frO2.setDirection(n4);
    }

    public static void changeDirectionLocalPlayer(fck_2 fck_22, frO frO2) {
        int n = fck_22.x();
        if (n != 1 && n != 3) {
            return;
        }
        if (!bqt_1.a.a()) {
            return;
        }
        if (bqt_1.a.b()) {
            frO2.setDirection(aej_2.b.a());
            frO2.setAnimName("AnimEmote-Vomis");
            return;
        }
        int n2 = n == 1 ? -2 : 2;
        int n3 = (frO2.getDirection() + n2) % 8;
        if (n3 < 0) {
            n3 = 7;
        }
        frO2.setDirection(n3);
    }

    public static void changeDirection(fck_2 fck_22, frO frO2) {
        cGQ.a(fck_22, frO2, 1);
    }

    public static void customizePet(bMi bMi2, fvk_0 fvk_02) {
        dgO<bMi> dgO2 = new dgO<bMi>(bMi2);
        dgO2.a_(18765);
        dgO2.b(fvk_02 == null ? "inventoryDialog" : fvk_02.getElementMap().c());
        add_2.b().a(dgO2);
    }

    public static void showItemPopupMenu(exk_2 exk_22, fvk_0 fvk_02) {
        dgK dgK2 = new dgK();
        dgK2.a_(16130);
        dgK2.b(fvk_02 != null ? fvk_02.getElementMap().c() : null);
        dgK2.a(exk_22);
        add_2.b().a(dgK2);
    }

    public static void changePetItemBackground(fck_2 fck_22, fil_1 fil_12) {
        String string = "";
        fyy_0 fyy_02 = ((fyb_0)fck_22.e()).getElementMap();
        fvE fvE2 = (fvE)fyy_02.a("petContainer");
        if (fck_22.f() == frd_0.y) {
            string = "itemSelectedBackground";
        } else if (fck_22.f() == frd_0.z) {
            string = fis_1.a().d("pet", fyy_02) != null ? "itemSelectedBackground" : "itemBackground";
        }
        fvE2.setStyle(string);
        if (fil_12 != null) {
            if (fck_22.f() == frd_0.y) {
                fpu_0.popup((fzs)fck_22, fil_12, fvE2);
            } else {
                fpu_0.closePopup(fck_22);
            }
        }
    }

    public static void changeItemBackground(fck_2 fck_22, bmk_1 bmk_12, exk_2 exk_22, String string, fvk_0 fvk_02, fil_1 fil_12, boolean bl) {
        exq_2 exq_22;
        String string2 = "";
        fvE fvE2 = (fvE)fck_22.e();
        bmr_1 bmr_12 = azu_0.j().k();
        exq_2 exq_23 = exq_22 = bmk_12 == null ? bmr_12.R_() : bmk_12.m();
        if (bvz_2.a.b() != null && fis_1.a().e("exchange.sourceBag") instanceof bHe) {
            return;
        }
        if (string != null) {
            exk_22 = (exk_2)exq_22.e(Short.parseShort(string));
        }
        if (exk_22 != null) {
            boolean bl2 = false;
            if (fck_22.f() == frd_0.y) {
                bl2 = true;
                string2 = exk_22.T().x() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string2 = bhv_1.i(exk_22);
            }
            fvE2.setStyle(string2);
            if (bl && exk_22.T().x() != 0) {
                exq_2 exq_24 = exq_22;
                for (exk_2 exk_23 : exq_24) {
                    fvE fvE3;
                    if (exk_23.T().x() != exk_22.T().x()) continue;
                    short s2 = exq_22.g(exk_23);
                    fyy_0 fyy_02 = fvk_02.getElementMap();
                    ftj_0 ftj_02 = (ftj_0)fyy_02.a("EquipRC" + s2);
                    if (ftj_02 == null || (fvE3 = (fvE)ftj_02.getInnerElementMap().a("Equip" + s2)) == null) continue;
                    string2 = bl2 ? "itemSetSelectedBackground" : bhv_1.b(exk_23, fyy_02.c());
                    fvE3.setStyle(string2);
                }
            }
        }
        if (fil_12 != null) {
            if (fck_22.f() == frd_0.y) {
                cJl.showPopup(fck_22, exk_22, fil_12, fvE2);
            } else {
                cJl.closePopup(fck_22);
            }
        }
    }

    public static void updateFilterField(fcd_2 fcd_22, fuh_0 fuh_02) {
        if (fcd_22.k() == 10) {
            cGQ.a();
            cGQ.b(fuh_02.getText());
            return;
        }
        if (fcd_22.k() == 39 || fcd_22.k() == 37) {
            return;
        }
        cGQ.a();
        cGQ.a(fuh_02.getText());
    }

    public static void updateFilterField(fco_2 fco_22, fuh_0 fuh_02) {
        cGQ.a();
        cGQ.b(fuh_02.getText());
    }

    public static void clearFilterField(fzs fzs2, fuh_0 fuh_02) {
        if (fzs2.getClass() == fcl_1.class) {
            cGQ.a();
            cGQ.b(fuh_02.getText());
        }
    }

    private static void a(String string) {
        c = () -> cGQ.b(string);
        ado_1.a().a(c, 300L, 1);
    }

    private static void b(String string) {
        if (!azu_0.j().c(cyt_0.a())) {
            return;
        }
        dfc dfc2 = new dfc(16269);
        dfc2.a(Strings.isNullOrEmpty((String)string) ? null : Cz.o(string));
        add_2.b().a(dfc2);
    }

    private static void a() {
        ado_1.a().b(c);
    }

    public static void resetItemFilter(fzs fzs2, fug_0 fug_02) {
        cGQ.a();
        fug_02.e();
        cGQ.b(null);
    }

    public static void changeHatOn(fzs fzs2, blx_1 blx_12) {
        if (!(fzs2 instanceof fcp_2)) {
            return;
        }
        boolean bl = ((fcp_2)fzs2).j();
        if (blx_12.W_() == !bl) {
            return;
        }
        dfc dfc2 = new dfc(19732);
        dfc2.a(blx_12);
        dfc2.a(bl);
        add_2.b().a(dfc2);
    }

    public static void changeHatOn(fzs fzs2, bmk_1 bmk_12) {
        cGQ.changeHatOn(fzs2, bmk_12.l());
    }
}

