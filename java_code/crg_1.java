/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRG
 */
class crg_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crf_2 b;

    crg_1(crf_2 crf_22, Runnable runnable) {
        this.b = crf_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crh_1(this));
    }
}

