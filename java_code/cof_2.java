/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOF
 */
class cof_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ coe_1 b;

    cof_2(coe_1 coe_12, Runnable runnable) {
        this.b = coe_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cog_2(this));
    }
}

