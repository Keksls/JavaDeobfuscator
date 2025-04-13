/*
 * Decompiled with CFR 0.152.
 */
class abf
extends aas_0
implements aei_0 {
    abf(abe abe2) {
        super(abe2);
    }

    @Override
    public final void b(int n) {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void b() {
        aed.a.b(this);
    }

    @Override
    public final void c() {
        aed.a.a(this);
    }

    @Override
    public boolean d() {
        float f2 = this.a[0].a();
        float f3 = this.a[1].a();
        float f4 = this.a[2].a();
        return auc_1.a(f2, 1.0f) && auc_1.a(f3, 1.0f) && auc_1.a(f4, 1.0f);
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        float f2 = this.a[0].a();
        float f3 = this.a[1].a();
        float f4 = this.a[2].a();
        fArray[0] = fArray[0] * f2;
        fArray[1] = fArray[1] * f3;
        fArray[2] = fArray[2] * f4;
    }
}

