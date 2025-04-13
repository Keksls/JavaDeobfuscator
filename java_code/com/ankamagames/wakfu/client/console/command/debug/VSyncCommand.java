/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class VSyncCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        azu_2 azu_22;
        azu_22.d(!(azu_22 = ans_0.D().e()).b());
        if (!azu_22.b()) {
            aVo.a().b("vsync: on");
        } else {
            aVo.a().b("vsync: off");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

