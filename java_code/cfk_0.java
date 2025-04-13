/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFK
 */
@fpw_0
public class cfk_0 {
    public static final String PACKAGE = "wakfu.buildSheetSet";
    private static ble_0 a;

    public static void onDragBuild(fcp_1 fcp_12) {
        a = (ble_0)fcp_12.k();
    }

    public static void overBuild(fcb_2 fcb_22, bld_0 bld_02) {
        Object object = fcb_22.j();
        if (!(object instanceof ble_0)) {
            return;
        }
        ble_0 ble_02 = (ble_0)object;
        bld_02.a((byte)ble_02.c());
        fis_1.a().a((ajf_1)bld_02, "currentOverBuildSheet");
    }

    public static void outBuild(fcb_2 fcb_22, bld_0 bld_02) {
        bld_02.a((byte)-2);
        fis_1.a().a((ajf_1)bld_02, "currentOverBuildSheet");
    }

    public static void onSheetNameChanged(fcz_1 fcz_12) {
        if (!fcz_12.j()) {
            fug_0 fug_02 = (fug_0)fcz_12.e();
            dfc dfc2 = new dfc(16218);
            dfc2.a(fug_02.getText());
            add_2.b().a(dfc2);
        }
    }

    public static void onSheetNameChanged(fcd_2 fcd_22) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        dfc dfc2 = new dfc(16218);
        dfc2.a(fug_02.getText());
        add_2.b().a(dfc2);
    }

    public static void changeBuildSheetLevel(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(19998);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void changeAptitudeSheet(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(16657);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void changeSpellDeck(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(19333);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void changeEquipmentSheet(fcf_2 fcf_22) {
        if (fcf_22.k()) {
            dfc dfc2 = new dfc(19311);
            dfc2.a(fcf_22.l());
            add_2.b().a(dfc2);
        }
    }

    public static void changeIcon(fck_2 fck_22) {
        dfc dfc2 = new dfc(19066);
        add_2.b().a(dfc2);
        if (fpm_0.b().q("buildSheetSetIconsDialog")) {
            fpm_0.b().o("buildSheetSetIconsDialog");
        }
    }

    public static void openEquipmentSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(16583);
        add_2.b().a(dfc2);
    }

    public static void openSpellSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(18070);
        add_2.b().a(dfc2);
    }

    public static void openAptitudeSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(19876);
        add_2.b().a(dfc2);
    }

    public static void addNewSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(17431);
        add_2.b().a(dfc2);
    }

    public static void removeSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(17577);
        add_2.b().a(dfc2);
    }

    public static void selectPage(fck_2 fck_22, ble_0 ble_02) {
        dfc dfc2 = new dfc(18529);
        dfc2.a(ble_02);
        add_2.b().a(dfc2);
    }

    public static void closeCustom(fck_2 fck_22) {
        dfc dfc2 = new dfc(16359);
        add_2.b().a(dfc2);
    }

    public static void activateBuildSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(19700);
        add_2.b().a(dfc2);
    }

    public static void validateBuildSheet(fck_2 fck_22) {
        dfc dfc2 = new dfc(17037);
        add_2.b().a(dfc2);
    }

    public static void createEquipmentSheet(fck_2 fck_22) {
        blx_1 blx_12 = cwa_0.a.j().l();
        if (blx_12 == null) {
            return;
        }
        eZb eZb2 = blx_12.dB();
        if (eZb2 == null) {
            return;
        }
    }

    public static void createSpellSheet(fck_2 fck_22) {
        blx_1 blx_12 = cwa_0.a.j().l();
        if (blx_12 == null) {
            return;
        }
        fiR fiR2 = blx_12.dw();
        if (fiR2 == null) {
            return;
        }
    }

    public static void createAptitudeSheet(fck_2 fck_22) {
        blx_1 blx_12 = cwa_0.a.j().l();
        if (blx_12 == null) {
            return;
        }
        ezy_2 ezy_22 = blx_12.dA();
        if (ezy_22 == null) {
            return;
        }
    }

    public static void openIconsPanel(fzs fzs2) {
        dfc dfc2 = new dfc(16121);
        add_2.b().a(dfc2);
    }

    public static void selectIcon(fcb_2 fcb_22) {
        dfc dfc2 = new dfc(18150);
        bla_0 bla_02 = (bla_0)fcb_22.j();
        dfc2.b(bla_02.a());
        add_2.b().a(dfc2);
    }

    public static void upBuildIndex(fck_2 fck_22, ble_0 ble_02) {
        dfc dfc2 = new dfc(18956);
        dfc2.a(ble_02);
        add_2.b().a(dfc2);
    }

    public static void downBuildIndex(fck_2 fck_22, ble_0 ble_02) {
        dfc dfc2 = new dfc(17007);
        dfc2.a(ble_02);
        add_2.b().a(dfc2);
    }
}

