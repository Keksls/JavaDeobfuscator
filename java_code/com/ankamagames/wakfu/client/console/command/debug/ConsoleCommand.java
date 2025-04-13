/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class ConsoleCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 != null && !emp_0.a(bai_02.v(), emp_0.b)) {
            aWM.a(aWP.a);
            if (fpm_0.b().q("consoleDialog")) {
                fpm_0.b().o("consoleDialog");
            } else {
                fpm_0.b().a("consoleDialog", cfi_0.a("consoleDialog"), 1025L, (short)30000);
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

