/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class EnableMiniMapCommand
implements avt_0 {
    private static boolean a = true;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bvx_0 bvx_02;
        boolean bl = (bvx_02 = (bvx_0)ans_0.D().h()).a(bWe.af);
        bvx_02.a((agp_0)bWe.af, !bl);
        EnableMiniMapCommand.a(!bl);
    }

    @Override
    public boolean a() {
        return false;
    }

    public static void a(boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = bl && blj_1.D().r();
        if (bl2 == a) {
            return;
        }
        a = bl2;
        dfc dfc2 = new dfc();
        dfc2.a_(16893);
        dfc2.a(bl);
        add_2.b().a(dfc2);
    }

    public static boolean b() {
        return a;
    }
}

