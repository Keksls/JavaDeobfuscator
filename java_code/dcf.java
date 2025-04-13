/*
 * Decompiled with CFR 0.152.
 */
class dcf
implements fzp_0 {
    final /* synthetic */ bni_0 a;
    final /* synthetic */ bnh_0 b;
    final /* synthetic */ dce c;

    dcf(dce dce2, bni_0 bni_02, bnh_0 bnh_02) {
        this.c = dce2;
        this.a = bni_02;
        this.b = bnh_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            long l = this.a.a();
            bwv_2 bwv_22 = (bwv_2)this.c.c.l().c(this.b.p());
            exe_1<exk_2> exe_12 = this.b.a(bwv_22, l, (short)1, null, -1L, -1L);
            if (exe_12.a() == 0) {
                cqn_0 cqn_02 = new cqn_0();
                cqn_02.b(this.c.c.B());
                cqn_02.a(this.b.r());
                cqn_02.b(l);
                ans_0.F().K().c(cqn_02);
                cqs_0 cqs_02 = new cqs_0();
                cqs_02.b(this.c.c.B());
                ans_0.F().K().c(cqs_02);
                fis_1.a().a((ajf_1)bwy_2.h(), "boughtChallenges", "challengeInventory", "climateInventory", "walletHandler");
            }
        }
    }
}

