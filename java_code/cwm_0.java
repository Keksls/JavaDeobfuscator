/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cWM
 */
class cwm_0
implements fjv_2 {
    final /* synthetic */ fjo_2 a;
    final /* synthetic */ cwl_0 b;

    cwm_0(cwl_0 cwl_02, fjo_2 fjo_22) {
        this.b = cwl_02;
        this.a = fjo_22;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        switch (fju_22) {
            case a: {
                this.b.a.removeTweensOfType(fjo_2.class);
                this.a.b(this);
            }
        }
    }
}

