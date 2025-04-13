/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bex
 */
class bex_1
implements asb_2<aTO> {
    bex_1() {
    }

    public void a(aTO aTO2) {
        int n = aTO2.c();
        int n2 = aTO2.d();
        float f2 = aTO2.e();
        int n3 = aTO2.f();
        boolean bl = aTO2.g();
        int n4 = aTO2.h();
        boolean bl2 = aTO2.i();
        int n5 = aTO2.j() * 1000;
        int n6 = aTO2.k();
        boolean bl3 = aTO2.l();
        int n7 = aTO2.m() * 1000;
        aQV aQV2 = aTO2.n();
        ezy_1 ezy_12 = bet_1.b(aQV2);
        int n8 = bet_1.a(aQV2);
        evr_1 evr_12 = new evr_1(n, n2, f2, n3, bl, n4, bl2, n5, n6, bl3, n7, ezy_12, n8);
        evl_1.a.a(evr_12);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTO)asu_22);
    }
}

