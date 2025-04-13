/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOh
 */
class coh_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cog_1 b;

    coh_2(cog_1 cog_12, Runnable runnable) {
        this.b = cog_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new coi_2(this));
    }
}

