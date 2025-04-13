/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bzU
 */
public abstract class bzu_1<T extends bzu_1> {
    private boolean a = true;

    public abstract boolean b();

    public abstract void c();

    public abstract void d();

    public void a(boolean bl) {
        this.d();
    }

    public abstract void a(T var1);

    final boolean i() {
        return this.a;
    }

    final void a(Runnable runnable) {
        this.a = false;
        runnable.run();
        this.a = true;
    }
}

