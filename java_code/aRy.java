/*
 * Decompiled with CFR 0.152.
 */
public class aRy
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected byte d;
    protected ara_0[] e;
    protected aQV f;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public byte f() {
        return this.d;
    }

    public ara_0[] g() {
        return this.e;
    }

    public aQV h() {
        return this.f;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
        this.f = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.b();
        int n = asc_22.f();
        this.e = new ara_0[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new ara_0();
            this.e[k].a(asc_22);
        }
        if (asc_22.b() != 0) {
            this.f = new aQV();
            this.f.a(asc_22);
        } else {
            this.f = null;
        }
    }

    @Override
    public final int a() {
        return enK.aC.a();
    }
}

