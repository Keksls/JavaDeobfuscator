/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aEy
 */
class aey_1
implements Runnable {
    final /* synthetic */ aew_1 a;
    final /* synthetic */ Exception b;
    final /* synthetic */ aew_1 c;

    aey_1(aew_1 aew_12, aew_1 aew_13, Exception exception) {
        this.c = aew_12;
        this.a = aew_13;
        this.b = exception;
    }

    @Override
    public void run() {
        for (aeb_1 aeb_12 : this.c.i) {
            aeb_12.a(this.a, this.b);
        }
        aew_1.a(this.a, null);
    }
}

