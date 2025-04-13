/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cNT
 */
class cnt_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cns_2 b;

    cnt_1(cns_2 cns_22, Runnable runnable) {
        this.b = cns_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cnu_2(this));
    }
}

