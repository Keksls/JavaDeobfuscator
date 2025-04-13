/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aWp
 */
class awp_0
implements fzp_0 {
    final /* synthetic */ awo_0 a;

    awp_0(awo_0 awo_02) {
        this.a = awo_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.c();
        } else {
            aXj.a("You HAVE to validate your command with a dev");
        }
    }
}

