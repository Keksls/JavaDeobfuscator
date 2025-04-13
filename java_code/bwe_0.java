/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bwe
 */
final class bwe_0
implements Sq {
    private static final Logger a = Logger.getLogger(bwe_0.class);
    private final bvx_2 b;

    bwe_0(bvx_2 bvx_22) {
        this.b = bvx_22;
    }

    @Override
    public void a(sd_0 sd_02) {
        Su su;
        ejh_0 ejh_02 = (ejh_0)sd_02;
        if (sd_02.i() != null) {
            if (sd_02.i().x_() != null && !sd_02.P() && sd_02.as() && !sd_02.ar()) {
                sd_02.i().x_().a(sd_02);
            }
            if (sd_02.i() instanceof blx_1) {
                ((blx_1)sd_02.i()).a(new epz_0(ejh_02));
            }
        }
        if ((su = sd_02.ar() || sd_02.S() && !sd_02.R() ? sd_02.h() : sd_02.i()) == null) {
            a.warn((Object)("Pas de cible sur laquelle appliquer les HMI pour l'effet " + sd_02.bt_()));
        }
        if (su != null && su instanceof blx_1) {
            ((blx_1)su).bv().c((ejh_0)sd_02, sd_02.S());
        }
    }

    @Override
    public void b(sd_0 sd_02) {
        ejh_0 ejh_02 = (ejh_0)sd_02;
        Su su = sd_02.i();
        if (su != null && su instanceof blx_1) {
            ((blx_1)su).bv().c(ejh_02, false);
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().c(ejh_02, true);
        }
        if (ejh_02.bl()) {
            return;
        }
        if (su != null && su instanceof blx_1) {
            ((blx_1)su).a(new epz_0(ejh_02));
        }
    }

    @Override
    public void c(sd_0 sd_02) {
        Su su = sd_02.i();
        if (su != null && su instanceof blx_1) {
            ((blx_1)su).bv().b((ejh_0)sd_02, false);
        } else if (sd_02.h() != null && sd_02.h() instanceof blx_1) {
            ((blx_1)sd_02.h()).bv().b((ejh_0)sd_02, true);
        }
        if (((ejh_0)sd_02).bl()) {
            return;
        }
        if (su == null) {
            return;
        }
        if (su instanceof blx_1 && sd_02.as()) {
            ((blx_1)su).a(new epz_0((ejh_0)sd_02));
        }
    }

    @Override
    public void d(sd_0 sd_02) {
        Su su;
        if (!sd_02.as()) {
            return;
        }
        Su su2 = su = sd_02.A() == null ? null : sd_02.A().f();
        if (su != null && su instanceof blx_1) {
            ((blx_1)su).bv().a((ejh_0)sd_02, false);
        }
        if (sd_02.i() != null && sd_02.i() instanceof blx_1 && sd_02.as()) {
            ((blx_1)sd_02.i()).a(new epc_1((ejh_0)sd_02));
        }
    }
}

