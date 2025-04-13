/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command;

import java.util.ArrayList;
import java.util.Iterator;

public class HelpCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        ArrayList<Object> arrayList3 = new ArrayList<Object>();
        ArrayList<aZz> arrayList4 = aVn.d().j().b();
        for (aZz object2 : arrayList4) {
            if (object2.i() > aVn.d().g()) continue;
            if (object2 instanceof aZx) {
                arrayList2.add(object2);
                continue;
            }
            arrayList3.add(object2);
        }
        ArrayList<aZz> arrayList5 = aVn.d().h().b();
        Iterator iterator = arrayList5.iterator();
        while (iterator.hasNext()) {
            aZz aZz3 = (aZz)iterator.next();
            if (aZz3.i() > aVn.d().g()) continue;
            if (aZz3 instanceof aZx) {
                arrayList2.add(aZz3);
                continue;
            }
            arrayList3.add(aZz3);
        }
        StringBuilder stringBuilder = new StringBuilder("# Liste des commandes #\n");
        for (aZz aZz4 : arrayList2) {
            stringBuilder.append("[").append(aZz4.h()).append("] ");
        }
        for (aZz aZz5 : arrayList3) {
            stringBuilder.append(aZz5.h()).append(" ");
        }
        aVo.a().b(stringBuilder.toString());
    }

    @Override
    public boolean a() {
        return false;
    }
}

