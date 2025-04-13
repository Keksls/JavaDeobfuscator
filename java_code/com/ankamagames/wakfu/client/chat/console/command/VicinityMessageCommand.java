/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class VicinityMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        aUh.a(aup_0.b, arrayList.get(2));
        String string = aUh.c(arrayList.get(2));
        if (string == null) {
            return;
        }
        ckt ckt2 = new ckt();
        ckt2.a(string);
        azu_0.j().K().c(ckt2);
    }

    @Override
    public boolean a() {
        return false;
    }
}

