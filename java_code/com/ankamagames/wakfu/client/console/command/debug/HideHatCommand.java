/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class HideHatCommand
implements avt_0 {
    private static final String[] a = new String[]{"CheveuxHaut", "CheveuxBas", "CheveuxArriere", "CheuveuxNatteHaute", "CheveuxNatteBasse", "Oreille", "EliatropeCoiffeBas", "EliatropeCoiffeHaut"};
    private static final String[] b = new String[]{"Chapeau", "Chapeau02"};

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() < 3) {
            return;
        }
        boolean bl = Co.h(arrayList.get(2)) == 1;
        bmr_1 bmr_12 = azu_0.j().k();
        biI biI2 = bmr_12.bv();
        if (bl) {
            for (String string : b) {
                biI2.b(string, false);
            }
            for (String string : a) {
                biI2.an().c(string.hashCode());
            }
        } else {
            for (String string : b) {
                biI2.b(string, true);
            }
            for (String string : a) {
                biI2.an().d(string.hashCode());
            }
        }
        biI2.an().g();
        biI2.C();
    }

    @Override
    public boolean a() {
        return false;
    }
}

