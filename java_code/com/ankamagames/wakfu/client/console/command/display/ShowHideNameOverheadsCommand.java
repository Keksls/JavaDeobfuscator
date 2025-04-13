/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class ShowHideNameOverheadsCommand
implements avt_0 {
    private static boolean a = false;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (a) {
            dbm_0.a().g();
        } else {
            dbm_0.a().f();
        }
        a = !a;
    }

    public static boolean b() {
        return a;
    }

    public static void a(boolean bl) {
        a = bl;
    }

    @Override
    public boolean a() {
        return false;
    }
}

