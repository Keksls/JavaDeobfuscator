/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class AdminMessageCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        boolean bl;
        bmr_1 bmr_12 = bzf_1.a();
        boolean bl2 = bl = bmr_12 != null && emp_0.b(bmr_12.N_().a(), emq_0.bh);
        if (!bl) {
            return;
        }
        aUh.a(aup_0.j, arrayList.get(2));
        String string = aUh.c(arrayList.get(2));
        if (string == null) {
            return;
        }
        cki_0 cki_02 = new cki_0();
        cki_02.a(string);
        azu_0.j().K().c(cki_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

