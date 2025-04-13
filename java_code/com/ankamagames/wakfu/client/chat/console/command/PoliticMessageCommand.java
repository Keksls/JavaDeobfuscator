/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PoliticMessageCommand
implements avt_0 {
    private static final String a = "#";

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aUe.h, arrayList.get(2));
        String string = aUh.c(arrayList.get(2));
        if (string == null) {
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        if (bmr_12.fE().m() == faX.i) {
            aUh.a("error.chat.noNation", new Object[0]);
            return;
        }
        if (bmr_12.fE().w() == null) {
            aUh.a("error.chat.noNationRank", new Object[0]);
            return;
        }
        boolean bl = false;
        if (string.startsWith(a)) {
            bl = true;
            string = string.replaceFirst(a, "");
            aUh.a(aUe.i, string);
            if (string.isEmpty()) {
                return;
            }
        }
        ckp_0 ckp_02 = new ckp_0();
        ckp_02.a(string);
        ckp_02.a(bl);
        azu_0.j().K().c(ckp_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

