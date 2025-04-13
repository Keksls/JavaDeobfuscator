/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJO
 */
@fpw_0
public class cjo_0 {
    public static final String PACKAGE = "wakfu.storageBox";
    private static long a;
    private static fsk_0 b;

    public static void selectCompartment(fzs fzs2, bpy_0 bpy_02) {
        dfc dfc2 = new dfc();
        dfc2.a_(19126);
        dfc2.a(bpy_02.h());
        add_2.b().a(dfc2);
    }

    public static void unlockCompartment(fzs fzs2) {
        dfc.d((short)16835);
    }

    public static void dropItem(fcv_2 fcv_22) {
        boolean bl;
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        cgo_0.onDropItem();
        exk_2 exk_22 = (exk_2)fcv_22.n();
        boolean bl2 = ddi_0.d().e().o().a(exk_22);
        boolean bl3 = bl = azu_0.j().k().da().a((ts_0)exk_22) != null;
        if (!bl && !bl2) {
            return;
        }
        boolean bl4 = fcv_22.t();
        boolean bl5 = ((bvx_0)ans_0.D().h()).a(bWe.P);
        ftj_0 ftj_02 = fcv_22.k().getRenderableParent();
        byte by = (byte)ftj_02.getCollection().getTableIndex(ftj_02);
        boolean bl6 = exk_22.a() == a;
        short s2 = bl6 ? (short)18520 : 16838;
        if (!bl6 && exk_22.e() > 1 && bl4 ^ bl5) {
            cjk_0.setMaxQuantity(exk_22.e());
            cjk_0.setItem(exk_22);
            cjk_0.setMessageType(s2);
            cjk_0.setDestinationPosition(by);
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
            dgL3.e(by);
            dgL3.a_(s2);
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

    public static void onMouseOverFilter(fcb_2 fcb_22) {
        if (fcb_22.j().equals(ddi_0.d().e().o())) {
            return;
        }
        b = (fsk_0)((ftj_0)fcb_22.d()).getInnerElementMap().a("image");
        ((fid_1)b.getLayoutData()).setYOffset(-1);
        b.getContainer().invalidateMinSize();
    }

    public static void onMouseOutFilter(fcb_2 fcb_22) {
        if (b == null) {
            return;
        }
        ((fid_1)b.getLayoutData()).setYOffset(-3);
        b.getContainer().invalidateMinSize();
        b = null;
    }

    public static void seeItemDetails(fzs fzs2) {
        bjw_1 bjw_12 = ((bpz_0)ddi_0.d().e().o()).k();
        cfq_0.sendOpenCloseItemDetailMessage("storageBoxDialog", bjw_12);
    }

    public static void onItemDoubleClick(fcb_2 fcb_22) {
        exk_2 exk_22 = (exk_2)fcb_22.j();
        dgL dgL2 = new dgL();
        dgL2.a_(19489);
        dgL2.a(exk_22);
        dgL2.f(exk_22.e());
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

    public static void showItemDetails(fcb_2 fcb_22) {
        if (fcb_22.x() != 3) {
            return;
        }
        if (fcb_22.j() instanceof bqn_1) {
            exk_2 exk_22 = ((bqn_1)fcb_22.j()).b();
            cfq_0.sendOpenCloseItemDetailMessage("storageBoxDialog", exk_22);
        } else {
            cfq_0.sendOpenCloseItemDetailMessage("storageBoxDialog", (exk_2)fcb_22.j());
        }
    }

    public static void depositMoney(fzs fzs2, ful_0 ful_02) {
        long l = Co.f(ful_02.getText());
        ful_02.c("");
        dfc dfc2 = new dfc();
        dfc2.a_(18155);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    public static void withdrawMoney(fzs fzs2, ful_0 ful_02) {
        long l = Co.f(ful_02.getText());
        ful_02.c("");
        dfc dfc2 = new dfc();
        dfc2.a_(19570);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }
}

