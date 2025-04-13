/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fpQ
 */
class fpq_0
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ fpm_0 b;

    fpq_0(fpm_0 fpm_02, String string) {
        this.b = fpm_02;
        this.a = string;
    }

    @Override
    public void run() {
        for (int k = this.b.ae.size() - 1; k >= 0; --k) {
            anr_1 anr_12 = this.b.ae.get(k);
            if (this.b.af.contains(anr_12)) continue;
            anr_12.a(this.a);
        }
    }
}

