/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzF
 */
class fzf_0
implements fzc_0<fzj_0> {
    final /* synthetic */ fzd_0 a;

    fzf_0(fzd_0 fzd_02) {
        this.a = fzd_02;
    }

    @Override
    public fvE a(fzj_0 fzj_02) {
        if (fzj_02 == null) {
            return null;
        }
        if (fzj_02.a() == null) {
            return null;
        }
        return this.a.d(fzj_02.a());
    }

    @Override
    public void a(fvE fvE2) {
        fvE2.destroySelfFromParent();
    }
}

