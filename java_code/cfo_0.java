/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cFo
 */
@fpw_0
public class cfo_0 {
    public static final String PACKAGE = "wakfu.accountChest";
    private static final Logger c = Logger.getLogger(cfo_0.class);
    public static final String a = "compartmentName";
    public static final String b = "compartmentColor";
    private static final String d = "itemSelectedBackground";
    private static final String e = "itemSetSelectedBackground";
    private static final int f = 6;
    private static long g = -1L;

    public static void changeItemBackgroundEnter(fck_2 fck_22, exk_2 exk_22, fil_1 fil_12) {
        if (exk_22 == null) {
            return;
        }
        fvE fvE2 = (fvE)fck_22.e();
        fvE2.setStyle(exk_22.T().x() == 0 ? d : e);
        if (fil_12 != null) {
            cJl.showPopup(fck_22, exk_22, fil_12, fvE2);
        }
    }

    public static void changeItemBackgroundExit(fck_2 fck_22, exk_2 exk_22, fil_1 fil_12) {
        fvE fvE2 = (fvE)fck_22.e();
        fvE2.setStyle(bhx_0.d.a());
        cJl.closePopup(fck_22);
    }

    public static void dragItem(fcp_1 fcp_12) {
        if (cVg.b.f()) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcp_12.l();
        g = exk_22.a();
    }

    public static void dropItemOnCompartment(fcv_2 fcv_22, bqE bqE2) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        if (bqE2 == null || bqE2.f()) {
            return;
        }
        cgo_0.onDropItem();
        if (cVg.b.f()) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        long l = azu_0.j().k().U_();
        boolean bl = cVg.b.e().a(exk_22.a());
        if (!bl && euu_2.g(l, exk_22.a()) == null) {
            return;
        }
        cfo_0.a(fcv_22, exk_22, (short)-1, bqE2.j(), exk_22.e());
    }

    public static void dropItem(fcv_2 fcv_22) {
        boolean bl;
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        cgo_0.onDropItem();
        if (cVg.b.f()) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null || bqD2.e()) {
            return;
        }
        boolean bl2 = bqD2.a(exk_22.a());
        long l = azu_0.j().k().U_();
        boolean bl3 = bl = euu_2.g(l, exk_22.a()) != null;
        if (!bl && !bl2) {
            return;
        }
        ftj_0 ftj_02 = fcv_22.k().getRenderableParent();
        short s2 = (short)ftj_02.getCollection().getTableIndex(ftj_02);
        short s3 = cfo_0.a(ftj_02.getItemValue(), exk_22);
        cfo_0.a(fcv_22, exk_22, s2, cVg.b.e().c(), s3);
    }

    public static void stackItemsFromInventoryToAccountChest(fck_2 fck_22) {
        if (cVg.b.f()) {
            return;
        }
        bqD bqD2 = cVg.b.e();
        if (bqD2 == null || bqD2.e()) {
            return;
        }
        exk_2[] exk_2Array = cyt_0.s().da().e();
        dgP dgP2 = new dgP();
        dgP2.a(exk_2Array);
        dgP2.b(bqD2.c());
        dgP2.a_(16926);
        add_2.b().a(dgP2);
    }

    private static void a(fcv_2 fcv_22, exk_2 exk_22, short s2, String string, short s3) {
        short s4;
        boolean bl = fcv_22.t() ^ ((bvx_0)ans_0.D().h()).a(bWe.P);
        boolean bl2 = exk_22.a() == g;
        short s5 = s4 = bl2 ? (short)17543 : 17093;
        if (!bl2 && exk_22.e() > 1 && bl) {
            cjk_0.setItem(exk_22);
            cjk_0.setMaxQuantity(s3);
            cjk_0.setMessageType(s4);
            cjk_0.setDestinationPosition(s2);
            cjk_0.setTargetCompartmentId(string);
            dgL dgL2 = new dgL();
            dgL2.a(exk_22);
            dgL2.f(s3);
            dgL2.g((short)fcv_22.v());
            dgL2.h((short)fcv_22.w());
            dgL2.a_(18919);
            add_2.b().a(dgL2);
        } else {
            dgL dgL3 = new dgL();
            dgL3.a(exk_22);
            dgL3.f(s3);
            dgL3.e(s2);
            dgL3.a(string);
            dgL3.a_(s4);
            add_2.b().a(dgL3);
        }
    }

    private static short a(Object object, exk_2 exk_22) {
        if (!(object instanceof exk_2)) {
            return exk_22.e();
        }
        exk_2 exk_23 = (exk_2)object;
        if (!exk_22.a(exk_23)) {
            return exk_22.e();
        }
        int n = exk_23.aR_() - exk_23.e();
        return (short)Math.min(exk_22.e(), n);
    }

    public static void selectCompartment(fck_2 fck_22, bqE bqE2) {
        if (fck_22.x() != 1) {
            return;
        }
        if (cVg.b.f()) {
            return;
        }
        if (fck_22.e() instanceof fru_0) {
            return;
        }
        dfc dfc2 = new dfc(17315);
        dfc2.a(bqE2.j());
        add_2.b().a(dfc2);
    }

    public static void buyCompartment(fck_2 fck_22) {
        if (fck_22.x() != 1) {
            return;
        }
        ddO.a().b("wakfu_stockage");
    }

    public static void openCompartmentModification(fck_2 fck_22, bqE bqE2) {
        if (fck_22.x() != 1) {
            return;
        }
        fyy_0 fyy_02 = fpm_0.b().h().d("accountChestDialog");
        fug_0 fug_02 = (fug_0)fyy_02.a(a);
        fug_0 fug_03 = (fug_0)fyy_02.a(b);
        fug_02.c(bqE2.a());
        fug_03.c(bqE2.b().w());
        fis_1.a().a("compartmentColorPickerValue", (Object)bqE2.b(), "accountChestDialog");
        fis_1.a().a("compartmentColorPreview", (Object)bqE2.b(), "accountChestDialog");
        fis_1.a().a("accountChestCompartmentModification", true);
        fis_1.a().a("accountChestModifiedCompartment", bqE2);
    }

    public static void validateCompartmentModification(fck_2 fck_22, fug_0 fug_02, fug_0 fug_03) {
        if (fck_22.x() != 1) {
            return;
        }
        String string = fug_02.getText();
        String string2 = fug_03.getText();
        bqE bqE2 = (bqE)fis_1.a().e("accountChestModifiedCompartment");
        dfd_0 dfd_02 = new dfd_0(bqE2.j(), string, string2);
        add_2.b().a(dfd_02);
        fis_1.a().a("accountChestCompartmentModification", false);
        fis_1.a().a("accountChestModifiedCompartment");
    }

    public static void cancelCompartmentModification(fck_2 fck_22) {
        if (fck_22.x() != 1) {
            return;
        }
        fis_1.a().a("accountChestCompartmentModification", false);
        fis_1.a().a("accountChestModifiedCompartment");
    }

    public static void copyCompartmentId(fck_2 fck_22, bqE bqE2) {
        ca_0.a(bqE2.j());
        String string = String.format("Compartment %s id=%s copied to clipboard", bqE2.a(), bqE2.j());
        aul_0.a().c(string);
    }

    public static void pickCompartmentColor(fct_1 fct_12, fug_0 fug_02) {
        azj_2 azj_22 = (azj_2)fct_12.j();
        if (azj_22 == null) {
            return;
        }
        fug_02.c(azj_22.w().toUpperCase());
        fis_1.a().a("compartmentColorPreview", (Object)azj_22, "accountChestDialog");
    }

    public static void onColorType(fzs fzs2, fug_0 fug_02) {
        azf_2 azf_22;
        String string = fug_02.getText();
        if (string.length() < 6) {
            return;
        }
        try {
            azf_22 = azf_2.a(string);
        }
        catch (RuntimeException runtimeException) {
            c.error((Object)("Error when creating color from hex " + string), (Throwable)runtimeException);
            return;
        }
        fis_1.a().a("compartmentColorPickerValue", (Object)azf_22, "accountChestDialog");
        fis_1.a().a("compartmentColorPreview", (Object)azf_22, "accountChestDialog");
    }

    public static void showCompartmentOption(fck_2 fck_22, bqE bqE2) {
        bqE2.b(true);
        fis_1.a().a((ajf_1)bqE2, "hovered");
    }

    public static void hideCompartmentOption(fck_2 fck_22, bqE bqE2) {
        bqE2.b(false);
        fis_1.a().a((ajf_1)bqE2, "hovered");
    }

    public static void moveCompartmentUp(fck_2 fck_22, bqE bqE2) {
        if (cVg.b.f()) {
            return;
        }
        dfc dfc2 = new dfc(16615);
        dfc2.a(bqE2);
        add_2.b().a(dfc2);
    }

    public static void moveCompartmentDown(fck_2 fck_22, bqE bqE2) {
        if (cVg.b.f()) {
            return;
        }
        dfc dfc2 = new dfc(18827);
        dfc2.a(bqE2);
        add_2.b().a(dfc2);
    }

    public static void onItemDoubleClick(fcb_2 fcb_22) {
        if (cVg.b.f()) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcb_22.j();
        bmr_1 bmr_12 = cyt_0.s();
        bmk_1 bmk_12 = bzg_1.a.a(bmr_12);
        ArrayList<Long> arrayList = bmr_12.da().h(exk_22);
        if (arrayList.isEmpty()) {
            return;
        }
        dgL dgL2 = new dgL();
        dgL2.a(exk_22.a());
        dgL2.a(exk_22);
        dgL2.f(exk_22.e());
        dgL2.e((short)-1);
        dgL2.c(-1L);
        dgL2.b(bmk_12);
        dgL2.a_(16358);
        add_2.b().a(dgL2);
    }

    public static void showItemDetails(fcb_2 fcb_22) {
        if (fcb_22.x() != 3) {
            if (!(fcb_22.j() instanceof exk_2)) {
                return;
            }
            exk_2 exk_22 = (exk_2)fcb_22.j();
            fis_1.a().a("itemDetail", (Object)exk_22, "inventoryDialog");
            bMi bMi2 = exk_22.aQ_() ? new bMi(exk_22) : null;
            fis_1.a().a("pet", (Object)bMi2, "inventoryDialog");
            return;
        }
        cfq_0.sendOpenCloseItemDetailMessage("accountChestDialog", (exk_2)fcb_22.j());
    }

    public static void compartmentFilter(fzs fzs2, fuh_0 fuh_02) {
        bqC bqC2 = (bqC)fis_1.a().e("accountChestCompartments");
        String string = fuh_02.getText();
        if (!string.equals(bqC2.b())) {
            dfc dfc2 = new dfc(17048);
            dfc2.a(string);
            add_2.b().a(dfc2);
        }
    }

    public static void resetCompartmentFilter(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(17048);
        dfc2.a("");
        add_2.b().a(dfc2);
    }

    public static void itemFilter(fzs fzs2, fuh_0 fuh_02) {
        String string = fuh_02.getText();
        dfc dfc2 = new dfc(16356);
        dfc2.a(string);
        add_2.b().a(dfc2);
    }

    public static void resetItemFilter(fzs fzs2, fuh_0 fuh_02) {
        dfc dfc2 = new dfc(16356);
        dfc2.a("");
        add_2.b().a(dfc2);
    }

    public static long getDraggedItemId() {
        return g;
    }

    public static void setDraggedItemId(long l) {
        g = l;
    }
}

