/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bIp
 */
class bip_0
extends fdc_2 {
    final /* synthetic */ fhy_0 a;
    final /* synthetic */ bio_0 b;

    bip_0(bio_0 bio_02, fhy_0 fhy_02) {
        this.b = bio_02;
        this.a = fhy_02;
    }

    @Override
    public boolean run(fzs fzs2) {
        if (fzs2 == null) {
            return false;
        }
        if (!(fzs2 instanceof fck_2)) {
            return false;
        }
        int n2 = ((fck_2)fzs2).x();
        if (n2 == 3) {
            fta_0.getInstance().removeEventListener(frd_0.B, this, true);
            fyt_0.a().c();
            dei.a().b(this);
        } else if (n2 == 1) {
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
            exk_2 exk_23 = this.a.a();
            if (exk_22.a() == exk_23.a()) {
                return false;
            }
            ezg_0 ezg_02 = eZy.b(exk_22, exk_23);
            if (ezg_02 != ezg_0.a && ezg_02 != ezg_0.j) {
                fpm_0.b().a(bae.h().a(this.b.a(ezg_02), new Object[0]), cfn_0.a(1), 1027L, 102, 1);
                return false;
            }
            if (exk_23.e() == 1 && this.b.l()) {
                fta_0.getInstance().removeEventListener(frd_0.B, this, true);
                fyt_0.a().c();
                dei.a().b(this);
            }
            this.b.g = exk_22.a();
            fzm_0 fzm_02 = fpm_0.b().a(bae.h().a(this.b.a(ezg_02), new Object[0]), cfn_0.a(0), 25L, 102, 1);
            fzm_02.a((int n, String string) -> {
                if (n == 8) {
                    this.b.a(exk_23.a());
                    cgo_0.addRollElementsParticleToContainer(ftj_02);
                }
            });
        }
        return false;
    }
}

