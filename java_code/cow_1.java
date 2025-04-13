/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOW
 */
class cow_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cov_2 b;

    cow_1(cov_2 cov_22, Runnable runnable) {
        this.b = cov_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cox_2(this));
    }
}

