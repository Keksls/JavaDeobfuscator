/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRr
 */
class crr_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crq_1 b;

    crr_2(crq_1 crq_12, Runnable runnable) {
        this.b = crq_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crs_1(this));
    }
}

