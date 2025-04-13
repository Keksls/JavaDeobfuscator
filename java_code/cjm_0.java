/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cJm
 */
@fpw_0
public class cjm_0 {
    public static final String PACKAGE = "wakfu.protectorManagement";
    private static final Logger a = Logger.getLogger(cjm_0.class);

    public static void selectMerchantItem(fcb_2 fcb_22) {
        fis_1.a().a("selectedProtectorMerchantItem", fcb_22.j());
    }

    public static void validateBudgetAllocation(fcd_2 fcd_22, fru_0 fru_02) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        int n = Co.a((Object)fug_02.getText(), -1);
        boolean bl = (long)n <= bwy_2.h().j().l().a();
        fru_02.setEnabled(bl);
    }

    public static void allocateBudget(fzs fzs2, fug_0 fug_02, bwi_2 bwi_22) {
        int n = Co.a((Object)fug_02.getText(), -1);
        if (n == -1) {
            a.warn((Object)("Impossible d'allouer le budget : " + fug_02.getText() + " n'est pas une valeur valide."));
            return;
        }
        if ((long)n > bwi_22.b().a()) {
            a.warn((Object)("Impossible d'allouer le budget : on demande " + n + "alors qu'il ne reste que " + bwi_22.b().a()));
            return;
        }
        dfc dfc2 = new dfc();
        dfc2.a_(18945);
        dfc2.b(n);
        dfc2.a(bwi_22.a().d);
        add_2.b().a(dfc2);
        fpm_0.b().o("protectorBudgetAllocateDialog");
    }

    public static void openAllocateBudget(fzs fzs2, bwi_2 bwi_22) {
        fis_1.a().a("selectedProtectorBudget", bwi_22);
        fpm_0.b().a("protectorBudgetAllocateDialog", cfi_0.a("protectorBudgetAllocateDialog"), 256L, (short)10000);
    }

    public static void validateBudgetTransfer(fcd_2 fcd_22, fru_0 fru_02) {
        fug_0 fug_02 = (fug_0)fcd_22.e();
        int n = Co.a((Object)fug_02.getText(), -1);
        boolean bl = (long)n <= bwy_2.h().j().l().a();
        fru_02.setEnabled(bl);
    }

    public static void transferBudget(fzs fzs2, fug_0 fug_02, fsk fsk2) {
        int n = Co.a((Object)fug_02.getText(), -1);
        if (n == -1) {
            a.warn((Object)("Impossible de transf\u00e9rer le budget : " + fug_02.getText() + " n'est pas une valeur valide."));
            return;
        }
        fgP fgP2 = bwy_2.h().j().l();
        if ((long)n > fgP2.a()) {
            a.warn((Object)("Impossible de transf\u00e9rer le budget : on demande " + n + "alors qu'il ne reste que " + fgP2.a()));
            return;
        }
        bVs bVs2 = (bVs)fsk2.getSelectedValue();
        dfc dfc2 = new dfc();
        dfc2.a_(19575);
        dfc2.a(bVs2.h());
        dfc2.b(n);
        add_2.b().a(dfc2);
        fug_02.c("0");
    }

    public static void openTransferBudget(fzs fzs2) {
        fyb_0 fyb_02 = fpm_0.b().a("protectorBudgetTransferDialog", cfi_0.a("protectorBudgetTransferDialog"), 256L, (short)10000);
        fsk fsk2 = (fsk)fyb_02.getElementMap().a("territoryCombo");
        fsk2.getList().setListFilter(new cjn_0());
    }

    public static void changeChallengeCategory(fcp_2 fcp_22, bwt_2 bwt_22) {
        if (fcp_22.j()) {
            ftI ftI2 = (ftI)fcp_22.e();
            byte by = Co.g(ftI2.getValue());
            blr_2 blr_22 = blr_2.a(by);
            bwt_22.a(blr_22);
        }
    }

    public static void changeZoologyCategory(fcp_2 fcp_22, bwe_2 bwe_22) {
        if (fcp_22.j()) {
            ftI ftI2 = (ftI)fcp_22.e();
            boolean bl = Co.a(ftI2.getValue());
            bwe_22.a(bl);
        }
    }

    public static void reintroduce(fzs fzs2, bwe_2 bwe_22, bwd_2 bwd_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(18714);
        dfc2.b(bwd_22.j());
        dfc2.a(bwd_22.h());
        add_2.b().a(dfc2);
    }

    public static void protect(fzs fzs2, bwe_2 bwe_22, bwd_2 bwd_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(17870);
        dfc2.b(bwd_22.j());
        dfc2.a(bwd_22.h());
        add_2.b().a(dfc2);
    }

    public static void unprotect(fzs fzs2, bwe_2 bwe_22, bwd_2 bwd_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(17191);
        dfc2.b(bwd_22.j());
        dfc2.a(bwd_22.h());
        add_2.b().a(dfc2);
    }

    public static void validMerchantItemPurchase(fck_2 fck_22, bnh_0 bnh_02, bnl_0 bnl_02) {
        if (fck_22.x() != 1) {
            return;
        }
        fis_1.a().a("selectedProtectorMerchantItem", bnl_02);
        dhq dhq2 = new dhq();
        dhq2.a_(18644);
        dhq2.a(bnh_02);
        add_2.b().a(dhq2);
    }

    public static void tabSelected(fzs fzs2) {
        if (fzs2.e() instanceof ftI) {
            fis_1.a().a("selectedProtectorMerchantItem", (Object)null);
        }
    }

    public static void setTaxValue(fcq_1 fcq_12) {
        bhg_1 bhg_12 = bwy_2.h().a(fjb_0.a);
        cjm_0.a(fcq_12.j(), bhg_12);
        fis_1.a().a((ajf_1)bhg_12, "taxValue", "taxPercentage", "taxPercentageLongDesc");
    }

    private static void a(float f2, bhg_1 bhg_12) {
        fja_0 fja_02 = bhg_12.b();
        fja_02.a(f2 * 5.0f / 100.0f);
    }

    public static void applyTaxes(fzs fzs2) {
        dfc.d((short)19448);
    }

    public static void onBoughtChallengeSelectionChange(fcp_2 fcp_22, blu_2 blu_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(17693);
        dfc2.b(blu_22.w().g());
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
    }

    public static void applyLaws(fzs fzs2) {
        dfc.d((short)16441);
        cjm_0.a(fzs2, false);
    }

    public static void openChallengeDescription(fck_2 fck_22, ajf_1 ajf_12) {
        if (fck_22.x() == 1) {
            return;
        }
        bll_2 bll_22 = null;
        if (ajf_12 instanceof bll_2) {
            bll_22 = (bll_2)ajf_12;
        } else if (ajf_12 instanceof bnf_0) {
            bnf_0 bnf_02 = (bnf_0)ajf_12;
            bll_22 = blj_2.a.a(bnf_02.c());
        }
        if (bll_22 != null) {
            cVh.e().a(bll_22);
        }
    }

    public static void openClimateBonusDescription(fck_2 fck_22, bng_0 bng_02) {
        if (fck_22.x() == 1) {
            return;
        }
        if (bng_02 != null) {
            fyb_0 fyb_02 = fpm_0.b().a("climateBonusDetailDialog" + bng_02.c(), cfi_0.a("climateBonusDetailDialog"), 17L, (short)10000);
            fis_1.a().a("climateDetail", (Object)bng_02, fyb_02.getElementMap());
        }
    }

    private static void a(fzs fzs2, boolean bl) {
        fru_0 fru_02 = (fru_0)((fyb_0)fzs2.d()).getElementMap().a("applyLawsButton");
        fru_02.setEnabled(bl);
    }

    public static void displayPage(fcp_2 fcp_22) {
        if (fcp_22.j()) {
            ftI ftI2 = (ftI)fcp_22.e();
            fis_1.a().a("currentPage", (Object)ftI2.getValue(), ftI2.getElementMap());
        }
    }
}

