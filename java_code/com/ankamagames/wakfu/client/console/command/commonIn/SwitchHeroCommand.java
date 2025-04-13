/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class SwitchHeroCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!arrayList.isEmpty()) {
            byte by = Byte.parseByte(arrayList.get(2));
            byp_1 byp_12 = dbO.a().d();
            if (byp_12 == null) {
                return;
            }
            long l = byp_1.a(by);
            if (l == -1L) {
                return;
            }
            bmr_1 bmr_12 = bzf_1.a();
            if (bmr_12 == null) {
                return;
            }
            if (euw_2.a.h(bmr_12.U_()) < 2) {
                return;
            }
            SwitchHeroCommand.a(l);
        }
    }

    public static void a(long l) {
        if (cZJ.a.c()) {
            return;
        }
        if (!cZJ.a.d()) {
            return;
        }
        cZI.a().a(() -> SwitchHeroCommand.b(l));
    }

    private static void b(long l) {
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        if (bmr_12.dm() != null) {
            aUh.a("error.cantSwitchHeroLeader2", new Object[0]);
            return;
        }
        Object t = euw_2.a.c(bmr_12.U_(), l);
        if (t == null || euv_2.a.a((epq_2)t)) {
            aUh.a("error.cantSwitchHeroLeader1", new Object[0]);
            return;
        }
        aZG.e().a(false);
        bmp_1.a().g(bmr_12);
        bmr_12.n(false);
        cZJ.a.a(false);
        euv_2.a.a(azu_02.n().u(), l);
        bmr_1 bmr_13 = bzf_1.a();
        if (bmr_13 == null) {
            return;
        }
        bmr_13.dE().a(bmr_12.dE().a());
        brd_0.k.a(bmr_13);
        cmi cmi2 = new cmi(l);
        biI biI2 = bmr_12.bv();
        ((afe_0)biI2).aW();
        azu_02.K().c(cmi2);
    }

    @Override
    public boolean a() {
        return false;
    }
}

