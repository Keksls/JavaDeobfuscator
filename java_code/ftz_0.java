/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ftZ
 */
class ftz_0
implements fzu {
    final /* synthetic */ ftx_0 a;

    ftz_0(ftx_0 ftx_02) {
        this.a = ftx_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.e() == this.a.v) {
            this.a.x.setValue(this.a.x.getValue() + this.a.u);
        }
        if (fzs2.e() == this.a.w) {
            this.a.x.setValue(this.a.x.getValue() - this.a.u);
        }
        return false;
    }
}

