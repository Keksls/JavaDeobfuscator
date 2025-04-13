/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug.anim;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class AnmDebuggerCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(AnmDebuggerCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        AnmDebuggerCommand.b();
    }

    @Override
    public boolean a() {
        return false;
    }

    public static void b() {
        fis_1.a().a("debug.anm", aZu.a());
        fpm_0.b().a("debugAnmDialog", cfi_0.a("debugAnmDialog"), 1L, (short)10000);
        fpm_0.b().a("wakfu.debugAnm", cgx_0.class);
    }
}

