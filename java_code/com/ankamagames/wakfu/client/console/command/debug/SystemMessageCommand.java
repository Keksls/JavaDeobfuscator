/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class SystemMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = null;
        int n = Integer.MAX_VALUE;
        if (arrayList.size() >= 4) {
            string = arrayList.get(3).trim();
        }
        if (arrayList.size() >= 3) {
            try {
                n = Integer.parseInt(arrayList.get(2));
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        dlx.a().a(new dlq(dly.g, "Message", 500, 2500, "AnimChallenge1"));
    }

    @Override
    public boolean a() {
        return false;
    }
}

