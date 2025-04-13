/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.common;

import java.util.ArrayList;

public class BindCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.get(2) == null) {
            return;
        }
        bhu bhu2 = bhA.a.a(arrayList.get(2));
        if (bhu2 != null) {
            bhu2.j();
            return;
        }
        dfv dfv2 = new dfv();
        dfv2.b(BindCommand.a(arrayList.get(2)));
        add_2.b().a(dfv2);
    }

    private static String a(String string) {
        if (string.startsWith("/")) {
            return string;
        }
        aUv aUv2 = aUxx.a().f();
        if (aUv2 != null && aUv2.h() != null) {
            return aUv2.h().i() + " " + string;
        }
        return aUf.a(aUe.a.b()).b() + " " + string;
    }

    @Override
    public boolean a() {
        return false;
    }
}

