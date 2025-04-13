/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cOT
 */
class cot_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cos_1 b;

    cot_1(cos_1 cos_12, Runnable runnable) {
        this.b = cos_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cou_1(this));
    }
}

