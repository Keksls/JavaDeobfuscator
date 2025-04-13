/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOZ
 */
class coz_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ coy_2 b;

    coz_1(coy_2 coy_22, Runnable runnable) {
        this.b = coy_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cpa_2(this));
    }
}

