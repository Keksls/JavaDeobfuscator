/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cGM
 */
@fpw_0
public class cgm_0 {
    public static final String PACKAGE = "wakfu.enchantment";

    public static void itemDropped(fcv_2 fcv_22) {
        cgo_0.onDropItem();
        dfc dfc2 = new dfc(17847);
        dfc2.a(fcv_22.n());
        add_2.b().a(dfc2);
    }

    public static void currentItemDroppedOut(fcx_1 fcx_12) {
        add_2.b().a(new dfc(17847));
    }

    public static void consumedItemDropped(fcv_2 fcv_22) {
        cgo_0.onDropItem();
        dfc dfc2 = new dfc(18975);
        Object object = fcv_22.n();
        dfc2.a(object);
        add_2.b().a(dfc2);
        if (!(object instanceof exk_2)) {
            return;
        }
        exk_2 exk_22 = (exk_2)object;
        exq_1<?> exq_12 = exk_22.T().F();
        exh_2[] exh_2Array = exq_12.h();
        if (exh_2Array.length <= 0) {
            return;
        }
        exh_2 exh_22 = exh_2Array[0];
        cdw_0.n().b(exh_22);
    }

    public static void consumedItemDroppedOut(fcx_1 fcx_12) {
        add_2.b().a(new dfc(18975));
    }

    public static void removeOneLevelToShardSlot(fck_2 fck_22, bib_0 bib_02) {
        add_2.b().a(new dfy_0(bib_02, new ezb_0(ezc_0.d, bib_02.g(), fck_22.t())));
    }

    public static void addOneLevelToShardSlot(fck_2 fck_22, bib_0 bib_02) {
        add_2.b().a(new dfy_0(bib_02, new ezb_0(ezc_0.e, bib_02.g(), fck_22.t())));
    }

    public static void resetShardsModifications(fck_2 fck_22) {
        add_2.b().a(new dfc(19267));
    }

    public static void validateShardModification(fck_2 fck_22) {
        add_2.b().a(new dfc(16228));
    }

    public static void withItemChoicePanelValidation(fck_2 fck_22) {
        add_2.b().a(new dfc(16469));
    }

    public static void goToRollNumberPanel(fck_2 fck_22) {
        cgm_0.sendPanelChangeMessage(btu_1.b);
    }

    public static void goToRollColorPanel(fck_2 fck_22) {
        cgm_0.sendPanelChangeMessage(btu_1.c);
    }

    public static void goToRollOrderPanel(fck_2 fck_22) {
        cgm_0.sendPanelChangeMessage(btu_1.d);
    }

    public static void goToShardManagementPanel(fck_2 fck_22) {
        cgm_0.sendPanelChangeMessage(btu_1.e);
    }

    public static void goToModifiedItemPickerPanel(fck_2 fck_22) {
        cgm_0.sendPanelChangeMessage(btu_1.f);
    }

    public static void goToConsumedItemPickerPanel(fck_2 fck_22) {
        cgm_0.sendPanelChangeMessage(btu_1.g);
    }

    public static void goToShardsPickerPanel(fck_2 fck_22, bib_0 bib_02) {
        cgm_0.sendPanelChangeMessage(btu_1.a(bib_02.a()));
    }

    public static void deployItemSearchPanel(fck_2 fck_22) {
        add_2.b().a(new dfc(16497));
    }

    public static void resetItemSearch(fck_2 fck_22, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04, fug_0 fug_05, fug_0 fug_06, fim_1 fim_12) {
        fug_02.setTextImmediate("");
        fug_03.setTextImmediate("1");
        fug_04.setTextImmediate("4");
        fug_05.setTextImmediate("0");
        fug_06.setTextImmediate(enp_2.a.e(ens_2.v));
        fim_12.setValue("0");
        cgm_0.doItemSearch(fck_22, fug_02, fug_03, fug_04, fug_05, fug_06, fim_12);
    }

    public static void onSearchSortingSelectionChange(fck_2 fck_22, String string) {
        dfc dfc2 = new dfc(16525);
        dfc2.a(Byte.parseByte(string));
        add_2.b().a(dfc2);
    }

    public static void doItemSearch(fck_2 fck_22, fug_0 fug_02, fug_0 fug_03, fug_0 fug_04, fug_0 fug_05, fug_0 fug_06, fim_1 fim_12) {
        dfx_0 dfx_02 = new dfx_0();
        dfx_02.b(fug_02.getText());
        dfx_02.c(Integer.parseInt(fug_03.getText()));
        dfx_02.d(Integer.parseInt(fug_04.getText()));
        dfx_02.e(Integer.parseInt(fug_05.getText()));
        dfx_02.f(Integer.parseInt(fug_06.getText()));
        int n = fim_12.getValue() == null ? 0 : Integer.parseInt(fim_12.getValue());
        dfx_02.a(n == 0 ? fhw_0.b : fhw_0.c);
        add_2.b().a(dfx_02);
    }

    public static void pickItem(fcb_2 fcb_22) {
        Object object = fcb_22.j();
        if (!(object instanceof bty_0)) {
            return;
        }
        dfc dfc2 = new dfc(17488);
        dfc2.a(object);
        add_2.b().a(dfc2);
        exk_2 exk_22 = ((bty_0)object).a();
        if (exk_22 == null) {
            return;
        }
        exq_1<?> exq_12 = exk_22.T().F();
        exh_2[] exh_2Array = exq_12.h();
        if (exh_2Array.length <= 0) {
            return;
        }
        exh_2 exh_22 = exh_2Array[0];
        cdw_0.n().b(exh_22);
    }

    public static void onMouseEnterPickerItem(fck_2 fck_22) {
        Object t = fck_22.d();
        ((fyo)t).setXMLAttribute("style", "caracsBlue");
    }

    public static void onMouseExitPickerItem(fck_2 fck_22) {
        Object t = fck_22.d();
        ((fyo)t).setXMLAttribute("style", "caracs");
    }

    public static void sendPanelChangeMessage(btu_1 btu_12) {
        dfv_0 dfv_02 = new dfv_0();
        dfv_02.a(btu_12);
        add_2.b().a(dfv_02);
    }

    public static void removeSublimation(fck_2 fck_22, String string) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("enchantment.remove.sublimation.confirmation", new Object[0]), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a((n, string2) -> {
            if (n == 8) {
                dfw_0 dfw_02 = new dfw_0(Boolean.parseBoolean(string));
                add_2.b().a(dfw_02);
            }
        });
    }
}

