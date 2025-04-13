/*
 * Decompiled with CFR 0.152.
 */
class frZ
implements adv_1 {
    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final /* synthetic */ fru_0 f;

    public frZ(fru_0 fru_02, int n, int n2, int n3, int n4, int n5) {
        this.f = fru_02;
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.f.isUnloading()) {
            return false;
        }
        this.f.getAppearance().d();
        fck_2 fck_22 = fck_2.A();
        fck_22.e(this.a);
        fck_22.f(this.b);
        fck_22.b(this.c);
        fck_22.c(this.d);
        fck_22.d(this.e);
        fck_22.c(this.f);
        fck_22.a(frd_0.C);
        this.f.dispatchEvent(fck_22);
        return false;
    }

    @Override
    public long a_() {
        return 1L;
    }

    @Override
    public void a(long l) {
    }
}

