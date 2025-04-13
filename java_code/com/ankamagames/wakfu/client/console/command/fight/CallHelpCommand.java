/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.fight;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class CallHelpCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(CallHelpCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        cGV.callHelp(null);
    }

    @Override
    public boolean a() {
        return false;
    }
}

