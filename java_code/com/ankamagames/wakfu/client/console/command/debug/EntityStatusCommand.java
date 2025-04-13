/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class EntityStatusCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        StringBuilder stringBuilder = new StringBuilder("Status de WakfuGameEntity :");
        try {
            stringBuilder.append('\n').append("Connect\u00e9 : ").append(azu_0.j().K().i());
        }
        catch (Exception exception) {
            // empty catch block
        }
        stringBuilder.append('\n').append("Frames : ");
        for (adv_1 adv_12 : azu_0.j().c()) {
            stringBuilder.append('\n').append(" - ").append(adv_12.getClass().getSimpleName());
        }
        aVo.a().b(stringBuilder.toString());
    }

    @Override
    public boolean a() {
        return false;
    }
}

