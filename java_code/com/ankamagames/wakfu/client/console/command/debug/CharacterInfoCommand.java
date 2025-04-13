/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class CharacterInfoCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        for (eps_0 eps_02 : eps_0.values()) {
            epa_1 epa_12 = bmr_12.a_(eps_02);
            int n = bmr_12.c(eps_02);
            aVo.a().a(eps_02.name() + " \t" + n + "/" + epa_12.c(), 0xAA00FF);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

