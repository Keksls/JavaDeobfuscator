/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class DebugBarCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        ans_0 ans_02;
        boolean bl = (ans_02 = ans_0.D()).C();
        ans_02.c(!bl);
        if (bl == ans_02.C()) {
            if (bl) {
                aVo.a().d("Unable to hide DebugBar");
            } else {
                aVo.a().d("Unable to display DebugBar");
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

