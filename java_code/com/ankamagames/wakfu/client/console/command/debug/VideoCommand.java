/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.debug;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class VideoCommand
implements avt_0 {
    protected static final Logger a = Logger.getLogger(VideoCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        VideoCommand.b();
    }

    public static void b() {
        if (aVk.b) {
            return;
        }
        bai_0 bai_02 = azu_0.j().n();
        if (bai_02 != null && !emp_0.a(bai_02.v(), emp_0.b)) {
            if (fpm_0.b().q("videoDialog")) {
                fpm_0.b().o("videoDialog");
                fpm_0.b().e("wakfu.video");
            } else {
                fpm_0.b().a("videoDialog", cfi_0.a("videoDialog"), 32769L, (short)30000);
                fpm_0.b().a("wakfu.video", cjw_0.class);
                a.info((Object)"Chargement de l'ui video");
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

