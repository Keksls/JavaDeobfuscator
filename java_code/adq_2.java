/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aDQ
 */
abstract class adq_2 {
    protected final Runnable a;
    protected long b;
    protected int c;

    protected adq_2(Runnable runnable) {
        this.a = runnable;
    }

    public abstract long a(long var1);

    public long a() {
        return this.b;
    }

    public Runnable b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public void a(int n) {
        this.c = n;
    }
}

