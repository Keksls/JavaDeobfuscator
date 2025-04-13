/*
 * Decompiled with CFR 0.152.
 */
public final class cCv
implements adx_1<cwk_1> {
    @Override
    public boolean a(cwk_1 cwk_12) {
        bmv_1 bmv_12 = (bmv_1)bmf_2.a().c(cwk_12.b());
        bpe_1 bpe_12 = bpf_1.a().a(cwk_12.c());
        cSN cSN2 = dan.a().c();
        if (cSN2 != null) {
            int n = cSN2.b();
            for (int k = 0; k < n; ++k) {
                cUM cUM2 = cSN2.a(k);
                if (!(cUM2 instanceof bmv_1) || ((bmv_1)cUM2).a_() != bmv_12.a_()) continue;
                dan.a().d();
                break;
            }
        }
        bbv_0 bbv_02 = new bbv_0(alc_1.q(), 0, 0, bpe_12.a(), cwk_12.b(), bpe_12.b(), cwk_12.d());
        bbt.a.a(bbv_02);
        bbt.a.a();
        return false;
    }

    @Override
    public int a() {
        return 12671;
    }
}

