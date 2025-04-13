/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bjk
 */
class bjk_0
implements Runnable {
    final /* synthetic */ biI a;
    final /* synthetic */ bjj_0 b;

    bjk_0(bjj_0 bjj_02, biI biI2) {
        this.b = bjj_02;
        this.a = biI2;
    }

    @Override
    public void run() {
        if (this.a.bI().ak()) {
            this.a.bQ().d(this.a);
        }
        this.a.E();
    }
}

