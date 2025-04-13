/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxt
 */
class bxt_2
implements Runnable {
    final /* synthetic */ bxs_2 a;

    bxt_2(bxs_2 bxs_22) {
        this.a = bxs_22;
    }

    @Override
    public void run() {
        fyy_0 fyy_02 = fpm_0.b().h().d("tutorialMessageDialog");
        fvE fvE2 = (fvE)fyy_02.a("fightChallenges");
        fbx_1 fbx_12 = new fbx_1();
        fbx_12.onCheckOut();
        fbx_12.setFile("6001051.xps");
        fbx_12.setAlignment(frs_0.e);
        fvE2.getAppearance().add(fbx_12);
    }
}

