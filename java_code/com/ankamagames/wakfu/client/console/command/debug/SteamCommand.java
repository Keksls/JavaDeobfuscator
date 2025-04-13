/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class SteamCommand
implements avt_0 {
    private static final String a = "help";
    private static final String b = "resetUserStats";

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            String string = arrayList.get(2);
            if (string.equals(a)) {
                this.c();
            } else if (string.equals(b)) {
                this.b();
            }
        }
    }

    private void b() {
        bPL bPL2 = bPL.a;
        if (!bPL2.e()) {
            return;
        }
        if (bPL2.c()) {
            aVo.a().a("Stats r\u00e9initialis\u00e9es");
        } else {
            aVo.a().d("Probl\u00e8me \u00e0 la r\u00e9initialisation des stats");
        }
    }

    private void c() {
        aVo.a().a("steam help : ce message");
        aVo.a().a("steam resetUserStats : remet \u00e0 zero toutes les stats du joueur");
    }

    @Override
    public boolean a() {
        return false;
    }
}

