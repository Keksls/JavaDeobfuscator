/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
package com.ankamagames.wakfu.client.console.command.commonIn;

import java.util.ArrayList;
import org.apache.log4j.Logger;

public class GetPrivateContactCommand
implements avt_0 {
    private static final Logger a = Logger.getLogger(GetPrivateContactCommand.class);

    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        if (arrayList.get(2) != null && arrayList.get(2).length() > 0) {
            GetPrivateContactCommand.a(arrayList.get(2).charAt(0) == '1');
        }
    }

    public static void a(boolean bl) {
        String string = aul_0.a().a(bl);
        if (string != null && string.length() > 0) {
            int n = aUxx.a().f().a();
            String string2 = dey.a(n);
            fug_0 fug_02 = (fug_0)fpm_0.b().h().d(string2).a((n == 0 ? "textEditorRenderableContainer." : "") + "chatInput");
            if (fug_02 == null) {
                return;
            }
            aUr aUr2 = aUxx.a().f().h();
            aUr2.a("input", (Object)("/w \"" + string + "\" "));
            fis_1.a().a((ajf_1)aUr2, "input");
            if (!fug_02.equals(fyc_0.a().b())) {
                fyc_0.a().c(fug_02);
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

