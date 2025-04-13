/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ciy
 */
final class ciy_2
extends chd_1<crN, bwh_0> {
    ciy_2() {
    }

    @Override
    public boolean a(crN crN2) {
        blx_1 blx_12 = bmf_2.a().c(crN2.b());
        if (blx_12 != null && blx_12.bA() != -1) {
            bwh_0 bwh_02 = bwj_1.a().a(blx_12.bA());
            if (bwh_02 == null) {
                return false;
            }
            if (bwh_02.e() == elp_0.c) {
                bae_0 bae_02 = bae_0.a(8, emd_1.x.a(), 0, blx_12, new aff_1(crN2.c(), crN2.d(), crN2.e()), true);
                baa_0.a().a(blx_12.bA(), (aku_1)bae_02);
                baa_0.a().a(bwh_02);
            } else if (crN2.f()) {
                blx_12.bv().b(crN2.c(), crN2.d(), crN2.e(), false, false);
            }
            return false;
        }
        return true;
    }
}

