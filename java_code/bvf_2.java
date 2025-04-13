/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvF
 */
class bvf_2
implements fzp_0 {
    final /* synthetic */ bvc_2 a;
    final /* synthetic */ bvd_2 b;

    bvf_2(bvd_2 bvd_22, bvc_2 bvc_22) {
        this.b = bvd_22;
        this.a = bvc_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            dgd dgd2 = new dgd();
            dgd2.b(this.a.a());
            add_2.b().a(dgd2);
        } else {
            dge_0 dge_02 = new dge_0();
            dge_02.b(this.a.a());
            add_2.b().a(dge_02);
        }
    }
}

