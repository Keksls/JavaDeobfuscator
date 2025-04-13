/*
 * Decompiled with CFR 0.152.
 */
class fuo
implements fzu {
    final /* synthetic */ fum a;

    fuo(fum fum2) {
        this.a = fum2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (this.a.B || fzs2.e() != this.a.G) {
            return false;
        }
        fck_2 fck_22 = (fck_2)fzs2;
        if (this.a.D) {
            int n = fck_22.a((fvE)fck_22.d()) - this.a.H;
            float f2 = (int)Math.floor((double)this.a.G.getWidth() / 2.0);
            float f3 = (int)Math.ceil((double)this.a.G.getWidth() / 2.0);
            if ((float)n < f2) {
                n = (int)f2;
            } else if ((float)n > (float)this.a.m_size.width - f3) {
                n = this.a.m_size.width - (int)f3;
            }
            float f4 = ((float)n - f2) / ((float)this.a.m_size.width - (float)this.a.G.getWidth());
            this.a.setValue(this.a.a(f4));
        } else {
            int n = fck_22.b((fvE)fck_22.d()) - this.a.I;
            float f5 = (float)Math.floor((double)this.a.G.getHeight() / 2.0);
            float f6 = (float)Math.ceil((double)this.a.G.getHeight() / 2.0);
            if ((float)n < f5) {
                n = (int)f5;
            } else if ((float)n > (float)this.a.m_size.height - f6) {
                n = this.a.m_size.height - (int)f6;
            }
            float f7 = ((float)n - f5) / ((float)this.a.m_size.height - (float)this.a.G.getHeight());
            this.a.setValue(this.a.a(f7));
        }
        return true;
    }
}

