/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class CommunityMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (bzf_1.b()) {
            aUh.a("error.chat.operationNotPermited", new Object[0]);
            return;
        }
        Ow ow = aUh.a(aUe.u, arrayList.get(0).trim().split(" ")[0].toLowerCase());
        String string = aUh.a(ow, arrayList.get(2));
        if (string == null) {
            return;
        }
        ckm_0 ckm_02 = new ckm_0();
        ckm_02.a(string);
        ckm_02.a(ow.c());
        azu_0.j().K().c(ckm_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

