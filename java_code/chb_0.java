/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cHb
 */
class chb_0
implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;

    chb_0(boolean bl, int n) {
        this.a = bl;
        this.b = n;
    }

    @Override
    public void run() {
        cHa.doFadeAll(this.a, this.b);
        cHa.a = null;
    }
}

