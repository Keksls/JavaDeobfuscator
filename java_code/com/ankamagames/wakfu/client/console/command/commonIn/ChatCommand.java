/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;

public class ChatCommand
implements avt_0 {
    public static final String a = "textEditorRenderableContainer.chatInput";

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (!fyd_0.a().d()) {
            return;
        }
        ChatCommand.b();
        aul_0.a().b(true);
    }

    @Override
    public boolean a() {
        return false;
    }

    public static void b() {
        fyc_0.a().c((fvE)cww_0.c().d().getElementMap().a(a));
    }

    public static void a(fyy_0 fyy_02) {
        fyc_0.a().c((fvE)fyy_02.a(a));
    }
}

