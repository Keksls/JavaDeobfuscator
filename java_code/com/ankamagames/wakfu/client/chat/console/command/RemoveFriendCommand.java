/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class RemoveFriendCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        Long l = Long.parseLong("-1");
        if (aUL.a().e().a(string) != null) {
            l = aUL.a().e().a(string).i();
        } else if (aUL.a().e().c(string) != null) {
            l = aUL.a().e().c(string).i();
        }
        PJ pJ = new PJ();
        pJ.a(l);
        azu_0.j().K().c(pJ);
    }

    @Override
    public boolean a() {
        return false;
    }
}

