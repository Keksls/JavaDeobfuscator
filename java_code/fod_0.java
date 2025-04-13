/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fod
 */
public class fod_0
implements asu_2 {
    protected int a;
    protected short b;
    protected foe[] c;

    public int c() {
        return this.a;
    }

    public short d() {
        return this.b;
    }

    public foe[] e() {
        return this.c;
    }

    @Override
    public void b() {
        this.a = 0;
        this.b = 0;
        this.c = null;
    }

    @Override
    public void a(asc_2 asc_22) {
        this.a = asc_22.f();
        this.b = asc_22.d();
        int n = asc_22.f();
        this.c = new foe[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new foe();
            this.c[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.M.a();
    }
}

