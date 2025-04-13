/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class ShowXulorSceneCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        ano_1 ano_12 = ans_0.D().b();
        if (arrayList.size() == 3) {
            if (arrayList.get(2).equals("0")) {
                ans_0.D().e().a(ano_12);
            } else {
                ans_0.D().e().a(ano_12, true);
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

