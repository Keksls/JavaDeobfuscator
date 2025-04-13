/*
 * Decompiled with CFR 0.152.
 */
public class aRW
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected boolean e;
    protected short f;
    protected boolean g;
    protected int h;
    protected aRX[] i;

    public int c() {
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

    public boolean g() {
        return this.e;
    }

    public short h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public aRX[] k() {
        return this.i;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.g = false;
        this.h = 0;
        this.i = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.c();
        this.f = asc_22.d();
        this.g = asc_22.c();
        this.h = asc_22.f();
        int n = asc_22.f();
        this.i = new aRX[n];
        for (int k = 0; k < n; ++k) {
            this.i[k] = new aRX();
            this.i[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.aY.a();
    }
}

