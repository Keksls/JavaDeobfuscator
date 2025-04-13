/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEz
 */
class aez_1
implements Runnable {
    final /* synthetic */ aew_1 a;
    final /* synthetic */ aew_1 b;

    aez_1(aew_1 aew_12, aew_1 aew_13) {
        this.b = aew_12;
        this.a = aew_13;
    }

    @Override
    public void run() {
        for (aeb_1 aeb_12 : this.b.i) {
            aeb_12.a(this.a);
        }
    }
}

