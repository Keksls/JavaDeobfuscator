/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOC
 */
class coc_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cob_2 b;

    coc_1(cob_2 cob_22, Runnable runnable) {
        this.b = cob_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cod_1(this));
    }
}

