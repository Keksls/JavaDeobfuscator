/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ciN
 */
class cin_1
extends bak_0 {
    protected cin_1(int n, int n2, int n3, int n4) {
        super(n, n2, n3, n4);
    }

    @Override
    protected void r() {
        bwh_0 bwh_02 = this.b();
        if (bwh_02 == null) {
            return;
        }
        ((bvw_2)bwh_02).a(elp_0.c);
        ((bvw_2)bwh_02).h(wc_0.p().g());
        for (blx_1 blx_12 : bwh_02.j()) {
            if (blx_12 instanceof bnh_1) {
                biI biI2 = blx_12.bv();
                bwa_0.a(biI2, biI2.bQ());
            }
            this.a(bwh_02);
        }
        ((bvw_2)bwh_02).a();
        ((bvw_2)bwh_02).b();
        aoy_0.a(bwh_02.c());
    }

    private void a(bwh_0 bwh_02) {
        for (blx_1 blx_12 : bwh_02.j()) {
            blx_12.bv().cd();
        }
    }

    @Override
    protected void l() {
    }
}

