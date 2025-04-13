/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;

public class ShowAggroCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Aggro List \n");
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 != null && bmr_12.bz() != null) {
            for (blx_1 blx_12 : bmr_12.bz().j()) {
                stringBuilder.append(blx_12.hA());
            }
        } else {
            stringBuilder.append("pas de combat en cours \n");
        }
        aVo.a().b(stringBuilder.toString());
    }

    @Override
    public boolean a() {
        return false;
    }
}

