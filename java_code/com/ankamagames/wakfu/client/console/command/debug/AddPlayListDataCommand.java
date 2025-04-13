/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public class AddPlayListDataCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        long l = Co.f(arrayList.get(2));
        long l2 = Co.f(arrayList.get(3));
        short s2 = Co.h(arrayList.get(4));
        afp afp2 = new afp();
        afp2.a(1, l, l2, (byte)100, (short)0, (byte)1, 3);
        afp2.a(2, l, l2, (byte)100, (short)0, (byte)1, 3);
        afp2.a(s2);
        afr.a().a(afp2);
    }

    @Override
    public boolean a() {
        return false;
    }
}

