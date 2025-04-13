/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bdP
 */
class bdp_2
implements asb_2<aRb> {
    final /* synthetic */ bdo_2 a;

    bdp_2(bdo_2 bdo_22) {
        this.a = bdo_22;
    }

    public void a(aRb aRb2) {
        int n = aRb2.c();
        String string = aRb2.e();
        float f2 = aRb2.h();
        float f3 = aRb2.i();
        int n2 = aRb2.f();
        short s2 = aRb2.g();
        try {
            apc_2 apc_22 = eyS.c(string);
            eay_0.a.a(n, f2, f3, apc_22, n2, s2);
        }
        catch (Exception exception) {
            bdo_2.a.error((Object)("Exception lev\u00e9e lors de l'interpr\u00e9tation du crit\u00e8re : " + string));
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRb)asu_22);
    }
}

