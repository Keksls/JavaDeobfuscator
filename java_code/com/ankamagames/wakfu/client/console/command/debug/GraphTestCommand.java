/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class GraphTestCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(GraphTestCommand.class);
    private static Runnable b = null;

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        int n;
        String string = "graphDialog";
        if (fpm_0.b().q("graphDialog")) {
            fpm_0.b().o("graphDialog");
            return;
        }
        fpm_0.b().a("graphDialog", cfi_0.a("graphDialog"), (short)10000);
        fyy_0 fyy_02 = fpm_0.b().h().d("graphDialog");
        int[] nArray = new int[5];
        azj_2[] azj_2Array = new azf_2[]{new azf_2(1.0f, 0.8f, 0.3f, 1.0f), new azf_2(0.0f, 0.5f, 1.0f, 1.0f)};
        azj_2[] azj_2Array2 = new azf_2[]{new azf_2(1.0f, 0.8f, 0.3f, 0.3f), new azf_2(0.0f, 0.5f, 1.0f, 0.3f)};
        fwy_0 fwy_02 = new fwy_0();
        fwy_02.a(azj_2Array, nArray);
        fwy_02.a(new float[]{12.0f, 8.5f, 9.0f, 10.0f, 15.0f});
        int[] nArray2 = new int[5];
        nArray2[1] = 1;
        fwy_0 fwy_03 = new fwy_0();
        fwy_03.a(azj_2Array, nArray2);
        fwy_03.a(new float[]{11.0f, -5.0f, 3.0f, 8.0f, 7.0f});
        int[] nArray3 = new int[10];
        nArray3[3] = 1;
        fwz_0 fwz_02 = new fwz_0();
        fwz_02.a(azj_2Array2, nArray3);
        fwz_02.a(fwy_02);
        fwz_02.a(fwy_03);
        fwx_0 fwx_02 = new fwx_0();
        fwx_02.a((ayo_2)null);
        fwx_02.a(new azf_2(0.9f, 0.9f, 1.0f, 1.0f));
        fwx_0 fwx_03 = new fwx_0();
        fwx_03.a((ayo_2)null);
        fwx_03.a(new azf_2(0.9f, 1.0f, 0.9f, 1.0f));
        fsi_0 fsi_02 = (fsi_0)fyy_02.a("graph");
        fsj_0 fsj_02 = new fsj_0();
        fsj_02.a(fwy_02);
        fsj_02.a(fwy_03);
        fsj_02.a(fwz_02);
        for (n = 0; n < 3; ++n) {
            fsj_02.a(fwx_02);
        }
        for (n = 0; n < 2; ++n) {
            fsj_02.a(fwx_03);
        }
        fsj_02.a(-8.0f);
        fsj_02.b(22.0f);
        fsi_02.setContent(fsj_02);
    }

    @Override
    public boolean a() {
        return false;
    }
}

