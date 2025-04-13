/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRO
 */
public class aro_0
implements asu_2 {
    protected int a;
    protected short b;
    protected int c;
    protected int d;
    protected arp_0[] e;

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

    public arp_0[] g() {
        return this.e;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        this.c = asc_22.f();
        this.d = asc_22.f();
        int n = asc_22.f();
        this.e = new arp_0[n];
        for (int k = 0; k < n; ++k) {
            this.e[k] = new arp_0();
            this.e[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bQ.a();
    }
}

