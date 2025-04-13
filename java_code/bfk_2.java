/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfk
 */
class bfk_2
implements asb_2<aSQ> {
    final /* synthetic */ epx_1 a;
    final /* synthetic */ bfj_2 b;

    bfk_2(bfj_2 bfj_22, epx_1 epx_12) {
        this.b = bfj_22;
        this.a = epx_12;
    }

    public void a(aSQ aSQ2) {
        int n = aSQ2.d();
        int n2 = aSQ2.e();
        epw_1 epw_12 = this.a.a(n);
        epw_12.a(n2);
        epw_1 epw_13 = this.a.a(n2);
        epw_13.a(n);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aSQ)asu_22);
    }
}

