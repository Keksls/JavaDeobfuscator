/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQX
 */
public class aqx_0
implements asu_2 {
    protected int a;
    protected int b;
    protected int c;
    protected String d;
    protected String e;
    protected int[] f;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public int[] h() {
        return this.f;
    }

    public fbs_0[] i() {
        fbs_0[] fbs_0Array = new fbs_0[this.f.length];
        for (int k = 0; k < this.f.length; ++k) {
            fbs_0Array[k] = fbs_0.a(this.f[k]);
        }
        return fbs_0Array;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        this.c = asc_22.f();
        this.d = asc_22.i().intern();
        this.e = asc_22.i().intern();
        this.f = asc_22.k();
    }

    @Override
    public final int a() {
        return enK.q.a();
    }
}

