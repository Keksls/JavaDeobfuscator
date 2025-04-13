/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beu
 */
class beu_1
implements asb_2<aRy> {
    beu_1() {
    }

    public void a(aRy aRy2) {
        int n = aRy2.c();
        int n2 = aRy2.e();
        ara_0[] ara_0Array = aRy2.g();
        aQV aQV2 = aRy2.h();
        int n3 = bet_1.a(aQV2);
        ezy_1 ezy_12 = bet_1.b(aQV2);
        byte by = aRy2.f();
        evd_1 evd_12 = new evd_1(n, n2, ezy_12, n3, by, ara_0Array.length);
        int n4 = ara_0Array.length;
        for (int k = 0; k < n4; ++k) {
            short s2;
            int n5;
            apc_2 apc_22;
            ara_0 ara_02 = ara_0Array[k];
            int n6 = ara_02.a();
            int n7 = ara_02.d();
            int n8 = ara_02.e();
            int n9 = ara_02.g();
            String string = ara_02.b();
            arz_0[] arz_0Array = ara_02.c();
            arb_0[] arb_0Array = ara_02.f();
            try {
                apc_22 = eyS.c(string);
            }
            catch (Exception exception) {
                bet_1.a.error((Object)("Impossible de compiler le crit\u00e8re de l'\u00e9change " + n6), (Throwable)exception);
                continue;
            }
            eve_1 eve_12 = new eve_1(n6, n7, n9, apc_22, n8, k);
            for (arz_0 arz_02 : arz_0Array) {
                n5 = arz_02.a();
                s2 = arz_02.b();
                eve_12.a(n5, s2);
            }
            for (arb_0 arb_02 : arb_0Array) {
                n5 = arb_02.a();
                s2 = arb_02.b();
                eyh_1 eyh_12 = eyh_1.a(arb_02.c());
                eyh_1 eyh_13 = eyh_12 == eyh_1.a ? eyh_1.a : eyh_1.a(eyh_12.c(), eyh_12.g(), true);
                boolean bl = arb_02.d();
                eve_12.a(n5, s2, eyh_13, bl);
            }
            evd_12.a(eve_12);
        }
        evl_1.a.a(evd_12);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRy)asu_22);
    }
}

