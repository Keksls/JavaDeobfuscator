/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fsA
 */
class fsa_0
implements fzu {
    final /* synthetic */ fsy_0 a;

    fsa_0(fsy_0 fsy_02) {
        this.a = fsy_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.j && !this.a.g && this.a.f) {
            this.a.b();
            return true;
        }
        if (this.a.g) {
            this.a.g = false;
        }
        return false;
    }
}

