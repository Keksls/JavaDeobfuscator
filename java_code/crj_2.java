/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRJ
 */
class crj_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cri_1 b;

    crj_2(cri_1 cri_12, Runnable runnable) {
        this.b = cri_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crk_1(this));
    }
}

