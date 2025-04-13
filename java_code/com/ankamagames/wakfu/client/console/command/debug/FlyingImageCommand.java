/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class FlyingImageCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(FlyingImageCommand.class);
    private static Runnable b;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (b == null) {
            b = new aZk(this);
            ado_1.a().a(b, 5000L, -1);
        } else {
            ado_1.a().b(b);
            b = null;
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

