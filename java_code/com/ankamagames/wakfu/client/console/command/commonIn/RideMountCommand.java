/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class RideMountCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        RideMountCommand.a(bmr_12);
    }

    public static void a(bmr_1 bmr_12) {
        bpc_2 bpc_22 = bmr_12.eE();
        if (bpc_22 != null && bpc_22.ac_() == 14) {
            bmr_12.dN();
        } else if (new bqi_2(bmr_12).g()) {
            cpw_0 cpw_02 = new cpw_0();
            azu_0.j().K().c(cpw_02);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

