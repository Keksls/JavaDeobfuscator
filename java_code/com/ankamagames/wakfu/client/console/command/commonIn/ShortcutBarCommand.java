/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ShortcutBarCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        dfc dfc2 = new dfc(19946);
        dfc2.a(Byte.parseByte(arrayList.get(2)));
        add_2.b().a(dfc2);
    }

    @Override
    public boolean a() {
        return false;
    }
}

