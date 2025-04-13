/*
 * Decompiled with CFR 0.152.
 */
class cFR
implements anr_1 {
    final /* synthetic */ bmk_1 a;

    cFR(bmk_1 bmk_12) {
        this.a = bmk_12;
    }

    @Override
    public void a(String string) {
        if (!"heroBuildDialog".equals(string)) {
            return;
        }
        fis_1.a().a("characterSheet", (Object)this.a, "heroBuildDialog");
        dfc dfc2 = new dfc(16336);
        dfc2.a(this.a.f());
        add_2.b().a(dfc2);
        fpm_0.b().b(this);
    }
}

