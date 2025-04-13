/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TIntArrayList
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.climate;

import gnu.trove.list.array.TIntArrayList;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TemperatureCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(TemperatureCommand.class);
    private static final TIntArrayList b = new TIntArrayList();
    private static final ArrayList<adS> c = new ArrayList();

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        try {
            ahg_0 ahg_02 = ajJ.d().e();
            int n = 2;
            if (!arrayList.get(2).equalsIgnoreCase("start") && !arrayList.get(2).equalsIgnoreCase("stop")) {
                aVo.a().d("Arguments incorrects");
            }
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me lors de l'execution de la commande : " + exception.toString());
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

