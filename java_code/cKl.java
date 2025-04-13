/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.awt.Point;
import org.apache.log4j.Logger;

@fpw_0
public class cKl
extends cHn {
    private static final Logger a = Logger.getLogger(cKl.class);
    public static final String PACKAGE = "wakfu.worldEditor";
    private static final int b = 30;
    private static final int c = 30;
    private static final int d = 5;
    private static afe_1 e;
    private static int f;
    static boolean g;
    private static boolean h;
    private static cKr i;
    static int j;
    static int k;
    static fkr_0 l;

    public static void close(fck_2 fck_22) {
        if (ddZ.d().k().h()) {
            String string = bae.h().a("question.havenWorldEditorClose", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new cKm());
        } else {
            cKl.a();
        }
    }

    static void a() {
        fpm_0.b().o("worldEditorDialog");
    }

    public static void keyPressed(fcd_2 fcd_22, cks_2 cks_22) {
        switch (fcd_22.k()) {
            case 39: {
                cks_22.a(30.0f, 0.0f);
                break;
            }
            case 37: {
                cks_22.a(-30.0f, 0.0f);
                break;
            }
            case 38: {
                cks_22.a(0.0f, 30.0f);
                break;
            }
            case 40: {
                cks_22.a(0.0f, -30.0f);
                break;
            }
        }
    }

    public static void onMouseOut(fck_2 fck_22, cks_2 cks_22) {
        fyt_0.a().c();
        fzd_0.a().d();
        fis_1.a().a("havenWorldOverCatalogEntry", (Object)null);
        cKl.resetDrag(fck_22, cks_22);
    }

    public static void onMapDrag(fck_2 fck_22, cks_2 cks_22) {
        if (e == null || l != null) {
            return;
        }
        g = true;
        int n = fck_22.a(cks_22);
        int n2 = fck_22.b(cks_22);
        int n3 = n - e.a();
        int n4 = n2 - e.b();
        if (Math.abs(n3) > f || Math.abs(n4) > f) {
            f = 0;
            cks_22.a((float)n3 / cks_22.getZoomFactor(), (float)n4 / cks_22.getZoomFactor());
            e.b(n, n2);
        }
    }

    public static void onMouseWheel(fck_2 fck_22, cks_2 cks_22) {
        if (fck_22.z() < 0) {
            cks_22.a();
        } else {
            cks_22.c();
        }
    }

    public static void onClick(fck_2 fck_22, cks_2 cks_22, fso fso2) {
        if (g) {
            g = false;
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        erl_1 erl_12 = bos_22.a(bmr_12.a_());
        if (erl_12 == null) {
            return;
        }
        ern_1 ern_12 = bos_22.c(erl_12.d());
        if (ern_12 == null) {
            return;
        }
        if (!ern_12.a(eQt.i)) {
            return;
        }
        j = fck_22.a(cks_22);
        k = fck_22.b(cks_22);
        fso2.setVisible(false);
        l = null;
        if (fck_22.x() == 3) {
            Object object;
            cks_22.setCurrentLayer(ddZ.d().k().c());
            cks_22.setSelectTool();
            if (cks_22.getCurrentLayer() != fks_0.b) {
                return;
            }
            fkr_0 fkr_02 = cks_22.getBuildingUnderMouse(j, k);
            if (fkr_02 == null) {
                h = false;
                fyt_0.a().c();
                fzd_0.a().d();
                return;
            }
            fkr_0 fkr_03 = fkr_02;
            btd_2 btd_22 = ddZ.d().a(fkr_03);
            if (btd_22 != null && btd_22.c().a() == cLn.b) {
                return;
            }
            l = fkr_03;
            if (btd_22 != null) {
                String string = btd_22.a();
                bue_2 bue_22 = btd_22.b();
                fis_1.a().a("selectedBuilding", bue_22);
            } else {
                object = bua_2.a.b(l.d());
                if (object != null) {
                    String string = ((btv_2)object).e();
                    bue_2 bue_23 = ((btv_2)object).f();
                    fis_1.a().a("selectedBuilding", object);
                } else {
                    l = null;
                }
            }
            object = (fvk_0)fso2.getElementMap().a("worldEditorDialog");
            ((fvk_0)object).a(new cKn(fso2, cks_22, (fvk_0)object));
            ((fyo)object).setNeedsToPostProcess();
            fta_0.getInstance().addEventListener(frd_0.C, new cKo(fso2), true);
        }
        if (fck_22.x() == 1) {
            cks_22.c(j, k);
            byte by = ddZ.d().k().e();
            if (by != btu_2.c.c() && by != btu_2.a.c()) {
                cks_22.setSelectTool();
                h = false;
            }
        }
    }

    public static void evolveBuilding(fzs fzs2, cks_2 cks_22, fso fso2) {
        fso2.setVisible(false);
        cKl.evolveBuilding(fzs2, bua_2.a.b(l.d()));
    }

    public static void removeBuilding(fck_2 fck_22, cks_2 cks_22, fso fso2) {
        fso2.setVisible(false);
        if (l == null) {
            return;
        }
        if (l.d() < 0L) {
            btd_2 btd_22 = ddZ.d().a(l);
            dgc_0 dgc_02 = new dgc_0(btd_22);
            dgc_02.a_(18913);
            add_2.b().a(dgc_02);
        } else {
            cks_22.setTool(new cKX());
            cks_22.c(j, k);
            cks_22.setSelectTool();
        }
    }

    public static void moveBuilding(fck_2 fck_22, cks_2 cks_22, fso fso2) {
        fso2.setVisible(false);
        if (l == null) {
            return;
        }
        fyt_0.a().a(frb_0.p, true);
        h = true;
        fis_1.a().a("havenWorldCatalogPlacingMode", h);
        cks_22.setTool(new cLc(l));
        cks_22.getTool().b(fck_22.a(cks_22), fck_22.b(cks_22));
    }

    public static void resetDrag(fck_2 fck_22, cks_2 cks_22) {
        e = null;
        f = 5;
        cks_22.d();
        cks_22.b((fkt_0)null);
    }

    public static void onMousePress(fck_2 fck_22, cks_2 cks_22) {
        if (e == null && fck_22.x() == 3) {
            e = new afe_1(fck_22.a(cks_22), fck_22.b(cks_22));
            f = 5;
        }
    }

    public static void onMouseMove(fck_2 fck_22, cks_2 cks_22, fso fso2) {
        int n;
        int n2 = fck_22.a(cks_22);
        boolean bl = cKl.a(cks_22, n2, n = fck_22.b(cks_22));
        if (bl && cKl.a(cks_22)) {
            return;
        }
        if (!h) {
            if (bl || cks_22.getTool() instanceof cLa) {
                fyt_0.a().a(frb_0.p, true);
                fzd_0.a().a(null, cks_22.getWorkingHavenWorld().p() + " \u00a7", 30, 0, frs_0.d);
            } else {
                fyt_0.a().c();
                fzd_0.a().d();
            }
        } else {
            fyt_0.a().a(frb_0.p, true);
        }
        cks_22.b(n2, n);
        fso2.setVisible(false);
        fkr_0 fkr_02 = cks_22.getBuildingUnderMouse(n2, n);
        if (h || g || cks_22.getCurrentLayer() != fks_0.b || fkr_02 == l) {
            return;
        }
        if (fkr_02 == null) {
            fis_1.a().a("havenWorldOverCatalogEntry", (Object)null);
            return;
        }
        long l = fkr_02.d();
        btv_2 btv_22 = bua_2.a.b(l);
        if (btv_22 == null) {
            btd_2 btd_22 = ddZ.d().a(fkr_02);
            fis_1.a().a("havenWorldOverCatalogEntry", btd_22);
        } else {
            fis_1.a().a("havenWorldOverCatalogEntry", btv_22);
        }
        fso2.setPosition(new Point(n2, n + 15));
        fso2.setVisible(true);
    }

    private static boolean a(cks_2 cks_22) {
        csm_1 csm_12 = cks_22.getTool();
        if (!(csm_12 instanceof cLa)) {
            try {
                cks_22.setTool(new cLa(csm_12, cks_22.getWorkingHavenWorld().p()));
            }
            catch (Exception exception) {
                a.error((Object)"", (Throwable)exception);
                return true;
            }
        }
        return false;
    }

    private static boolean a(cks_2 cks_22, int n, int n2) {
        afe_1 afe_12 = cks_22.getPatchCoordFromMouse(n, n2);
        short s2 = fkh_0.e(afe_12.a());
        short s3 = fkh_0.f(afe_12.b());
        return cLa.a(cks_22, s2, s3);
    }

    public static void zoomIn(fck_2 fck_22, cks_2 cks_22) {
        cks_22.a();
    }

    public static void zoomOut(fck_2 fck_22, cks_2 cks_22) {
        cks_22.c();
    }

    public static void validate(fck_2 fck_22, cks_2 cks_22) {
        dfc.d((short)19778);
    }

    public static void onMouseOverElement(fzs fzs2, bue_2 bue_22, fil_1 fil_12) {
        fpu_0.popup(fzs2, fil_12);
        fvE fvE2 = (fvE)fzs2.e();
        fvE2.getAppearance().setModulationColor(anr_0.v);
        fis_1.a().a("havenWorldOverCatalogEntry", bue_22);
        if (bue_22.j()) {
            cdw_0.n().c(600193L);
        } else {
            cdw_0.n().c(600010L);
        }
    }

    public static void onMouseOutElement(fzs fzs2, bue_2 bue_22, fil_1 fil_12) {
        fpu_0.closePopup(fzs2, fil_12);
        fvE fvE2 = (fvE)fzs2.e();
        if (bue_22.equals(fis_1.a().e("havenWorldSelectedCatalogEntry"))) {
            fvE2.getAppearance().setModulationColor(anr_0.v);
        } else {
            fvE2.getAppearance().setModulationColor(azf_2.e);
        }
        fis_1.a().a("havenWorldOverCatalogEntry", (Object)null);
    }

    public static void toggleQuotationsMode(fzs fzs2) {
        boolean bl = fis_1.a().c("havenWorldCatalogQuotationMode");
        fis_1.a().a("havenWorldCatalogQuotationMode", !bl);
        cKl.unloadConflictContainer(fzs2);
    }

    public static void removeEntryFromQuotation(fzs fzs2, btd_2 btd_22) {
        dgc_0 dgc_02 = new dgc_0(btd_22);
        dgc_02.a_(18913);
        add_2.b().a(dgc_02);
    }

    public static void onMouseOverQuotationElement(fcb_2 fcb_22, cks_2 cks_22) {
        btd_2 btd_22 = (btd_2)fcb_22.j();
        cLm cLm2 = btd_22.c();
        if (cLm2 != null) {
            cks_22.b((fkt_0)cLm2.e());
        }
    }

    public static void onMouseOutQuotationElement(fcb_2 fcb_22, cks_2 cks_22) {
        cks_22.b((fkt_0)null);
    }

    public static void selectElementFromCatalog(fcb_2 fcb_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        bos_2 bos_22 = bmr_12.eV();
        erl_1 erl_12 = bos_22.a(bmr_12.a_());
        if (erl_12 == null) {
            return;
        }
        ern_1 ern_12 = bos_22.c(erl_12.d());
        if (ern_12 == null) {
            return;
        }
        if (!ern_12.a(eQt.i)) {
            fpm_0.b().a(bae.h().a("error.noRightToManageHavenWorld", new Object[0]), cfn_0.a(8), 3L, 7, 1);
            return;
        }
        bue_2 bue_22 = (bue_2)fcb_22.j();
        if (!bue_22.j()) {
            return;
        }
        dgy_0 dgy_02 = new dgy_0(bue_22);
        dgy_02.a_(18623);
        add_2.b().a(dgy_02);
        fyt_0.a().a(frb_0.p, true);
        h = true;
        fis_1.a().a("havenWorldCatalogPlacingMode", h);
        fta_0.getInstance().addEventListener(frd_0.C, new cKp(), true);
    }

    public static void cancelAction() {
        h = false;
        fis_1.a().a("havenWorldCatalogPlacingMode", h);
        fyt_0.a().c();
        fis_1.a().a("havenWorldSelectedCatalogEntry", (Object)null);
    }

    public static void selectCategory(fcb_2 fcb_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(16051);
        dfc2.a(((btj_2)fcb_22.j()).a());
        add_2.b().a(dfc2);
    }

    public static void selectSubCategoryFromCatalog(fzs fzs2, btm_2 btm_22) {
        btm_22.b();
    }

    public static void unloadConflictContainer(fzs fzs2) {
        ddZ.d().l();
    }

    public static void onConflictTextClick(fzs fzs2, cks_2 cks_22) {
        fuk_0 fuk_02 = (fuk_0)fzs2.e();
        fxH fxH2 = fuk_02.getBlockUnderMouse();
        if (fxH2 == null || fxH2.g() != fxI.b) {
            return;
        }
        fxQ fxQ2 = fxH2.h();
        if (fxQ2.b() != ane_2.b) {
            return;
        }
        String string = ((fxS)fxQ2).p();
        if (string != null && string.length() > 0) {
            try {
                String[] stringArray = string.split(";");
                int n = Co.c(stringArray[0]);
                int n2 = Co.c(stringArray[1]);
                cks_22.a(n, n2);
            }
            catch (Exception exception) {
                a.error((Object)"", (Throwable)exception);
            }
        }
    }

    public static void scrollUp(fzs fzs2, cks_2 cks_22) {
        cKl.stopScroll(fzs2);
        aej_2 aej_22 = aej_2.g;
        cKl.a(((fck_2)fzs2).w(), cks_22, aej_22);
    }

    public static void scrollDown(fzs fzs2, cks_2 cks_22) {
        cKl.stopScroll(fzs2);
        cKl.a(((fck_2)fzs2).w(), cks_22, aej_2.c);
    }

    public static void scrollLeft(fzs fzs2, cks_2 cks_22) {
        cKl.stopScroll(fzs2);
        cKl.a(((fck_2)fzs2).v(), cks_22, aej_2.e);
    }

    public static void scrollRight(fzs fzs2, cks_2 cks_22) {
        cKl.stopScroll(fzs2);
        cKl.a(((fck_2)fzs2).v(), cks_22, aej_2.a);
    }

    private static void a(int n, cks_2 cks_22, aej_2 aej_22) {
    }

    public static void stopScroll(fzs fzs2) {
        if (i != null) {
            if (fzs2 != null && fzs2.f() == frd_0.z && i.a((fck_2)fzs2)) {
                return;
            }
            ado_1.a().b(i);
            i = null;
        }
    }
}

