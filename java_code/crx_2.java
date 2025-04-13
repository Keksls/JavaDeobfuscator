/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRx
 */
class crx_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crw_2 b;

    crx_2(crw_2 crw_22, Runnable runnable) {
        this.b = crw_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cry_1(this));
    }
}

