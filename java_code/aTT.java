/*
 * Decompiled with CFR 0.152.
 */
public class aTT
implements asu_2 {
    protected String a;
    protected int b;
    protected int c;
    protected int d;

    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    @Override
    public void b() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.i().intern();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
    }

    @Override
    public final int a() {
        throw new UnsupportedOperationException();
    }
}

