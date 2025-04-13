/*
 * Decompiled with CFR 0.152.
 */
class abw
implements Runnable {
    final /* synthetic */ abu a;

    abw(abu abu2) {
        this.a = abu2;
    }

    @Override
    public void run() {
        if (this.a.aA == null) {
            return;
        }
        if (this.a.ae != null) {
            this.a.ae.e();
        }
        this.a.ae = this.a.aA;
        this.a.aA = null;
        this.a.E();
    }
}

