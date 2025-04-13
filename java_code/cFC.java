/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cFC {
    public static final String PACKAGE = "wakfu.artisansBook";

    public static void findArtisan(fck_2 fck_22, brw_0 brw_02) {
        dfO dfO2 = new dfO(brw_02);
        add_2.b().a(dfO2);
    }

    public static void nextPageArtisans(fck_2 fck_22) {
        dfO dfO2 = new dfO(dfp_0.b);
        add_2.b().a(dfO2);
    }

    public static void previousPageArtisans(fck_2 fck_22) {
        dfO dfO2 = new dfO(dfp_0.c);
        add_2.b().a(dfO2);
    }

    public static void switchCraft(fcf_2 fcf_22) {
        if (!fcf_22.k()) {
            return;
        }
        brt_1 brt_12 = (brt_1)fcf_22.l();
        dfc dfc2 = new dfc();
        dfc2.a_(18274);
        dfc2.b(brt_12.e());
        add_2.b().a(dfc2);
    }

    public static void checkOkFilter(fck_2 fck_22) {
        dfm_0 dfm_02 = new dfm_0(dfN.b);
        add_2.b().a(dfm_02);
    }

    public static void setMinLevelFilter(fcd_2 fcd_22, fug_0 fug_02) {
        dfm_0 dfm_02 = new dfm_0(dfN.c);
        dfm_02.b(fug_02.getText());
        add_2.b().a(dfm_02);
    }

    public static void setMaxLevelFilter(fcd_2 fcd_22, fug_0 fug_02) {
        dfm_0 dfm_02 = new dfm_0(dfN.d);
        dfm_02.b(fug_02.getText());
        add_2.b().a(dfm_02);
    }

    public static void validNameFilter(fcd_2 fcd_22, fug_0 fug_02) {
        dfm_0 dfm_02 = new dfm_0(dfN.a);
        dfm_02.b(fug_02.getText());
        add_2.b().a(dfm_02);
    }

    public static void contactArtisan(fck_2 fck_22, bsb bsb2) {
        dfc dfc2 = new dfc();
        dfc2.a_(17113);
        dfc2.a(String.valueOf(bsb2.b()));
        add_2.b().a(dfc2);
    }

    public static void nextPage(fck_2 fck_22) {
        dfk_0 dfk_02 = new dfk_0(dfl_0.a);
        add_2.b().a(dfk_02);
    }

    public static void previousPage(fck_2 fck_22) {
        dfk_0 dfk_02 = new dfk_0(dfl_0.b);
        add_2.b().a(dfk_02);
    }
}

