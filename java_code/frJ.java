/*
 * Decompiled with CFR 0.152.
 */
class frJ
implements fzu {
    final /* synthetic */ frB a;

    frJ(frB frB2) {
        this.a = frB2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.e() != this.a) {
            return false;
        }
        fxH fxH2 = this.a.s;
        if (fxH2 != null && fxH2.g() == fxI.b && ((fxL)fxH2).n() != null && ((fxL)fxH2).n().p() != null) {
            this.a.setCursorType(frb_0.s);
        } else {
            this.a.setCursorType(this.a.getTextBuilder().v() ? frb_0.d : frb_0.a);
        }
        return false;
    }
}

