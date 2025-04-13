/*
 * Decompiled with CFR 0.152.
 */
public abstract class ZT<M extends aaq_0> {
    protected final ZZ[] a;
    protected final ZZ[] b;
    protected ZY[] c;
    protected final M d;

    protected ZT(M m) {
        this.d = m;
        this.a = ((aaq_0)m).h();
        this.b = ((aaq_0)m).g();
    }

    public final ZZ a(int n) {
        return this.b[n];
    }

    public final ZZ b(int n) {
        return this.a[n];
    }

    public final int a() {
        return ((aaq_0)this.d).e();
    }

    public final ZU b() {
        return ((aaq_0)this.d).d_();
    }

    public int c() {
        return ((aaq_0)this.d).f();
    }

    public void a(ZY[] zYArray) {
        assert (zYArray.length == this.c());
        this.c = zYArray;
    }

    public abstract void c(int var1);
}

