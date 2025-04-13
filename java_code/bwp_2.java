/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bWp
 */
class bwp_2
implements fzp_0 {
    final /* synthetic */ bMn a;
    final /* synthetic */ bwo_2 b;

    bwp_2(bwo_2 bwo_22, bMn bMn2) {
        this.b = bwo_22;
        this.a = bMn2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if ((n & 8) != 8) {
            return;
        }
        boolean bl = ((bvx_0)ans_0.D().h()).a(bWe.G);
        cmv_0 cmv_02 = new cmv_0(this.a.B(), bl);
        azu_0.j().K().c(cmv_02);
    }
}

