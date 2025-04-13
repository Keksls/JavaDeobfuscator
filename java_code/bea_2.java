/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beA
 */
class bea_2
implements asb_2<aTL> {
    bea_2() {
    }

    public void a(aTL aTL2) {
        int n = aTL2.c();
        aQV aQV2 = aTL2.f();
        try {
            apc_2 apc_22 = eyS.c(aTL2.d());
            evl_1.a.a(new evo_1(n, apc_22, aTL2.e(), bet_1.b(aQV2), bet_1.a(aQV2)));
        }
        catch (Exception exception) {
            bet_1.a.error((Object)"", (Throwable)exception);
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTL)asu_22);
    }
}

