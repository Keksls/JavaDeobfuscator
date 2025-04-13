/*
 * Decompiled with CFR 0.152.
 */
class cVL
implements Runnable {
    int a;
    final /* synthetic */ fuk_0 b;
    final /* synthetic */ cVA c;

    cVL(cVA cVA2, fuk_0 fuk_02) {
        this.c = cVA2;
        this.b = fuk_02;
    }

    @Override
    public void run() {
        this.b.c(String.valueOf(this.a));
        ++this.a;
    }
}

