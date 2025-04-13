/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class RemoveIgnoreCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        Long l = Long.parseLong("-1");
        if (aUL.a().f().a(string) != null) {
            l = aUL.a().f().a(string).i();
        } else if (aUL.a().f().c(string) != null) {
            l = aUL.a().f().c(string).i();
        }
        PK pK = new PK();
        pK.a(l);
        azu_0.j().K().c(pK);
    }

    @Override
    public boolean a() {
        return false;
    }
}

