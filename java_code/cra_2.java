/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRA
 */
class cra_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crz_2 b;

    cra_2(crz_2 crz_22, Runnable runnable) {
        this.b = crz_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crb_1(this));
    }
}

