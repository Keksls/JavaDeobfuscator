/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIi
 */
class bii_0
extends fdc_2 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ bmr_1 b;
    final /* synthetic */ cyt_0 c;
    final /* synthetic */ bih_0 d;

    bii_0(bih_0 bih_02, exk_2 exk_22, bmr_1 bmr_12, cyt_0 cyt_02) {
        this.d = bih_02;
        this.a = exk_22;
        this.b = bmr_12;
        this.c = cyt_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (!(fzs2 instanceof fck_2)) {
            return false;
        }
        fck_2 fck_22 = (fck_2)fzs2;
        if (fck_22.x() == 3) {
            this.d();
            return false;
        }
        if (fck_22.x() != 1) {
            return false;
        }
        fvE fvE2 = fta_0.getInstance().getMouseOver();
        ftj_0 ftj_02 = fvE2.getParentOfType(ftj_0.class);
        if (ftj_02 == null) {
            return false;
        }
        Object object = ftj_02.getItemValue();
        if (!(object instanceof exk_2)) {
            this.d();
            return false;
        }
        exk_2 exk_22 = (exk_2)object;
        Object t = euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (t == null) {
            return false;
        }
        if (exk_22.a() == this.a.a()) {
            return false;
        }
        if (exk_22.U().g().d() != 109) {
            this.c();
            return false;
        }
        if (!bol_1.a(exk_22)) {
            this.c();
            return false;
        }
        ezr_0<?> ezr_02 = bih_0.c(exk_22);
        if (this.d.a(this.b, ezr_02)) {
            String string2 = bae.h().a("account.mimiSymbic.error.known", aUi.a(ezr_02.n()));
            aul_0.a().b(string2);
            return false;
        }
        fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("account.mimiSymbic.confirmation", aUi.a(ezr_02.n())), cfn_0.a(0), 25L, 102, 1);
        fzm_02.a((int n, String string) -> {
            if (n == 8) {
                this.d.g = exk_22.a();
                this.d.a(this.a.a());
                cgo_0.addRollElementsParticleToContainer(ftj_02);
                this.d();
            }
        });
        return false;
    }

    private void c() {
        String string = bae.h().a("account.mimiSymbic.error.uneligible", new Object[0]);
        aul_0.a().b(string);
    }

    private void d() {
        this.d.a(this);
        this.c.a(false);
    }
}

