/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

@fpw_0
public abstract class cGj {
    public static final String PACKAGE = "wakfu.companionsEmbedded";

    public static void selectCompanion(fcb_2 fcb_22, fvk_0 fvk_02) {
        String string = fvk_02.getElementMap().c();
        brn brn2 = (brn)fcb_22.j();
        cGj.selectCompanion(string, brn2.f());
    }

    public static void selectCompanion(fzs fzs2, brn brn2, fvk_0 fvk_02) {
        String string = fvk_02.getElementMap().c();
        cGj.selectCompanion(string, brn2.f());
    }

    public static void selectHero(fzs fzs2, bnh_1 bnh_12, fvk_0 fvk_02) {
        brm brm2 = new brm(bnh_12);
        bmk_1 bmk_12 = bzg_1.a.a(brm2);
        fyy_0 fyy_02 = fvk_02.getElementMap();
        String string = fyy_02.c();
        fis_1.a().a("characterSheet", (Object)bmk_12, string);
        if ("inventoryDialog".equals(string)) {
            fue_0 fue_02 = (fue_0)fyy_02.a("inventoriesScrollContainer");
            fue_02.setVerticalScrollBarPosition(1.0f);
            dfc dfc2 = new dfc(16198);
            dfc2.a(brm2.a());
            add_2.b().a(dfc2);
        } else if ("spellDeckDialog".equals(string)) {
            dfc dfc3 = new dfc(16823);
            dfc3.a(brm2.a());
            add_2.b().a(dfc3);
        } else if ("characterSheetDialog".equals(string)) {
            dfc dfc4 = new dfc(18905);
            dfc4.a(brm2.a());
            add_2.b().a(dfc4);
        } else if ("buildSheetSetDialog".equals(string)) {
            dfc dfc5 = new dfc(16871);
            dfc5.a(brm2.a());
            add_2.b().a(dfc5);
        } else if ("heroBuildDialog".equals(string)) {
            dfc dfc6 = new dfc(16336);
            dfc6.a(brm2.a());
            add_2.b().a(dfc6);
        }
    }

    public static void selectCompanion(String string, int n) {
        bmk_1 bmk_12 = cxo_0.c(n);
        fis_1.a().a("characterSheet", (Object)bmk_12, string);
        if ("heroBuildDialog".equals(string)) {
            dfc dfc2 = new dfc(19108);
            dfc2.b(n);
            add_2.b().a(dfc2);
        } else {
            dfc dfc3 = new dfc();
            dfc3.a_(18293);
            dfc3.a(string);
            dfc3.b(n);
            add_2.b().a(dfc3);
        }
    }

    public static void openSpellDescription(int n, bpl_0 bpl_02, String string) {
        azu_0 azu_02;
        dhb_0 dhb_02 = new dhb_0();
        dhb_02.a(bpl_02.a(false));
        dhb_02.c(n);
        dhb_02.a(string);
        dhb_02.a_(18677);
        add_2.b().a(dhb_02);
        if (n == 1 && (azu_02 = azu_0.j()).c(dcX.a)) {
            dha_0 dha_02 = new dha_0();
            dha_02.a_(19621);
            dha_02.a(bpl_02);
            add_2.b().a(dha_02);
        }
    }

    public static void openSpellDescription(fcb_2 fcb_22) {
        cGj.openSpellDescription(fcb_22, null);
    }

    public static void openSpellSlotDescription(fck_2 fck_22, bpr_0 bpr_02) {
        if (bpr_02.b() == null) {
            return;
        }
        cGj.openSpellDescription(fck_22.x(), bpr_02.b(), "spellDeckDialog");
    }

    public static void openSpellDescription(fcb_2 fcb_22, bmk_1 bmk_12) {
        bpl_0 bpl_02 = fcb_22.j() instanceof bpl_0 ? (bpl_0)fcb_22.j() : (bmk_12 != null ? new bpl_0((bph_0)fcb_22.j(), 0, -1L, bmk_12.l()) : (azu_0.j().c(dcX.a) ? new bpl_0((bph_0)fcb_22.j(), 0, -1L, dcX.a.j().l()) : new bpl_0((bph_0)fcb_22.j(), 0, -1L, azu_0.j().k())));
        fyy_0 fyy_02 = ((fyb_0)fcb_22.d()).getElementMap();
        cGj.openSpellDescription(fcb_22.x(), bpl_02, fyy_02.c());
        fut_0 fut_02 = (fut_0)fyy_02.a("tabbedContainer");
        if (fut_02 != null) {
            fut_02.setSelectedTabIndex(0);
        }
        if (bmk_12 != null && bmk_12.k()) {
            bqU bqU2 = (bqU)bmk_12;
            cGj.a(bpl_02, fyy_02, bqU2);
        }
    }

    private static void a(bpl_0 bpl_02, fyy_0 fyy_02, bqU bqU2) {
        int n;
        bqX bqX2 = bqU2.a(bpl_02.w());
        if (bqX2 == null) {
            return;
        }
        ArrayList<String> arrayList = bqX2.a();
        frO frO2 = (frO)fyy_02.a("animatedElementViewer");
        if (arrayList != null && arrayList.size() > 0) {
            frO2.setAnimName(arrayList.get(0));
            if (arrayList.size() > 1) {
                abu abu2 = frO2.getAnimatedElement();
                abu2.a(new cgk_0(frO2, arrayList, abu2));
            }
        }
        if ((n = bqX2.b()) != -1) {
            ado_1.a().a(new cGl(n, frO2), bqX2.c(), 1);
        }
    }

    private static void a(fvE fvE2) {
        fvE2.getAppearance().setModulationColor(new azf_2(1.0f, 0.87f, 0.0f, 1.0f));
    }

    public static void onMouseOverSpell(fzs fzs2, fso fso2) {
        cGj.a(fso2);
    }

    public static void onMouseOutSpell(fzs fzs2, fso fso2, Object object) {
        String string = fso2.getRenderableParent().getElementMap().c();
        bpl_0 bpl_02 = (bpl_0)fis_1.a().d("describedSpell", string);
        if (object instanceof bph_0 && bpl_02 != null && ((bph_0)object).i() == bpl_02.aT_()) {
            return;
        }
        if (object instanceof bpl_0 && bpl_02 != null && ((bpl_0)object).aT_() == bpl_02.aT_()) {
            return;
        }
        fso2.getAppearance().setModulationColor(new azf_2(1.0f, 1.0f, 1.0f, 1.0f));
    }

    public static void openCloseDescription(fcb_2 fcb_22) {
        cJF.openCloseDescription(fcb_22, "spellPopup");
    }
}

