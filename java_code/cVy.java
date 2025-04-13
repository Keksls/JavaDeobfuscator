/*
 * Decompiled with CFR 0.152.
 */
class cVy
implements fzp_0 {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ int b;
    final /* synthetic */ ezm_1 c;
    final /* synthetic */ cVw d;

    cVy(cVw cVw2, bmr_1 bmr_12, int n, ezm_1 ezm_12) {
        this.d = cVw2;
        this.a = bmr_12;
        this.b = n;
        this.c = ezm_12;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            ezn_1 ezn_12 = new ezn_1();
            if (!ezn_12.b(this.a.a_(), this.b, bkr_2.v.s())) {
                return;
            }
            ezj_1 ezj_12 = this.c.d();
            clv_0 clv_02 = new clv_0(this.a.a_(), ezl_1.a(ezj_12));
            azu_0.j().K().c(clv_02);
            if (azu_0.j().c(cwa_0.a)) {
                // empty if block
            }
            fis_1.a().a((ajf_1)bkr_2.v, bkr_2.u);
        }
    }
}

