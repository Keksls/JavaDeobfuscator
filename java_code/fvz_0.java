/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvz
 */
class fvz_0
implements fjv_2 {
    final /* synthetic */ fjo_2 a;
    final /* synthetic */ fvy b;

    fvz_0(fvy fvy2, fjo_2 fjo_22) {
        this.b = fvy2;
        this.a = fjo_22;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                fyy_0 fyy_02 = this.b.getElementMap();
                fvE fvE2 = (fvE)fyy_02.a("image");
                if (fvE2 != null) {
                    fvE2.getAppearance().setModulationColor(azf_2.e);
                }
                if ((fvE2 = (fvE)fyy_02.a("container")) != null) {
                    fvE2.getAppearance().setModulationColor(azf_2.e);
                }
                if ((fvE2 = (fvE)fyy_02.a("text")) != null) {
                    fvE2.getAppearance().setModulationColor(azf_2.e);
                }
                this.b.d();
                this.a.b(this);
                return;
            }
        }
    }
}

