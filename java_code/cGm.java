/*
 * Decompiled with CFR 0.152.
 */
@fpw_0
public class cGm
extends cGj {
    public static final String PACKAGE = "wakfu.companionsManagement";

    public static void selectCompanion(fcb_2 fcb_22) {
        fis_1.a().a("characterSheet", fcb_22.j(), "companionsManagementDialog");
    }

    public static void selectAlphabeticalSorter(fcp_2 fcp_22) {
        cxq_0.a.h().a(fcp_22.j());
        cxq_0.a.i();
    }

    public static void selectLevelSorter(fcp_2 fcp_22) {
        cxq_0.a.h().b(fcp_22.j());
        cxq_0.a.i();
    }

    public static void selectFilter(fcp_2 fcp_22) {
        if (!fcp_22.j()) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        int n = Integer.parseInt(ftI2.getValue());
        bra_0 bra_02 = bra_0.a(n);
        cxq_0.a.h().a(bra_02);
        cxq_0.a.i();
    }

    public static void setPage(fcp_2 fcp_22) {
        if (!fcp_22.j()) {
            return;
        }
        ftI ftI2 = (ftI)fcp_22.e();
        byte by = Byte.parseByte(ftI2.getValue());
        fis_1.a().a("companionManagementPage", by);
    }

    public static void removeCompanion(fzs fzs2, bqU bqU2) {
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.unlinkCompanion", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
        fzm_02.a((n, string) -> {
            if (n == 8) {
                cmj cmj2 = new cmj(bqU2.w());
                azu_0.j().K().c(cmj2);
            }
        });
    }

    public static void retrieveAllItems(fzs fzs2, bqU bqU2) {
        cmm cmm2 = new cmm(bqU2.w());
        azu_0.j().K().c(cmm2);
    }

    public static void validRenameCompanion(fzs fzs2, fug_0 fug_02) {
        if (fzs2.f() == frd_0.n && ((fcd_2)fzs2).k() != 10) {
            return;
        }
        String string = fug_02.getText();
        bqU bqU2 = (bqU)fis_1.a().d("characterSheet", "companionsManagementDialog");
        if (string != null && string.length() > 0 && !string.equals(bqU2.x())) {
            if (!xu_0.a().a(string)) {
                aUh.a("error.connection.nicknameInvalidContent", new Object[0]);
            } else {
                cml cml2 = new cml(bqU2.w(), string);
                azu_0.j().K().c(cml2);
            }
        }
    }

    public static void openSpellPopup(fcb_2 fcb_22, fvk_0 fvk_02) {
        bpl_0 bpl_02 = (bpl_0)fcb_22.j();
        fis_1.a().a("describedSpell", bpl_02);
        fis_1.a().a("describedSpellRealLevel", bpl_02.c());
        fil_1 fil_12 = (fil_1)fvk_02.getElementMap().a("spellDetailPopup");
        if (fcb_22.f() == frd_0.m && !fta_0.getInstance().isDragging()) {
            fpu_0.popup(fil_12, fvk_02);
        } else if (fcb_22.f() == frd_0.l) {
            fpu_0.closePopup(fcb_22, fil_12);
        }
    }

    public static void buyCompanion(fzs fzs2, bqU bqU2) {
        bss_0<?, ?> bss_02 = bqU2.y();
        ddO.a().a(bss_02);
    }

    public static void displayPage(fzs fzs2, String string) {
        Byte by = Byte.valueOf(string);
        int n = fis_1.a().d("companionCurrentPageIndex");
        if (by == n) {
            return;
        }
        fis_1.a().a("companionCurrentPageIndex", by);
    }

    public static void addCompanionToParty(bqU bqU2) {
        long l = bqU2.w();
        cmf cmf2 = new cmf(l);
        azu_0.j().K().c(cmf2);
        bua_0.a.a(new buv_1());
        brd_0.k.b(false);
    }

    public static void addToParty(fcb_2 fcb_22) {
        if (!brd_0.k.j()) {
            return;
        }
        if (!(fcb_22.j() instanceof bmk_1)) {
            return;
        }
        bmk_1 bmk_12 = (bmk_1)fcb_22.j();
        brd_0.k.c(bmk_12);
        cGm.b(bmk_12);
    }

    public static void manageCharacterSelection(fcb_2 fcb_22) {
        if (!brd_0.k.j()) {
            return;
        }
        if (!(fcb_22.j() instanceof bmk_1)) {
            return;
        }
        bmk_1 bmk_12 = (bmk_1)fcb_22.j();
        boolean bl = brd_0.b(bmk_12);
        if (bl) {
            cGm.a(bmk_12);
            return;
        }
        euk_2 euk_22 = bmk_12.g();
        if (bmk_12.k()) {
            if (bmk_12.a()) {
                cGm.addCompanionToParty((bqU)bmk_12);
            }
        } else {
            enX enX2 = eul_2.a.a(euk_22);
            if (enX2 == enX.a) {
                cGm.addHeroToParty(bmk_12);
            } else if (enX2 == enX.e) {
                ddO.a().b("WAKFU_BOOSTER_PACK");
            }
        }
    }

    public static void removeFromParty(fzs fzs2, bmk_1 bmk_12) {
        cGm.a(bmk_12);
    }

    public static void openCompanyRewards(fzs fzs2) {
        if (fpm_0.b().q("companyRewardsDialog")) {
            fpm_0.b().o("companyRewardsDialog");
        } else {
            cYF.a().a(azu_0.j().k());
            fpm_0.b().a("companyRewardsDialog", cfi_0.a("companyRewardsDialog"), 32768L, (short)10000);
        }
    }

    public static void purchase(fzs fzs2, bvk_1 bvk_12) {
        dgj_0 dgj_02 = new dgj_0();
        dgj_02.a(bvk_12);
        dgj_02.b((short)1);
        dgj_02.a_(16162);
        add_2.b().a(dgj_02);
    }

    public static void upgradeSlot(fzs fzs2) {
        ddO.a().b("heros_wakfu");
    }

    public static void mouseOverHeroList(fcb_2 fcb_22) {
        fis_1.a().a("overHero", fcb_22.j());
    }

    public static void mouseOutHeroList(fcb_2 fcb_22) {
        fis_1.a().a("overHero", (Object)null);
    }

    private static void a(bmk_1 bmk_12) {
        byn_1 byn_12 = azu_0.j().k().dE();
        if (!byn_12.d()) {
            return;
        }
        long l = bmk_12.l().a_();
        if (bmk_12.k()) {
            l = -((bqU)bmk_12).w();
        }
        dfc dfc2 = new dfc();
        dfc2.a_(16138);
        dfc2.a(l);
        add_2.b().a(dfc2);
    }

    private static void b(bmk_1 bmk_12) {
        if (bmk_12.k()) {
            cGm.addCompanionToParty((bqU)bmk_12);
        } else {
            cGm.addHeroToParty(bmk_12);
        }
    }

    public static void addHeroToParty(bmk_1 bmk_12) {
        long l = bmk_12.l().a_();
        cmg cmg2 = new cmg(l);
        azu_0.j().K().c(cmg2);
        brd_0.k.b(false);
    }

    public static void selectExchange(fck_2 fck_22, bvk_1 bvk_12) {
        cGU.selectExchange(fck_22, bvk_12);
        if (!"exchangeBackground".equals(((fyb_0)fck_22.e()).getId())) {
            return;
        }
        if (fck_22.x() == 1) {
            if (brd_0.k.a() == bvk_12) {
                brd_0.k.k();
            } else {
                brd_0.k.a(bvk_12);
            }
        }
    }

    public static void unloadRewardPreviewDialog(fzs fzs2) {
        fpm_0.b().o("companyRewardsDialog");
        brd_0.k.k();
    }

    public static void changeDirection(fck_2 fck_22, frO frO2) {
        cGQ.changeDirection(fck_22, frO2);
    }

    public static void displayLevelInfos(fck_2 fck_22, ful_0 ful_02, String string) {
        ful_02.c(string);
    }
}

