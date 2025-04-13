/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cic
 */
final class cic_2
extends chd_1<ctx_1, bvx_2> {
    cic_2() {
    }

    @Override
    public boolean a(ctx_1 ctx_12) {
        blx_1 blx_12 = (blx_1)((bvx_2)this.a).n(ctx_12.c());
        if (blx_12 == null || ((bvx_2)this.a).e() != elp_0.b) {
            return false;
        }
        biI biI2 = blx_12.bv();
        if (ctx_12.b()) {
            if (blx_12 instanceof bnh_1) {
                biI2.bR();
                this.a(blx_12, true);
            }
            ((bvx_2)this.a).h(blx_12);
        } else {
            if (blx_12 instanceof bnh_1) {
                biI2.bS();
                this.a(blx_12, false);
            }
            ((bvx_2)this.a).i(blx_12);
        }
        return false;
    }

    private void a(blx_1 blx_12, boolean bl) {
        for (blx_1 blx_13 : ((bvx_2)this.a).j()) {
            if (blx_13.U_() != blx_12.U_() || blx_13.gY() != 5) continue;
            if (bl) {
                blx_13.bv().bR();
                continue;
            }
            blx_13.bv().bS();
        }
    }
}

