/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRS
 */
public class ars_0
implements asu_2 {
    protected int a;
    protected short b;
    protected int c;
    protected int d;
    protected byte e;
    protected byte f;
    protected int g;
    protected boolean h;
    protected aRT[] i;
    protected aru_0[] j;
    protected int[] k;
    protected arv_0[] l;

    public int c() {
        return this.a;
    }

    public short d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.d;
    }

    public byte g() {
        return this.e;
    }

    public byte h() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public boolean j() {
        return this.h;
    }

    public aRT[] k() {
        return this.i;
    }

    public aru_0[] l() {
        return this.j;
    }

    public int[] m() {
        return this.k;
    }

    public arv_0[] n() {
        return this.l;
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
        this.h = false;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        int n;
        int n2;
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.f();
        this.d = asc_22.f();
        this.e = asc_22.b();
        this.f = asc_22.b();
        this.g = asc_22.f();
        this.h = asc_22.c();
        int n3 = asc_22.f();
        this.i = new aRT[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            this.i[n2] = new aRT();
            this.i[n2].a(asc_22);
        }
        n2 = asc_22.f();
        this.j = new aru_0[n2];
        for (n = 0; n < n2; ++n) {
            this.j[n] = new aru_0();
            this.j[n].a(asc_22);
        }
        this.k = asc_22.k();
        n = asc_22.f();
        this.l = new arv_0[n];
        for (int k = 0; k < n; ++k) {
            this.l[k] = new arv_0();
            this.l[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.aW.a();
    }
}

