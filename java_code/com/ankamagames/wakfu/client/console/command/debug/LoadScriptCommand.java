/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class LoadScriptCommand
implements avt_0 {
    private static akx_2 a = null;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() < 4) {
            return;
        }
        int n = Integer.parseInt(arrayList.get(2));
        String string = arrayList.get(3);
        if (a != null) {
            a.a();
        }
        aVo.a().b("Loading script " + n + "...");
        a = aks_1.a().a(n, (akr_1[])null, false);
        a.d(string);
    }

    @Override
    public boolean a() {
        return false;
    }
}

