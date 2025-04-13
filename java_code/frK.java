/*
 * Decompiled with CFR 0.152.
 */
class frK
implements fzu {
    final /* synthetic */ frB a;

    frK(frB frB2) {
        this.a = frB2;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2.e() == this.a && this.a.getTextBuilder().v()) {
            this.a.setCursorType(this.a.getTextBuilder().v() ? frb_0.d : frb_0.a);
        }
        return false;
    }
}

