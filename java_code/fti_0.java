/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fti
 */
class fti_0
implements fzu {
    final /* synthetic */ fte_0 a;

    fti_0(fte_0 fte_02) {
        this.a = fte_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fck_2 fck_22 = (fck_2)fzs2;
        int n = fck_22.a(this.a) - this.a.g;
        int n2 = fck_22.b(this.a) - this.a.h;
        fjz_1 fjz_12 = null;
        int n3 = this.a.C.size();
        for (int k = 0; k < n3; ++k) {
            fjz_1 fjz_13 = this.a.C.get(k);
            if (!this.a.isInside(fjz_13, n, n2)) continue;
            fjz_12 = fjz_13;
            break;
        }
        if (this.a.E == fjz_12) {
            return false;
        }
        this.a.E = fjz_12;
        this.a.J.setVisible(this.a.E != null);
        if (this.a.E != null) {
            this.a.K.c(this.a.E.g());
        }
        return false;
    }
}

