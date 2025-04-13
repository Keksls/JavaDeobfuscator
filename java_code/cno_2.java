/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cNO
 */
class cno_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cnn_1 b;

    cno_2(cnn_1 cnn_12, Runnable runnable) {
        this.b = cnn_12;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.a.run();
    }
}

