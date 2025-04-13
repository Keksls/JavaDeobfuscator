/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvn
 */
class fvn_0
implements fzu {
    final /* synthetic */ fvk a;

    fvn_0(fvk fvk2) {
        this.a = fvk2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.k == this.a.l) {
            this.a.setValue(this.a.m);
        } else {
            this.a.setValue(this.a.k - 1);
        }
        return true;
    }
}

