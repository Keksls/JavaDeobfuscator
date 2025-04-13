/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aES
 */
class aes_2 {
    private final long a;
    private final double b;
    private final int c;
    private long d;
    double e;

    aes_2(double d2, int n, long l) {
        if (l <= 0L) {
            throw new IllegalArgumentException("Elements of capacities must be positive.");
        }
        this.a = l;
        this.b = d2;
        this.c = n;
    }

    double a() {
        return (double)this.a / this.b;
    }

    public int b() {
        return this.c;
    }

    long c() {
        return this.d;
    }

    void a(double d2) {
        this.d = (long)Math.floor(d2);
        this.e = d2 - (double)this.d;
    }

    public void d() {
        this.d = this.a;
    }

    public double e() {
        return this.b;
    }

    public void f() {
        ++this.d;
        this.e -= 1.0;
    }
}

