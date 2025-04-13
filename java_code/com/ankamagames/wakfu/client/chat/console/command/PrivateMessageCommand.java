/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PrivateMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aup_0.c, arrayList.get(2));
        if (arrayList.get(2) == null) {
            return;
        }
        String string = arrayList.get(2).replaceAll("\"", "");
        if (string.contains("<")) {
            aUh.a("error.chat.privateFieldEmpty", new Object[0]);
            return;
        }
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 != null) {
            aUh.a(arrayList.get(3).trim(), string);
            if (bmr_12.ds()) {
                aUh.b("info.chat.doNotDisturbActive", new Object[0]);
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

