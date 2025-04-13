/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  gnu.trove.list.array.TIntArrayList
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import com.google.common.collect.Multimap;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from bdl
 */
class bdl_2
implements asb_2<aQc> {
    final /* synthetic */ TIntObjectHashMap a;
    final /* synthetic */ bdk_2 b;

    bdl_2(bdk_2 bdk_22, TIntObjectHashMap tIntObjectHashMap) {
        this.b = bdk_22;
        this.a = tIntObjectHashMap;
    }

    public void a(aQc aQc2) {
        apc_2 apc_22;
        apc_2 apc_23;
        int n = aQc2.c();
        boolean bl = aQc2.e();
        String string = aQc2.h();
        try {
            apc_23 = eyS.c(string);
        }
        catch (Exception exception) {
            apc_23 = null;
            bdk_2.a.error((Object)"", (Throwable)exception);
        }
        String string2 = this.b.a(aQc2, (TIntObjectHashMap<Multimap<Byte, Integer>>)this.a);
        try {
            apc_22 = eyS.c(string2);
        }
        catch (Exception exception) {
            apc_22 = null;
            bdk_2.a.error((Object)"", (Throwable)exception);
        }
        wt_0 wt_02 = null;
        ww_0 ww_02 = null;
        if (aQc2.u() != 0L) {
            wt_02 = wt_0.b(aQc2.u());
            ww_02 = ww_0.a(aQc2.v());
        }
        int n2 = aQc2.p() ? -1 : aQc2.t();
        boolean bl2 = bhp_1.a.a(n, aQc2.d(), bl, aQc2.f(), null, null, apc_23, aQc2.l() * 1000, (long)aQc2.m() * 1000L, aQc2.n(), aQc2.o(), aQc2.p(), aQc2.q(), aQc2.r(), aQc2.s(), n2, wt_02, ww_02, aQc2.g(), aQc2.w(), aQc2.x(), aQc2.A(), apc_22, aQc2.B());
        if (!bl2) {
            bdk_2.a.error((Object)"[STOP] Error during registering achievement");
        }
        this.a(aQc2, n);
        this.b(aQc2, n);
    }

    private void a(aQc aQc2, int n) {
        for (aqd_0 aqd_02 : aQc2.j()) {
            boolean bl = aqd_02.b();
            aQg[] aQgArray = aqd_02.f();
            TIntArrayList tIntArrayList = new TIntArrayList(aQgArray.length);
            for (aQg aQg2 : aQgArray) {
                tIntArrayList.add(aQg2.c());
            }
            Object[] objectArray = aqd_02.d();
            apc_2 apc_22 = null;
            try {
                apc_22 = eyS.c(aqd_02.c());
            }
            catch (Exception exception) {
                bdk_2.a.error((Object)"Exception during loadGoals", (Throwable)exception);
            }
            if (apc_22 == null) {
                apc_22 = aov_2.a;
            }
            apc_2 apc_23 = null;
            try {
                apc_23 = eyS.c(aqd_02.e());
            }
            catch (Exception exception) {
                bdk_2.a.error((Object)"Exception during loadGoals", (Throwable)exception);
            }
            if (apc_23 == null) {
                apc_23 = aov_2.a;
            }
            if (bhp_1.a.a(aqd_02.a(), n, tIntArrayList.isEmpty() ? null : tIntArrayList.toArray(), null, null, bl, apc_22, apc_23, (aqe_0[])objectArray)) continue;
            bdk_2.a.error((Object)"[STOP] Error during registering objective");
        }
    }

    private void b(aQc aQc2, int n) {
        for (aQf aQf2 : aQc2.k()) {
            bhn_1 bhn_12 = bhn_1.a(aQf2.b());
            if (bhp_1.a.a(aQf2.a(), n, bhn_12, aQf2.c())) continue;
            bdk_2.a.error((Object)"[STOP] Error during registering achievement reward");
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aQc)asu_22);
    }
}

