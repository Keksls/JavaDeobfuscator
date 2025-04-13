/*
 * Decompiled with CFR 0.152.
 */
public class fnG
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected short d;
    protected short e;
    protected short f;
    protected short g;
    protected int h;
    protected fnH[] i;
    protected fnH[] j;
    protected fnJ[] k;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public short f() {
        return this.d;
    }

    public short g() {
        return this.e;
    }

    public short h() {
        return this.f;
    }

    public short i() {
        return this.g;
    }

    public int j() {
        return this.h;
    }

    public fnH[] k() {
        return this.i;
    }

    public fnH[] l() {
        return this.j;
    }

    public fnJ[] m() {
        return this.k;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.k = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.d();
        this.e = asc_22.d();
        this.f = asc_22.d();
        this.g = asc_22.d();
        this.h = asc_22.f();
        int n3 = asc_22.f();
        this.i = new fnH[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.i[n2] = new fnH();
            this.i[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.j = new fnH[n2];
        for (n = 0; n < n2; ++n) {
            this.j[n] = new fnH();
            this.j[n].a(asc_22);
        }
        n = asc_22.f();
        this.k = new fnJ[n];
        for (int k = 0; k < n; ++k) {
            this.k[k] = new fnJ();
            this.k[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bN.a();
    }
}

