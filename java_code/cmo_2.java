/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMo
 */
class cmo_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cmn_1 b;

    cmo_2(cmn_1 cmn_12, Runnable runnable) {
        this.b = cmn_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.a.run();
    }
}

