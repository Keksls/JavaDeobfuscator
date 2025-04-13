/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bxu
 */
class bxu_2
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ bxs_2 b;

    bxu_2(bxs_2 bxs_22, int n) {
        this.b = bxs_22;
        this.a = n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        Object object = this.b.d;
        synchronized (object) {
            this.b.b.f(this.a);
        }
        bhw_2.a.b();
    }
}

