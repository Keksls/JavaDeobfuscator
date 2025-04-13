/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjv
 */
class bjv_0
implements Runnable {
    final /* synthetic */ biI a;
    final /* synthetic */ bju b;

    bjv_0(bju bju2, biI biI2) {
        this.b = bju2;
        this.a = biI2;
    }

    @Override
    public void run() {
        if (this.a.k(this.b.a)) {
            this.a.g(this.b.a);
            this.a.e(this.b.a);
            this.a.bJ();
        }
    }
}

