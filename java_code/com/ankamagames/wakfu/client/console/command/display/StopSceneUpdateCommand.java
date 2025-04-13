/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class StopSceneUpdateCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        azu_2 azu_22;
        azu_22.c(!(azu_22 = ans_0.D().e()).a());
        aVo.a().b("Scene update is now : " + (azu_22.a() ? "stopped" : "running"));
    }

    @Override
    public boolean a() {
        return false;
    }
}

