/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class PlayMusicCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(PlayMusicCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        long l = Co.f(arrayList.get(2));
        int n = 100;
        if (arrayList.size() > 3 && (n = Co.c(arrayList.get(3))) == 0) {
            n = 100;
        }
        cdw_0.n().c(l, (float)n / 100.0f);
    }

    @Override
    public boolean a() {
        return false;
    }
}

