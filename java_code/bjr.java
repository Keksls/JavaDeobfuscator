/*
 * Decompiled with CFR 0.152.
 */
class bjr
implements Runnable {
    final /* synthetic */ biI a;
    final /* synthetic */ bjq b;

    bjr(bjq bjq2, biI biI2) {
        this.b = bjq2;
        this.a = biI2;
    }

    @Override
    public void run() {
        if (this.a.k(this.b.a)) {
            this.a.h(this.b.a);
            if (this.a.F().contains("Course") && !this.a.F().contains("-Fin")) {
                this.a.e(this.b.a);
                this.a.bJ();
            }
        }
    }
}

