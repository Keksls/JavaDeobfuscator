/*
 * Decompiled with CFR 0.152.
 */
class cYv
extends fdc_2 {
    final /* synthetic */ cyt_0 a;

    cYv(cyt_0 cyt_02) {
        this.a = cyt_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2 == null) {
            return false;
        }
        if (!(fzs2 instanceof fck_2)) {
            return false;
        }
        if (((fck_2)fzs2).x() == 1) {
            fvE fvE2 = fta_0.getInstance().getMouseOver();
            if (fvE2 == null) {
                return false;
            }
            ftj_0 ftj_02 = fvE2.getParentOfType(ftj_0.class);
            if (ftj_02 == null) {
                return false;
            }
            Object object = ftj_02.getItemValue();
            if (!(object instanceof exk_2)) {
                return false;
            }
            exk_2 exk_22 = (exk_2)object;
            Object t = euu_2.c(azu_0.j().n().u(), exk_22.a());
            if (t == null) {
                return false;
            }
            if (flC.b(((epq_2)t).hB())) {
                this.a.d();
                return false;
            }
            if (eZq.a(exk_22, t) != eZp.a) {
                return false;
            }
            fpu_0.closePopup(null);
            exw_1 exw_12 = exk_22.G();
            if (!((fck_2)fzs2).t() && (cyt_0.n.contains(exw_12) || exk_22.y() && exk_22.A() >= 3)) {
                fzm_0 fzm_02 = fpm_0.b().a(bae.h().a("question.recycleItem", exk_22.N()), cfn_0.a(0), 2073L, 102, 1);
                fzm_02.a((int n, String string) -> {
                    if (n == 8) {
                        cyt_0.a(exk_22);
                    }
                });
            } else {
                cyt_0.a(exk_22);
            }
        } else if (((fck_2)fzs2).x() == 3) {
            this.a.d();
        }
        return false;
    }
}

