/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class NotificationTestCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(NotificationTestCommand.class);
    private Runnable b;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (this.b == null) {
            this.b = new aZs(this);
            ado_1.a().a(this.b, 5000L, 25);
            aVo.a().b("Test started.");
        } else {
            ado_1.a().b(this.b);
            this.b = null;
            aVo.a().b("Test stopped.");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

