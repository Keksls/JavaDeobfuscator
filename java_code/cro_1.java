/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRo
 */
class cro_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crn_2 b;

    cro_1(crn_2 crn_22, Runnable runnable) {
        this.b = crn_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crp_1(this));
    }
}

