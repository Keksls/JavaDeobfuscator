/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

@fpw_0
public class cHa {
    public static final String PACKAGE = "wakfu.followedAchievements";
    static Runnable a;

    public static void fillList(ftj_0 ftj_02, int n, boolean bl) {
        bim_2 bim_22 = (bim_2)ftj_02.getItemValue();
        if (bim_22 == null) {
            return;
        }
        int n2 = bim_22.i();
        if (n2 == n && !bl) {
            return;
        }
        fyy_0 fyy_02 = ftj_02.getInnerElementMap();
        cHa.a((fvE)fyy_02.a("environmentQuestContainer"), bl);
        fus_0 fus_02 = (fus_0)fyy_02.a("goalsList");
        ArrayList<ftj_0> arrayList = fus_02.getRenderables();
        int n3 = arrayList.size();
        for (int k = 0; k < n3; ++k) {
            ftj_0 ftj_03 = arrayList.get(k);
            fyy_0 fyy_03 = ftj_03.getInnerElementMap();
            cHa.a((fvE)fyy_03.a("goalDesc"), bl);
            cHa.a((fvE)fyy_03.a("goalValue"), bl);
        }
        cHa.a((fvE)fyy_02.a("timeText"), bl);
        cHa.a((fvE)fyy_02.a("timeValue"), bl);
        cHa.a((fvE)fyy_02.a("rankingText"), bl);
        cHa.a((fvE)fyy_02.a("rankingValue"), bl);
    }

    private static void a(fvE fvE2, boolean bl) {
        if (fvE2 == null || fvE2.getAppearance() == null) {
            return;
        }
        azj_2 azj_22 = fvE2.getAppearance().getModulationColor();
        azf_2 azf_22 = bl ? azf_2.b : azf_2.e;
        azf_2 azf_23 = azj_22 != null ? new azf_2(azj_22.i()) : azf_2.e;
        azf_2 azf_24 = bl ? azf_2.e : azf_2.b;
        fjp_2 fjp_22 = new fjp_2(azf_23, azf_24, fvE2.getAppearance(), 0, 150, 1, false, fjw_2.b);
        fvE2.getAppearance().removeTweensOfType(fjp_2.class);
        fvE2.getAppearance().addTween(fjp_22);
    }

    public static void fadeAll(boolean bl, int n) {
        if (bl) {
            a = new chb_0(bl, n);
            ado_1.a().a(a, 150L, 1);
        } else {
            if (a != null) {
                ado_1.a().b(a);
                a = null;
            }
            cHa.doFadeAll(bl, n);
        }
    }

    public static void doFadeAll(boolean bl, int n) {
        String string = fpm_0.b().q("followedAchievementsDialog") ? "followedAchievementsDialog" : "verticalFollowedAchievementsDialog";
        ArrayList arrayList = new ArrayList();
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        cHa.fillList((ftj_0)fyy_02.a("environmentRenderable"), n, bl);
        cHa.fillList((ftj_0)fyy_02.a("almanaxRenderable"), n, bl);
        fus_0 fus_02 = (fus_0)fyy_02.a("achievementsList");
        ArrayList<ftj_0> arrayList2 = fus_02.getRenderables();
        int n2 = arrayList2.size();
        for (int k = 0; k < n2; ++k) {
            cHa.fillList(arrayList2.get(k), n, bl);
        }
    }

    public static void popup(fzs fzs2, fil_1 fil_12, bim_2 bim_22, fvE fvE2) {
        fis_1.a().a("displayedAchievement", bim_22);
        fpu_0.popup(fzs2, fil_12, fvE2);
    }

    public static void openAchievementDialog(fzs fzs2, biw_2 biw_22) {
        if (biw_22 == null) {
            return;
        }
        boolean bl = biz_2.a.e(azu_0.j().k().a_(), biw_22.i());
        cVh.e().a(bl, biw_22);
    }

    public static void onClick(fck_2 fck_22, bim_2 bim_22) {
        if (fck_22.x() == 3 && fck_22.t()) {
            cVh.a(bim_22.i(), false);
            return;
        }
        if (bim_22 instanceof biw_2) {
            cHa.openAchievementDialog(fck_22, (biw_2)bim_22);
        } else {
            cHa.openQuestDescriptionDialog(fck_22, bim_22);
        }
    }

    public static void onMouseEnter(fck_2 fck_22, bim_2 bim_22) {
        cHa.fadeAll(false, bim_22.i());
    }

    public static void onMouseExit(fck_2 fck_22, bim_2 bim_22) {
        cHa.fadeAll(true, bim_22.i());
    }

    public static void openQuestDescriptionDialog(fzs fzs2, bim_2 bim_22) {
        if (bim_22 == null) {
            return;
        }
        cVh.e().a(bim_22);
    }

    public static void toggleQuestOpened(fzs fzs2, bim_2 bim_22) {
        bim_22.a(!bim_22.o());
    }

    public static boolean followAchievement(fcp_2 fcp_22, biw_2 biw_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(18531);
        dfc2.b(biw_22.i());
        dfc2.a(fcp_22.j());
        add_2.b().a(dfc2);
        return true;
    }

    public static void compassObjective(fcp_2 fcp_22, bip_2 bip_22) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (fcp_22.j()) {
            biz_2.a.a(bmr_12.a_(), bip_22.j(), bmr_12.T_());
        } else if (biz_2.a.a(bip_22.j())) {
            biz_2.a.a(bmr_12.a_(), -1, bmr_12.T_());
        }
    }

    public static boolean unfollowAchievement(fzs fzs2, bim_2 bim_22) {
        dfc dfc2 = new dfc();
        dfc2.a_(18531);
        dfc2.b(bim_22.i());
        dfc2.a(false);
        add_2.b().a(dfc2);
        return true;
    }
}

