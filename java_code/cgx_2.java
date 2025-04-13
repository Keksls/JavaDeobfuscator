/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cgx
 */
class cgx_2
implements auxx_2 {
    final /* synthetic */ acb_0 a;
    final /* synthetic */ bmr_1 b;
    final /* synthetic */ long c;
    final /* synthetic */ cct_1 d;
    final /* synthetic */ ans_0 e;
    final /* synthetic */ biI f;
    final /* synthetic */ aff_1 g;
    final /* synthetic */ cgu_2 h;

    cgx_2(cgu_2 cgu_22, acb_0 acb_02, bmr_1 bmr_12, long l, cct_1 cct_12, ans_0 ans_02, biI biI2, aff_1 aff_12) {
        this.h = cgu_22;
        this.a = acb_02;
        this.b = bmr_12;
        this.c = l;
        this.d = cct_12;
        this.e = ans_02;
        this.f = biI2;
        this.g = aff_12;
    }

    @Override
    public void c() {
        this.a.b().e();
        acw.a().c();
        acw.a().a(this.a, 300);
    }

    @Override
    public void d() {
        auy_2.a().b(this);
        this.b.m(false);
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        if (cdn_1.a.a() == this.c) {
            this.a.a(this.d.q);
            cgu_2.a(this.e.d(), this.d);
        }
        try {
            this.f.b(this.g.d(), this.g.e(), (int)this.g.f());
        }
        catch (Exception exception) {
            cgu_2.b.error((Object)"Exception levee", (Throwable)exception);
        }
    }
}

