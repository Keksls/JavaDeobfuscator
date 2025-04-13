/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRS
 */
class crs_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crr_1 b;

    crs_2(crr_1 crr_12, Runnable runnable) {
        this.b = crr_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crt_1(this));
    }
}

