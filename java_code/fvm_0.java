/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvm
 */
class fvm_0
implements fzu {
    final /* synthetic */ fvk a;

    fvm_0(fvk fvk2) {
        this.a = fvk2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.k == this.a.m) {
            this.a.setValue(this.a.l);
        } else {
            this.a.setValue(this.a.k + 1);
        }
        return true;
    }
}

