/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor;

import java.util.ArrayList;

public class DialogInfosCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() == 3) {
            fvE fvE2 = (fvE)fpm_0.b().k(arrayList.get(2));
            if (fvE2 != null) {
                aVo.a().b(fvE2.toString());
            } else {
                aVo.a().d("La dialog " + arrayList.get(2) + " n'existe pas.");
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

