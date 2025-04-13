/*
 * Decompiled with CFR 0.152.
 */
public class fme {
    protected int a;
    protected int b;
    protected fmd[] c;

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public fmd[] c() {
        return this.c;
    }

    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.f();
        int n = asc_22.f();
        this.c = new fmd[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new fmd();
            this.c[k].a(asc_22);
        }
    }
}

