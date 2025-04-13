/*
 * Decompiled with CFR 0.152.
 */
class fvf
implements fzu {
    final /* synthetic */ fvb_0 a;

    fvf(fvb_0 fvb_02) {
        this.a = fvb_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        fcv_1 fcv_12 = new fcv_1(this.a);
        fcv_12.onCheckOut();
        this.a.dispatchEvent(fcv_12);
        fpm_0.b().o(fvb_0.a(this.a).c());
        return false;
    }
}

