/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEp
 */
class aep_1
implements Runnable {
    final /* synthetic */ aev_1 a;
    final /* synthetic */ aeo_1 b;

    aep_1(aev_1 aev_12, aeo_1 aeo_12) {
        this.a = aev_12;
        this.b = aeo_12;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

