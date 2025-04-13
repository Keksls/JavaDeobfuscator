/*
 * Decompiled with CFR 0.152.
 */
public final class cBZ
implements adx_1<crx_0> {
    @Override
    public boolean a(crx_0 crx_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bmr_12.cP() != null) {
            baa_0.a().a(bvx_22, (aku_1)new bbn_0(() -> cBZ.a(crx_02.b(), crx_02.c(), crx_02.d())));
            baa_0.a().a(bvx_22);
        } else {
            cBZ.a(crx_02.b(), crx_02.c(), crx_02.d());
        }
        return false;
    }

    private static void a(long l, int n, boolean bl) {
        bhr_1 bhr_12 = bhl_1.a.b(l);
        if (bhr_12 != null) {
            bhr_12.a(n, bl);
        }
    }

    @Override
    public int a() {
        return 12698;
    }
}

