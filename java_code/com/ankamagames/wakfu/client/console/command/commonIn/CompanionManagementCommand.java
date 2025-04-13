/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class CompanionManagementCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (azu_0.j().c(cxq_0.a)) {
            azu_0.j().b(cxq_0.a);
        } else if (euu_2.a() || euu_2.b()) {
            azu_0.j().a(cxq_0.a);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

