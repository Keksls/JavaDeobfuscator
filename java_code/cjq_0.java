/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cJQ
 */
@fpw_0
public class cjq_0
extends cGQ {
    public static final String PACKAGE = "wakfu.stuffPreview";
    private static long a = -1L;

    public static void equipItem(exk_2 exk_22, String string) {
        dgL dgL2 = new dgL();
        dgL2.a(exk_22);
        dgL2.a(Byte.valueOf(string));
        dgL2.a_(17410);
        add_2.b().a(dgL2);
    }

    public static void unequipItem(byte by) {
        dgL dgL2 = new dgL();
        dgL2.a(by);
        dgL2.a_(18791);
        add_2.b().a(dgL2);
        cjq_0.setDraggedItemId(-1L);
    }

    public static void unequip(fcb_2 fcb_22, String string) {
        cjq_0.unequipItem(Byte.parseByte(string));
    }

    public static void itemDropOut(fcx_1 fcx_12, String string) {
        cjq_0.unequipItem(Byte.parseByte(string));
    }

    public static void equipmentDropItem(fcv_2 fcv_22, String string) {
        if (!(fcv_22.n() instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)fcv_22.n();
        cgo_0.onDropItem();
        cjq_0.equipItem(exk_22, string);
    }

    public static void dragItem(fcp_1 fcp_12) {
        exk_2 exk_22 = (exk_2)fcp_12.l();
        cjq_0.setDraggedItemId(exk_22.aT_());
    }

    public static long getDraggedItemId() {
        return a;
    }

    public static void setDraggedItemId(long l) {
        a = l;
    }

    public static void changeItemBackground(fck_2 fck_22, String string, fvk_0 fvk_02) {
        cjq_0.changeItemBackground(fck_22, null, null, string, fvk_02, null);
    }

    public static void changeItemBackground(fck_2 fck_22, ajf_1 ajf_12, exk_2 exk_22, String string, fvk_0 fvk_02, fil_1 fil_12) {
        String string2 = "";
        fvE fvE2 = (fvE)fck_22.e();
        if (bvz_2.a.b() != null && fis_1.a().e("exchange.sourceBag") instanceof bHe) {
            return;
        }
        if (string != null) {
            exk_22 = ddo_0.b.a().c(Byte.parseByte(string));
        }
        if (exk_22 != null) {
            boolean bl = false;
            if (fck_22.f() == frd_0.y) {
                bl = true;
                string2 = exk_22.T().x() != 0 ? "itemSetSelectedBackground" : "itemSelectedBackground";
            } else if (fck_22.f() == frd_0.z) {
                string2 = bhv_1.b(exk_22, fvE2.getElementMap().c());
            }
            fvE2.setStyle(string2);
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

