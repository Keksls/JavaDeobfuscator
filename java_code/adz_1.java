/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDZ
 */
public class adz_1 {
    private final int a;
    private int b;
    private boolean c;
    private final Runnable d;

    public adz_1(int n, Runnable runnable) {
        this.a = n;
        this.b = 0;
        this.d = runnable;
        this.c = true;
    }

    public synchronized void a() {
        if (!this.c) {
            return;
        }
        if (this.j() > 0) {
            ++this.b;
            if (this.j() == 0) {
                this.k();
            }
        } else {
            throw new RuntimeException("Barrier already open");
        }
    }

    public synchronized void b() {
        if (!this.c) {
            return;
        }
        if (this.j() <= 0) {
            throw new RuntimeException("Barrier already open");
        }
        this.b = this.a;
        this.k();
    }

    public void c() {
        this.c = true;
    }

    public synchronized void d() {
        this.c = false;
    }

    public synchronized boolean e() {
        return this.c;
    }

    public synchronized boolean f() {
        if (this.c) {
            return this.b == this.a;
        }
        return true;
    }

    public synchronized void g() {
        this.b = 0;
    }

    public synchronized int h() {
        if (this.c) {
            return this.b;
        }
        return this.a;
    }

    public synchronized int i() {
        return this.a;
    }

    public synchronized int j() {
        if (this.c) {
            return this.a - this.b;
        }
        return 0;
    }

    private void k() {
        if (this.d != null) {
            this.d.run();
        }
    }
}

