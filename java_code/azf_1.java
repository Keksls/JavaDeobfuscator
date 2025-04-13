/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from azF
 */
public class azf_1
extends azk_1 {
    private static final int a = 54;

    private void a(arf_1 arf_12, azg_1 azg_12, azh_1 azh_12) {
        abt_1<Integer> abt_12 = new abt_1<Integer>(0);
        byte[] byArray = new byte[54];
        arf_12.b(byArray);
        azg_12.a(byArray, abt_12);
        azh_12.a(byArray, abt_12);
    }

    @Override
    protected azk_2 a(arf_1 arf_12) {
        azg_1 azg_12 = new azg_1();
        azh_1 azh_12 = new azh_1();
        this.a(arf_12, azg_12, azh_12);
        azs_2 azs_22 = null;
        if (azh_12.e < 16) {
            int n = azh_12.j;
            if (n == 0) {
                n = 1 << azh_12.e;
            }
            abt_1<Integer> abt_12 = new abt_1<Integer>(0);
            byte[] byArray = new byte[n * 4];
            arf_12.b(byArray);
            azs_22 = new azs_2(n);
            for (int k = 0; k < n; ++k) {
                int n2 = abt_12.a();
                azs_22.a(new azf_2(this.b[n2 + 3], this.b[n2 + 2], this.b[n2 + 1], this.b[n2]));
                abt_12.a(n2 + 4);
            }
        }
        byte[] byArray = this.a(arf_12, azh_12.b, azh_12.c, (int)azh_12.e);
        return this.a(azh_12, azs_22, byArray);
    }

    private azk_2 a(azh_1 azh_12, azs_2 azs_22, byte ... byArray) {
        azr_2 azr_22 = new azr_2(azh_12.b, azh_12.c, azh_12.e, azs_22, byArray);
        azk_2 azk_22 = new azk_2(abc_1.e, azr_22);
        azr_22.u();
        return azk_22;
    }

    @Override
    protected afe_1 b(arf_1 arf_12) {
        azg_1 azg_12 = new azg_1();
        azh_1 azh_12 = new azh_1();
        this.a(arf_12, azg_12, azh_12);
        return new afe_1(azh_12.b, azh_12.c);
    }

    @Override
    protected int a() {
        return 54;
    }
}

