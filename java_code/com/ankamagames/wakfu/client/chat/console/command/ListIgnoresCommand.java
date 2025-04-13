/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class ListIgnoresCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUB aUB2 = aUL.a().f();
        if (aUB2 != null) {
            StringBuilder stringBuilder = new StringBuilder(bae.h().a("chat.ignoreList", new Object[0]));
            stringBuilder.append(" :\n");
            for (aUK aUK2 : aUB2) {
                stringBuilder.append(" +").append(aUK2.g()).append(" (");
                stringBuilder.append(")\n");
            }
            aul_0.a().c(stringBuilder.toString());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

