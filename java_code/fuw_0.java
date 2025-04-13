/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fuw
 */
class fuw_0
implements fwr_0 {
    final /* synthetic */ fso a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ fut_0 c;

    fuw_0(fut_0 fut_02, fso fso2, Runnable runnable) {
        this.c = fut_02;
        this.a = fso2;
        this.b = runnable;
    }

    @Override
    public void onVisibilityChanged(boolean bl, boolean bl2) {
        if (!bl2) {
            return;
        }
        this.a.removeVisibilityListener(this);
        this.b.run();
    }
}

