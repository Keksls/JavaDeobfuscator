/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public final class biL {
    private static final Logger a = Logger.getLogger(biL.class);

    private biL() {
    }

    public static boolean a(blx_1 blx_12) {
        if (blx_12 == null) {
            return false;
        }
        if (!blx_12.ak()) {
            return false;
        }
        if (blx_12.gg() == null) {
            return false;
        }
        if (biL.a(blx_12, cYZ.o())) {
            return true;
        }
        if (biL.a(blx_12, cYS.o())) {
            return true;
        }
        return biL.a(blx_12, cyy_0.o());
    }

    private static boolean a(@NotNull blx_1 blx_12, cux_0 cux_02) {
        if (!azu_0.j().c(cux_02)) {
            return false;
        }
        if (!blx_12.gg().equals(cux_02.h())) {
            return false;
        }
        if (blx_12.a((apv_2)cux_02.i()) != un_0.a) {
            return false;
        }
        return cux_02.n();
    }

    public static void a(ani_2 ani_22) {
        try {
            ani_22.a(bac.a(168), 16, 16, null);
        }
        catch (gm_0 gm_02) {
            a.error((Object)"Cannot add backstabbing icon to overhead dialog", (Throwable)gm_02);
        }
    }

    public static boolean a(bbo_0 bbo_02) {
        ejh_0 ejh_02 = bbo_02.y();
        if (!bPg.a(ejh_02)) {
            return false;
        }
        efh_0 efh_02 = (efh_0)ejh_02.f();
        if (efh_02 == null || !efh_02.v()) {
            return false;
        }
        if (ejh_02.i() == null) {
            return false;
        }
        uo_0 uo_02 = ejh_02.i().k();
        if (uo_02 == null) {
            return false;
        }
        un_0 un_02 = uo_02.a(bbo_02.G());
        return un_02 == un_0.a;
    }
}

