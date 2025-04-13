/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdu
 */
class bdu_2
implements asb_2<aqo_0> {
    final /* synthetic */ bdt_1 a;

    bdu_2(bdt_1 bdt_12) {
        this.a = bdt_12;
    }

    public void a(aqo_0 aqo_02) {
        int n = aqo_02.c();
        int n2 = aqo_02.e();
        int[] nArray = aqo_02.g();
        int n3 = aqo_02.f();
        int n4 = 0;
        if (nArray.length > 0) {
            n4 = nArray[0];
        }
        bkt_2 bkt_22 = new bkt_2(n, n4, n2, n3);
        bdt_1.a(bkt_22);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aqo_0)asu_22);
    }
}

