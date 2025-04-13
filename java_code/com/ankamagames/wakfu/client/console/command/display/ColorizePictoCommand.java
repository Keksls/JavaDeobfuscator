/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;

public class ColorizePictoCommand
implements avt_0 {
    private static float a = 1.0f;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        long l = bmr_12.G();
        long l2 = bmr_12.H();
        long l3 = bmr_12.I();
        long l4 = aii_0.a((int)l, (int)l2, (int)l3);
        a = a == 1.0f ? 0.2f : 1.0f;
        acz.a().a(l4, 1.0f, 1.0f, 1.0f, a);
    }

    @Override
    public boolean a() {
        return false;
    }
}

