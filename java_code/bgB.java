/*
 * Decompiled with CFR 0.152.
 */
public final class bgB {
    public static final bgB a = new bgB();

    private bgB() {
    }

    public void a(enu_0 enu_02, enu_0 enu_03) {
        if (!enp_2.a.d(ens_2.k)) {
            return;
        }
        bmr_1 bmr_12 = azu_0.j().k();
        if (enu_02 == null || enu_02 == enu_0.a) {
            return;
        }
        if (enu_02 == enu_03) {
            return;
        }
        boolean bl = this.a(enu_02, bmr_12);
        if (!bl) {
            return;
        }
        boolean bl2 = emj_0.c.a(new emh_0[]{bmr_12});
        if (bl2) {
            return;
        }
        this.a();
    }

    private void a() {
        fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a("subscription.end.notification", new Object[0]), 2L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a(new bgC(this));
    }

    private boolean a(enu_0 enu_02, bmr_1 bmr_12) {
        return emj_0.c.a(new emh_0[]{new bgD(this, bmr_12, enu_02)});
    }
}

