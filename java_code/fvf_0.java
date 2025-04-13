/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvF
 */
class fvf_0
implements fjv_2 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fvE b;

    fvf_0(fvE fvE2, Runnable runnable) {
        this.b = fvE2;
        this.a = runnable;
    }

    @Override
    public void onTweenEvent(fjg_2 fjg_22, fju_2 fju_22) {
        fjg_22.b(this);
        if (this.a != null) {
            this.a.run();
        }
    }
}

