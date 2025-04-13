/*
 * Decompiled with CFR 0.152.
 */
class cDz
implements Runnable {
    final /* synthetic */ amc_1 a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ cdw_0 d;

    cDz(cdw_0 cdw_02, amc_1 amc_12, float f2, int n) {
        this.d = cdw_02;
        this.a = amc_12;
        this.b = f2;
        this.c = n;
    }

    @Override
    public void run() {
        this.a.a(this.b, (float)this.c);
    }
}

