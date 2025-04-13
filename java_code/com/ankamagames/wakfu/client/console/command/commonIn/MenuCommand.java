/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class MenuCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(MenuCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!azu_0.j().c(daB.a())) {
            azu_0.j().a(daB.a());
        } else {
            azu_0.j().b(daB.a());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

