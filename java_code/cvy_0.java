/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cVY
 */
class cvy_0
implements fjv_2 {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cvv_0 d;

    cvy_0(cvv_0 cvv_02, int n, int n2, boolean bl) {
        this.d = cvv_02;
        this.a = n;
        this.b = n2;
        this.c = bl;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                azf_2 azf_22 = new azf_2(this.a);
                azf_2 azf_23 = new azf_2(this.b);
                this.d.e.getAppearance().removeTweensOfType(fjp_2.class);
                fjp_2 fjp_22 = new fjp_2(azf_22, azf_23, this.d.e.getAppearance(), 0, this.c ? 2500 : 75, 1, false, fjw_2.b);
                this.d.e.getAppearance().addTween(fjp_22);
                fjp_22.b(this);
                break;
            }
        }
    }
}

