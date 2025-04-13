/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eXy
 */
public abstract class exy_2
extends exx_2 {
    private long b;
    private long d;
    public static final int a = Integer.MAX_VALUE;

    public long l() {
        return this.b;
    }

    public void b(long l) {
        this.b = l;
    }

    public long m() {
        return this.d;
    }

    public void c(long l) {
        this.d = l;
    }

    public void n() {
        this.b = Integer.MAX_VALUE;
    }

    public boolean o() {
        return this.b == Integer.MAX_VALUE;
    }

    public boolean s() {
        return this.d + this.b > wc_0.p().e();
    }
}

