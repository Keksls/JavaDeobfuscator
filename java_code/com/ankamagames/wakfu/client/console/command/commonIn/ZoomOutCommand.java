/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ZoomOutCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        ace_0 ace_02 = ans_0.D().c();
        ace_02.i(ace_02.B() - 0.1f);
    }

    @Override
    public boolean a() {
        return false;
    }
}

