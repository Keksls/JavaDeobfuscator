/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from chH
 */
final class chh_1
extends chd_1<cqv_0, bvx_2> {
    chh_1() {
    }

    @Override
    public boolean a(cqv_0 cqv_02) {
        blx_1 blx_12 = bmf_2.a().c(cqv_02.b());
        if (blx_12 == null) {
            return false;
        }
        if (!((bvx_2)this.a).l(blx_12)) {
            return true;
        }
        bbb_0 bbb_02 = new bbb_0(blx_12.a_(), new aff_1(cqv_02.c(), cqv_02.d(), cqv_02.e()), aej_2.a(cqv_02.f()));
        baa_0.a().a((bvx_2)this.a, (aku_1)bbb_02);
        baa_0.a().a(this.a);
        return false;
    }
}

