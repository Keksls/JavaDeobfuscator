/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class UseShortcutItemCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.get(2).length() >= 2) {
            bOw bOw2 = dcj_0.a().h();
            if (bOw2 == null) {
                return;
            }
            byte by = Byte.parseByte("" + arrayList.get(2).charAt(1));
            by = bOw2.e(by).n();
            bOw2.a(by, Short.parseShort("" + arrayList.get(2).charAt(0)));
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

