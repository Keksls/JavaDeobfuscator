/*
 * Decompiled with CFR 0.152.
 */
final class bgz
implements Sq {
    bgz() {
    }

    @Override
    public void c(sd_0 sd_02) {
        blx_1 blx_12;
        Su su = sd_02.i();
        if (su instanceof blx_1) {
            blx_12 = (blx_1)su;
            if (bzf_1.a(blx_12.a_()) == null) {
                return;
            }
            blx_12.bv().b((ejh_0)sd_02, false);
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().b((ejh_0)sd_02, true);
        }
        if (((ejh_0)sd_02).bl()) {
            return;
        }
        if (su instanceof blx_1 && sd_02.as()) {
            blx_12 = (blx_1)su;
            if (bzf_1.a(blx_12.a_()) == null) {
                return;
            }
            blx_12.a(new epz_0((ejh_0)sd_02));
        }
    }

    @Override
    public void a(sd_0 sd_02) {
        blx_1 blx_12;
        Su su = sd_02.i();
        if (su instanceof blx_1) {
            blx_12 = (blx_1)su;
            if (bzf_1.a(blx_12.a_()) == null) {
                return;
            }
            blx_12.bv().c((ejh_0)sd_02, false);
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().c((ejh_0)sd_02, true);
        }
        if (((ejh_0)sd_02).bl()) {
            return;
        }
        if (su == null) {
            return;
        }
        if (su.x_() != null && !sd_02.P() && sd_02.as()) {
            su.x_().a(sd_02);
        }
        if (su instanceof blx_1) {
            blx_12 = (blx_1)su;
            if (bzf_1.a(blx_12.a_()) == null) {
                return;
            }
            blx_12.a(new epz_0((ejh_0)sd_02));
        }
    }

    @Override
    public void b(sd_0 sd_02) {
    }

    @Override
    public void d(sd_0 sd_02) {
        blx_1 blx_12;
        Su su = sd_02.i();
        if (su instanceof blx_1) {
            blx_12 = (blx_1)su;
            if (bzf_1.a(blx_12.a_()) == null) {
                return;
            }
            blx_12.bv().a((ejh_0)sd_02, false);
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().a((ejh_0)sd_02, true);
        }
        if (!((ejh_0)sd_02).bl() && su instanceof blx_1 && sd_02.as()) {
            blx_12 = (blx_1)su;
            if (bzf_1.a(blx_12.a_()) == null) {
                return;
            }
            blx_12.a(new epc_1((ejh_0)sd_02));
        }
    }
}

