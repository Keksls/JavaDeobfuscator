/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from dbG
 */
class dbg_0
implements cga_2 {
    final /* synthetic */ boolean a;
    final /* synthetic */ dbe_0 b;

    dbg_0(dbe_0 dbe_02, boolean bl) {
        this.b = dbe_02;
        this.a = bl;
    }

    @Override
    public void a() {
        fpm_0.b().u();
        fta_0.getInstance().preProcess(0);
        fta_0.getInstance().postProcess(0);
        this.b.b.f();
        fta_0.getInstance().setVisible(false);
    }

    @Override
    public void b() {
        this.b.g = true;
        azu_0 azu_02 = azu_0.j();
        if (this.a) {
            azu_02.a(dbO.a());
            dbO.a().c();
        }
        if (azu_02.k().dh()) {
            azu_02.a(dds_0.a());
        }
        this.b.b.h();
    }
}

