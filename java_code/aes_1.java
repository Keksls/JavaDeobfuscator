/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEs
 */
class aes_1
implements Runnable {
    final /* synthetic */ aeo_1 a;
    final /* synthetic */ aeo_1 b;

    aes_1(aeo_1 aeo_12, aeo_1 aeo_13) {
        this.b = aeo_12;
        this.a = aeo_13;
    }

    @Override
    public void run() {
        for (aev_1 aev_12 : this.b.h) {
            aev_12.b(this.a);
        }
    }
}

