/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.nation;

import java.util.ArrayList;

public final class ShowCitizenScores
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        faV faV2 = bmr_12.fE();
        int[] nArray = fbc_0.a.b();
        for (int k = 0; k < nArray.length; ++k) {
            int n = nArray[k];
            int n2 = faV2.c(n);
            aVo.a().a(n + " score : " + n2);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

