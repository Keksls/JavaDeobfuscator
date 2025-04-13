/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beK
 */
class bek_1
implements asb_2<atp_0> {
    bek_1() {
    }

    public void a(atp_0 atp_02) {
        evs_1 evs_12 = new evs_1(atp_02.c());
        evl_1.a.a(evs_12);
        for (aTQ aTQ2 : atp_02.d()) {
            int n = aTQ2.a();
            int n2 = aTQ2.h();
            int n3 = aTQ2.b();
            int n4 = aTQ2.c();
            int n5 = aTQ2.d();
            int n6 = aTQ2.e();
            aej_2 aej_22 = aej_2.a(aTQ2.f());
            apc_2 apc_22 = null;
            try {
                apc_22 = eyS.c(aTQ2.g());
            }
            catch (Exception exception) {
                bet_1.a.warn((Object)("TP id=" + evs_12.m() + "  " + exception.getMessage() + " (criteria='" + aTQ2.g() + "')"));
            }
            if (apc_22 == null) {
                apc_22 = aov_2.a;
            }
            int n7 = aTQ2.i();
            short s2 = aTQ2.j();
            int n8 = aTQ2.k();
            short s3 = aTQ2.l();
            boolean bl = aTQ2.n();
            short s4 = aTQ2.m();
            boolean bl2 = aTQ2.o();
            int n9 = aTQ2.p();
            evt_1 evt_12 = new evt_1(n, n2, n3, n4, n5, (short)n6, aej_22, apc_22, n7, s2, n8, s3, bl, s4, bl2, n9);
            evs_12.a(evt_12);
            evt_12.a(new fjC(aTQ2.q(), aTQ2.r(), aTQ2.s(), aTQ2.t()));
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((atp_0)asu_22);
    }
}

