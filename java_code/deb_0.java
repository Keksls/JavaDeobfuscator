/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from deb
 */
class deb_0
implements fzp_0 {
    final /* synthetic */ cLm a;
    final /* synthetic */ ddZ b;

    deb_0(ddZ ddZ2, cLm cLm2) {
        this.b = ddZ2;
        this.a = cLm2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            cfl_0.deleteBuilding(this.a.e().d());
        } else {
            this.a.e(this.b.e);
        }
    }
}

