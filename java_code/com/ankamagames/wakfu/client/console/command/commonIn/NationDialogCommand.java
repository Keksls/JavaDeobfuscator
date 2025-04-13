/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class NationDialogCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!azu_0.j().c(dbd.a())) {
            azu_0.j().a(dbd.a());
        } else {
            azu_0.j().b(dbd.a());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

