/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class DisplayHpBarCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        fit_1 fit_12 = fis_1.a().f("fight.displayHPBar");
        byte by = fit_12 != null && fit_12.i() >= 0 ? (byte)fit_12.i() : (byte)((bvx_0)ans_0.D().h()).d(bWe.x);
        DisplayHpBarCommand.a(bvq_0.b(by));
    }

    public static void a(byte by) {
        fis_1.a().a("fight.displayHPBar", by);
        bvx_2 bvx_22 = azu_0.j().k().bz();
        if (bvx_22 != null) {
            for (blx_1 blx_12 : bvx_22.j()) {
                fis_1.a().a((ajf_1)blx_12, "hpBarVisible");
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

