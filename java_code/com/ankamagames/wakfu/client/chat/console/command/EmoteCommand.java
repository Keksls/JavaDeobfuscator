/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.chat.console.command;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class EmoteCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(EmoteCommand.class);
    private final int b;

    public EmoteCommand(int n) {
        this.b = n;
    }

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            return;
        }
        boolean bl = bht.i.a(this.b, bhv.a);
        if (!bl) {
            a.error((Object)("Impossible d'utiliser l'Emote " + this.b));
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

