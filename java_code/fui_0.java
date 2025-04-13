/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fui
 */
class fui_0
implements fzu {
    final /* synthetic */ fue_0 a;

    fui_0(fue_0 fue_02) {
        this.a = fue_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        if (this.a.r) {
            this.a.n.setValue(this.a.n.getValue() - this.a.n.getButtonJump() * (float)fck_22.z());
        } else if (this.a.s) {
            this.a.o.setValue(this.a.o.getValue() + this.a.o.getButtonJump() * (float)fck_22.z());
        }
        return true;
    }
}

