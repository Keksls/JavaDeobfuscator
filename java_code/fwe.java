/*
 * Decompiled with CFR 0.152.
 */
class fwe
implements fzu {
    final /* synthetic */ fwd a;

    fwe(fwd fwd2) {
        this.a = fwd2;
    }

    @Override
    public boolean run(fzs fzs2) {
        fru_0 fru_02 = (fru_0)fzs2.e();
        int n = this.a.g.indexOf(fru_02);
        if (n >= 0 && n < this.a.a.size()) {
            azj_2 azj_22 = (azj_2)this.a.a.get(n);
            fcb_2 fcb_22 = fcb_2.a((fck_2)fzs2, this.a, frd_0.j, azj_22);
            this.a.dispatchEvent(fcb_22);
            fzs2.b(fcb_22.g());
        }
        return false;
    }
}

