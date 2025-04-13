/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRl
 */
class crl_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crk_2 b;

    crl_1(crk_2 crk_22, Runnable runnable) {
        this.b = crk_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crm_2(this));
    }
}

