/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOL
 */
class col_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cok_2 b;

    col_1(cok_2 cok_22, Runnable runnable) {
        this.b = cok_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new com_2(this));
    }
}

