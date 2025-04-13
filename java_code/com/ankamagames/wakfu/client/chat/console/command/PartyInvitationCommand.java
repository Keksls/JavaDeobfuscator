/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PartyInvitationCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        bmr_12.dE().a(string);
    }

    @Override
    public boolean a() {
        return false;
    }
}

