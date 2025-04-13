/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cFp
 */
@fpw_0
public class cfp_0 {
    public static final String PACKAGE = "wakfu.achievements";

    public static void selectCategory(fcb_2 fcb_22) {
        dfe_0 dfe_02 = new dfe_0((bin_2)fcb_22.j());
        add_2.b().a(dfe_02);
    }

    public static void displayHistory(fzs fzs2) {
        dfe_0 dfe_02 = new dfe_0(null);
        add_2.b().a(dfe_02);
    }

    public static void selectAchievement(fcb_2 fcb_22) {
        dff_0 dff_02 = new dff_0((biw_2)fcb_22.j());
        add_2.b().a(dff_02);
    }

    public static void mouseOverAchievementQuickList(fcb_2 fcb_22) {
        fis_1.a().a("overQuickAchievement", fcb_22.j());
    }

    public static void mouseOutAchievementQuickList(fcb_2 fcb_22) {
        fis_1.a().a("overQuickAchievement", fis_1.a().e("selectedAchievement"));
    }

    public static void changeRewardBackgroundAndPopup(fck_2 fck_22, fil_1 fil_12, fvE fvE2) {
        if (fck_22.f() == frd_0.y) {
            fvE2.setStyle("itemSelectedBackground");
            fpu_0.popup(fck_22, fil_12);
        } else if (fck_22.f() == frd_0.z) {
            fvE2.setStyle("itemBackground");
            fpu_0.closePopup(fck_22, fil_12);
        }
    }

    public static void changeAchievementFilter(fcp_2 fcp_22, cvo_0 cvo_02) {
        if (fcp_22.j()) {
            cVh.e().a(cvo_02);
        }
    }

    public static void selectLastCompletedAchievement(fzs fzs2) {
        dff_0 dff_02 = new dff_0(null);
        add_2.b().a(dff_02);
    }

    public static void selectPreviousAchievementQuickList(fzs fzs2) {
        biw_2 biw_22 = cVh.e().h().g().L_();
        if (biw_22 == null) {
            return;
        }
        dff_0 dff_02 = new dff_0(biw_22);
        add_2.b().a(dff_02);
    }

    public static void selectNextAchievementQuickList(fzs fzs2) {
        biw_2 biw_22 = cVh.e().h().g().M_();
        if (biw_22 == null) {
            return;
        }
        dff_0 dff_02 = new dff_0(biw_22);
        add_2.b().a(dff_02);
    }

    public static void goBackCategory(fzs fzs2) {
        dfe_0 dfe_02 = new dfe_0(cVh.e().h().g());
        add_2.b().a(dfe_02);
    }

    public static boolean followAchievement(fcp_2 fcp_22, biw_2 biw_22) {
        if (fcp_22.j() == biw_22.c()) {
            return true;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(18531);
        dfc2.b(biw_22.i());
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
        return true;
    }

    public static void share(fzs fzs2, biw_2 biw_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(16906);
        dfc2.b(biw_22.i());
        add_2.b().a(dfc2);
    }

    public static void switchCharacterInAchievementDialog(fzs fzs2, bnh_1 bnh_12) {
        cfp_0.a(bnh_12, "achievementsDialog");
    }

    public static void switchCharacterInQuestDialog(fzs fzs2, bnh_1 bnh_12) {
        cfp_0.a(bnh_12, "questDialog");
    }

    private static void a(bnh_1 bnh_12, String string) {
        fis_1.a().a("characterSheet", (Object)bzg_1.a.a((bnh_1)euw_2.a.d(bnh_12.a_())), string);
        dfc dfc2 = new dfc();
        dfc2.a_(18390);
        dfc2.a(bnh_12.a_());
        add_2.b().a(dfc2);
    }

    public static void openItemDetailWindow(fcb_2 fcb_22) {
        if (fcb_22.x() != 3) {
            return;
        }
        Object object = fcb_22.j();
        if (!(object instanceof bir_2)) {
            return;
        }
        bir_2 bir_22 = (bir_2)object;
        if (bir_22.b() == null) {
            return;
        }
        OR oR = bir_22.b().d();
        if (oR == bhn_1.p) {
            dhb_0 dhb_02 = new dhb_0();
            bpl_0 bpl_02 = bir_22.g();
            dhb_02.a(bpl_02);
            dhb_02.c(fcb_22.x());
            dhb_02.a(((fyb_0)fcb_22.d()).getElementMap().c());
            dhb_02.a_(18677);
            add_2.b().a(dhb_02);
        } else if (oR == bhn_1.e) {
            cfq_0.sendOpenCloseItemDetailMessage(((fyb_0)fcb_22.d()).getElementMap().c(), bir_22.f());
        }
    }

    public static void openCloseRewardDescription(fcb_2 fcb_22, fso fso2) {
        int n;
        if (!(fcb_22.j() instanceof bir_2)) {
            return;
        }
        bir_2 bir_22 = (bir_2)fcb_22.j();
        int n2 = n = bir_22.b().c() != null && bir_22.b().c().length > 0 ? bir_22.b().c()[0] : 0;
        if (bir_22.b().d() == bhn_1.p) {
            bph_0 bph_02 = bpp_0.a().a(n);
            bpl_0 bpl_02 = new bpl_0(bph_02, 0, -1L, null);
            fis_1.a().a("describedSpell", bpl_02);
            fis_1.a().a("describedSpellRealLevel", bpl_02.c());
            fil_1 fil_12 = (fil_1)fso2.getElementMap().a("spellDetailPopup");
            fil_12.setHotSpotPosition(frs_0.h);
            fil_12.setAlign(frs_0.b);
            if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                fpu_0.popup(fil_12, (fvE)fcb_22.e());
            } else if (fcb_22.f() == frd_0.l) {
                fpu_0.closePopup(fcb_22, fil_12);
            }
        } else if (bir_22.b().d() == bhn_1.e) {
            Object r2 = eyo_1.g().d(n);
            if (r2 == null) {
                return;
            }
            fil_1 fil_13 = (fil_1)fso2.getElementMap().a("itemDetailPopup");
            fil_13.setHotSpotPosition(frs_0.h);
            fil_13.setAlign(frs_0.b);
            if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
                fis_1.a().a("itemPopupDetail", r2);
                fpu_0.popup(fil_13, (fvE)fcb_22.e());
            } else if (fcb_22.f() == frd_0.l) {
                fis_1.a().a("itemPopupDetail", (Object)null);
                fpu_0.closePopup(fcb_22, fil_13);
            }
        }
    }
}

