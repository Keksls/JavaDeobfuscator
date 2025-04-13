/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLX
 */
class blx_0
implements Runnable {
    final /* synthetic */ ddC a;
    final /* synthetic */ blw_0 b;

    blx_0(blw_0 blw_02, ddC ddC2) {
        this.b = blw_02;
        this.a = ddC2;
    }

    @Override
    public void run() {
        if (this.b.c == this.a) {
            this.b.a();
        }
    }
}

