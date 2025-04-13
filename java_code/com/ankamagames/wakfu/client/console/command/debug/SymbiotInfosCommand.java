/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class SymbiotInfosCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        azu_0 azu_02 = azu_0.j();
        bmr_1 bmr_12 = azu_02.k();
        bol_0 bol_02 = bmr_12.cH();
        if (bol_02 != null) {
            for (byte by = 0; by < bol_02.b(); by = (byte)(by + 1)) {
                eqy_1 eqy_12 = bol_02.a((int)by);
                aVo.a().a(eqy_12.toString() + "\n", 0xAA00FF);
            }
        } else {
            aVo.a().a("pas de symbiote");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

