/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class CommandWhereIAm
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        biI biI2 = bmr_12.bv();
        aVo.a().b(bmr_12.gd() + "[" + Integer.toString(biI2.G()) + "," + Integer.toString(biI2.H()) + "," + Double.toString(biI2.L()) + "] @" + Long.toString(bmr_12.T_()));
    }

    @Override
    public boolean a() {
        return false;
    }
}

