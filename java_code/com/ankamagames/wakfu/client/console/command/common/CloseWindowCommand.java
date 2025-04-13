/*
 * Decompiled with CFR 0.152.
 */
package com.ankamagames.wakfu.client.console.command.common;

import java.util.ArrayList;

public class CloseWindowCommand
implements avt_0 {
    @Override
    public void a(aZz aZz2, ArrayList<String> arrayList) {
        CloseWindowCommand.b();
    }

    public static void b() {
        fzh fzh2 = cff_0.b().a();
        switch (fzh2) {
            case c: {
                if (azu_0.j().c(daB.a())) {
                    azu_0.j().b(daB.a());
                    return;
                }
                if (cuo_0.e().f()) {
                    azu_0.j().H();
                    return;
                }
                if (azu_0.j().c(dcD.a)) {
                    azu_0.j().b(dcD.a);
                    fzw_0.a.a("loginLock", true);
                    azu_0.j().a(cvv_0.a());
                    return;
                }
                if (azu_0.j().c(cWI.a())) {
                    azu_0.j().H();
                    return;
                }
                if (azu_0.j().c(cwk_0.a())) {
                    if (!cwk_0.a().d().a()) {
                        azu_0.j().H();
                    } else {
                        dfc.d((short)16865);
                    }
                    return;
                }
                if (azu_0.j().c(cxv_0.a) && cxv_0.a.c()) {
                    String string = cxv_0.a.a();
                    String string2 = bae.h().a(string, new Object[0]);
                    fzm_0 fzm_02 = fpm_0.b().a(string2 != null && !string2.isEmpty() ? string2 : bae.h().a("scenario.confirmEscape", new Object[0]), cfn_0.a(0), 2073L, 102, 1);
                    fzm_02.a(new azf_0());
                    return;
                }
                azu_0.j().a(daB.a());
                break;
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }
}

