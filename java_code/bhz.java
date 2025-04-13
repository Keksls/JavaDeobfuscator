/*
 * Decompiled with CFR 0.152.
 */
class bhz
implements afy_0 {
    final /* synthetic */ bmr_1 a;
    final /* synthetic */ bhy b;

    bhz(bhy bhy2, bmr_1 bmr_12) {
        this.b = bhy2;
        this.a = bmr_12;
    }

    @Override
    public void pathEnded(afe_0 afe_02, int n, int n2, short s2) {
        int n3 = this.a.P_().e(this.b.c.bI().P_());
        if (n3 == 1) {
            this.b.e.a(this.b.d, this.b.c.a());
        }
        afe_02.c(this);
    }
}

