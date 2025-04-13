/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eGS
 */
class egs_0
implements rv_0 {
    final /* synthetic */ epa_1 a;
    final /* synthetic */ egr_0 b;

    egs_0(egr_0 egr_02, epa_1 epa_12) {
        this.b = egr_02;
        this.a = epa_12;
    }

    @Override
    public void a(rs_0 rs_02) {
        if (this.b.x == 100) {
            this.a.c((epa_1)rs_02);
        } else {
            this.a.a((epa_1)rs_02, this.b.x);
        }
    }
}

