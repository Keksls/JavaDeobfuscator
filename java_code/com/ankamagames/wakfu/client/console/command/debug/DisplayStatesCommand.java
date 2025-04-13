/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class DisplayStatesCommand
implements avt_0 {
    private static boolean a = false;

    public static boolean b() {
        return a;
    }

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        a = !a;
        aVo.a().b(a ? "Affichage forc\u00e9 des \u00e9tats : ON" : "Affichage forc\u00e9 des \u00e9tats : OFF");
    }

    @Override
    public boolean a() {
        return false;
    }
}

