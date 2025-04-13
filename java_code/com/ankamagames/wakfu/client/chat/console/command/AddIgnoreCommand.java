/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AddIgnoreCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (aUh.a()) {
            return;
        }
        String string = arrayList.get(2).replaceAll("\"", "");
        aUG.b(string);
    }

    @Override
    public boolean a() {
        return false;
    }
}

