/*
 * Decompiled with CFR 0.152.
 */
class fua
implements fzu {
    final /* synthetic */ ftx_0 a;

    fua(ftx_0 ftx_02) {
        this.a = ftx_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.v.getAppearance().isArmed()) {
            this.a.n = 1;
            adi_2.a().a(this.a.s);
            adi_2.a().a(this.a.s, 500L, this.a.n, 1L);
        }
        return false;
    }
}

