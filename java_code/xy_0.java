/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Xy
 */
class xy_0
implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ long b;
    final /* synthetic */ xw_0 c;

    xy_0(xw_0 xw_02, Runnable runnable, long l) {
        this.c = xw_02;
        this.a = runnable;
        this.b = l;
    }

    @Override
    public void run() {
        this.a.run();
        this.c.c.d(this.b);
    }
}

