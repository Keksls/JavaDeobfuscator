/*
 * Decompiled with CFR 0.152.
 */
class bWQ
implements Runnable {
    final /* synthetic */ akx_2 a;
    final /* synthetic */ int b;
    final /* synthetic */ bWP c;

    bWQ(bWP bWP2, akx_2 akx_22, int n) {
        this.c = bWP2;
        this.a = akx_22;
        this.b = n;
    }

    @Override
    public void run() {
        this.a.b(this.b);
    }
}

