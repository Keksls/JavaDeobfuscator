/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class UnloadCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        String string = arrayList.get(2);
        if (string.equals("all")) {
            fpm_0.b().u();
            return;
        }
        if (fpm_0.b().q(string)) {
            fpm_0.b().o(arrayList.get(2));
        } else {
            aVo.a().d(string + " n'est pas charg\u00e9 !");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

