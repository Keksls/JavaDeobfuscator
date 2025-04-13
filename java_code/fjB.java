/*
 * Decompiled with CFR 0.152.
 */
public abstract class fjB {
    protected final long a;
    protected final int b;
    protected final int c;
    protected final fjv d;

    public fjB(long l, int n) {
        this(l, n, -1, fjv.d);
    }

    public fjB(long l, int n, int n2, fjv fjv2) {
        this.a = l;
        this.b = n;
        this.c = n2;
        this.d = fjv2;
    }

    public long e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.c;
    }

    public fjv h() {
        return this.d;
    }
}

