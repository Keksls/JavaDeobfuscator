/*
 * Decompiled with CFR 0.152.
 */
class cZF
implements fzi {
    final /* synthetic */ cZD a;

    cZF(cZD cZD2) {
        this.a = cZD2;
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (!cZD.d().e().f()) {
            String string2 = bae.h().a("question.havenWorldResourcesCollectorClose", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new cZG(this));
            return fzh.d;
        }
        return fzh.a;
    }
}

