/*
 * Decompiled with CFR 0.152.
 */
public final class cBX
implements adx_1<crv_0> {
    @Override
    public boolean a(crv_0 crv_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = crv_02.b();
        int n = crv_02.c();
        long l2 = crv_02.d();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bvx_22 != null) {
            baa_0.a().a(bmr_12.cQ(), (aku_1)new bbn_0(() -> cBX.a(l, n, l2)));
            baa_0.a().a(bvx_22);
        } else {
            cBX.a(l, n, l2);
        }
        return false;
    }

    private static void a(long l, int n, long l2) {
        bhr_1 bhr_12 = bhl_1.a.b(l);
        if (bhr_12 != null) {
            bhr_12.c(n, l2);
            bua_0.a.a(new buo_2(n));
        }
    }

    @Override
    public int a() {
        return 12806;
    }
}

