/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chq
 */
final class chq_2
extends chd_1<ctw_2, bwh_0> {
    private ctw_2 b;
    private boolean c = true;

    chq_2() {
    }

    @Override
    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public boolean a(ctw_2 ctw_22) {
        this.b = ctw_22;
        blx_1 blx_12 = this.a.e(ctw_22.p());
        if (blx_12 == null) {
            return false;
        }
        blx_12.bv().bZ();
        bjw_1 bjw_12 = this.b();
        if (this.c) {
            bwt_1.a(blx_12, bjw_12);
        }
        this.a(blx_12, bjw_12);
        return false;
    }

    private bjw_1 b() {
        int n = this.b.i() == -1 ? 2145 : this.b.i();
        return bhb_0.d().a(n);
    }

    private void a(blx_1 blx_12, bjw_1 bjw_12) {
        exq_1 exq_12 = bjw_12.F();
        int n = bwd_0.a(exq_12);
        byte by = this.b.c().a();
        bpl_0 bpl_02 = null;
        if (this.b.q()) {
            if (blx_12.aZ() != null) {
                bpl_02 = (bpl_0)blx_12.aZ().a().a(this.b.r());
            } else {
                bpn_0 bpn_02 = new bpn_0(blx_12);
                bpl_02 = bpn_02.a(this.b.r());
            }
        }
        int n2 = bol_1.a(blx_12.U_(), blx_12.a_(), bjw_12);
        if (bpl_02 == null) {
            bwa_0.a(this.b.e(), this.b.b(), this.a.c(), blx_12, exq_12, n2);
        }
        bcd_0 bcd_02 = new bcd_0(this.b.e(), by, this.b.b(), this.a.c(), this.b.h(), this.b.g(), this.b.p(), this.b.j(), this.b.k(), this.b.o(), this.b.i(), this.b.s(), bpl_02);
        akx_1 akx_12 = baa_0.a().a(this.a.c(), (aku_1)bcd_02);
        bcd_02.a(new bZR(akx_12));
        bcd_02.a(new alb_1(akx_12));
    }
}

