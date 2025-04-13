/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRu
 */
class cru_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crt_2 b;

    cru_2(crt_2 crt_22, Runnable runnable) {
        this.b = crt_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new crv_1(this));
    }
}

