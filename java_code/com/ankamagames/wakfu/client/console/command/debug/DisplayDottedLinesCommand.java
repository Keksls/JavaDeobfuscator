/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayDottedLinesCommand
implements avt_0 {
    public final String a = "help";
    public final String b = "on";
    public final String c = "off";
    public final String[] d = new String[]{"on", "off", "help"};

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            this.b();
            return;
        }
        String string = arrayList.get(2);
        if (string == null || Arrays.stream(this.d).noneMatch(string2 -> string2.equals(string))) {
            aVo.a().d(String.format("Invalid argument provided : %s. Help displayed bellow :", string));
            this.b();
            return;
        }
        switch (string) {
            case "help": {
                this.b();
                break;
            }
            case "on": {
                aPo.a(true);
                aVo.a().a("Dotted lines are enabled for future draw of Tactical mode.");
                break;
            }
            case "off": {
                aPo.a(false);
                aVo.a().a("Dotted lines are disabled for future draw of Tactical mode.");
                break;
            }
            default: {
                aVo.a().d(String.format("Unsupported argument provided : %s! Please notify developer to add support of arg provided or remove arg from arguments allowed", string));
            }
        }
    }

    public void b() {
        aVo.a().a(String.format("Help :%nAllow to manage display of dotted lines in SemiTactical and Tactical Mode. Options are : %s", Arrays.toString(this.d)));
    }

    @Override
    public boolean a() {
        return false;
    }
}

