/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class CloseAllWindowsCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        boolean bl;
        boolean bl2 = bl = !fta_0.getInstance().getVisible();
        if (bl || fyd_0.a().d()) {
            fta_0.getInstance().setVisible(bl);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

