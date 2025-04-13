/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MapCommand
implements avt_0 {
    protected static Logger a = Logger.getLogger(MapCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        MapCommand.b();
    }

    public static void b() {
        das_0 das_02 = das_0.a();
        if (azu_0.j().c(das_02)) {
            azu_0.j().b(das_02);
            return;
        }
        blf_1.b();
        if (ble_1.E().r()) {
            azu_0.j().a(das_02);
            return;
        }
        bLP bLP2 = blg_1.a().b(blh_1.e, -2L);
        if (bLP2 == null) {
            return;
        }
        ble_1.E().a(bLP2);
        azu_0.j().a(das_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

