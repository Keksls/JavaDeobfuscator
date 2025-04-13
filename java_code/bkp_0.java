/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bKP
 */
public abstract class bkp_0
extends bKH {
    protected final long a;
    protected final long b;

    bkp_0(long l, long l2, Runnable runnable) {
        super(runnable);
        this.a = l;
        this.b = l2;
    }

    public boolean g() {
        return this.a != -1L;
    }

    public long a(long l) {
        return this.a == -1L ? l : this.a;
    }

    public boolean h() {
        return this.b != -1L;
    }

    public long b(long l) {
        return this.b == -1L ? l : this.b;
    }

    @Override
    public boolean a() {
        if (this.a == -1L && this.b == -1L) {
            return false;
        }
        if (this.a != -1L && this.b != -1L) {
            return this.a <= this.b;
        }
        return true;
    }

    public boolean c(long l) {
        if (this.a != -1L && this.a > l) {
            return false;
        }
        return this.b == -1L || this.b >= l;
    }

    public long i() {
        return this.a;
    }

    public long j() {
        return this.b;
    }
}

