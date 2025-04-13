/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bfN
 */
class bfn_2
implements asb_2<aTR> {
    final /* synthetic */ bfm_2 a;

    bfn_2(bfm_2 bfm_22) {
        this.a = bfm_22;
    }

    public void a(aTR aTR2) {
        int[] nArray = aTR2.g();
        if (nArray.length > 0) {
            int n = nArray[0];
            efh_0 efh_02 = bgh_0.a().c(n);
            if (efh_02 == null) {
                bfm_2.a.error((Object)("Probl\u00e8me de chargmeent de Timelinebuff " + aTR2.c()));
            } else {
                eox_2.a.a(efh_02, aTR2.c());
            }
            eox_2.a.a(n, aTR2.e());
            eox_2.a.a(eoy_2.a(aTR2.d()), n);
            if (aTR2.f()) {
                eox_2.a.a(efh_02);
            }
        }
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aTR)asu_22);
    }
}

