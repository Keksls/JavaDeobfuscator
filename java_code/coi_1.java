/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOI
 */
class coi_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ coh_1 b;

    coi_1(coh_1 coh_12, Runnable runnable) {
        this.b = coh_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new coj_1(this));
    }
}

