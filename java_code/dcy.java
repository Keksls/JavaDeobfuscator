/*
 * Decompiled with CFR 0.152.
 */
class dcy
implements fzi {
    final /* synthetic */ dcx_0 a;

    dcy(dcx_0 dcx_02) {
        this.a = dcx_02;
    }

    @Override
    public fzh onDialogCloseRequest(String string) {
        if (this.a.g()) {
            String string2 = bae.h().a("question.seedSpreaderClose", new Object[0]);
            fzn_0 fzn_02 = new fzn_0(102, 0, string2, null, cfn_0.a(8), 24L);
            fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
            fzm_02.a(new dcz(this));
            return fzh.d;
        }
        return fzh.a;
    }
}

