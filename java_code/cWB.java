/*
 * Decompiled with CFR 0.152.
 */
class cWB
implements fzp_0 {
    final /* synthetic */ cwa_0 a;

    cWB(cwa_0 cwa_02) {
        this.a = cwa_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            bmr_1 bmr_12 = (bmr_1)this.a.j().l();
            ezm_1 ezm_12 = bmr_12.dx();
            ezn_1 ezn_12 = new ezn_1();
            if (fpm_0.b().q("buildSheetSetIconsDialog")) {
                fpm_0.b().o("buildSheetSetIconsDialog");
            }
            ezn_12.d(bmr_12.a_(), this.a.k.f());
            this.a.k.a((int)((byte)ezm_12.e()));
            this.a.k.a();
            fis_1.a().a((ajf_1)this.a.k, this.a.k.d());
            this.a.r();
        }
    }
}

