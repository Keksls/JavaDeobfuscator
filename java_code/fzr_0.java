/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fzR
 */
class fzr_0
extends fdt_1 {
    final /* synthetic */ fzm_0 a;
    final /* synthetic */ int b;
    final /* synthetic */ fug_0 c;

    fzr_0(fzm_0 fzm_02, int n, fug_0 fug_02) {
        this.a = fzm_02;
        this.b = n;
        this.c = fug_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        this.a.a(this.b, this.c != null ? this.c.getText() : null);
        return false;
    }
}

