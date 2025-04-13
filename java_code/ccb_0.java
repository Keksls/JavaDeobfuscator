/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCb
 */
public final class ccb_0
implements adx_1<crz_0> {
    @Override
    public boolean a(crz_0 crz_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = crz_02.b();
        int n = crz_02.c();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bmr_12.cP() != null) {
            baa_0.a().a(bvx_22, (aku_1)new bbn_0(() -> ccb_0.a(l, n)));
            baa_0.a().a(bvx_22);
        } else {
            ccb_0.a(l, n);
        }
        return false;
    }

    private static void a(long l, int n) {
        bhr_1 bhr_12 = bhl_1.a.b(l);
        if (bhr_12 != null) {
            bhr_12.u(n);
        }
    }

    @Override
    public int a() {
        return 12444;
    }
}

