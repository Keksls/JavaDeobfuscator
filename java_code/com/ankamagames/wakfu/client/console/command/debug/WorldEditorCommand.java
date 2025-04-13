/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WorldEditorCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(WorldEditorCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 != null && emp_0.b(bai_02.v(), emq_0.bi)) {
            if (azu_0.j().c(ddZ.d())) {
                azu_0.j().b(ddZ.d());
            } else {
                cct_1 cct_12 = ccs_1.a().a(YX.a());
                if (cct_12 != null && cct_12.b()) {
                    esl_1 esl_12 = esp_2.a(this.b());
                    ddZ.d().a(esl_12);
                    azu_0.j().a(ddZ.d());
                } else {
                    aVo.a().b("You must be in a havenworld to open worldEditor.");
                }
            }
        }
    }

    private esm_2 b() {
        bos_2 bos_22 = azu_0.j().k().eV();
        return new esm_2(bos_22.d(), bos_22.a(), bos_22.b(), 0, false);
    }

    @Override
    public boolean a() {
        return false;
    }
}

