/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cNQ
 */
class cnq_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cnp_1 b;

    cnq_2(cnp_1 cnp_12, Runnable runnable) {
        this.b = cnp_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cnr_2(this));
    }
}

