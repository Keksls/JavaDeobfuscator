/*
 * Decompiled with CFR 0.152.
 */
public class fxA {
    private fxB a;
    private int b = 0;
    private int c = 0;

    public fxB a() {
        return this.a;
    }

    public void a(fxB fxB2) {
        this.a = fxB2;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public int c() {
        if (this.a != null) {
            return this.a.h();
        }
        return 0;
    }

    public int d() {
        return this.c;
    }

    public void b(int n) {
        this.c = n;
    }

    public int e() {
        if (this.a != null) {
            return this.a.i();
        }
        return 0;
    }
}

