/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fvd
 */
class fvd_0
implements Runnable {
    final /* synthetic */ fvc a;

    fvd_0(fvc fvc2) {
        this.a = fvc2;
    }

    @Override
    public void run() {
        if (!this.a.d.isVisible()) {
            return;
        }
        String string = this.a.a + "\n" + this.a.c;
        this.a.d.k.c(string);
        this.a.d.j.b(this.a.b);
    }
}

