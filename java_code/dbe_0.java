/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbE
 */
class dbe_0
implements auxx_2 {
    boolean g;
    private final aue_2 h = new dbF(this);
    final /* synthetic */ azu_0 a;
    final /* synthetic */ cgu_2 b;
    final /* synthetic */ bmr_1 c;
    final /* synthetic */ long d;
    final /* synthetic */ byte e;
    final /* synthetic */ dbA f;

    dbe_0(dbA dbA2, azu_0 azu_02, cgu_2 cgu_22, bmr_1 bmr_12, long l, byte by) {
        this.f = dbA2;
        this.a = azu_02;
        this.b = cgu_22;
        this.c = bmr_12;
        this.d = l;
        this.e = by;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
        boolean bl = this.a.c(dbO.a());
        this.b.a(new dbg_0(this, bl));
        auy_2.a().a(this.h);
        if (this.a.c(dcX.a)) {
            this.a.b(dcX.a);
        }
        this.b.g();
        if (this.a.c(dcw.n())) {
            this.a.b(dcw.n());
        }
        if (this.a.c(dcv.i)) {
            this.a.b(dcv.i);
        }
        if (this.a.c(dej_0.a())) {
            this.a.b(dej_0.a());
        }
    }

    @Override
    public void d() {
        auy_2.a().b(this);
        auy_2.a().b(this.h);
        fta_0.getInstance().setVisible(true);
        aZG.e().a(true);
        this.c.n(true);
        long l = 1L + (System.currentTimeMillis() - this.d) / 1000L;
        if (l < (long)this.e) {
            ddp.a().d().a((byte)Math.max(0L, (long)this.e - l));
        }
    }
}

