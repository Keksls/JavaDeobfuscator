/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cii
 */
final class cii_2
extends chd_1<ctc_1, bvx_2> {
    cii_2() {
    }

    @Override
    public boolean a(ctc_1 ctc_12) {
        bbQ[] bbQArray;
        if (!ctc_12.d()) {
            return true;
        }
        if (this.a != null) {
            ((bvx_2)this.a).a(ctc_12.c());
        }
        bbe_0 bbe_02 = bbe_0.a(ctc_12);
        baa_0.a().a((bvx_2)this.a, (aku_1)bbe_02);
        for (bbQ bbQ2 : bbQArray = bbQ.a(ctc_12)) {
            baa_0.a().a((bvx_2)this.a, (aku_1)bbQ2);
        }
        return false;
    }
}

