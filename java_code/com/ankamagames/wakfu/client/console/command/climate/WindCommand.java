/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.climate;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class WindCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(WindCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        try {
            int n = 2;
            if (!arrayList.get(2).equalsIgnoreCase("start")) {
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

