/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class XpCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            return;
        }
        if (bmr_12.dt() == enp_2.a.b(ens_2.v)) {
            aul_0.a().c("100%");
            return;
        }
        oj_0 oj_02 = bmr_12.du();
        long l = bmr_12.ce();
        long l2 = oj_02.c(l);
        long l3 = oj_02.a(bmr_12.dt() + 1) - l + l2;
        int n = Math.round((float)l2 / (float)l3 * 100.0f);
        aul_0.a().c(n + "%");
    }

    @Override
    public boolean a() {
        return false;
    }
}

