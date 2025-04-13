/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import java.util.Arrays;

public class SetSemiTacticalBackgroundCommand
implements avt_0 {
    public final String a = "help";
    public final String b = "theme";
    public final String c = "parallax";
    public final String[] d = new String[]{"theme", "parallax", "help"};

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
            case "theme": {
                ((bvx_0)ans_0.D().h()).a((agp_0)bWe.J, false);
                aVo.a().a("Background in SemiTactical use color from theme.");
                break;
            }
            case "parallax": {
                ((bvx_0)ans_0.D().h()).a((agp_0)bWe.J, true);
                aVo.a().a("Background in SemiTactical use parallax.");
                break;
            }
            default: {
                aVo.a().d(String.format("Unsupported argument provided : %s! Please notify developer to add support of arg provided or remove arg from arguments allowed", string));
            }
        }
    }

    public void b() {
        aVo.a().a(String.format("Help :%nAllow to set background in SemiTactical Mode. Options are : %s", Arrays.toString(this.d)));
    }

    @Override
    public boolean a() {
        return false;
    }
}

