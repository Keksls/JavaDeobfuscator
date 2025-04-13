/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beI
 */
class bei_1
implements asb_2<aRq> {
    bei_1() {
    }

    public void a(aRq aRq2) {
        apc_2 apc_22;
        aQV aQV2 = null;
        try {
            apc_22 = eyS.c(aRq2.h());
        }
        catch (Exception exception) {
            bet_1.a.error((Object)("Impossible de compiler le crit\u00e8re de la porte " + aRq2.c()), (Throwable)exception);
            return;
        }
        evl_1.a.a(new eva_2(aRq2.c(), aRq2.d(), aRq2.e(), aRq2.f(), aRq2.g(), apc_22, bet_1.b(aQV2), bet_1.a(aQV2)));
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRq)asu_22);
    }
}

