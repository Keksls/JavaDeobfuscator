/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;

public class FollowPlayerCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        String string = arrayList.get(2).replaceAll("\"", "");
        blx_1 blx_12 = bmf_2.a().b(string);
        if (!(blx_12 instanceof bnh_1)) {
            return;
        }
        bnh_1 bnh_12 = (bnh_1)blx_12;
        if (bnh_12.bv().at() && dhI.a((bnh_1)blx_12)) {
            dhI.a().b(bnh_12.a_());
            azu_0.j().a(dhI.a());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

