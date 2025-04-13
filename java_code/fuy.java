/*
 * Decompiled with CFR 0.152.
 */
class fuy
implements fzu {
    final /* synthetic */ fut_0 a;

    fuy(fut_0 fut_02) {
        this.a = fut_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        int n = this.a.P;
        this.a.P = Math.max(0, this.a.P - 1);
        if (this.a.P != n) {
            this.a.R = true;
            this.a.setNeedsToPreProcess();
        }
        return false;
    }
}

