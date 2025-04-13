/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class FloodChatCommand
implements avt_0 {
    private long a;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() != 3) {
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (Field field : bae.class.getDeclaredFields()) {
            try {
                if (field.getType() != String.class) continue;
                arrayList2.add(bae.h().a((String)field.get(bae.h()), new Object[0]));
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
            }
        }
        this.a = Long.parseLong(arrayList.get(2));
        int n = 0;
        while ((long)n < this.a) {
            ado_1.a().a(new aZj(this, arrayList2), n, 1);
            ++n;
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

