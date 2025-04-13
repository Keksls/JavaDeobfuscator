/*
 * Decompiled with CFR 0.152.
 */
class aWl
implements fzp_0 {
    final /* synthetic */ awk_0 a;

    aWl(awk_0 awk_02) {
        this.a = awk_02;
    }

    @Override
    public void messageBoxClosed(int n, String string) {
        if (n == 8) {
            this.a.c();
        }
    }
}

