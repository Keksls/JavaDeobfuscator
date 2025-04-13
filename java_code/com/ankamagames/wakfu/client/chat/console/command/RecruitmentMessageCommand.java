/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class RecruitmentMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (bzf_1.b()) {
            aUh.a("error.chat.operationNotPermited", new Object[0]);
            return;
        }
        Ow ow = aUh.a(aUe.v, arrayList.get(0).trim().split(" ")[0].toLowerCase());
        String string = aUh.b(ow, arrayList.get(2));
        if (string == null) {
            return;
        }
        ckr_0 ckr_02 = new ckr_0();
        ckr_02.a(string);
        ckr_02.a(ow.c());
        azu_0.j().K().c(ckr_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

