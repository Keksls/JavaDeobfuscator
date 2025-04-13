/*
 * Decompiled with CFR 0.152.
 */
public class aQV
implements asu_2 {
    protected byte a;
    protected int b;

    public byte c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.b();
        this.b = asc_22.f();
    }

    @Override
    public final int a() {
        throw new UnsupportedOperationException();
    }
}

