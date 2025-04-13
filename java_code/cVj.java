/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class cVj
implements Runnable {
    final /* synthetic */ int a;

    cVj(int n) {
        this.a = n;
    }

    @Override
    public void run() {
        Object object;
        boolean bl = !fbf_2.a().a("followedAchievementsDialog") || fbf_2.a().b("followedAchievementsDialog");
        String string = bl ? "verticalFollowedAchievementsDialog" : "followedAchievementsDialog";
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 == null) {
            return;
        }
        fus_0 fus_02 = (fus_0)fyy_02.a("achievementsList");
        ArrayList<Object> arrayList = fus_02.getItems();
        int n = -1;
        int n2 = arrayList.size();
        for (int k = 0; k < n2; ++k) {
            object = (bim_2)arrayList.get(k);
            if (object == null || ((bim_2)object).i() != this.a) continue;
            n = k;
            break;
        }
        if (n == -1) {
            return;
        }
        ftj_0 ftj_02 = fus_02.getRenderables().get(n);
        if (ftj_02 == null) {
            return;
        }
        fvE fvE2 = (fvE)ftj_02.getInnerElementMap().a("environmentQuestContainer");
        object = new fbx_1();
        ((fbx_1)object).onCheckOut();
        ((fbx_1)object).setFile("6001051.xps");
        ((fbx_1)object).setAlignment(frs_0.e);
        fvE2.getAppearance().add((fyb_0)object);
    }
}

