/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMk
 */
class cmk_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cmj_2 b;

    cmk_1(cmj_2 cmj_22, Runnable runnable) {
        this.b = cmj_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.a.run();
    }
}

