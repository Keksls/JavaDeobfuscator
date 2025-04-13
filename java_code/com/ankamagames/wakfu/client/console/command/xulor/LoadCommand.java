/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class LoadCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            aVo.a().d("Missing arguments. Expected command format is 'load' [dialogId]");
            return;
        }
        String string = cfi_0.a(arrayList.get(2));
        if (string == null) {
            aVo.a().d("Dialog path not found for " + arrayList.get(2));
            return;
        }
        fpm_0.b().a(arrayList.get(2), string, 16L, (short)0);
    }

    @Override
    public boolean a() {
        return false;
    }
}

