/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ciR
 */
final class cir_1
extends chd_1<ctx_1, bwh_0> {
    cir_1() {
    }

    @Override
    public boolean a(ctx_1 ctx_12) {
        bwh_0 bwh_02 = bwj_1.a().a(ctx_12.d());
        if (bwh_02 == null) {
            return false;
        }
        blx_1 blx_12 = bwh_02.e(ctx_12.c());
        if (blx_12 == null) {
            return false;
        }
        biI biI2 = blx_12.bv();
        if (ctx_12.b()) {
            bwa_0.a(biI2, biI2.bQ());
        } else {
            biI2.g("AnimStatique");
            biI2.e("AnimStatique");
        }
        return false;
    }
}

