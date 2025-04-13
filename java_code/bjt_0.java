/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjt
 */
class bjt_0
implements Runnable {
    final /* synthetic */ biI a;
    final /* synthetic */ bju b;
    final /* synthetic */ bjs_0 c;

    bjt_0(bjs_0 bjs_02, biI biI2, bju bju2) {
        this.c = bjs_02;
        this.a = biI2;
        this.b = bju2;
    }

    @Override
    public void run() {
        if (this.c.b()) {
            this.a.g(this.c.e);
            this.a.e(this.c.e);
            this.c.e = null;
            this.a.bJ();
        } else {
            bju bju2 = (bju)this.c.c();
            if (!bju2.equals(this.b)) {
                bju2.a(this.a);
            }
        }
    }
}

