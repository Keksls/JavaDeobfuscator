/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRM
 */
class crm_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crl_2 b;

    crm_1(crl_2 crl_22, Runnable runnable) {
        this.b = crl_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crn_1(this));
    }
}

