/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class HourCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        wc_0 wc_02 = wc_0.p();
        DecimalFormat decimalFormat = new DecimalFormat("00");
        wu_0 wu_02 = wc_02.a();
        String string = wc_02.k().a() + ", " + decimalFormat.format(wu_02.j()) + "/" + decimalFormat.format(wu_02.m()) + "/" + wu_02.o() + " " + decimalFormat.format(wu_02.k()) + ":" + decimalFormat.format(wu_02.l());
        aVo.a().b(string);
    }

    @Override
    public boolean a() {
        return false;
    }
}

