/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZK
 */
class czk_0
implements auxx_2 {
    boolean a;
    final aue_2 b = new czl_0(this);
    final /* synthetic */ cgu_2 c;
    final /* synthetic */ bmr_1 d;
    final /* synthetic */ azu_0 e;
    final /* synthetic */ bmr_1 f;
    final /* synthetic */ long g;
    final /* synthetic */ byte h;
    final /* synthetic */ cZJ i;

    czk_0(cZJ cZJ2, cgu_2 cgu_22, bmr_1 bmr_12, azu_0 azu_02, bmr_1 bmr_13, long l, byte by) {
        this.i = cZJ2;
        this.c = cgu_22;
        this.d = bmr_12;
        this.e = azu_02;
        this.f = bmr_13;
        this.g = l;
        this.h = by;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
        czu_0 czu_02;
        this.c.a(new cZM(this));
        auy_2.a().a(this.b);
        if (this.e.c(dcX.a)) {
            this.e.b(dcX.a);
        }
        this.c.g();
        if (this.e.c(dcw.n())) {
            this.e.b(dcw.n());
        }
        if (this.e.c(dcv.i)) {
            this.e.b(dcv.i);
        }
        if (this.e.c(dej_0.a())) {
            this.e.b(dej_0.a());
        }
        if (this.e.c(czu_02 = bgp_1.c())) {
            this.e.b(czu_02);
        }
        fis_1.a().a("isInOwnHavenWorld", bgp_1.a(this.d.T_()));
    }

    @Override
    public void d() {
        this.i.c = false;
        byp_2.a().x();
        if (this.d.eZ()) {
            byp_2.a().b();
        }
        auy_2.a().b(this);
        auy_2.a().b(this.b);
        fta_0.getInstance().setVisible(true);
        aZG.e().a(true);
        cxq_0.a.f();
        long l = 1L + (System.currentTimeMillis() - this.g) / 1000L;
        if (l < (long)this.h) {
            ddp.a().d().a((byte)Math.max(0L, (long)this.h - l));
        }
        if (this.i.f != null) {
            ado_1.a().a(this.i.f);
        }
    }
}

