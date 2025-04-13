/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGi {
    public static final String PACKAGE = "wakfu.collectMachine";
    private static long a;

    public static void valid(fzs fzs2, bqP bqP2) {
        dfB dfB2 = new dfB(bqP2);
        dfB2.a_(19887);
        add_2.b().a(dfB2);
    }

    public static void setContentToMax(fzs fzs2, bqP bqP2) {
        dfB dfB2 = new dfB(bqP2);
        dfB2.b(-1);
        dfB2.a_(17133);
        add_2.b().a(dfB2);
    }

    public static void keyType(fzs fzs2, fug_0 fug_02, bqP bqP2) {
        String string = fug_02.getText();
        if (string.length() == 0) {
            return;
        }
        int n = Integer.parseInt(string);
        dfB dfB2 = new dfB(bqP2);
        dfB2.b(n);
        dfB2.a_(17133);
        add_2.b().a(dfB2);
    }

    public static void dropItem(fcv_2 fcv_22) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        if (azu_0.j().k().da().a((ts_0)exk_22) == null) {
            return;
        }
        cgo_0.onDropItem();
        boolean bl = fcv_22.t();
        boolean bl2 = ((bvx_0)ans_0.D().h()).a(bWe.P);
        if (exk_22.e() > 1 && bl ^ bl2) {
            cjk_0.setMaxQuantity(exk_22.e());
            cjk_0.setItem(exk_22);
            cjk_0.setMessageType((short)17530);
            dgL dgL2 = new dgL();
            dgL2.a(exk_22);
            dgL2.g((short)fcv_22.v());
            dgL2.h((short)fcv_22.w());
            dgL2.a_(18919);
            add_2.b().a(dgL2);
        } else {
            dgL dgL3 = new dgL();
            dgL3.a(exk_22.a());
            dgL3.a(exk_22.e());
            dgL3.a_(17530);
            add_2.b().a(dgL3);
        }
    }

    public static void dragItem(fcp_1 fcp_12) {
        exk_2 exk_22 = (exk_2)fcp_12.l();
        a = exk_22.a();
    }

    public static long getDraggedItemId() {
        return a;
    }

    public static void setDraggedItemId(long l) {
        a = l;
    }

    public static void giveKamas(fck_2 fck_22) {
        cGi.moveKamas(fck_22, true);
    }

    public static void takeKamas(fck_2 fck_22) {
        cGi.moveKamas(fck_22, false);
    }

    public static void moveKamas(fck_2 fck_22, boolean bl) {
        if (fck_22.x() == 1) {
            dgL dgL2 = new dgL();
            fvE fvE2 = (fvE)fpm_0.b().h().d("freeCollectMachineDialog").a("localMoney");
            int n = 65;
            int n2 = 20;
            cjk_0.setMessageType(bl ? (short)16393 : 16774);
            cjk_0.setMaxQuantity(bl ? azu_0.j().k().cq() : cXm.d().e().e());
            dgL2.g((short)(fvE2.getScreenX() + 65));
            dgL2.h((short)(fvE2.getScreenY() + 20));
            dgL2.a_(18919);
            add_2.b().a(dgL2);
        }
    }

    public static void onItemDoubleClick(fcb_2 fcb_22) {
        exk_2 exk_22 = (exk_2)fcb_22.j();
        a = exk_22.a();
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a(exk_22.a());
        dgL2.f(exk_22.e());
        dgL2.a_(18118);
        dgL2.c(cjk_0.getDestinationUniqueId());
        dgL2.e(cjk_0.getDestinationPosition());
        add_2.b().a(dgL2);
    }

    public static void changeItemBackground(fck_2 fck_22, exk_2 exk_22, fvk_0 fvk_02, fil_1 fil_12) {
        String string = "";
        fvE fvE2 = (fvE)fck_22.e();
        bmr_1 bmr_12 = azu_0.j().k();
        if (exk_22 != null) {
            boolean bl = false;
            if (fck_22.f() == frd_0.y) {
                bl = true;
                string = exk_22.T().x() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string = bhv_1.i(exk_22);
            }
            fvE2.setStyle(string);
        }
        if (fil_12 != null) {
            if (fck_22.f() == frd_0.y) {
                cJl.showPopup(fck_22, exk_22, fil_12, fvE2);
            } else {
                cJl.closePopup(fck_22);
            }
        }
    }
}

