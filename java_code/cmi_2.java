/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cMi
 */
class cmi_2
implements fwp_0 {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cmh_2 b;

    cmi_2(cmh_2 cmh_22, Runnable runnable) {
        this.b = cmh_22;
        this.a = runnable;
    }

    @Override
    public void onChildrenAdded() {
        this.b.a.removeChildrenAddedListener(this);
        this.a.run();
    }
}

