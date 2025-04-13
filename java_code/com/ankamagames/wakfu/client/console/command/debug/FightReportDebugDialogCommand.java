/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class FightReportDebugDialogCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (azu_0.j().c(cYL.a())) {
            azu_0.j().b(cYL.a());
        } else {
            cYL.a().d();
            azu_0.j().a(cYL.a());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

