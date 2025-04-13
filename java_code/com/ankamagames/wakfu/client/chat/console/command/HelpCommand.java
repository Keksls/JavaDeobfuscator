/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class HelpCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = " >" + bae.h().a("chat.help", new Object[0]) + "\n";
        aul_0.a().c(string);
    }

    @Override
    public boolean a() {
        return false;
    }
}

