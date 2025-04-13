/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpO
 */
class fpo_0
implements fzo_0 {
    final /* synthetic */ fvk_0 a;
    final /* synthetic */ fzn_0 b;
    final /* synthetic */ fpm_0 c;

    fpo_0(fpm_0 fpm_02, fvk_0 fvk_02, fzn_0 fzn_02) {
        this.c = fpm_02;
        this.a = fvk_02;
        this.b = fzn_02;
    }

    @Override
    public void a() {
        try {
            fzq_0.a(this.a, this.b);
        }
        catch (Exception exception) {
            fpm_0.C.error((Object)("Unable to reformat MessageBox " + this.b), (Throwable)exception);
        }
    }
}

