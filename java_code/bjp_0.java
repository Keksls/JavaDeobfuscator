/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjp
 */
class bjp_0
implements Runnable {
    final /* synthetic */ biI a;
    final /* synthetic */ bjq b;
    final /* synthetic */ bjo c;

    bjp_0(bjo bjo2, biI biI2, bjq bjq2) {
        this.c = bjo2;
        this.a = biI2;
        this.b = bjq2;
    }

    @Override
    public void run() {
        if (this.c.b()) {
            this.a.h(this.c.e);
            if (this.a.F().contains("Course") && !this.a.F().contains("-Fin")) {
                this.a.e(this.c.e);
                this.a.bJ();
            }
            this.c.e = null;
        } else {
            bjq bjq2 = (bjq)this.c.c();
            if (!bjq2.equals(this.b)) {
                bjq2.a(this.a);
            }
        }
    }
}

