/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class SetSkinPartCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(SetSkinPartCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        if (bmr_12 == null) {
            aVo.a().d("pas de localPlayer");
            return;
        }
        if (arrayList.size() != 4) {
            return;
        }
        biI biI2 = bmr_12.bv();
        String string = arrayList.get(3);
        try {
            int n = Integer.parseInt(arrayList.get(2));
            try {
                String[] stringArray = atn_2.a(arrayList.get(3));
                biI2.a(biE.k(n), stringArray);
            }
            catch (Exception exception) {
                a.error((Object)"", (Throwable)exception);
            }
        }
        catch (NumberFormatException numberFormatException) {
            biI2.a(arrayList.get(2), string);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

