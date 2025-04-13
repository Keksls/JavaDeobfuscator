/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from XA
 */
public abstract class xa_0<E> {
    private int a;
    private E b;

    protected xa_0() {
    }

    public xa_0(int n, E e2, xb_0<E> xb_02) {
        this.a = n;
        this.b = e2;
        xb_02.a(this);
    }

    public int a() {
        return this.a;
    }

    public E b() {
        return this.b;
    }

    public abstract String c();
}

