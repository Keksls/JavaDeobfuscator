/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aQv
 */
public class aqv_0 {
    protected int a;
    protected int b;
    protected aQu[] c;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public aQu[] c() {
        return this.c;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        int n = asc_22.f();
        this.c = new aQu[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new aQu();
            this.c[k].a(asc_22);
        }
    }
}

