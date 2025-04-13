/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cRD
 */
class crd_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ crc_2 b;

    crd_2(crc_2 crc_22, Runnable runnable) {
        this.b = crc_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.b.a.setNeedsToPostProcess();
        this.b.a.addPostProcessCallback(new cre_2(this));
    }
}

