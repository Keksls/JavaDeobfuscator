/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public final class WhoisCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        cbw_0 cbw_02 = new cbw_0();
        cbw_02.a(string);
        azu_0.j().K().c(cbw_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

