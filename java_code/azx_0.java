/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aZX
 */
class azx_0
implements fzp_0 {
    final /* synthetic */ azu_0 a;

    azx_0(azu_0 azu_02) {
        this.a = azu_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.a("Quit Request From Client");
            ans_0.D().a().e();
        }
    }
}

