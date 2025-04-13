/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class CharacterBookCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        cwu_0 cwu_02 = cwu_0.h();
        if (!azu_0.j().c(cwu_02)) {
            azu_0.j().a(cwu_02);
        } else {
            azu_0.j().b(cwu_02);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

