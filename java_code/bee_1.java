/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bee
 */
class bee_1
implements asb_2<aRv> {
    final /* synthetic */ bow_0 a;
    final /* synthetic */ bed_2 b;

    bee_1(bed_2 bed_22, bow_0 bow_02) {
        this.b = bed_22;
        this.a = bow_02;
    }

    public void a(aRv aRv2) {
        bov_0 bov_02 = new bov_0(aRv2.c());
        for (int n : aRv2.d()) {
            efh_0 efh_02 = bgh_0.a().c(n);
            if (efh_02 != null) {
                bov_02.a(efh_02);
                continue;
            }
            bed_2.a.error((Object)("Probl\u00e8me de chargmeent de effectGruop " + aRv2.c()));
        }
        this.a.a(bov_02);
    }

    @Override
    public /* synthetic */ void load(asu_2 asu_22) {
        this.a((aRv)asu_22);
    }
}

