/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class AlphaMaskCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bvx_0 bvx_02 = (bvx_0)ans_0.D().h();
        boolean bl = !bvx_02.a(bWe.r);
        bvx_02.a((agp_0)bWe.r, bl);
        AlphaMaskCommand.a(bl);
    }

    public static void a(boolean bl) {
        AlphaMaskCommand.b(bl);
        AlphaMaskCommand.c(bl);
        aUh.b(bl ? "options.alphaMaskActivated" : "options.alphaMaskDisactivated", new Object[0]);
    }

    public static void b(boolean bl) {
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        if (bmr_12 == null) {
            return;
        }
        biI biI2 = bmr_12.bv();
        if (biI2 == null) {
            return;
        }
        biI2.f(bl);
    }

    public static void c(boolean bl) {
        ans_0.D();
        bmr_1 bmr_12 = ans_0.F().k();
        if (bmr_12 == null) {
            return;
        }
        biI biI2 = bmr_12.bv();
        assert (biI2 != null);
        bvx_2 bvx_22 = bmr_12.bz();
        if (bvx_22 == null) {
            return;
        }
        for (blx_1 blx_12 : bvx_22.j()) {
            biI biI3 = blx_12.bv();
            if (biI3 == null || biI2 == biI3) continue;
            biI3.f(bl);
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

