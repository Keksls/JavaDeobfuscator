/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chz
 */
final class chz_2
extends chd_1<cut_1, bvx_2> {
    chz_2() {
    }

    @Override
    public boolean a(cut_1 cut_12) {
        long l = cut_12.d();
        bFZ bFZ2 = (bFZ)ccm_1.g().a(l);
        if (bFZ2 == null) {
            return true;
        }
        if (bFZ2.c(((bvx_2)this.a).c())) {
            bbp_0 bbp_02 = bbp_0.a(alc_1.q(), emd_1.P.a(), 0, cut_12.d(), cut_12.e());
            baa_0.a().a((bvx_2)this.a, (aku_1)bbp_02);
            return false;
        }
        return true;
    }
}

