/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRP
 */
public class arp_0 {
    protected int a;
    protected short b;
    protected String c;
    protected String d;
    protected boolean e;
    protected arq_0[] f;

    public int a() {
        return this.a;
    }

    public short b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public arq_0[] f() {
        return this.f;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.i().intern();
        this.d = asc_22.i().intern();
        this.e = asc_22.c();
        int n = asc_22.f();
        this.f = new arq_0[n];
        for (int k = 0; k < n; ++k) {
            this.f[k] = new arq_0();
            this.f[k].a(asc_22);
        }
    }
}

