/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PartyMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aup_0.f, arrayList.get(2));
        String string = aUh.c(arrayList.get(2));
        if (string == null) {
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 != null && bmr_12.dE().d()) {
            cko_0 cko_02 = new cko_0();
            cko_02.a(string);
            cko_02.a(bmr_12.dE().b());
            azu_0.j().K().c(cko_02);
        } else {
            aUh.a("group.error.not_in_group", new Object[0]);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

