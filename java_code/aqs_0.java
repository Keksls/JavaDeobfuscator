/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQS
 */
public class aqs_0
implements asu_2 {
    protected int a;
    protected boolean b;
    protected int c;
    protected int d;
    protected String e;

    public int c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.c();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.i().intern();
    }

    @Override
    public final int a() {
        return enK.m.a();
    }
}

