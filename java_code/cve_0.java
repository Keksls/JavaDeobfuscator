/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVE
 */
class cve_0
implements fjv_2 {
    final /* synthetic */ fsk_0 a;
    final /* synthetic */ fjg_2 b;
    final /* synthetic */ cVA c;

    cve_0(cVA cVA2, fsk_0 fsk_02, fjg_2 fjg_22) {
        this.c = cVA2;
        this.a = fsk_02;
        this.b = fjg_22;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        if (fju_22 == fju_2.a) {
            this.a.setModulationColor(azf_2.e);
            this.b.b(this);
        }
    }
}

