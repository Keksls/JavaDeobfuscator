/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import com.ankamagames.framework.graphics.engine.entity.Entity;
import java.util.ArrayList;

public class HideEntitiesCommand
implements avt_0 {
    public static int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        int n = 0;
        if (!arrayList.isEmpty()) {
            n = a;
            for (String string : arrayList.get(0).split(" ")) {
                n = HideEntitiesCommand.a(n, string);
            }
        }
        Entity.v = (a = n) == 0 ? null : this.c();
        this.b();
    }

    private void b() {
        if (a == 0) {
            aVo.a().b("Tout visible");
            return;
        }
        Object object = "";
        if ((a & 1) == 1) {
            object = (String)object + "mobs ";
        }
        if ((a & 2) == 2) {
            object = (String)object + "joueurs ";
        }
        if ((a & 4) == 4) {
            object = (String)object + "localPlayer ";
        }
        aVo.a().b("masqu\u00e9: " + (String)object);
    }

    private static int a(int n, String string) {
        if (string.equals("npc")) {
            return n ^ 1;
        }
        if (string.equals("players")) {
            return n ^ 2;
        }
        if (string.equals("local")) {
            return n ^ 4;
        }
        if (string.equals("0")) {
            return 0;
        }
        return n;
    }

    private aut_2 c() {
        return new aZm(this);
    }

    @Override
    public boolean a() {
        return false;
    }
}

