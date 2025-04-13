/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class OverheadDebugCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        boolean bl = abu.A = !abu.A;
        if (abu.A) {
            aVo.a().b("Overhead debug : on");
        } else {
            aVo.a().b("Overhead debug : off");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

