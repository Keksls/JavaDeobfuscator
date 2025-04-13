/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.xulor.property;

import java.util.ArrayList;

public class ListCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder("# Liste des propri\u00e9t\u00e9s #");
        fis_1.a().a(new azd_0(this, stringBuilder));
        aVo.a().b(stringBuilder.toString());
    }

    @Override
    public boolean a() {
        return false;
    }
}

