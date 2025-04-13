/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMq
 */
class cmq_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cmp_2 b;

    cmq_2(cmp_2 cmp_22, Runnable runnable) {
        this.b = cmp_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.a.run();
    }
}

