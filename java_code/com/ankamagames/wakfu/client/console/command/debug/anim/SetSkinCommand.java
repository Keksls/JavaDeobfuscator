/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetSkinCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(SetSkinCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            aVo.a().d("pas de localPlayer");
            return;
        }
        if (arrayList.size() != 3) {
            return;
        }
        bmr_12.bv().m(arrayList.get(2));
    }

    @Override
    public boolean a() {
        return false;
    }
}

