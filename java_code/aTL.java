/*
 * Decompiled with CFR 0.152.
 */
public class aTL
implements asu_2 {
    protected int a;
    protected String b;
    protected int c;
    protected aQV d;

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public aQV f() {
        return this.d;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = 0;
        this.d = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        this.c = asc_22.f();
        if (asc_22.b() != 0) {
            this.d = new aQV();
            this.d.a(asc_22);
        } else {
            this.d = null;
        }
    }

    @Override
    public final int a() {
        return enK.ap.a();
    }
}

