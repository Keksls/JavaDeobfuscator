/*
 * Decompiled with CFR 0.152.
 */
public class aSB
implements asu_2 {
    protected int a;
    protected byte b;
    protected aSC[] c;

    public int c() {
        return this.a;
    }

    public byte d() {
        return this.b;
    }

    public aSC[] e() {
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
        this.b = asc_22.b();
        int n = asc_22.f();
        this.c = new aSC[n];
        for (int k = 0; k < n; ++k) {
            this.c[k] = new aSC();
            this.c[k].a(asc_22);
        }
    }

    @Override
    public final int a() {
        return enK.bq.a();
    }
}

