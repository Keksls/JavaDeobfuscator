/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class RunScriptCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            return;
        }
        int n = Integer.parseInt(arrayList.get(2));
        aks_1.a().c(n);
        aVo.a().b("Script " + n);
    }

    @Override
    public boolean a() {
        return false;
    }
}

