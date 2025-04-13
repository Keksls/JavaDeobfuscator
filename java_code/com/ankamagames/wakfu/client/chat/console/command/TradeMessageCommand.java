/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class TradeMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aup_0.h, arrayList.get(2));
        if (bzf_1.b()) {
            aUh.a("error.chat.operationNotPermited", new Object[0]);
            return;
        }
        String string = aUh.c(arrayList.get(2));
        if (string == null) {
            return;
        }
        cks_0 cks_02 = new cks_0();
        cks_02.a(string);
        azu_0.j().K().c(cks_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

