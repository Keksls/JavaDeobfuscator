/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bmc
 */
class bmc_1
implements bmg_2 {
    final /* synthetic */ long a;
    final /* synthetic */ eqy_1 b;
    final /* synthetic */ bmf_2 c;
    final /* synthetic */ blx_1 d;

    bmc_1(blx_1 blx_12, long l, eqy_1 eqy_12, bmf_2 bmf_22) {
        this.d = blx_12;
        this.a = l;
        this.b = eqy_12;
        this.c = bmf_22;
    }

    @Override
    public void a(blx_1 blx_12) {
        if (blx_12.a_() != this.a) {
            return;
        }
        this.b.a(this.d, blx_12);
        this.d.l(blx_12);
        this.c.b(this);
    }
}

