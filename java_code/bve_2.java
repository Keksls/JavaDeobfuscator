/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bvE
 */
class bve_2
implements fzp_0 {
    final /* synthetic */ bvc_2 a;
    final /* synthetic */ bvd_2 b;

    bve_2(bvd_2 bvd_22, bvc_2 bvc_22) {
        this.b = bvd_22;
        this.a = bvc_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (azu_0.j().c(cye_0.a())) {
            dge_0 dge_02 = new dge_0();
            dge_02.b(this.a.a());
            add_2.b().a(dge_02);
        } else {
            cmf_0 cmf_02 = new cmf_0();
            cmf_02.a(this.a.a());
            cmf_02.a((byte)1);
            azu_0.j().K().c(cmf_02);
        }
    }
}

