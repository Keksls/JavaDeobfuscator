/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cfW
 */
class cfw_1
implements afy_0 {
    final /* synthetic */ bjw_1 a;
    final /* synthetic */ biI b;
    final /* synthetic */ brw_1 c;
    final /* synthetic */ blx_1 d;
    final /* synthetic */ bNK e;
    final /* synthetic */ byte f;
    final /* synthetic */ cfv_1 g;

    cfw_1(cfv_1 cfv_12, bjw_1 bjw_12, biI biI2, brw_1 brw_12, blx_1 blx_12, bNK bNK2, byte by) {
        this.g = cfv_12;
        this.a = bjw_12;
        this.b = biI2;
        this.c = brw_12;
        this.d = blx_12;
        this.e = bNK2;
        this.f = by;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        if (this.a != null) {
            this.b.a(this.a, (short)exh_2.r.A);
        }
        this.g.a(this.c, this.d, this.e, this.b, this.f);
        this.b.c(this);
    }
}

