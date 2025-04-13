/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beM
 */
class bem_1
implements asb_2<aSA> {
    bem_1() {
    }

    public void a(aSA aSA2) {
        int n = aSA2.c();
        int n2 = aSA2.d();
        int n3 = aSA2.f();
        int n4 = aSA2.g();
        int n5 = aSA2.h();
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(aSA2.m());
        }
        catch (Exception exception) {
            bet_1.a.error((Object)("coffre de loot " + n + "  " + exception.getMessage() + " (criteria='" + aSA2.m() + "')"));
            return;
        }
        aQV aQV2 = aSA2.n();
        evl_1.a.a(new evi_1(n, n2, Long.MIN_VALUE, n3, n4, n5, aSA2.i(), Short.MIN_VALUE, aSA2.k(), Long.MIN_VALUE, apc_22, bet_1.b(aQV2), bet_1.a(aQV2)));
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aSA)asu_22);
    }
}

