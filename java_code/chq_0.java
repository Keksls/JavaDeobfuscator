/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cHq
 */
@fpw_0
public class chq_0 {
    protected static final Logger a = Logger.getLogger(chq_0.class);
    public static final String PACKAGE = "wakfu.havenWorldResourcesCollector";
    private static long b = -1L;

    public static void closeWindow(fzs fzs2) {
        if (!cZD.d().e().f()) {
            String string = bae.h().a("question.havenWorldResourcesCollectorClose", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new cHr());
        } else {
            chq_0.a();
        }
    }

    static void a() {
        fpm_0.b().o("havenWorldResourcesCollectorDialog");
    }

    public static void validCollect(fzs fzs2) {
        dfc.d((short)18960);
    }

    public static void removeItem(fzs fzs2) {
        if (fzs2 instanceof fcx_1 && ((fcx_1)fzs2).l() instanceof exi_2) {
            chq_0.removeItem((exi_2)((fcx_1)fzs2).l());
        }
    }

    public static void onItemDoubleClick(fcb_2 fcb_22) {
        if (!(fcb_22.j() instanceof exi_2)) {
            return;
        }
        chq_0.removeItem((exi_2)fcb_22.j());
    }

    public static void removeItem(exi_2 exi_22) {
        dgH dgH2 = new dgH(exi_22);
        dgH2.a_(18128);
        add_2.b().a(dgH2);
    }

    public static void dropItem(fcv_2 fcv_22) {
        boolean bl;
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        boolean bl2 = bl = azu_0.j().k().da().a((ts_0)exk_22) != null;
        if (!bl) {
            return;
        }
        cgo_0.onDropItem();
        boolean bl3 = fcv_22.t();
        boolean bl4 = ((bvx_0)ans_0.D().h()).a(bWe.P);
        int n = 17594;
        if (exk_22.e() > 1 && bl3 ^ bl4) {
            cjk_0.setMaxQuantity(exk_22.e());
            cjk_0.setItem(exk_22);
            cjk_0.setMessageType((short)17594);
            dgL dgL2 = new dgL();
            dgL2.a(exk_22);
            dgL2.g((short)fcv_22.v());
            dgL2.h((short)fcv_22.w());
            dgL2.a_(18919);
            add_2.b().a(dgL2);
        } else {
            dgL dgL3 = new dgL();
            dgL3.a(exk_22.a());
            dgL3.f(exk_22.e());
            dgL3.a_(17594);
            add_2.b().a(dgL3);
        }
    }

    public static void changeItemBackground(fck_2 fck_22, exk_2 exk_22) {
        chq_0.changeItemBackground(fck_22, exk_22, null);
    }

    public static void changeItemBackground(fck_2 fck_22) {
        String string = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (fck_22.f() == frd_0.y) {
            string = "itemSelectedBackground";
        } else if (fck_22.f() == frd_0.z) {
            string = "itemBackground";
        }
        fvE2.setStyle(string);
    }

    public static void changeItemBackground(fck_2 fck_22, exk_2 exk_22, fil_1 fil_12) {
        String string = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (exk_22 != null) {
            if (fck_22.f() == frd_0.y) {
                string = "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string = "itemBackground";
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

    public static void dragItem(fcp_1 fcp_12) {
        exk_2 exk_22 = (exk_2)fcp_12.l();
        b = exk_22.a();
    }

    public static long getDraggedItemId() {
        return b;
    }

    public static void setDraggedItemId(long l) {
        b = l;
    }
}

