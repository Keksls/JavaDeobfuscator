/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.display;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class DisplayPartInSightCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(DisplayPartInSightCommand.class);
    private static final String b = "DEBUG_FRONT_LAYER";
    private static final String c = "DEBUG_BACK_LAYER";
    private static final String d = "DEBUG_SIDE_LAYER";
    private static final float[] e = new float[]{1.0f, 0.0f, 0.0f, 0.5f};
    private static final float[] f = new float[]{0.0f, 1.0f, 0.0f, 0.5f};
    private static final float[] g = new float[]{0.0f, 0.0f, 1.0f, 0.5f};

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        bmr_1 bmr_12 = azu_0.j().k();
        uo_0 uo_02 = bmr_12.k();
        uo_0 uo_03 = uo_02 != null ? uo_02 : new uo_0();
        uo_03.a(bmr_12.G(), bmr_12.H(), bmr_12.I(), bmr_12.F());
        this.a(b, e);
        this.a(c, f);
        this.a(d, g);
        int n = bmr_12.G();
        int n2 = bmr_12.H();
        for (int k = -15; k < 15; ++k) {
            block6: for (int i2 = -15; i2 < 15; ++i2) {
                un_0 un_02 = uo_03.a(n + k, n2 + i2, bmr_12.I());
                long l = aii_0.a(n + k, n2 + i2, bmr_12.I());
                switch (un_02) {
                    case d: {
                        aii_0.a().a(l, b);
                        continue block6;
                    }
                    case a: {
                        aii_0.a().a(l, c);
                        continue block6;
                    }
                    case c: 
                    case b: {
                        aii_0.a().a(l, d);
                    }
                }
            }
        }
    }

    private void a(String string, float[] fArray) {
        aif_0 aif_02 = aii_0.a().d(string);
        if (aif_02 == null) {
            try {
                aif_02 = aii_0.a().b(string);
                aif_02.a(fArray);
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        aii_0.a().e(string);
    }

    @Override
    public boolean a() {
        return false;
    }
}

