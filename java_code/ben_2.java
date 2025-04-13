/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beN
 */
class ben_2
implements asb_2<aTM> {
    ben_2() {
    }

    public void a(aTM aTM2) {
        aQV aQV2 = aTM2.e();
        evp_1 evp_12 = new evp_1(aTM2.c(), aTM2.d(), bet_1.b(aQV2), bet_1.a(aQV2));
        for (atn_0 atn_02 : aTM2.f()) {
            evp_12.a(new evq_1(atn_02.a(), atn_02.d(), atn_02.c()));
        }
        evl_1.a.a(evp_12);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTM)asu_22);
    }
}

