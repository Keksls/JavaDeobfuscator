/*
 * Decompiled with CFR 0.152.
 */
class ftg
implements fzu {
    final /* synthetic */ fte_0 a;

    ftg(fte_0 fte_02) {
        this.a = fte_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.a.s = null;
        if (this.a.r && this.a.v != Integer.MIN_VALUE && this.a.w != Integer.MIN_VALUE) {
            int n = this.a.g + this.a.v * 20;
            int n2 = this.a.h + this.a.w * 20;
            this.a.addTween(new ftk_0(this.a, n, n2, 1000));
            this.a.v = Integer.MIN_VALUE;
            this.a.w = Integer.MIN_VALUE;
        }
        return false;
    }
}

