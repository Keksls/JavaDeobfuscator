/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aSa
 */
public class asa_0
implements asu_2 {
    protected int a;
    protected int b;
    protected asb_0[] c;

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public asb_0[] e() {
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
        this.b = asc_22.f();
        int n = asc_22.f();
        this.c = new asb_0[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new asb_0();
            this.c[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bb.a();
    }
}

