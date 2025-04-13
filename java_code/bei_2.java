/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bei
 */
class bei_2
implements asb_2<aRC> {
    final /* synthetic */ beh_2 a;

    bei_2(beh_2 beh_22) {
        this.a = beh_22;
    }

    public void a(aRC aRC2) {
        apc_2 apc_22;
        int n = aRC2.c();
        short s2 = (short)aRC2.d();
        try {
            apc_22 = eyS.c(aRC2.e());
        }
        catch (Exception exception) {
            beh_2.a.error((Object)("Probl\u00e8me \u00e0 la compilation d'un crit\u00e8re dans le challenge d'id " + n + " : " + aRC2.e()));
            apc_22 = null;
        }
        if (apc_22 == null) {
            apc_22 = aov_2.a;
        }
        int n2 = aRC2.f();
        int n3 = aRC2.g();
        int n4 = aRC2.h();
        int n5 = aRC2.i();
        boolean bl = aRC2.j();
        eon_1 eon_12 = new eon_1(n, s2, apc_22, n2, n3, n4, n5, bl);
        eon_12.a(aRC2.k());
        eon_12.b(aRC2.l());
        for (ard_0 ard_02 : aRC2.m()) {
            apc_2 apc_23;
            int n6 = ard_02.a();
            try {
                apc_23 = eyS.c(ard_02.b());
            }
            catch (Exception exception) {
                beh_2.a.error((Object)("Probl\u00e8me \u00e0 la compilation d'un crit\u00e8re dans le challenge d'id " + n + " : " + aRC2.e()));
                apc_23 = null;
            }
            if (apc_23 == null) {
                apc_23 = aov_2.a;
            }
            short s3 = ard_02.c();
            short s4 = ard_02.d();
            eon_12.a(n6, apc_23, s3, s4);
        }
        eop_1.a.a(eon_12);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRC)asu_22);
    }
}

