/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ON
 */
public abstract class on_0 {
    protected Integer a;
    protected Integer b;
    protected Long c;
    protected Long d;
    protected Double e;

    int c() {
        return this.a == null ? 1 : this.a;
    }

    abstract int a();

    long d() {
        return this.c == null ? 0L : this.c;
    }

    long e() {
        return this.d == null ? Long.MAX_VALUE : this.d;
    }

    double f() {
        return this.e == null ? 1.0 : this.e;
    }

    abstract long[] b();

    public on_0 a(int n) {
        this.a = n;
        return this;
    }

    public on_0 b(int n) {
        this.b = n;
        return this;
    }

    public on_0 a(long l) {
        this.c = l;
        return this;
    }

    public on_0 b(long l) {
        this.d = l;
        return this;
    }

    public on_0 a(double d2) {
        this.e = d2;
        return this;
    }
}

