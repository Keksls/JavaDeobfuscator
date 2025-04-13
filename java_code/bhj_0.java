/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bHj
 */
class bhj_0
implements ewy_2 {
    final /* synthetic */ bHi a;

    bhj_0(bHi bHi2) {
        this.a = bHi2;
    }

    @Override
    public void a(ewz_2 ewz_22) {
        exk_2 exk_22 = eyo_1.g().g(ewz_22.a());
        bjy_1.a(exk_22, ewz_22.b(), null);
        if (this.a.s == null) {
            return;
        }
        this.a.s.a(this.a.t());
        fis_1.a().a((ajf_1)this.a, "currentInventoryView");
    }

    @Override
    public void b(ewz_2 ewz_22) {
        exk_2 exk_22 = eyo_1.g().g(ewz_22.a());
        bjy_1.a(exk_22, (int)ewz_22.b());
        if (this.a.s == null) {
            return;
        }
        this.a.s.a(this.a.t());
        fis_1.a().a((ajf_1)this.a, "currentInventoryView");
    }

    @Override
    public void a(ewz_2 ewz_22, int n) {
        exk_2 exk_22 = eyo_1.g().g(ewz_22.a());
        if (n > 0) {
            bjy_1.a(exk_22, n, null);
        } else {
            bjy_1.a(exk_22, Math.abs(n));
        }
        if (this.a.s == null) {
            return;
        }
        this.a.s.a(this.a.t());
        fis_1.a().a((ajf_1)this.a, "currentInventoryView");
    }
}

