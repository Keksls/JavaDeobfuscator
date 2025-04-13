/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bwt
 */
public final class bwt_1 {
    private final bwh_0 a;
    private final ctw_2 b;
    private final boolean c;

    public bwt_1(bwh_0 bwh_02, ctw_2 ctw_22, boolean bl) {
        this.a = bwh_02;
        this.b = ctw_22;
        this.c = bl;
    }

    public void a() {
        blx_1 blx_12 = this.a.e(this.b.p());
        if (blx_12 == null) {
            return;
        }
        blx_12.bv().bZ();
        bjw_1 bjw_12 = this.b();
        if (this.c) {
            bwt_1.a(blx_12, bjw_12);
        }
        this.a(blx_12, bjw_12);
    }

    private bjw_1 b() {
        int n = this.b.i() == -1 ? 2145 : this.b.i();
        return bhb_0.d().a(n);
    }

    private void a(blx_1 blx_12, bjw_1 bjw_12) {
        exq_1 exq_12 = bjw_12.F();
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
        int n = bol_1.a(blx_12.U_(), blx_12.a_(), bjw_12);
        if (bpl_02 == null) {
            bwa_0.a(this.b.e(), this.b.b(), this.a.c(), blx_12, exq_12, n);
        }
        bcd_0 bcd_02 = new bcd_0(this.b.e(), by, this.b.b(), this.a.c(), this.b.h(), this.b.g(), this.b.p(), this.b.j(), this.b.k(), this.b.o(), this.b.i(), this.b.s(), bpl_02);
        akx_1 akx_12 = baa_0.a().a(this.a.c(), (aku_1)bcd_02);
        bcd_02.a(new bZR(akx_12), new alb_1(akx_12));
    }

    public static void a(blx_1 blx_12, ezr_0 ezr_02) {
        aUh.c("fight.itemUse", new ani_2().a().a((CharSequence)blx_12.gd()).b().r(), new ani_2().a().a((CharSequence)ezr_02.e()).r());
    }
}

