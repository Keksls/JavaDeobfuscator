/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCa
 */
public final class cca_0
implements adx_1<cry_0> {
    @Override
    public boolean a(cry_0 cry_02) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = cry_02.b();
        int n = cry_02.c();
        bvx_2 bvx_22 = bmr_12.cP();
        if (bmr_12.cP() != null) {
            baa_0.a().a(bvx_22, (aku_1)new bbn_0(() -> cca_0.a(l, n)));
            baa_0.a().a(bvx_22);
        } else {
            cca_0.a(l, n);
        }
        return false;
    }

    private static void a(long l, int n) {
        bhr_1 bhr_12 = bhl_1.a.b(l);
        if (bhr_12 != null) {
            bhr_12.t(n);
            bhx_2 bhx_22 = bhp_1.a.c(n);
            bua_0.a.a(new bun_1(n, bhx_22.d().a()));
        }
    }

    @Override
    public int a() {
        return 12158;
    }
}

