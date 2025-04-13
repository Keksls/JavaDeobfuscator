/*
 * Decompiled with CFR 0.152.
 */
public abstract class ZY<M extends aaq_0, T>
extends ZT<M> {
    private T f;

    protected ZY(M m) {
        super(m);
    }

    protected abstract T d();

    public final T e() {
        if (this.f == null) {
            this.f = this.d();
        }
        return this.f;
    }

    @Override
    public void c(int n) {
        this.f = null;
    }

    public abstract float f();

    public abstract int g();

    public abstract String h();
}

