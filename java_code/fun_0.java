/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fun
 */
class fun_0
implements fzu {
    final /* synthetic */ fum a;

    fun_0(fum fum2) {
        this.a = fum2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.B) {
            return false;
        }
        fck_2 fck_22 = (fck_2)fzs2;
        if (fzs2.e() == this.a.G) {
            this.a.H = fck_22.a(this.a.G) - this.a.G.getWidth() / 2;
            this.a.I = fck_22.b(this.a.G) - this.a.G.getHeight() / 2;
        } else if (fzs2.e() == fzs2.d()) {
            float f2;
            float f3 = f2 = this.a.z ? 1.0f / (float)this.a.A + 0.001f : this.a.F;
            if (this.a.D && fck_22.a((fvE)fck_22.e()) < this.a.G.getX() || !this.a.D && fck_22.b((fvE)fck_22.e()) < this.a.G.getY()) {
                this.a.setValue(this.a.a(this.a.b(this.a.r) - f2));
            } else {
                this.a.setValue(this.a.a(this.a.b(this.a.r) + f2));
            }
        }
        return false;
    }
}

