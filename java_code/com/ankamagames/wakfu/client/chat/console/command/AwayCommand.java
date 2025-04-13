/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AwayCommand
implements avt_0 {
    public static boolean a = false;
    public static String b = "";

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!a && arrayList.get(2) == null) {
            aUh.a("command.error.away", new Object[0]);
            return;
        }
        if (a ^= true) {
            String string = arrayList.get(2);
            b = string.isEmpty() ? "" : string;
            aUh.b("command.away.enabled", new Object[0]);
        } else {
            b = "";
            aUh.b("command.away.disabled", new Object[0]);
        }
        AwayCommand.c();
    }

    private static void c() {
        cqc_0 cqc_02 = new cqc_0(a);
        azu_0.j().K().c(cqc_02);
    }

    public static void b() {
        if (a) {
            a = false;
            b = "";
            AwayCommand.c();
            aUh.b("command.away.disabled", new Object[0]);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

