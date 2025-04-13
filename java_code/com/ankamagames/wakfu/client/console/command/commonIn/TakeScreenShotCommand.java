/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import com.ankamagames.wakfu.client.WakfuClient;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class TakeScreenShotCommand
implements avt_0 {
    public static final Logger a = Logger.getLogger(TakeScreenShotCommand.class);
    private static final String b = ".png";

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        azh_0 azh_02 = new azh_0();
        try {
            if (!this.a(azh_02)) {
                azh_02.a(new RuntimeException("Internal error"));
                return;
            }
        }
        catch (IOException iOException) {
            azh_02.a(iOException);
            return;
        }
        boolean bl = ans_0.D().e().a(azh_02);
        if (!bl) {
            a.error((Object)"Impossible de faire une requ\u00eate de screenShot aupr\u00e8s du Renderer");
        }
    }

    private boolean a(azh_0 azh_02) {
        String string = WakfuClient.a.k();
        File file = new File(string);
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("Unable to create directory : path=" + string);
        }
        azh_02.b = new File(file, System.currentTimeMillis() + b);
        return azh_02.b.createNewFile();
    }

    @Override
    public boolean a() {
        return false;
    }
}

