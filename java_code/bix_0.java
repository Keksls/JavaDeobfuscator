/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIX
 */
class bix_0
extends fdc_2 {
    final /* synthetic */ exk_2 a;
    final /* synthetic */ biw_1 b;

    bix_0(biw_1 biw_12, exk_2 exk_22) {
        this.b = biw_12;
        this.a = exk_22;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2 == null) {
            return false;
        }
        if (fzs2 instanceof fck_2 && ((fck_2)fzs2).x() == 3) {
            fta_0.getInstance().removeEventListener(frd_0.B, this, true);
            fyt_0.a().c();
            dei.a().b(this);
        } else if (fzs2 instanceof fck_2 && ((fck_2)fzs2).x() == 1) {
            exk_2 exk_22;
            fvE fvE2 = fta_0.getInstance().getMouseOver();
            ftj_0 ftj_02 = fvE2.getParentOfType(ftj_0.class);
            if (ftj_02 == null) {
                return false;
            }
            Object object = ftj_02.getItemValue();
            if (object instanceof exk_2) {
                exk_22 = (exk_2)object;
            } else if (object instanceof bja_1) {
                exk_22 = ((bja_1)object).h();
            } else {
                return false;
            }
            if (exk_22.a() == this.a.a()) {
                return false;
            }
            if (exk_22.e() > 1) {
                aUh.a("error.rollElements.itemStack", new Object[0]);
                return false;
            }
            if (!exk_22.T().ag() || exk_22.ai()) {
                aUh.a("error.rollElements.cantReroll", new Object[0]);
                return false;
            }
            if (exk_22.c() > this.b.a && this.b.a != 0) {
                aUh.a("error.item.cantReroll", new Object[0]);
                return false;
            }
            if (this.a.e() == 1 && this.b.l()) {
                fta_0.getInstance().removeEventListener(frd_0.B, this, true);
                fyt_0.a().c();
                dei.a().b(this);
            }
            this.b.h = exk_22.a();
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("reroll.itemElementsConfirmation", new Object[0]), cfn_0.a(0), 25L, 102, 1);
            fzm_02.a(new biy_1(this, ftj_02));
        }
        return false;
    }
}

