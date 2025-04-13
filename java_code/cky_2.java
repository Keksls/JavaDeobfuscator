/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cKy
 */
class cky_2
implements fzu {
    final /* synthetic */ ckw_2 a;

    cky_2(ckw_2 ckw_22) {
        this.a = ckw_22;
    }

    @Override
    public boolean run(fzs fzs2) {
        Object t = fzs2.e();
        int n = this.a.t.indexOf(t);
        if (n != -1) {
            fpu_0.closePopup(null);
        }
        return false;
    }
}

