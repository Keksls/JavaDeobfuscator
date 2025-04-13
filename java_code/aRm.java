/*
 * Decompiled with CFR 0.152.
 */
public class aRm
implements asu_2 {
    protected int a;
    protected String b;
    protected String c;
    protected String d;
    protected arn_0[] e;

    public int c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public arn_0[] g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        this.c = asc_22.i().intern();
        this.d = asc_22.i().intern();
        int n = asc_22.f();
        this.e = new arn_0[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new arn_0();
            this.e[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.A.a();
    }
}

