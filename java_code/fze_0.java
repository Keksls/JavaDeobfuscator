/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzE
 */
class fze_0
implements fzc_0<fzh_0> {
    final /* synthetic */ fzd_0 a;

    fze_0(fzd_0 fzd_02) {
        this.a = fzd_02;
    }

    @Override
    public fvE a(fzh_0 fzh_02) {
        if (fzh_02 == null) {
            return null;
        }
        if (fzh_02.a() == null) {
            return null;
        }
        return this.a.c(fzh_02.a());
    }

    @Override
    public void a(fvE fvE2) {
        fvE2.destroySelfFromParent();
    }
}

