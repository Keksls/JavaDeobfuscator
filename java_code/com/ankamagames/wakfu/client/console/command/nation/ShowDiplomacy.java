/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.nation;

import java.util.ArrayList;

public final class ShowDiplomacy
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        faX faX2 = azu_0.j().k().fE().m();
        int[] nArray = fbc_0.a.b();
        for (int k = 0; k < nArray.length; ++k) {
            fbl_0 fbl_02;
            int n = nArray[k];
            faX faX3 = fbc_0.a.a(n);
            fcd fcd2 = faX3.F();
            fcd fcd3 = faX2.F();
            fbl_0 fbl_03 = fcd3.c(n);
            aVo.a().a(n + " -> " + fbl_03);
            fbl_0 fbl_04 = fcd2.b(faX2.c());
            if (fbl_04 != null) {
                aVo.a().a(n + " attend une r\u00e9ponse pour : " + fbl_04);
            }
            if ((fbl_02 = fcd3.b(n)) == null) continue;
            aVo.a().a(n + " doit r\u00e9pondre pour : " + fbl_03);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

