/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class PositionCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        aff_1 aff_12 = bmr_12.P_();
        long l = bmr_12.T_();
        aUh.b("command.worldPosition", aff_12.d(), aff_12.e(), aff_12.f(), l);
    }

    @Override
    public boolean a() {
        return false;
    }
}

