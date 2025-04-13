/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDB
 */
class adb_2
extends Thread
implements abo_1 {
    adz_2 b;
    Runnable c;
    long d;
    int e;
    boolean f;
    boolean g;
    final /* synthetic */ adz_2 a;

    adb_2(adz_2 adz_22) {
        this.a = adz_22;
    }

    adb_2(adz_2 adz_22, adz_2 adz_23, Runnable runnable, long l, int n) {
        this.a = adz_22;
        this.b = adz_23;
        this.c = runnable;
        this.d = l;
        this.e = n;
        this.g = true;
    }

    @Override
    public void run() {
        if (this.e == -1) {
            while (this.g) {
                this.b();
            }
        } else {
            for (int k = 0; k < this.e; ++k) {
                this.b();
            }
        }
        this.b.a(this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void b() {
        adb_2 adb_22 = this;
        synchronized (adb_22) {
            try {
                this.wait(this.d);
            }
            catch (InterruptedException interruptedException) {
                adz_2.a.error((Object)"Exception levee", (Throwable)interruptedException);
            }
        }
        if (this.g) {
            this.c.run();
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.b = null;
        this.c = null;
        this.d = 0L;
        this.e = 0;
    }

    public void a() {
        if (this.f) {
            try {
                this.a.e.returnObject((Object)this);
            }
            catch (Exception exception) {
                adz_2.a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
    }
}

