/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwr
 */
class bwr_1
implements fzp_0 {
    final /* synthetic */ bvw_2 a;
    final /* synthetic */ fzm_0 b;
    final /* synthetic */ bwq_0 c;
    final /* synthetic */ blx_1 d;
    final /* synthetic */ bwq_1 e;

    bwr_1(bwq_1 bwq_12, bvw_2 bvw_22, fzm_0 fzm_02, bwq_0 bwq_02, blx_1 blx_12) {
        this.e = bwq_12;
        this.a = bvw_22;
        this.b = fzm_02;
        this.c = bwq_02;
        this.d = blx_12;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        this.a.a(this.b);
        if ((n & 8) != 8) {
            return;
        }
        ema_1 ema_12 = this.c.ag_();
        if (ema_12 == ema_1.a) {
            return;
        }
        bQG.a();
        bQG.a(ema_12.a(), this.d);
    }
}

