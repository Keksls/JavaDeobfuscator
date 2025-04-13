/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aRK
 */
public class ark_0 {
    protected int a;
    protected String b;
    protected float c;
    protected arj_0[] d;

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public arj_0[] d() {
        return this.d;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.i().intern();
        this.c = asc_22.e();
        int n = asc_22.f();
        this.d = new arj_0[n];
        for (int k = 0; k < n; ++k) {
            this.d[k] = new arj_0();
            this.d[k].a(asc_22);
        }
    }
}

