/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beL
 */
class bel_2
implements asb_2<aRd> {
    bel_2() {
    }

    public void a(aRd aRd2) {
        int n = aRd2.c();
        int n2 = aRd2.d();
        short s2 = aRd2.e();
        boolean bl = aRd2.f();
        int n3 = aRd2.g();
        euw_1 euw_12 = new euw_1(n, n2, s2, bl, n3);
        evl_1.a.a(euw_12);
        for (arf_0 arf_02 : aRd2.h()) {
            euw_12.a(arf_02.b(), arf_02.c());
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRd)asu_22);
    }
}

