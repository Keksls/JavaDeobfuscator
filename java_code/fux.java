/*
 * Decompiled with CFR 0.152.
 */
class fux
implements fzu {
    final /* synthetic */ fut_0 a;

    fux(fut_0 fut_02) {
        this.a = fut_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.isEnabledFull()) {
            int n = this.a.P;
            this.a.P = Math.min(this.a.w.size() - 1, this.a.P + 1);
            if (this.a.P != n) {
                this.a.R = true;
                this.a.setNeedsToPreProcess();
            }
        }
        return false;
    }
}

