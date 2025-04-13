/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMm
 */
class cmm_1
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cml_1 b;

    cmm_1(cml_1 cml_12, Runnable runnable) {
        this.b = cml_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.a.run();
    }
}

