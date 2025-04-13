/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class RandCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        short s2;
        byte by;
        if (aUh.a()) {
            return;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (!Pattern.matches("^\\d{1,4}(d\\d{1,4})?$", arrayList.get(2).trim())) {
            RandCommand.b();
            return;
        }
        String[] stringArray = arrayList.get(2).trim().split("d");
        if (stringArray.length == 1) {
            by = 1;
            s2 = Short.parseShort(stringArray[0]);
        } else {
            by = Byte.parseByte(stringArray[0]);
            s2 = Short.parseShort(stringArray[1]);
        }
        if (s2 > 1000 || by > 20) {
            RandCommand.b();
            return;
        }
        clx clx2 = new clx();
        clx2.a(by);
        clx2.a(s2);
        azu_0.j().K().c(clx2);
    }

    private static void b() {
        aUh.a("chat.random.error", (byte)20, (short)1000);
    }

    @Override
    public boolean a() {
        return false;
    }
}

