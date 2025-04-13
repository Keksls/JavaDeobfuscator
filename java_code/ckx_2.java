/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKx
 */
class ckx_2
implements fzu {
    final /* synthetic */ ckw_2 a;

    ckx_2(ckw_2 ckw_22) {
        this.a = ckw_22;
    }

    @Override
    public boolean run(fzs fzs2) {
        Object t = fzs2.e();
        int n = this.a.t.indexOf(t);
        if (n != -1) {
            fsM fsM2 = this.a.t.get(n);
            int n2 = this.a.A[n] - 1;
            fpu_0.popup(this.a.m, fsM2);
        }
        return false;
    }
}

