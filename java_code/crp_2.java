/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRP
 */
class crp_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cro_2 b;

    crp_2(cro_2 cro_22, Runnable runnable) {
        this.b = cro_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crq_2(this));
    }
}

