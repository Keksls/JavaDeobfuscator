/*
 * Decompiled with CFR 0.152.
 */
class bMl
implements ffb_0 {
    final /* synthetic */ bMk a;

    bMl(bMk bMk2) {
        this.a = bMk2;
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void a(int n) {
        if (this.a.c == null) {
            return;
        }
        bMk bMk2 = this.a.a.er();
        if (this.a.b.a().b() != bMk2.f().a().b()) {
            return;
        }
        ffv ffv2 = new ffv(bMk2);
        ffv2.d(n);
        this.a.c.a(this.a.b.d());
    }

    @Override
    public void b(int n) {
        bMk bMk2;
        bMj.a(this.a.b, this.a.c, n, this.a.a);
        bMk bMk3 = bMk2 = this.a.b.a().k() ? this.a.a.es() : this.a.a.er();
        if (bMk2 == null) {
            return;
        }
        if (this.a.b.a().b() != bMk2.f().a().b()) {
            return;
        }
        ffv ffv2 = new ffv(bMk2);
        try {
            ffv2.b(n);
        }
        catch (fgm fgm2) {
            bMk.f.error((Object)"Exception raised", (Throwable)fgm2);
        }
        bpc_2 bpc_22 = this.a.a.eE();
        if (bpc_22 instanceof bqi_2 && this.a.a.es() != null) {
            bqi_2 bqi_22 = (bqi_2)bpc_22;
            bqi_22.h();
            bqi_22.i();
        }
    }

    @Override
    public void c(int n) {
        this.a.a(n > 0, YU.b);
    }

    @Override
    public void d(int n) {
    }

    @Override
    public void a(wu_0 wu_02) {
    }

    @Override
    public void b(wu_0 wu_02) {
    }

    @Override
    public void c(wu_0 wu_02) {
        this.a.a(wu_02.c(), YU.b);
    }

    @Override
    public void e(int n) {
        this.a.a(n <= 0, YU.b);
    }
}

