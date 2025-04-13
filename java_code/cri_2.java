/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRi
 */
class cri_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crh_2 b;

    cri_2(crh_2 crh_22, Runnable runnable) {
        this.b = crh_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crj_1(this));
    }
}

