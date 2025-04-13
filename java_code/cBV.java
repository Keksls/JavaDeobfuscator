/*
 * Decompiled with CFR 0.152.
 */
public final class cBV
implements adx_1<crt_0> {
    @Override
    public boolean a(crt_0 crt_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bmr_12.cP() != null) {
            baa_0.a().a(bvx_22, (aku_1)new bbn_0(() -> cBV.a(crt_02.b(), crt_02.c())));
            baa_0.a().a(bvx_22);
        } else {
            cBV.a(crt_02.b(), crt_02.c());
        }
        return false;
    }

    private static void a(long l, int n) {
        bhr_1 bhr_12 = bhl_1.a.b(l);
        if (bhr_12 != null) {
            bhr_12.v(n);
        }
    }

    @Override
    public int a() {
        return 13913;
    }
}

