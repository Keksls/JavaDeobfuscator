/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class ReloadSoundXmlCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(ReloadSoundXmlCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        cdw_0.n().O();
        try {
            cdw_0.n().P();
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me au rechargement des barks");
        }
        try {
            cdw_0.n().Q();
        }
        catch (Exception exception) {
            aVo.a().d("Probl\u00e8me au rechargement des grounds");
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

