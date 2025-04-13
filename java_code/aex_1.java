/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEx
 */
class aex_1
implements Runnable {
    final /* synthetic */ aeb_1 a;
    final /* synthetic */ aew_1 b;

    aex_1(aeb_1 aeb_12, aew_1 aew_12) {
        this.a = aeb_12;
        this.b = aew_12;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

