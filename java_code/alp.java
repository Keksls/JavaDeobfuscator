/*
 * Decompiled with CFR 0.152.
 */
class alp
implements afk_0<afe_0> {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ afv d;
    final /* synthetic */ akx_2 e;
    final /* synthetic */ int f;
    final /* synthetic */ alo_0 g;

    alp(alo_0 alo_02, boolean bl, int n, int n2, afv afv2, akx_2 akx_22, int n3) {
        this.g = alo_02;
        this.a = bl;
        this.b = n;
        this.c = n2;
        this.d = afv2;
        this.e = akx_22;
        this.f = n3;
    }

    public void a(afe_0 afe_02, int n, int n2, short s2) {
        if (this.a && n == this.b && n2 == this.c) {
            this.d.c(this);
            this.e.b(this.f);
        } else if (!(this.a || n == this.b && n2 == this.c)) {
            this.d.c(this);
            this.e.b(this.f);
        }
    }

    @Override
    public /* synthetic */ void cellPositionChanged(ahh_0 ahh_02, int n, int n2, short s2) {
        this.a((afe_0)ahh_02, n, n2, s2);
    }
}

