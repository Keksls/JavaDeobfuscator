/*
 * Decompiled with CFR 0.152.
 */
class ddX
implements Runnable {
    boolean a = true;
    final /* synthetic */ ddO b;

    ddX(ddO ddO2) {
        this.b = ddO2;
    }

    @Override
    public void run() {
        long l = System.currentTimeMillis();
        if (l - this.b.k < 10000L) {
            this.a = true;
            return;
        }
        if (l - this.b.j < 5000L) {
            this.a = true;
            return;
        }
        this.b.j = l;
        this.b.a(this.b.i + 1, this.b.i);
        this.a = false;
    }
}

