/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvI
 */
class fvi_0
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fvH b;

    fvi_0(fvH fvH2, Runnable runnable) {
        this.b = fvH2;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.d.removeChildrenAddedListener(this);
        if (this.b.a.g) {
            this.b.d.setNeedsToPostProcess();
            this.b.d.addPostProcessCallback(new fvj_0(this));
        } else {
            this.a.run();
        }
    }
}

