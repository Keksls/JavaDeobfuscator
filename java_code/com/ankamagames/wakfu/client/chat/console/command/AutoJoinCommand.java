/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AutoJoinCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean bl = "on".equals(arrayList.get(2));
        ((bvx_0)ans_0.D().h()).a((agp_0)bWe.ar, bl);
        aUh.b("chat.autojoin.info", bl ? "on" : "off");
    }

    @Override
    public boolean a() {
        return false;
    }
}

