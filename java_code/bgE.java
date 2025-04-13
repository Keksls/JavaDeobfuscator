/*
 * Decompiled with CFR 0.152.
 */
public final class bgE
implements Sq {
    private final blx_1 a;

    public bgE(blx_1 blx_12) {
        this.a = blx_12;
    }

    @Override
    public void a(sd_0 sd_02) {
        if (sd_02.i() != null && sd_02.i() instanceof blx_1) {
            ((blx_1)sd_02.i()).bv().c((ejh_0)sd_02, false);
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().c((ejh_0)sd_02, true);
        }
        if (!((ejh_0)sd_02).bl() && sd_02.i() != null) {
            if (sd_02.i().x_() != null && !sd_02.P() && sd_02.as()) {
                sd_02.i().x_().a(sd_02);
            }
            if (sd_02.i() instanceof blx_1) {
                ((blx_1)sd_02.i()).a(new epz_0((ejh_0)sd_02));
            }
        }
    }

    @Override
    public void d(sd_0 sd_02) {
        blx_1 blx_12;
        this.a.bv().a((ejh_0)sd_02, false);
        if (!((ejh_0)sd_02).bl() && sd_02.as() && (blx_12 = (blx_1)sd_02.i()) != null) {
            blx_12.a(new epc_1((ejh_0)sd_02));
        }
    }

    @Override
    public void b(sd_0 sd_02) {
    }

    @Override
    public void c(sd_0 sd_02) {
        this.a.bv().b((ejh_0)sd_02, false);
        if (!((ejh_0)sd_02).bl() && sd_02.as()) {
            ((blx_1)sd_02.i()).a(new epz_0((ejh_0)sd_02));
        }
    }
}

