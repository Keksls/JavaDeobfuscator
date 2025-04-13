/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class BattlegroundMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aup_0.l, arrayList.get(2));
        String string = aUh.c(arrayList.get(2));
        if (string == null) {
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 != null && ((fjw_0)fjw_0.e()).c(bmr_12.T_()).a()) {
            ckk_0 ckk_02 = new ckk_0();
            ckk_02.a(string);
            azu_0.j().K().c(ckk_02);
        } else {
            aUh.a("error.chat.playerNotInBattleground", new Object[0]);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

