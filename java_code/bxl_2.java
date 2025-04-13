/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxl
 */
class bxl_2
implements fzp_0 {
    final /* synthetic */ bxk_2 a;

    bxl_2(bxk_2 bxk_22) {
        this.a = bxk_22;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 2) {
            bvx_2 bvx_22 = azu_0.j().k().dm();
            baa_0.a().a(bvx_22, (aku_1)new bxm_2(this, alc_1.q(), emd_1.an.a(), 0));
            baa_0.a().a(bvx_22);
        }
        this.a.a = false;
    }
}

