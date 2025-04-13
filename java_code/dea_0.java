/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dea
 */
class dea_0
implements fzp_0 {
    final /* synthetic */ ddZ a;

    dea_0(ddZ ddZ2) {
        this.a = ddZ2;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.n();
        }
    }
}

