/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;

public final class SetPositionCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.size() != 5) {
            return;
        }
        azu_0.j().k().a(Integer.parseInt(arrayList.get(2)), Integer.parseInt(arrayList.get(3)), Short.parseShort(arrayList.get(4)));
    }

    @Override
    public boolean a() {
        return false;
    }
}

