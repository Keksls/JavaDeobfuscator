/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfQ
 */
class bfq_2
implements asb_2<aQQ> {
    bfq_2() {
    }

    public void a(aQQ aQQ2) {
        fjy fjy2 = new fjy(aQQ2.c(), aQQ2.d(), aQQ2.g(), aQQ2.h(), aQQ2.e(), fjv.a(aQQ2.f()));
        for (aqr_0 aqr_02 : aQQ2.i()) {
            fjz fjz2 = new fjz(aqr_02.a(), (short)aqr_02.e(), aqr_02.f(), aqr_02.b(), aqr_02.c(), aqr_02.d());
            fjy2.a(fjz2);
            fjz2.a(bfp_1.a(aqr_02.g()));
        }
        fjs.a.a(fjy2);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aQQ)asu_22);
    }
}

